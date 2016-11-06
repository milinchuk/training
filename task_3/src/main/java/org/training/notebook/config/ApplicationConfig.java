package org.training.notebook.config;

import org.training.notebook.Main;
import org.training.notebook.controllers.Controller;
import org.training.notebook.models.NotebookModel;
import org.training.notebook.validators.CommentValidator;
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
    private Properties properties;

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
            properties = new Properties();
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("regex.properties");
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initValidators(){
        nameValidator = new SimpleTextValidator(properties.getProperty("name"));
        nicknameValidator = new SimpleTextValidator(properties.getProperty("nickname"));
        commentValidator = new CommentValidator(Integer.parseInt(properties.getProperty("max.size.comment")));
        groupValidator = new GroupValidator();
        phoneValidator = new SimpleTextValidator(properties.getProperty("phone"));
        emailValidator = new SimpleTextValidator(properties.getProperty("email"));
        numberValidator = new SimpleTextValidator(properties.getProperty("number"));
    }

    private void initComponents(){
        notebookModel = new NotebookModel();
        view = new View();
        scanner = new Scanner(System.in);
        controller = new Controller(notebookModel, view, scanner, nameValidator, nicknameValidator,
                commentValidator, groupValidator, phoneValidator, emailValidator, numberValidator);
    }

    private void start(){
        controller.newRecord();
    }

}