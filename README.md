<h1 align = "center">⋆. 𐙚˚࿔ 𝓕𝓪𝓼𝓽 𝓐𝓕 (𝓐𝓼 𝓕𝓲𝓷𝓰𝓮𝓻𝓼) 𝜗𝜚˚⋆</h1>
<h3 align = "center"> 𝖼𝗈𝗇𝗌𝗈𝗅𝖾-𝖻𝖺𝗌𝖾𝖽 𝗍𝗒𝗉𝗂𝗇𝗀 𝗀𝖺𝗆𝖾 </h3>
<p align = "center">
<b> 𝖨𝖳 2112 (𝙳𝙰𝙼𝙰𝚅𝚈:  </b> <br/>
𝑪𝒖𝒆𝒕𝒐, 𝑰𝒗𝒚 𝑵𝒊𝒄𝒐𝒍𝒆 𝑳. <br/>
𝑪𝒐𝒅𝒆𝒓𝒆𝒔, 𝑴𝒂𝒓𝒊𝒆𝒍𝒍𝒆 𝑬𝒊𝒓𝒆𝒏𝒆 𝑽.<br/>
𝑭𝒂𝒖𝒏𝒊, 𝑫𝒂𝒓𝒓𝒚𝒍𝒍 𝑰. 
</p>





## ⊹˚₊‧ Project Structure
```
    📂 `src/erds`
    ├── ☕ `Main.java`
    ├── ☕ `CRUD_Function.java`
    ├── ☕ `Report.java`
    ├── ☕ `File_Handling.java`
   

𝐅𝐀𝐒𝐓 𝐀𝐅(𝐀𝐒 𝐅𝐈𝐍𝐆𝐄𝐑𝐒) 𝐏𝐑𝐎𝐆𝐑𝐀𝐌

Description: This console-based typing game helps users, especially students in IT-related fields, improve their typing skills.It measures accuracy, total words typed, and WPM. Players can choose how many rounds, and customize their experience with background music, and typing topics drawn from various media. 
OOP Concepts in this Project:

1. Encapsulation
This is the concept of bundling related data and methods inside a single class. In our project, this principle is applied by dividing the program into three separate classes, each with its own clear responsibility:
- Main – Manages the menu, user choices, and overall program flow.
- MusicPlayerLoop – Handles all music-related functions such as playing, stopping, and selecting tracks.
- TypingSpeedTest – Manages the typing game logic, including timing, scoring, and accuracy calculations.

By keeping each task within its own class, the program stays organized, easier to maintain, and prevents different parts of the code from interfering with each other.

2. Abstraction
This is the concept of bundling related data and methods inside a single class. In our project, this principle is applied by dividing the program into three separate classes, each with its own clear responsibility:

- Main – Manages the menu, user choices, and overall program flow.
- MusicPlayerLoop – Handles all music-related functions such as playing, stopping, and selecting tracks.
- TypingSpeedTest – Manages the typing game logic, including timing, scoring, and accuracy calculations.

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
