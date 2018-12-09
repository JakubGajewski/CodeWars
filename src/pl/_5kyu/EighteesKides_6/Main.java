package pl._5kyu.EighteesKides_6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        
        robot1.setName("Rocky");
        robot1.setHealth(200);
        robot1.setSpeed(25);
        robot1.setTactics(new String[]{"punch", "punch", "laser", "missile"});


        robot2.setName("Missile Bob");
        robot2.setHealth(1100);
        robot2.setSpeed(21);
        robot2.setTactics(new String[]{});

        Map<String, Integer> tactics = new HashMap() {
            {
                put("punch", 20);
                put("laser", 30);
                put("missle", 35);
            }
        };

        System.out.println(EigtheessKids_6_Robots.fight(robot1, robot2, tactics));
    }
}
