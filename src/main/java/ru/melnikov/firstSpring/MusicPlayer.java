package ru.melnikov.firstSpring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component()
@Scope("prototype")
public class MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    Music music1;
    Music music2;

    @Autowired()
    public MusicPlayer(@Qualifier("classicalMusic") Music classical, @Qualifier("rockMusic") Music rock) {
        music1 = classical;
        music2 = rock;
    }

    public void playMusic(Genres genre) {
        if (genre == Genres.CLASSICAL) {
            System.out.println(music1.getMusicList().get(new Random().nextInt(music1.getMusicList().size())));
        }
        if (genre == Genres.ROCK) {
            System.out.println(music2.getMusicList().get(new Random().nextInt(music2.getMusicList().size())));
        }
    }
}
