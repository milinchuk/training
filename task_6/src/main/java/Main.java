import java.util.ArrayList;
import java.util.List;

/**
 * Created by click on 11/21/2016.
 */
public class Main {

    public static void main(String[] args){
        List<String> newList = new NewList<String>();
        newList.add("Hello");
        newList.add("World");

        System.out.println(newList.size());
    }
}
