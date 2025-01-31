# DeepSeek Playground

This is an experiment project to integrate DeepSeek and Ollama with Spring Boot.

## Project Requirements

- Java 17 or higher
- Spring Boot 3.x
- Spring AI dependencies
- DeepSeek API key
- Ollama installed locally with the deepseek-r1:7b model

## Getting Started

Download Ollama from the [official website](https://ollama.com) and install it on your local machine. You can then pull
the required model using the following command:

```bash
  ollama pull deepseek-r1:7b
```
Setup **DEEPSEEK_API_KEY** environment variable

## Running the Application

```bash
  curl -X POST -H 'Content-Type: application/json' -d '{"UserInput":"Tell me about Sri Lanka. "}' http://localhost:8081/api/v1/deepseek/call
```

## References

https://api-docs.deepseek.com/