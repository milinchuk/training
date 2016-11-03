import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.training.task_2.Controller;
import org.training.task_2.GlobalConstants;
import org.training.task_2.Model;

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * ]Test of Model
 *
 * @author Anastasia Milichuk
 */
public class ModelTest {
    /**
     * Main logic
     */
    Model model;

    /**
     * Initialize of data
     */
    @Before
    public void setUp(){
        model = new Model();
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
    }

    /**
     * Test if secret number don't go away from barriers
     */
    @Test
    public void secretValueTest(){
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            model.setSecretValue();
            integerList.add(model.getSecretValue());
        }
        Collections.sort(integerList);
        assertTrue(integerList.get(0) > model.getMinBarrier());
        assertTrue(integerList.get(integerList.size() - 1) < model.getMaxBarrier());
    }

    /**
     * Check if barrier would be forever in right order
     */
    @Test
    public void checkRightOrderBarrier(){
        assertFalse(model.checkBarrier(21, 12));
    }

    /**
     * Check if borders lie in right barriers
     */
    @Test
    public void checkRightNumberInBarrier(){
        assertFalse(model.checkBarrier(0, 100));
    }

    /**
     * Check if distance between barriers is respected
     */
    @Test
    public void checkRightDistanceInBarrier(){
        assertFalse(model.checkBarrier(12, 13));
    }
}
