package Practice.Random;

import java.util.Random;

public class RandomNum {


    public static void main(String[] args) {
        Random rng = new Random();

        for (int i = 0; i <= 5; i++) {

            int randomnumber = rng.nextInt(5);
            System.out.println(randomnumber);
        }
        String[] names = new String[] { "Alice", "Bob", "Clarice", "David", "Elizabeth" };
        int randomIndex = rng.nextInt(names.length);
        String randomName = names [randomIndex];

        System.out.println(randomName);

        double randomValue = rng.nextDouble(1);
        System.out.println(randomValue);

        boolean coinIsHead = randomValue < .5;
        System.out.println(coinIsHead);             // coin flip code!



    }
}



