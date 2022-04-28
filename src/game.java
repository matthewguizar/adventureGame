import java.io.IOException;
import java.util.Scanner;

public class game {
    public static void main(String[] args) throws IOException {
        System.out.println("Booting up...");
        System.out.println("Still loading...");
        System.out.println("Loaded... type start to begin!");
        Scanner userInput = new Scanner(System.in);
        boolean ready = false;
        boolean jingle = false;


        while (!ready) {
            String start = userInput.nextLine();
            if (start.equals("start")) {
                System.out.println("Welcome-- er..uh--this would be easier if I knew your name ... what is it?");
                ready= true;
            } else {
                System.out.println("you have to type start, dude...");
            }
        }
        String name = userInput.nextLine();
        System.out.println("I'm forced to say your name now that I know it.. so here it goes... " + name + ". Anyways, Are ready to jingle your bells? (y/n)");

        while (!jingle){
            String y_n = userInput.next();
            if (y_n.equals("y")) {
                System.out.println("Easy there... we don't need a dead space cadet on our hands... but I guess I should be happy you didn't say no .. never mind.");
                jingle = true;
            } else if (y_n.equals("n")) {
                System.out.println("Don't worry less than 20 percent make it back, wait... that doesn't seem-- Well it's probably a typo.");
                jingle = true;
            } else {
                System.out.println("bruv it's y or n only...");

           }
        }

            System.out.print("Next on the agenda, you're allowed carry-on how many suitcases do you plan on bringing? Enter number.");
            int suitcase = userInput.nextInt();
            if (suitcase == 2) {
                System.out.println("Sounds good");
            } else if (suitcase > 2) {
                System.out.println("that's too many, you can only bring a maximum of two.");
            } else if (suitcase == 1) {
                System.out.println("Nice packing skills.");
            }

            System.out.println("Next, you're allowed to bring gone companion animal with you. What kind of companion animal would you like to bring?");
            String companion = userInput.nextLine();
            System.in.read();
            System.out.println("What is your companions name?");
            String companionName = userInput.nextLine();
            System.in.read();
            System.out.println("alright we have a(n)" + companionName + " the " + companion);
            System.out.println(" ");
            System.out.println("NASA has a interior design team offering to outfit your space ship. You have a couple of options for the interior decor of your ship.");
            System.out.println(" ");
            String A = "Sleek, modern minimalism";
            String B = "Retro/vintage space age";
            String C = "SF Hippie chic";
            System.out.println(" You options are " + A + B + C);
        }
    }

