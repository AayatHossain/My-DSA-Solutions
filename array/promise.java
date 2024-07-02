public class promise {
    import java.util.concurrent.TimeUnit;



    public static void main(String[] args) {
        makePromise();
    }

    static void makePromise() {
        System.out.println("Hey there, my love! 💖");
        sleep(2);
        System.out.println("I wanted to express my promises in a special way,");
        sleep(2);
        System.out.println("so I wrote this program just for you.");

        sleep(2);
        System.out.println("\nHere it goes...\n");

        sleep(2);
        System.out.println("I, [Your Name], promise to:");

        String[] promises = {
                "Always be your biggest supporter.",
                "Listen to you with all my heart.",
                "Make you laugh when you need it most.",
                "Hold you close in good times and bad.",
                "Build a lifetime of memories together.",
                // Add more promises as you wish
        };

        for (String promise : promises) {
            sleep(1);
            System.out.println("  - " + promise);
        }

        sleep(2);
        System.out.println("\nAnd most importantly, I promise to love you unconditionally, every single day.");

        sleep(2);
        System.out.println("\nI hope this little program brings a smile to your face.");
        sleep(2);
        System.out.println("I love you more than words can express. ❤️");
    }

    static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

