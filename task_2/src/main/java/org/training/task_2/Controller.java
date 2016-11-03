package org.training.task_2;

import java.util.Scanner;

/**
 * Class which control the process of game
 *
 * @author Anastasia Milinchuk
 */
public class Controller {
    /**
     * Main login in game
     */
    Model model;

    /**
     * Presentation of game
     */
    View view;

    /**
     * Initialization of Controller
     *
     * @param model {@link org.training.task_2.Model} is main logic
     * @param view {@link org.training.task_2.View} is presentation layer
     */
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    /**
     * Start of main procces of game. Set up barriers.
     */
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
        view.printMessage(View.GREETING);
        getBarriersByUser(sc);
        model.setSecretValue();
        System.out.println(model.getSecretValue());

        while (!model.checkValue(inputIntValueWithScanner(sc))){}

        view.printMessage(View.CONGRATULATION + model.getSecretValue());
    }

    /**
     * Obtain certain border of interval from user. Both start and end of interval.
     * Print a message in the end of positive input.
     *
     * @param sc {@link java.util.Scanner} system of input
     */
    public void getBarriersByUser(Scanner sc){
        model.setPrimaryBarrier(getStartBarrier(sc), getEndBarrier(sc));
        view.printMessage(View.INTERVAL_CHOOSE);
    }

    /**
     * Obtain start barrier of interval. Check correctness of users input.
     * In case of incorrectness give a chance for user to input another data.
     *
     * @param sc {@link java.util.Scanner} system of input
     * @return correct start barrier
     */
    private int getStartBarrier(Scanner sc){
        view.printMessage(View.START_INTERVAL);
        model.setPrimaryBarrier(model.getMinBarrier(), model.getMaxBarrier() - 2);
        int startBarrier;
        do{
            startBarrier = inputIntValueWithScanner(sc);
            if(startBarrier >= model.getMaxBarrier()){
                view.printMessage(View.WRONG_RANGE_DATA);
            }else {
                break;
            }
        } while (model.checkBarrier(startBarrier, model.getMaxBarrier()));

        return startBarrier;
    }

    /**
     * Obtain end barrier of interval. Check correctness of users input.
     * In case of incorrectness give a chance for user to input another data.
     *
     * @param sc {@link java.util.Scanner} system of input
     * @return correct end barrier
     */
    private int getEndBarrier(Scanner sc){
        model.setPrimaryBarrier(getStartBarrier(sc), model.getMaxBarrier() + 2);
        view.printMessage(View.END_INTERVAL);
        int endBarrier;
        do{
            endBarrier = inputIntValueWithScanner(sc);
            if(endBarrier - model.getMinBarrier() <= 1){
                view.printMessage(View.WRONG_RANGE_DATA);
            }else {
                break;
            }
        } while (model.checkBarrier(model.getMinBarrier(), endBarrier));

        return endBarrier;
    }

    // The Utility methods

    /**
     * Input number from user. Check correctness of this number: int and right diapason
     *
     * @param sc system of input
     * @return correct number, which lay in interval
     */
    public int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(View.INPUT_INT_DATA + View.MIN_BARRIER +
                model.getMinBarrier() + View.MAX_BARRIER + model.getMaxBarrier());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA + View.MIN_BARRIER
                        + model.getMinBarrier() + View.MAX_BARRIER
                        + model.getMaxBarrier());
                continue ;
            }
            break;
        }
        return res;
    }
}
