package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setPenWidth(5);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350);
        zofka.penDown();
        zofka.turnRight(90);

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                zofka.turnRight(90);
                zofka.move(100);
            }
            zofka.turnRight(45);
            zofka.move(70.7106);
            zofka.turnRight(90);
            zofka.move(70.7106);
            zofka.penUp();
            zofka.turnLeft(45);
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.penDown();
        }

    }

}
