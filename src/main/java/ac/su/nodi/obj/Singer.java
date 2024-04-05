package ac.su.nodi.obj;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Singer {
    String name;
    String song;

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
        System.out.println("Singer is ready");
    }

    public void sing() {
        if (name != null && song != null) {
            System.out.printf("%s is singing %s\n", name, song);
        }
    }
}
