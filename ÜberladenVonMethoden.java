/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {

    public static void addTags(String text,char tag) {
        String output = tag + text.substring(0, (int) Math.ceil(text.length() / 2.0)) + tag + text.substring((int) Math.ceil(text.length() / 2.0)) + tag;
        System.out.println(output);
    }

    public static void addTags(int number, char tag) {
        int digit = number, count = 0;

        while (digit > 0) {
            count++;
            digit = digit / 10;
        }
        double num = Math.pow(10, count - 1);
        int i = (int) num;
        String output = "" + tag;
        int helper = count;
        for (; i > 0; i /= 10) {

            if (helper == count / 2)
                output += tag;
            output += (number / i % 10);
            helper--;
        }
        output += tag;
        if (count == 1)
            output += tag;
        System.out.println(output);
    }


    public static void addTags(String text, String tags) {
        for (int i = 0; i < tags.length(); i++) {
            addTags(text, tags.charAt(i));
        }
    }

    public static void main(String[] args) {
        String text0 = "A";
        String text1 = "AB";
        String text2 = "Hello World!";//12
        String text3 = "Java-Programmierung";//19
        String text4 = "Das ist ein Test";//16

        addTags(text0, '?');
        addTags(text1, ',');
        addTags(text2, ':');
        addTags(text3, '+');
        addTags(text4, '-');

        addTags(1, '$');
        addTags(35, '*');
        addTags(2048, '#');
        addTags(657, ':');
        addTags(26348, '+');

        addTags(text2, "+#$");
        addTags(text3, ":*&!");
    }
}
/*
1.
public static void addTags(String text) {
        char tag = 'X';   //ein voreingestelltes Standardtrennzeichen
        String output = tag + text.substring(0, (int) Math.ceil(text.length() / 2.0)) + tag + text.substring((int) Math.ceil(text.length() / 2.0)) + tag;
        System.out.println(output);
    }

 */