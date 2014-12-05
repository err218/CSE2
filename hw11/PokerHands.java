/*Emma Resnick
  CSE2
  HW 11 
  5 Dec. 2014
  Program 1


This program allows the user to enter fives cards in a had, first by asking suit and then rank.
Then, the hand is analyzed and the user receives a message regarding what type of poker hand the hand is.
*/

import java.util.Arrays;
import java.util.Scanner;
public class PokerHands {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        int cardSuit = 0;
        int cardFace = 0;
        int[] hand = new int[5];
        int[] rank = new int[13];
        int[] freqRank = new int[5];
        String handType = "";
        int[] SUIT = new int[5];
        int [] RANK= new int [5];
        int counter = 0;
        
        //setting up card values by suit
        do {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the suit:'c','d','h','s' ");

                if (scan.hasNext()) {
                    String suit = scan.next();

                    switch (suit) {
                        case "c":
                            cardSuit = 0;
                            SUIT[i] = cardSuit;
                            break;
                        case "d":
                            cardSuit = 13;
                            SUIT[i] = cardSuit;
                            break;
                        case "h":
                            cardSuit = 26;
                            SUIT[i] = cardSuit;
                            break;
                        case "s":
                            cardSuit = 39;
                            SUIT[i] = cardSuit;
                            break;
                        default:
                            System.out.println("You did not enter a valid response.");
                            continue;

                    }

                }
                
                //setting up card values for rank
                System.out.println("Enter the face:'A','K','Q','J','10',...'2' ");
                if (scan.hasNext()) {
                    String face = scan.next();
                    switch (face) {
                        case "A":
                            cardFace = 0;
                            rank[0] ++;
                            RANK[i]=cardFace;
                            break;
                        case "K":
                            cardFace = 1;
                            rank[1] ++;
                            RANK[i]=cardFace;
                            break;
                        case "Q":
                            cardFace = 2;
                            rank[2] ++;
                            RANK[i]=cardFace;
                            break;
                        case "J":
                            cardFace = 3;
                            rank[3] ++;
                            RANK[i]=cardFace;
                            break;
                        case "10":
                            cardFace = 4;
                            rank[4] ++;
                            RANK[i]=cardFace;
                            break;
                        case "9":
                            cardFace = 5;
                            rank[5] ++;
                            RANK[i]=cardFace;
                            break;
                        case "8":
                            cardFace = 6;
                            rank[6] ++;
                            RANK[i]=cardFace;
                            break;
                        case "7":
                            cardFace = 7;
                            rank[7] ++;
                            RANK[i]=cardFace;
                            break;
                        case "6":
                            cardFace = 8;
                            rank[8] ++;
                            RANK[i]=cardFace;
                            break;
                        case "5":
                            cardFace = 9;
                            rank[9] ++;
                            RANK[i]=cardFace;
                            break;
                        case "4":
                            cardFace = 10;
                            rank[10] ++;
                            RANK[i]=cardFace;
                            break;
                        case "3":
                            cardFace = 11;
                            rank[11] ++;
                            RANK[i]=cardFace;
                            break;
                        case "2":
                            cardFace = 12;
                            rank[12] ++;
                            RANK[i]=cardFace;
                            break;
                        default:
                            System.out.println("You did not enter a proper response.");
                            continue;
                    }
                }
                
                //makes a deck of 52 cards
                hand[i] = cardSuit + cardFace;


            }
            showOneHand(hand);
            //shows how many times a specific face shows up.
            // System.out.println(" A  K  Q  J  10  9  8  7  6  5  4  3  2");
            // System.out.println(Arrays.toString(rank));
            int m = 0;
            for (int k = 0; k < 13; k++) {
                m = rank[k];
                switch (m) {
                    case 0:
                        freqRank[0] ++;
                        break;
                    case 1:
                        freqRank[1] ++;
                        break;
                    case 2:
                        freqRank[2] ++;
                        break;
                    case 3:
                        freqRank[3] ++;
                        break;
                    case 4:
                        freqRank[4] ++;
                        break;
                    default:
                        break;
                }
                m++;
            }



            //shows frequency of how many 0,1,2,3,4s are produced by rank[].
            // System.out.println(Arrays.toString(freqRank));




            //q has to be 13. 13 different ranks to choose from
            for (int q = 0; q < 13; q++) {
                
                //one pair
                if (freqRank[0] == 9 & freqRank[1] == 3 & freqRank[2] == 1 & rank[q] == 2) {
                    handType = "One Pair.";
                }
                //two pairs
                if (freqRank[0] == 10 & freqRank[1] == 1 & freqRank[2] == 2 & rank[q] == 2) {
                    handType = "Two Pair.";
                }
                
                 //three of a kind
                if (freqRank[0] == 10 & freqRank[1] == 2 & freqRank[3] == 1 & rank[q] == 3) {
                    handType = "Three of a Kind.";
                }
                
                //four of a kind
                if (freqRank[0] == 11 & freqRank[1] == 1 & freqRank[4] == 1 & rank[q] == 4) {
                    handType = "Four of a Kind.";
                }
                
                //full house //not working
                if (freqRank[0] == 11 & freqRank[1] == 1 & freqRank[3] == 1) {
                    handType = "Full House.";
                }
                
                
                 // straight flush not working yet (comes up as flush)
                if (freqRank[0] == 8 & freqRank[1] == 5 & SUIT[0] == SUIT[1] & SUIT[1] == SUIT[2] & SUIT[2] == SUIT[3] & SUIT[3]
                == SUIT[4]&hand[0]+1==hand[1]&hand[0]+2==hand[2]&hand[0]+3==hand[3]&hand[0]+4==hand[4]) {
                    handType = "Straight Flush.";
                }

                // flush
                if (freqRank[0] == 8 & freqRank[1] == 5 & SUIT[0] == SUIT[1] & SUIT[1] == SUIT[2] & SUIT[2] == SUIT[3] & SUIT[3] == SUIT[4]) {
                    handType = "Flush.";
                }

                //straight // not working
                if (freqRank[0] == 8 & freqRank[1] == 5 & SUIT[0] != SUIT[1]& RANK[q]==RANK[q+1]) {
                handType = "Straight.";
                }
                
                //royal flush
                
                //high card
                 if (freqRank[0] == 8 & freqRank[1] == 5 & SUIT[0] != SUIT[1]) {
                handType = "High Card.";
                }
                
               
                

        }
        System.out.println("The hand is a " + handType);


    }
    while (answer.equals("Y") || answer.equals("y"));
}

public static void showOneHand(int hand[]) {
    String suit[] = {
        "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
    };
    String face[] = {
        "A ", "K ", "Q ", "J ", "10 ", "9", "8 ", "7 ", "6 ", "5 ",
        "4 ", "3 ", "2 "
    };
    String out = "";
    for (int s = 0; s < 4; s++) {
        out += suit[s];
        for (int rank = 0; rank < 13; rank++)
            for (int card = 0; card < 5; card++)
                if (hand[card] / 13 == s && hand[card] % 13 == rank)
                    out += face[rank];
        out += '\n';
    }
    System.out.println(out);
}
}