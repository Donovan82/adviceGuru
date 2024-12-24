// version 1.0
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {

        // prompts user for input
        Scanner input = new Scanner(System.in);
        System.out.println("What troubles your mortal soul? Spill the tea, and I shall spill the truth.");

        int result = (int)(Math.random()*20);

        String response = input.nextLine();

        // if-else tree for possible responses
        if (result == 0) {
            System.out.println("The Guru's wisdom flows eternal, but even I can't fix your bad decisions.");
        } else if (result == 1) {
            System.out.println("Why are you asking me? Even my cat has better judgment than you.");
        } else if (result == 2) {
            System.out.println("Oh, great seeker, the universe tells me... you’re just not that important.");
        } else if (result == 3) {
            System.out.println("The stars say... you’re procrastinating again. Get back to work!");
        } else if (result == 4) {
            System.out.println("The spirits whisper: 'This one is hopeless.' That’s you, by the way.");
        } else if (result == 5) {
            System.out.println("Your aura is... meh. I recommend trying again after a nap.");
        } else if (result == 6) {
            System.out.println("Congratulations! You’re on the path to mediocrity. Keep it up!");
        } else if (result == 7) {
            System.out.println("The Guru predicts you’ll trip over air in the next 24 hours. Good luck.");
        } else if (result == 8) {
            System.out.println("Ah, I sense an answer... or maybe that’s just last night’s burrito.");
        } else if (result == 9) {
            System.out.println("The ancient scrolls of wisdom say... you’re screwed.");
        } else if (result == 10) {
            System.out.println("The mighty oracle reveals... that you’re annoying. Next question?");
        } else if (result == 11) {
            System.out.println("Your future looks bright... as long as you don’t touch anything important.");
        } else if (result == 12) {
            System.out.println("Oh, you want advice? Try Googling it next time, genius.");
        } else if (result == 13) {
            System.out.println("The Guru says: Stop blaming Mercury retrograde for your bad choices.");
        } else if (result == 14) {
            System.out.println("The cosmic forces tell me... your Wi-Fi password is stronger than your willpower.");
        } else if (result == 15) {
            System.out.println("I see great things in your future... Oh wait, that's someone else’s fortune.");
        } else if (result == 16) {
            System.out.println("The universe says: 'Stop asking dumb questions.'");
        } else if (result == 17) {
            System.out.println("The spirits are laughing at your question, and honestly, so am I.");
        } else if (result == 18) {
            System.out.println("Your destiny awaits... but honestly, it might just be more bad coffee.");
        } else if (result == 19) {
            System.out.println("The stars aligned to say this: Nope, not today.");
        }
    }
}