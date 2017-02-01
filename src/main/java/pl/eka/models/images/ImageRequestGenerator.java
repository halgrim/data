package pl.eka.models.images;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ImageRequestGenerator {


    public static String generate(){
        String startURL = "https://dummyimage.com/";
        int min = 32;
        int max = 2560;

        int width = ThreadLocalRandom.current().nextInt(min+1,max+1);
        int height = ThreadLocalRandom.current().nextInt(min+1,max+1);

        String imageWidth = String.valueOf(width);
        String imageHeight = String.valueOf(height);

        String color = generateColor();

        String extension = ".jpg";

        String url = startURL + width + "x" + height + "/" + color + extension;

        return url;
    }

    private static String generateColor(){
        // create random object - reuse this as often as possible
        Random random = new Random();

        // create a big random number - maximum is ffffff (hex) = 16777215 (dez)
        int nextInt = random.nextInt(256*256*256);

        // format it as hexadecimal string (with hashtag and leading zeros)
        String colorCode = String.format("%06x", nextInt);

        return colorCode;
    }
}
