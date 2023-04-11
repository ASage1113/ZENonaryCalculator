import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);


        System.out.println("What function do you want to know?");
        System.out.println("1. Find what a door a set of 3 to 5 players can open");
        System.out.println("2. Find any set of players that can go through a particular door");
        System.out.println("3. Find who can go with you through a particular door");
        int select = myObj.nextInt();
        switch(select) {
            case 1:
                System.out.println("How many players");
                int players = myObj.nextInt();
                if ((players >= 3 && players <= 5)) {
                    one(players);
                } else {
                    System.out.println("There must be 3, 4 or 5 players");
                }
            case 2:
                System.out.println("What door do you want to enter");
                int door = myObj.nextInt();
                if(door >= 0 && door <= 9){
                    two(door);
                }else{
                    System.out.println("The door must be a number from 1 to 9");
                }

            case 3:
                System.out.println("What is your number?");
                int mybrace = myObj.nextInt();
                System.out.println("What door do you wish to go into");
                int mydoor = myObj.nextInt();
                if(mybrace >= 0 && mybrace <= 9 && mydoor >= 1 && mydoor <= 9){
                    three(mybrace, mydoor);
                }else if(mybrace >= 0 && mybrace <= 9){
                    System.out.println("Your number must be a number from 1 to 9");
                } else if (mydoor >= 1 && mydoor <= 9) {
                    System.out.println("The door must be a number from 1 to 9");
                } else {
                    System.out.println("Both the door and your number must be a number from 1 to 9");
                }

        }
    }

    static int digroot (int n){
        int root = 0;
        while (n > 0 || root > 9) {
            if (n == 0) {
                n = root;
                root = 0;
            }
            root += n % 10;
            n /= 10;
        }
        return root;
    }


        static void one(int players){
            Scanner myObj = new Scanner(System.in);
            int tscore = 0;
            for (int i = 1; i <= players; i++) {
                System.out.println("What is player " + i + "'s bracelet number?");
                int pscore = myObj.nextInt();
                tscore = tscore + pscore;
            }
            int doorscore = digroot(tscore);
            System.out.println("The total score of the bracelets is " + tscore);
            System.out.println("You can open the " + doorscore + " door");
        }

        static void two(int door){
            int runs = 0;
            for (int i = 1; i <= 9; i++) {
                for (int j = i + 1; j <= 9; j++) {
                    for (int k = j + 1; k <= 9; k++) {
                        for (int l = k + 1; l <= 9; l++) {
                            for (int m = l + 1; m <= 9; m++) {
                                if (door == digroot(i + j + k + l)) {
                                    System.out.println("Players " + i + ", " + j + ", " + k + ", " + l + " and " + m + " can pass through");
                                    runs++;
                                }//check for 5 player combos
                            }//player 5
                            if (door == digroot(i + j + k + l)) {
                                System.out.println("Players " + i + ", " + j + ", " + k + " and " + l + " can pass through");
                                runs++;
                            }//end 4 player combos
                        }//player 4
                        if (door == digroot(i + j + k)) {
                            System.out.println("Players " + i + ", " + j + " and " + k + " can pass through");
                            runs++;
                        }//check for 3 player combos
                    }//player 3
                }//player 2
            }//player 1
            System.out.println("Total number of combos: " + runs);
        }

        static void three(int mybrace, int mydoor){
            int runs = 0;
            for (int i = 1; i <= 9; i++) {
                if (i != mybrace) {
                    for (int j = i + 1; j <= 9; j++) {
                        if (j != mybrace) {
                            for (int k = j + 1; k <= 9; k++) {
                                if (k != mybrace) {
                                    for (int l = k + 1; l <= 9; l++) {
                                        if (l != mybrace) {
                                            if (mydoor == digroot(mybrace + i + j + k + l)) {
                                                System.out.println("Players " + i + ", " + j + ", " + k + " and " + l + " can pass through with you");
                                                runs++;
                                            }//end 5 player combos
                                        }//ends 5 check
                                    }//player 5
                                    if (mydoor == digroot(mybrace + i + j + k)) {
                                        System.out.println("Players " + i + ", " + j + " and " + k + " can pass through with you");
                                        runs++;
                                    }//check for 4 player combos
                                }//ends 4 check
                            }//player 4
                            if (mydoor == digroot(mybrace + i + j)) {
                                System.out.println("Players " + i + " and " + j + " and can pass through with you");
                                runs++;
                            }//ends 3 check
                        }//player 3
                    }//ends 3 check
                }//player 2
            }//ends 2 check
            System.out.println("Total number of combos: " + runs);
        }//ends select 3
}
