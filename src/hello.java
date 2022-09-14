public class hello {
    public static void main(String[] args) {
        //How to print
        System.out.println("Hello World");

        //Variables

        int num = 5;
        double doubley = 4.6;
        char firstInitial = 'J';
        String name = "Jake";
        boolean isHome = false;

//        System.out.println(num);
//        System.out.println(doubley);
//        System.out.println(name);
//        System.out.println(firstInitial);
//        System.out.println(isHome);

        if (num < 18) {
            System.out.println("You are not an adult");
        }

        while(num < 18) {
            System.out.println("You are not an adult");
            // num = num + 1;
            num++;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        if (name.equals("Jake")) {
            System.out.println("Happy Birthday");
        } else {
            System.out.println("Have a nice day");
        }

        int x = 0;

        do {
            System.out.println("Happy Wednesday");
            x++;
        } while(x < 10);

    }
}
