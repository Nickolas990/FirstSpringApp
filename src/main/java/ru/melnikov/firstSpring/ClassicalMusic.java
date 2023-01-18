package ru.melnikov.firstSpring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music, InitializingBean {
    private List<String> musicList = List.of("Cracker", "Swan's Lake", "Ode to Joy");
   private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Doing my initialisation");
    }

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
