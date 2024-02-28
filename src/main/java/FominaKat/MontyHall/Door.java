package FominaKat.MontyHall;

import lombok.Getter;

/**
 * Класс для описание двери
 */

public class Door {
    @Getter
    private boolean prize;

    public Door(boolean isPrize) {
        this.prize = isPrize;
    }


}
