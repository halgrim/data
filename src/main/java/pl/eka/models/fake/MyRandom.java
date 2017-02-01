package pl.eka.models.fake;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class MyRandom {

    static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    static String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    static boolean randomBol(){
        return (Math.random() < 0.5);
    }

    static boolean randomBol(double bla ){
        return (Math.random() < bla);
    }

    static long randomLongForDate(){

        return ThreadLocalRandom.current().nextLong(1483258567000L,1485936967000L);
    }

    static String randomSubStep(){
        String[] steps = {"type 1", "type 2", "type 3", "type 4", "type 5", "type 6", "type 7", "type 8", "type 9", "type 10", "type 11"};

        int type = ThreadLocalRandom.current().nextInt(0,11);
        return steps[type];

    }

    public static String randomStep() {
        String[] steps = {"Step type 1", "Step type 2", "Step type  3", "Step type  4"};

        int type = ThreadLocalRandom.current().nextInt(0,4);
        return steps[type];
    }

    public static String randomProperty() {
        String[] steps = {"property 1", "property 2", "property 3", "property 4", "property 5", "property 6"};

        int type = ThreadLocalRandom.current().nextInt(0,6);
        return steps[type];
    }

    public static String randomOtherProperty() {
        String[] steps = {"other property 1", "other property 2", "other property 3", "other property 4", "other property 5", "other property 6"};

        int type = ThreadLocalRandom.current().nextInt(0,6);
        return steps[type];
    }
}
