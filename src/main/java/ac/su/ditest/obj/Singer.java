package ac.su.ditest.obj;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Singer {
    String name;
    String song;

    public Singer() {
        System.out.println("Singer is arrived");
    }
    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
        System.out.println("Singer is ready");
    }

    public void sing() {
        if (name != null && song != null) {
            System.out.printf("%s is singing %s\n", name, song);
        }
        System.out.println("Singer is singing");
    }
}
