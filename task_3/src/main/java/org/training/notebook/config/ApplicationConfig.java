package org.training.notebook.config;

import org.training.notebook.Main;
import org.training.notebook.controllers.Controller;
import org.training.notebook.models.NotebookModel;
import org.training.notebook.validators.ValidatorStore;
import org.training.notebook.views.View;

import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by click on 11/6/2016.
 */
public class ApplicationConfig {
    private Controller controller;
    private NotebookModel notebookModel;
    private View view;
    private Scanner scanner;
    private Properties regexProperties;
    private Properties messageProperties;
    private ValidatorStore validators;

    /**
     *
     */
    public void configAndStart(){
        initRegex();
        initValidatorFactory();
        initComponents();

        start();
    }

    /**
     *
     */
    private void initRegex(){
        try {
            regexProperties = new Properties();
            messageProperties = new Properties();
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("regex.properties");
            regexProperties.load(inputStream);
            inputStream = Main.class.getClassLoader().getResourceAsStream("messages.properties");
            messageProperties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    private void initValidatorFactory(){
        validators = new ValidatorStore(regexProperties);
    }

    /**
     *
     */
    private void initComponents(){
        notebookModel = new NotebookModel();
        view = new View();
        scanner = new Scanner(System.in);
        controller = new Controller(notebookModel, view, scanner, messageProperties,validators);
    }

    /**
     *
     */
    private void start(){
        controller.newRecord();
    }

}
