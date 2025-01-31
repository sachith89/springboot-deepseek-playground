package dev.sachith.deepseek;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/deepseek")
public class DeepSeekController {

    private final DeepSeekService deepSeekService;

    public DeepSeekController(DeepSeekService deepSeekService) {
        this.deepSeekService = deepSeekService;
    }

    @PostMapping("/call")
    public String deepSeek(@RequestBody UserInput userInput) {
        return deepSeekService.call(userInput.getUserInput());
    }

    @PostMapping("/stream")
    public Flux<String> deepSeekStream(@RequestBody UserInput userInput) {
        return deepSeekService.stream(userInput.getUserInput());
    }


}
