import java.util.Scanner;

/**
 * Created by rkulov on 04.02.15.
 */
public class CountAllWords {
    public static void main ( String[] args){
        Scanner in=new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(text.split("\\W+").length);
    }
}
