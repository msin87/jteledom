package ru.msin87.teledom.dom;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DomApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DomApplication.class).run(args);
    }

}
