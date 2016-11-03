package org.training.task_2;

import org.training.task_2.Controller;

/**
 * Start poin of programm. Here all start.
 *
 * @author Anastasia Milinchuk
 */
public class Main {

    /**
     * Maethod in which create basic elements: model, view, controller.
     * And run a game.
     *
     * @param args are command line arguments
     */
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }

}
