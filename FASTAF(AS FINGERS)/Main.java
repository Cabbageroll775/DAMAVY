import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // default music
        MusicPlayerLoop.playMusic("Game Corner.wav");

        while (true) {
            System.out.println("\n=== WELCOME TO FASTAF(AS FINGERS) ===");
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Go to Typing Game");
            System.out.println("2. Open Music Picker");
            System.out.println("3. Stop Music");
            System.out.println("4. Exit Program");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> TypingSpeedTest.startTypingGame();
                case 2 -> MusicPlayerLoop.musicPicker();
                case 3 -> {
                    MusicPlayerLoop.stopMusic();
                    System.out.println("Music stopped.");
                }
                case 4 -> {
                    MusicPlayerLoop.stopMusic();
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
