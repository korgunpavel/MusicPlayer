package com.korgun.springcourse;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    private ClassicalMusic musicBean(){
        return new ClassicalMusic();
    }
}
