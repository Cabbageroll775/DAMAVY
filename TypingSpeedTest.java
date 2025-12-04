import java.util.*;

public class TypingSpeedTest {
    static Scanner scanner = new Scanner(System.in);

    // THEMES 
    static String[] quotes = {
        "Success starts with small consistent steps every day.",
        "Your future is created by what you do today.",
        "Raindrops create ripples on the calm river.",
        "Great things take time, so trust your pace.",
        "Believe in yourself even when others doubt you.",
        "Discipline beats motivation when days get tough.",
        "Dream big, work hard, and stay humble.",
        "Small wins still count—celebrate them.",
        "Every mistake is a lesson you need to grow.",
        "Be the energy you want to attract."
    };

    static String[] panagrams = {
        "Sixty zippers were quickly picked from the woven jute bag",
        "Brown jars prevented the mixture from freezing too quickly.",
        "My girl wove six dozen plaid jackets before she quit.",
        "We promptly judge antique ivory buckles for the next prize",
        "Amazingly, few discotheques provide jukeboxes",
        "The quick brown fox jumps over a lazy dog",
        "The jay, pig, fox, zebra and my wolves quack!",
        "The five boxing wizards jump quickly.",
        "Two driven jocks help fax my big quiz",
        "A wizards job is to vex chumps quickly in fog.",
    };

    static String[] swift = {
        "The rest of the world was black and white, but we were in screaming color.",
        "All's well that ends well to end up with you.",
        "Squeeze my hand three times in the back of the taxi.",
        "Spinning in my highest heels, love, shining just for you.",
        "I'll stare directly at the sun but never in the mirror.",
        "Everything you lose is a step you take.",
        "Never be so kind you forget to be clever, never be so clever you forget to be kind.",
        "When I was drowning, that's when I could finally breathe",
        "Take pictures in your mind of your childhood room",
        "I don't like slow motion double vision in rose blush"
    };

    static String[] joke = {
        "I failed math so many times at school, I cant even count.",
        "I told my wife she should embrace her mistakes. She gave me a hug.",
        "I went to buy some camouflage pants, but I couldn't find any.",
        "What do you call a snowman with a six-pack? An abdominal snowman!",
        "Why don't skeletons fight each other? They don't have the guts!",
        "I'm writing a book about glue, but I'm stuck on the first chapter.",
        "Stop looking for the perfect match, use a lighter.",
        "Can February March? No, but April May!",
        "Why was 6 afraid of 7? Because 7 ate nine!",
        "I'm so good at sleeping that I do it with my eyes closed."
        
    };

    static String[] randomness = {
        "fjKeaotslvrND",
        "ZpvdmkaRqsenWL",
        "hlTslraPNEkfu",
        "LwqsnDkpmRTvy",
        "bNfksqtmrehPU",
        "YptmSldRAehvKF",
        "kdrtMsaNvpefLH",
        "JqmrVhTkasnPW",
        "ewQpskMTnavDLu",
        "qmslAhdnvRTyb"
    };

    // Return theme by choice
    static String[] getTheme(int choice) {
        switch (choice) {
            case 1 -> { return quotes; }
            case 2 -> { return panagrams; }
            case 3 -> { return swift; }
            case 4 -> { return joke; }
            case 5 -> { return randomness; }
            default -> { return quotes; }
        }
    }

    //  Start Game
    public static void startTypingGame() {
        System.out.println("\n=== Welcome to Typing Speed Test! ===");

        // 🎨 STEP 1: Choose theme
        System.out.println("\nChoose a theme:");
        System.out.println("1. Motivational Quotes");
        System.out.println("2. Panagrams");
        System.out.println("3. Taylor Swift Lyrics");
        System.out.println("4. Jokes");
        System.out.println("5. Random(HARD!)");
        System.out.print("Enter your choice: ");

        int themeChoice = scanner.nextInt();
        String[] selectedTheme = getTheme(themeChoice);

        //Choose number of rounds
        System.out.print("\nHow many rounds do you want? ");
        int rounds = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Random random = new Random();
        double totalCorrectChars = 0;
        double totalCharsTyped = 0;
        double totalTimeSeconds = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nROUND " + i);

            String sentence = selectedTheme[random.nextInt(selectedTheme.length)];
            System.out.println("Type this sentence:\n" + sentence);

            System.out.print("Your answer: ");

            // ⏱ Start time
            long startTime = System.currentTimeMillis();
            String answer = scanner.nextLine();
            long endTime = System.currentTimeMillis();
            double timeTaken = (endTime - startTime) / 1000.0; // seconds

            totalTimeSeconds += timeTaken;

            //  Count characters
            int minLength = Math.min(sentence.length(), answer.length());
            int correctChars = 0;
            for (int j = 0; j < minLength; j++) {
                if (sentence.charAt(j) == answer.charAt(j)) {
                    correctChars++;
                }
            }

            totalCorrectChars += correctChars;
            totalCharsTyped += answer.length();
        }

        // FINAL CALCULATIONS
        double accuracy = (totalCorrectChars / totalCharsTyped) * 100;
        double wordsTyped = totalCorrectChars / 5.0; // 5 chars per word
        double minutes = totalTimeSeconds / 60.0;
        double wpm = wordsTyped / minutes;

        //  RESULT
        System.out.println("\n=== Test Finished! ===");
        System.out.printf("Total Time: %.2f seconds\n", totalTimeSeconds);
        System.out.printf("Speed: %.2f WPM\n", wpm);
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        //  Return to Main Menu
        System.out.println("\nPress ENTER to return to Main Menu...");
        scanner.nextLine();
    }
}
