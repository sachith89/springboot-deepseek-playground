package dev.sachith.deepseek;

import reactor.core.publisher.Flux;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
public interface DeepSeekService {

    String call(String userInput);

    Flux<String> stream(String userInput);
}
