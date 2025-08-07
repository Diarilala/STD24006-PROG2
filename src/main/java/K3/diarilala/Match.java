package K3.diarilala;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor

public class Match {
    private String id;
    private Date date;
    private String location;
    private MatchType type;
    private Fighter fighter1;
    private Fighter fighter2;

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(MatchType type) {
        this.type = type;
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }

    public void finish() {
        if(MatchType.OFFICIAL.equals(this.type)) {

        }
    }
}
