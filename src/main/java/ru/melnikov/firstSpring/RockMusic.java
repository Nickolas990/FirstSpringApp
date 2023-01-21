package ru.melnikov.firstSpring;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

import java.util.List;

public class RockMusic implements Music {
    private List<String> musicList = List.of("Indestructible", "Criminal", "Night", "Haunted");
    @Override
    public String getSong() {
        return "Smoke on the water";
    }
    @Override
    public List<String> getMusicList() {
        return musicList;
    }
}
