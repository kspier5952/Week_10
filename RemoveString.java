import java.util.*;
public class RemoveString {
    public static void main(String[]args){
        String sentence;
        String fragment;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        sentence = input.nextLine();
        System.out.println("Enter a string: ");
        fragment = input.nextLine();
        input.close();
        System.out.println(sentence.replace(fragment, ""));        
    }
}
