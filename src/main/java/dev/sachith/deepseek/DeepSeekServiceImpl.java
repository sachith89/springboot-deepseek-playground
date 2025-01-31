package dev.sachith.deepseek;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
@Service
public class DeepSeekServiceImpl implements DeepSeekService {

    private final ChatClient chatClient;

    public DeepSeekServiceImpl(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public String call(String userInput) {
        return chatClient.prompt()
                .user(userInput)
                .call()
                .content();
    }

    @Override
    public Flux<String> stream(String userInput) {
        return chatClient.prompt()
                .user(userInput)
                .stream()
                .content();
    }
}
