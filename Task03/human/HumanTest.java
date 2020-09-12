package ru.mirea.java.task03.human;

public class HumanTest {
    public static void main(String[] args) throws Exception {

        Head head = new Head("Small", "Long", "Black");

        Leg leftLeg = new Leg(40);
        Leg rightLeg = new Leg(41);

        Hand rightHand = new Hand("Short");
        Hand leftHand = new Hand("Long");

        Human human = new Human(head, new Leg[]{rightLeg, leftLeg}, new Hand[]{rightHand, leftHand});
        System.out.println(human.toString());
    }
}
