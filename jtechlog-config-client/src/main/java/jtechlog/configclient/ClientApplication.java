package jtechlog.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.InMemoryTraceRepository;
import org.springframework.boot.actuate.trace.TraceRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ClientApplication {

    @Bean
    public TraceRepository traceRepository() {
        InMemoryTraceRepository inMemoryTraceRepository = new InMemoryTraceRepository();
        inMemoryTraceRepository.setCapacity(10);
        return inMemoryTraceRepository;

    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}