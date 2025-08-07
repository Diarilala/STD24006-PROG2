package K3.diarilala;

import java.util.ArrayList;
import java.util.List;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Fighter {
    private final String id;
    private final String name;
    private final String lastName;
    private final String alias;
    private final String weight;
    private int win;
    private int loss;
    private int draw;

    public Fighter(String id, String name, String lastName, String alias, String weight) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.alias = alias;
        this.weight = weight;

    }



    public String displayPalmares() {
        return ("win: " + getWin() + " loss: " + getLoss() + " draw: " + getDraw());
    }

    public static void main(String[] args) {
        Fighter Ngannou = new Fighter("1", "Ngannou", "Erwin", "THE GORILLA", "95kg",
                29, 7, 5);

        System.out.println(Ngannou.toString());
        System.out.println(Ngannou.displayPalmares());
    }
}
