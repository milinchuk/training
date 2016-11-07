package org.training.notebook.config;

import org.training.notebook.Main;
import org.training.notebook.controllers.Controller;
import org.training.notebook.models.NotebookModel;
import org.training.notebook.validators.GroupValidator;
import org.training.notebook.validators.SimpleTextValidator;
import org.training.notebook.validators.Validator;
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

    private Validator<String> nameValidator;
    private Validator<String> nicknameValidator;
    private Validator<String> commentValidator;
    private Validator<String> groupValidator;
    private Validator<String> phoneValidator;
    private Validator<String> emailValidator;
    private Validator<String> numberValidator;

    public void configAndStart(){
        initRegex();
        initValidators();
        initComponents();

        start();
    }

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

    private void initValidators(){
        nameValidator = new SimpleTextValidator(regexProperties.getProperty("name"));
        nicknameValidator = new SimpleTextValidator(regexProperties.getProperty("nickname"));
        commentValidator = new SimpleTextValidator(regexProperties.getProperty("comment"));
        groupValidator = new GroupValidator();
        phoneValidator = new SimpleTextValidator(regexProperties.getProperty("phone"));
        emailValidator = new SimpleTextValidator(regexProperties.getProperty("email"));
        numberValidator = new SimpleTextValidator(regexProperties.getProperty("build"));
    }

    private void initComponents(){
        notebookModel = new NotebookModel();
        view = new View();
        scanner = new Scanner(System.in);
        controller = new Controller(notebookModel, view, scanner, messageProperties, nameValidator, nicknameValidator,
                commentValidator, groupValidator, phoneValidator, emailValidator, numberValidator);
    }

    private void start(){
        controller.newRecord();
    }

}
