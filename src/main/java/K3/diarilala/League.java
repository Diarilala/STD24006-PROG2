package K3.diarilala;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import static javax.management.Query.match;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class League {
    private final String name;
    private List<Fighter> fighters;
    private List<Match> matches;

    public static void createMatch(String id,
    Date date,
    String location,
    MatchType type,
    Fighter fighter1,
    Fighter fighter2) {
        Match match = new Match(id, date, location, type, fighter1, fighter2);
    }
}
