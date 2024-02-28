package FominaKat.MontyHall;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main класс для запуска Монти Холла в цикле
 */
public class PlayGame {

    public static void main(String[] args) {

        Player gamer = new Player("Gamer", true);
        int statisticWin = 0;
        int step;
        DescriptiveStatistics statistics = new DescriptiveStatistics();

        for (step = 0; step < 1000; step++) {
            Game game = new Game(gamer, getDoors());
            statistics.addValue(game.round(0).isPrize() ? 1 : 0);
        }
        System.out.println("% выигрыша = " + statistics.getMean() * 100);
    }

    private static List<Door> getDoors() {

        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }
}
