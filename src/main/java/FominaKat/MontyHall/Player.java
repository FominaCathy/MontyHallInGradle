package FominaKat.MontyHall;


import lombok.Getter;

/**
 * Класс для описания игрока
 */

public class Player {
    //стратегия игрока, если true игрок меняет дверь
    @Getter
    private boolean risk;

    public Player(String name, boolean risk) {
        this.risk = risk;
    }


}
