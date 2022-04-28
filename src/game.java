import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("Booting up...");
        System.out.println("Still loading...");
        System.out.println("Loaded... type start to begin!");
        Scanner userInput = new Scanner (System.in);
        boolean ready = false;

        while(!ready){
            String start = userInput.nextLine();
            if(start.equals("start")){
                System.out.println("Welcome-- er..uh--this would be easier if I knew your name ... what is it?");
                ready = true;
            } else {
                System.out.println("you have to type start, dude...");
            }
            String name = userInput.nextLine();
            System.out.println("Ahh, okay " + name + " now that I said it, I don't need to anymore." );

        }


    }
}
