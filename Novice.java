import java.io.*;
import java.util.Scanner;

public class Novice {
    private int hp;
    private int exp;
    private int level;
    private int maxexp;
    private Bag store;

    private int 

    public Novice(int curr) {
        this.hp = 100;
        this.exp = 0;
        this.maxexp = 50;
        this.level = 0;
    }

    public int levelUp() {
        level = level + 1;
        return level;
    }

    public int sleep() {
        int sleeps = 0;
        if (sleeps == 5) {
            hp = hp + 5;
        }
        return hp;
    }

    public int attackmonter() {
        exp = exp + 10;
        if (exp >= maxexp) {
            this.levelUp();
        }
        hp = hp - 2;
        if (hp <= 0) {
            System.out.println("YOU DIE!!!");
        }
        exp = exp % maxexp;
        return level;
    }

    public int eatherbs() {
        int eatH = 0;
        if (eatH == 5) {
            hp = hp + 1;
        }
        return hp;
    }

    public

    }

    public static void main(String[] args) {
        Novice novice = new Novice();
        Scanner Sc = new Scanner(System.in);
        int number;
        System.out.println("Plese Enter Number For Novice Do");
        System.out.println("1 For Attack Monter");
        System.out.println("2 For Sleep");
        System.out.println("3 For EatHerbs");
        System.out.println("0 For End");

        do {
            System.out.print("Enter number : ");
            number = Sc.nextInt();

            if (number == 1) {
                System.out.println("Your level is " + novice.attackmonter());
            } else if (number == 2) {
                System.out.println("Your Hp is " + novice.sleep());
            } else if (number == 3) {
                System.out.println("Your Hp is " + novice.eatherbs());
            }

        } while (number != 0);
    }
