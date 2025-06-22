package ploy_task;

// Q11. You are designing a music application where different musical instruments, 
// such as Piano, Guitar, and Violin, have unique ways of producing sound. 
// Implement a Java program using polymorphism where each instrument has a playSound() method 
// that behaves differently for each type of instrument.

abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Playing piano melody...");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Strumming guitar chords...");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Playing violin tune...");
    }
}

public class q11 {
    public static void main(String[] args) {
        Instrument i1 = new Piano();
        Instrument i2 = new Guitar();
        Instrument i3 = new Violin();

        i1.playSound();
        i2.playSound();
        i3.playSound();
    }
}

