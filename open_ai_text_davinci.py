# 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
import os
import openai
openai.organization = "org-A9GruOLOvupXJv1MqcNuW1EK"
os.environ["OPENAI_API_KEY"] = "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"
openai.api_key = os.getenv("OPENAI_API_KEY")
openai.Model.list()

response = openai.Completion.create(
    model="text-davinci-003",
    prompt="\nHuman: JAVA的Dijkstra完整程式\nAI:",
    temperature=0.9,
    max_tokens=1500,
    top_p=1,
    frequency_penalty=0.0,
    presence_penalty=0.6,
    stop=[" Human:", " AI:"]
)

print(response["choices"][0]["text"])