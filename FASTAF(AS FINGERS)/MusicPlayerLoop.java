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
        System.out.println("1. Watermelon Battle");
        System.out.println("2. Sardonyxs");
        System.out.println("3. Almost There");
        System.out.println("4. Watermelon Steven");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> playMusic("Watermelon Battle.wav");
            case 2 -> playMusic("Sardonyxs Theme.wav");
            case 3 -> playMusic("Almost There.wav");
            case 4 -> playMusic("Watermelon Steven.wav");
            default -> System.out.println("Invalid choice!");
        }
    }
}
