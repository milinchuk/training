package strategy;

/**
 * Created by click on 11/28/2016.
 */
public class CompareStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
