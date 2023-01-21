package ru.melnikov.firstSpring;

import org.springframework.stereotype.Component;

import java.util.List;

public class PunkRock implements Music {
    @Override
    public String getSong() {
        return "Tha Mask by King and Joker";
    }

    @Override
    public List<String> getMusicList() {
        return null;
    }
}
