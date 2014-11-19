/*Emma Resnick
 CSE2
 HW10
 Program 2
 
 
 This program first allows the user to get dealt a hand of cards to play poker. This can be done until 
 the user decides otherwise. Once the user quits out of the dealing, a frequency chart is created of all
 the frequencies of each rank if they appear only once in a hand.
 
 The frequencies are slightly off, but I am not entirely sure why.
*/





import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }
    public static boolean exactlyOneDup(String[] x) {
        int counter = -1;
        int i = 0;

        for (i = 0; i < x.length; i++) {

            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j] & i != j) {
                    counter++;
                }

                else {
                    counter = counter;
                }
            }

        }

        if (i == x.length & counter == 1) {
            return true;
        }


        else if (i == x.length & (counter == -1)) {
            return false;
        }

        else if (i == x.length & (counter >= 2)) {
            return false;
        }

        return true;
    }

    public static String showHands() {
        Scanner scan = new Scanner(System.in);
        int cards = 52;
        String[] deck = new String[cards];
        String answer = "";

        //clubs
        deck[0] = "A";
        deck[1] = "K";
        deck[2] = "Q";
        deck[3] = "J";
        deck[4] = "10";
        deck[5] = "9";
        deck[6] = "8";
        deck[7] = "7";
        deck[8] = "6";
        deck[9] = "5";
        deck[10] = "4";
        deck[11] = "3";
        deck[12] = "2";

        //diamonds
        deck[13] = "A";
        deck[14] = "K";
        deck[15] = "Q";
        deck[16] = "J";
        deck[17] = "10";
        deck[18] = "9";
        deck[19] = "8";
        deck[20] = "7";
        deck[21] = "6";
        deck[22] = "5";
        deck[23] = "4";
        deck[24] = "3";
        deck[25] = "2";

        //hearts
        deck[26] = "A";
        deck[27] = "K";
        deck[28] = "Q";
        deck[29] = "J";
        deck[30] = "10";
        deck[31] = "9";
        deck[32] = "8";
        deck[33] = "7";
        deck[34] = "6";
        deck[35] = "5";
        deck[36] = "4";
        deck[37] = "3";
        deck[38] = "2";

        //spades
        deck[39] = "A";
        deck[40] = "K";
        deck[41] = "Q";
        deck[42] = "J";
        deck[43] = "10";
        deck[44] = "9";
        deck[45] = "8";
        deck[46] = "7";
        deck[47] = "6";
        deck[48] = "5";
        deck[49] = "4";
        deck[50] = "3";
        deck[51] = "2";

        String[] clubs = new String[5];
        String[] diamonds = new String[5];
        String[] hearts = new String[5];
        String[] spades = new String[5];

        int c = 0;
        int d = 0;
        int h = 0;
        int s = 0;

        do {
            System.out.println("Here is your deck of cards: ");
            int j = (int)(Math.random() * 52);

            //picks each card for hand
            //determines what the suit is of the card picked
            for (int i = 0; i < 5; i++) {

                if (j >= 0 & j <= 12) {
                    clubs[c] = deck[j];
                    c++;

                }

                if (j >= 13 & j <= 25) {
                    diamonds[d] = deck[j];
                    d++;


                }
                if (j >= 26 & j <= 38) {
                    hearts[h] = deck[j];
                    h++;

                }
                if (j >= 39 & j <= 51) {
                    spades[s] = deck[j];
                    s++;

                }

                if (i != 4) {
                    j = (int)(Math.random() * 52);
                }

            }

            //prints "null" when spots in array are not used, I do not know how to fix this
            System.out.println("Clubs: " + Arrays.toString(clubs));
            System.out.println("Diamonds: " + Arrays.toString(diamonds));
            System.out.println("Hearts: " + Arrays.toString(hearts));
            System.out.println("Spades: " + Arrays.toString(spades));


            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();

            //reset
            c = 0;
            d = 0;
            h = 0;
            s = 0;

            clubs = new String[5];
            diamonds = new String[5];
            hearts = new String[5];
            spades = new String[5];

        } while (answer.equals("Y") || answer.equals("y"));
        return "";
    }

    public static String simulateOdds() {
        int cards = 52;
        String deck[] = new String[cards];
        String hand[] = new String[5];

        //used for listing freq of exactly one pair
        int Aces = 0;
        int Kings = 0;
        int Queens = 0;
        int Jacks = 0;
        int ten = 0;
        int nine = 0;
        int eight = 0;
        int seven = 0;
        int six = 0;
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int notExact = 0;

        //clubs
        deck[0] = "A";
        deck[1] = "K";
        deck[2] = "Q";
        deck[3] = "J";
        deck[4] = "10";
        deck[5] = "9";
        deck[6] = "8";
        deck[7] = "7";
        deck[8] = "6";
        deck[9] = "5";
        deck[10] = "4";
        deck[11] = "3";
        deck[12] = "2";

        //diamonds
        deck[13] = "A";
        deck[14] = "K";
        deck[15] = "Q";
        deck[16] = "J";
        deck[17] = "10";
        deck[18] = "9";
        deck[19] = "8";
        deck[20] = "7";
        deck[21] = "6";
        deck[22] = "5";
        deck[23] = "4";
        deck[24] = "3";
        deck[25] = "2";

        //hearts
        deck[26] = "A";
        deck[27] = "K";
        deck[28] = "Q";
        deck[29] = "J";
        deck[30] = "10";
        deck[31] = "9";
        deck[32] = "8";
        deck[33] = "7";
        deck[34] = "6";
        deck[35] = "5";
        deck[36] = "4";
        deck[37] = "3";
        deck[38] = "2";

        //spades
        deck[39] = "A";
        deck[40] = "K";
        deck[41] = "Q";
        deck[42] = "J";
        deck[43] = "10";
        deck[44] = "9";
        deck[45] = "8";
        deck[46] = "7";
        deck[47] = "6";
        deck[48] = "5";
        deck[49] = "4";
        deck[50] = "3";
        deck[51] = "2";



        int j = (int)(Math.random() * 52);
        int h = 0;

        for (int simulation = 0; simulation <= 10000; simulation++) {
            for (int i = 0; i <= 5; i++) {

                //takes card from deck and puts into hand, leaving one less card in the deck
                if (deck[j] == null) {
                    j = (int)(Math.random() * 52);
                }
                hand[h] = deck[j];
                deck[j] = null;

                h++;

                if (i <= 5) {
                    j = (int)(Math.random() * 52);
                }

                if (h == 5) {
                    break;
                }
                //makes sure "null" is not included in the hand
                if (deck[j] == null) {
                    j = (int)(Math.random() * 52);
                }

            }



            //if there is only one pair
            if (exactlyOneDup(hand) == true) {
                //figures out which card is the duplicate
                for (int k = 1; k < hand.length; k++) {
                    if (hand[k] == hand[k - 1]) {

                        //assigns a frequency depending on what rank is paired
                        switch (hand[k]) {
                            case "A":
                                Aces++;
                                break;
                            case "K":
                                Kings++;
                                break;
                            case "Q":
                                Queens++;
                                break;
                            case "J":
                                Jacks++;
                                break;
                            case "10":
                                ten++;
                                break;
                            case "9":
                                nine++;
                                break;
                            case "8":
                                eight++;
                                break;
                            case "7":
                                seven++;
                                break;
                            case "6":
                                six++;
                                break;
                            case "5":
                                five++;
                                break;
                            case "4":
                                four++;
                                break;
                            case "3":
                                three++;
                                break;
                            case "2":
                                two++;
                                break;
                        }

                        if (k != hand.length) {
                            //assigns a frequency depending on what rank is paired
                            switch (hand[k]) {
                                case "A":
                                    Aces++;
                                    break;
                                case "K":
                                    Kings++;
                                    break;
                                case "Q":
                                    Queens++;
                                    break;
                                case "J":
                                    Jacks++;
                                    break;
                                case "10":
                                    ten++;
                                    break;
                                case "9":
                                    nine++;
                                    break;
                                case "8":
                                    eight++;
                                    break;
                                case "7":
                                    seven++;
                                    break;
                                case "6":
                                    six++;
                                    break;
                                case "5":
                                    five++;
                                    break;
                                case "4":
                                    four++;
                                    break;
                                case "3":
                                    three++;
                                    break;
                                case "2":
                                    two++;
                                    break;
                            }

                        }
                    }
                }
            }

            //if there is not only one pair
            if (exactlyOneDup(hand) == false) {
                notExact++;
            }


            //reset the arrays 
            h = 0;
            deck = new String[cards];
            hand = new String[5];

            //clubs
            deck[0] = "A";
            deck[1] = "K";
            deck[2] = "Q";
            deck[3] = "J";
            deck[4] = "10";
            deck[5] = "9";
            deck[6] = "8";
            deck[7] = "7";
            deck[8] = "6";
            deck[9] = "5";
            deck[10] = "4";
            deck[11] = "3";
            deck[12] = "2";

            //diamonds
            deck[13] = "A";
            deck[14] = "K";
            deck[15] = "Q";
            deck[16] = "J";
            deck[17] = "10";
            deck[18] = "9";
            deck[19] = "8";
            deck[20] = "7";
            deck[21] = "6";
            deck[22] = "5";
            deck[23] = "4";
            deck[24] = "3";
            deck[25] = "2";

            //hearts
            deck[26] = "A";
            deck[27] = "K";
            deck[28] = "Q";
            deck[29] = "J";
            deck[30] = "10";
            deck[31] = "9";
            deck[32] = "8";
            deck[33] = "7";
            deck[34] = "6";
            deck[35] = "5";
            deck[36] = "4";
            deck[37] = "3";
            deck[38] = "2";

            //spades
            deck[39] = "A";
            deck[40] = "K";
            deck[41] = "Q";
            deck[42] = "J";
            deck[43] = "10";
            deck[44] = "9";
            deck[45] = "8";
            deck[46] = "7";
            deck[47] = "6";
            deck[48] = "5";
            deck[49] = "4";
            deck[50] = "3";
            deck[51] = "2";

        }

        //freq.chart
        System.out.println("Rank            Freq of Exactly One Pair");
        System.out.println("A:                      " + Aces);
        System.out.println("K:                      " + Kings);
        System.out.println("Q:                      " + Queens);
        System.out.println("J:                      " + Jacks);
        System.out.println("10:                      " + ten);
        System.out.println("9:                      " + nine);
        System.out.println("8:                      " + eight);
        System.out.println("7:                      " + seven);
        System.out.println("6:                      " + six);
        System.out.println("5:                      " + five);
        System.out.println("4:                      " + four);
        System.out.println("3:                      " + three);
        System.out.println("2:                      " + two);
        System.out.println("----------------------------------------");
        System.out.println("Total not exactly one pair: " + notExact);
        return "";
    }

}
