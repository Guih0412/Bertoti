import ollama
from smolagents import CodeAgent, tool
from tools.final_answer import FinalAnswerTool
from tools.scra import LetrasMusTool

# from tools.generate_image import GenerateImageTool
from Gradio_UI import GradioUI
import yaml



class OllamaModelWrapper:
    def __init__(self, model_name: str):
        self.model_name = model_name

    def generate(self, prompt: str, **kwargs):
        response = ollama.chat(
            model=self.model_name,
            messages=[{"role": "user", "content": str(prompt)}]
        )
        
        print(response)

        if 'text' in response:
            return response['text']
        elif 'message' in response:
            return response['message']
        else:
            return "Unexpected response format"

    def __call__(self, prompt: str, **kwargs):
        return self.generate(prompt, **kwargs)

# Initialize the model
model = OllamaModelWrapper(model_name="qwen2.5:3b")

# Initialize Tools
final_answer = FinalAnswerTool()
musicas_analise = LetrasMusTool()

# generate_image = GenerateImageTool()
    

with open("prompts.yaml", 'r') as stream:
    prompt_templates = yaml.safe_load(stream)

agent = CodeAgent(
    model=model,
    tools=[final_answer,musicas_analise],
    max_steps=6,
    verbosity_level=1,
    prompt_templates=prompt_templates
)

GradioUI(agent).launch()
