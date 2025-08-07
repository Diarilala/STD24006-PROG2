package K3.diarilala;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

    public static void createMatch(Match match) {
        match = new Match();
    }
}
