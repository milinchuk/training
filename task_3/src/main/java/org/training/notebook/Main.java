package org.training.notebook;

import org.training.notebook.config.ApplicationConfig;

/**
 * Created by click on 11/6/2016.
 */
public class Main {
    public static void main(String args[]){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.configAndStart();
    }
}
