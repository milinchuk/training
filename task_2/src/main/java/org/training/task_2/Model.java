package org.training.task_2;

/**
 * This is the main logic of game. Here computer generates a secret number which user must guess.
 * Model have a barriers - live interval, which is a border of field of game.
 * The main logic of {@link org.training.task_2.Model} is check users value, set up, checked a barriers value.
 *
 * @author Anastasia Milinchuk
 */
public class Model {
    /**
     * Left border of interval
     */
    private int minBarrier;

    /**
     * Right border of interval
     */
    private int maxBarrier;

    /**
     * Value which computer generate
     */
    private int secretValue;

    /**
     * Check if users value equals to secret value
     *
     * @param value is number that user assume
     * @return boolean if user win or not
     */
    public boolean checkValue (int value){
        if (value == secretValue){
            return true;
        } else if (value > secretValue){
            maxBarrier = value;
        } else {
            minBarrier = value;
        }
      return false;
    }

    /**
     * Set left and right border of barrier
     *
     * @param minBarrier is left border of barrier
     * @param maxBarrier is right border of barrier
     */
    public void setPrimaryBarrier(int minBarrier, int maxBarrier){
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    /**
     * Check if barrier that user get is correct.
     *
     * @param minBarrier is left border of barrier
     * @param maxBarrier is right border of barrier
     *
     * @return boolean value
     */
    public boolean checkBarrier(int minBarrier, int maxBarrier){
        if( (minBarrier > GlobalConstants.PRIMARY_MIN_BARRIER)
                && (maxBarrier < GlobalConstants.PRIMARY_MAX_BARRIER)
                && (maxBarrier - minBarrier > 1) ){
            return true;
        }
        return false;
    }

    /**
     * Generation of secret value
     */
    public void setSecretValue() {
        secretValue = (int)Math.ceil(Math.random() *
                (maxBarrier - minBarrier -1) + minBarrier);
    }

    public int getSecretValue() {
        return secretValue;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }
}
