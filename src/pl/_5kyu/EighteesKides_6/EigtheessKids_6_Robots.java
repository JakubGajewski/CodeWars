package pl._5kyu.EighteesKides_6;

//https://www.codewars.com/kata/566b490c8b164e03f8000002/train/java
//
//You and your friends have been battling it out with your Rock 'Em, Sock 'Em robots, but things have gotten a little boring. You've each decided to add some amazing new features to your robot and automate them to battle to the death.
//
//Each robot will be represented by an object. You will be given two robot objects, and an object of battle tactics and how much damage they produce. Each robot will have a name, hit points, speed, and then a list of battle tacitcs they are to perform in order. Whichever robot has the best speed, will attack first with one battle tactic.
//
//Your job is to decide who wins.

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class EigtheessKids_6_Robots {

    public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {

        int health1 = robot1.getHealth();
        int health2 = robot2.getHealth();

        Queue<Integer> tacticsValues1 = new LinkedList<>();
        Queue<Integer> tacticsValues2 = new LinkedList<>();

        for (int i = 0; i < robot1.getTactics().length; i++) {
            tacticsValues1.add(tactics.get(robot1.getTactics()[i]));
        }

        for (int i = 0; i < robot2.getTactics().length; i++) {
            tacticsValues2.add(tactics.get(robot2.getTactics()[i]));
        }

        int turn = robot1.getSpeed() >= robot2.getSpeed() ? 1 : 2;

        while (health1 > 0 && health2 > 0 && !(tacticsValues1.isEmpty() && tacticsValues2.isEmpty())) {
            if (turn == 1) {
                turn = 2;
                if (tacticsValues1.isEmpty()) {
                    continue;
                }
                health2 -= tacticsValues1.poll();
                continue;
            } else if (turn == 2) {
                turn = 1;
                if (tacticsValues2.isEmpty()) {
                    continue;
                }
                health1 -= tacticsValues2.poll();
                continue;
            }
        }

        if (health1 > health2) {
            return robot1.getName() + " has won the fight.";
        } else if (health2 > health1) {
            return robot2.getName() + " has won the fight.";
        } else {
            return "The fight was a draw.";
        }
    }
}
