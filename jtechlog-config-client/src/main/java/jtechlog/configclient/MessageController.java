package jtechlog.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RefreshScope
public class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    private String message;

    public MessageController(@Value("${message}") String message) {
        this.message = message;
    }

    @RequestMapping("/")
    public String hello() {
	LOGGER.debug("Request processed to /");
        return message;
    }
}

