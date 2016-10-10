package jtechlog.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

    private String message;

    public MessageController(@Value("${message}") String message) {
        this.message = message;
    }

    @RequestMapping("/")
    public String hello() {
        return message;
    }
}

