package assessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String breed1 = "German Shepherd";
        String breed2 = "Pomeranian";
        String breed3 = "Husky";
        String breed4 = "Poodle";
        String breed5 = "Bulldog";

        System.out.println("What is your dogs name?");
        String name = sc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n");

        System.out.println(name + " is:\n");

        Random r = new Random();

        int r1, r2, r3 , r4, r5, r6 = 0;

        do{

            r1 = r.nextInt(101);
            r2 = r.nextInt(101-r1);
            r3 =  r.nextInt(101-r1-r2);
            r4 =  r.nextInt(101-r1-r2-r3);
            r5 =  r.nextInt(101-r1-r2-r3-r4);

            r6 = r1 + r2 + r3 + r4 + r5;

        }
        while(r6 != 100);

        System.out.println(r1 + "% " + breed1);
        System.out.println(r2 + "% " + breed2);
        System.out.println(r3 + "% " + breed3);
        System.out.println(r4 + "% " + breed4);
        System.out.println(r5 + "% " + breed5);


        System.out.println("\n Wow, that's QUITE the dog!");




    }


}
