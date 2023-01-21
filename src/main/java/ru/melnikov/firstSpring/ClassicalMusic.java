package ru.melnikov.firstSpring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;

import java.util.List;

public class ClassicalMusic implements Music {
    private List<String> musicList = List.of("Cracker", "Swan's Lake", "Ode to Joy");

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void afterPropertiesSet() {
        System.out.println("Doing my initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public List<String> getMusicList() {
        return musicList;
    }
}
