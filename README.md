# DAMAVY


FAST AF(AS FINGERS) PROGRAM

Description: This console-based typing game helps users, especially students in IT-related fields, improve their typing skills.It measures accuracy, total words typed, and WPM. Players can choose how many rounds, and customize their experience with background music, and typing topics drawn from various media. 
OOP Concepts in this Project:

1. Encapsulation

Encapsulation means grouping related data and methods in one class.
My project uses three classes, each with its own job:

Main handles the menu and program flow.

MusicPlayerLoop handles playing, stopping, and choosing music.

TypingSpeedTest handles the typing game logic and calculations.

Each class has its own methods and data. This keeps the program organized and prevents mixing responsibilities.

2. Abstraction

Abstraction means hiding complex code behind simple method calls.

Examples:

MusicPlayerLoop.playMusic("Watermelon Battle.wav");
TypingSpeedTest.startTypingGame();


The Main class does not need to know how music works or how WPM is calculated. It only uses simple methods. Users only see easy actions, not the complex code inside.

3. Inheritance

The program does not create custom subclasses, but it still uses inheritance from Java’s built-in classes.

Examples:

Scanner inherits from interfaces such as Iterator.

Clip inherits from DataLine and Line.

AudioInputStream inherits from InputStream.

Because these classes already use inheritance, the program benefits when calling methods like:

clip.start();
scanner.nextInt();

4. Polymorphism

Polymorphism allows the same method to behave differently depending on the object.

Examples:

AudioSystem.getClip() returns a different Clip type depending on the device or OS.

Scanner uses methods with different behaviors, such as:

nextInt();  // reads a number
nextLine(); // reads text


One switch structure also performs different actions depending on the user’s input choice. This is another form of polymorphism.
