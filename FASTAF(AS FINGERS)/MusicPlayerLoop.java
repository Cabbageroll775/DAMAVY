import javax.sound.sampled.*;
import java.io.File;

public class MusicPlayerLoop {

    static Clip clip;

    public static void playMusic(String filepath) {
        stopMusic(); // stop previous music if any
        try {
            File musicPath = new File(filepath);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
            } else {
                System.out.println("File not found: " + filepath);
            }
        } catch (Exception e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public static void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }

    // Music picker menu c
    public static void musicPicker() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("🎵 MUSIC PICKER 🎵");
        System.out.println("1. Bad Blood");
        System.out.println("2. Dance Of Swords");
        System.out.println("3. Game Corner");
        System.out.println("4. Nimbasa");
        System.out.println("5. Getaway Car");
        System.out.println("6. Watermelon Battle");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> playMusic("Bad Blood.wav");
            case 2 -> playMusic("Dance Of Swords.wav");
            case 3 -> playMusic("Game Corner.wav");
            case 4 -> playMusic("Nimbasa.wav");
            case 5 -> playMusic("Getaway Car.wav");
            case 6 -> playMusic("Watermelon Battle.wav");
            default -> System.out.println("Invalid choice!");
        }
    }
}
