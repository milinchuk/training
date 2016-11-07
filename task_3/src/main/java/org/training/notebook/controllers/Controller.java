package org.training.notebook.controllers;

import org.training.notebook.models.entities.Address;
import org.training.notebook.models.entities.Group;
import org.training.notebook.models.NotebookModel;
import org.training.notebook.models.entities.Record;
import org.training.notebook.validators.Validator;
import org.training.notebook.views.View;

import java.util.Properties;
import java.util.Scanner;

/**
 * Created by click on 11/6/2016.
 */
public class Controller {
    private NotebookModel notebook;
    private View view;
    private Properties messageResouce;
    private Scanner sc;

    private Validator<String> nameValidator;
    private Validator<String> nicknameValidator;
    private Validator<String> commentValidator;
    private Validator<String> groupValidator;
    private Validator<String> phoneValidator;
    private Validator<String> emailValidator;
    private Validator<String> numberValidator;

    public Controller(NotebookModel notebook, View view, Scanner sc,
                      Properties messageResouce, Validator<String> nameValidator,
                      Validator<String> nicknameValidator, Validator<String> commentValidator,
                      Validator<String> groupValidator, Validator<String> phoneValidator,
                      Validator<String> emailValidator, Validator<String> numberValidator) {
        this.notebook = notebook;
        this.view = view;
        this.sc = sc;
        this.messageResouce = messageResouce;
        this.nameValidator = nameValidator;
        this.nicknameValidator = nicknameValidator;
        this.commentValidator = commentValidator;
        this.groupValidator = groupValidator;
        this.phoneValidator = phoneValidator;
        this.emailValidator = emailValidator;
        this.numberValidator = numberValidator;
    }

    public void newRecord(){
        Record record = new Record();
        askNames(record);
        askPhoneNumbers(record);
        askSocial(record);
        askAddress(record);
        askAdditionInfo(record);
        //generate date !!!
        notebook.addRecord(record);
    }

    private void askNames(Record record){
        record.setFirstName(getValidData(messageResouce.getProperty("firstname"), nameValidator));
        record.setMiddleName(getValidData(messageResouce.getProperty("middlename"), nameValidator));
        record.setLastName(getValidData(messageResouce.getProperty("lastname"), nameValidator));
        record.setNickname(getValidData(messageResouce.getProperty("nickname"), nicknameValidator));
    }

    private void askPhoneNumbers(Record record){
        record.setHomePhone(getValidData(messageResouce.getProperty("phone.home"), phoneValidator));
        record.setMobilePhone(getValidData(messageResouce.getProperty("phone.mobile"), phoneValidator));
        record.setMobilePhone2(getValidData(messageResouce.getProperty("phone.mobile"), phoneValidator));
    }

    private void askSocial(Record record){
        record.setEmail(getValidData(messageResouce.getProperty("email"), emailValidator));
        record.setSkype(getValidData(messageResouce.getProperty("skype"), nicknameValidator));
    }

    private void askAddress(Record record){
        Address address = new Address();
        address.setCity(getValidData(messageResouce.getProperty("address.city"), nameValidator));
        address.setStreet(getValidData(messageResouce.getProperty("address.street"), nameValidator));
        address.setBuildNum(getValidData(messageResouce.getProperty("address.build.num"), numberValidator));
        address.setApartmentNum(getValidData(messageResouce.getProperty("address.apartment.num"), numberValidator));
        record.setAddress(address);
    }

    private void askAdditionInfo(Record record){
        String group = getValidData(messageResouce.getProperty("group") + Group.values().toString(), groupValidator);
        record.setGroup(Group.valueOf(group));
        record.setComment(getValidData(messageResouce.getProperty("comment"), commentValidator));
    }

    private String getValidData(String askDataMessage, Validator<String> validator){
        String data;
        view.printMessage(askDataMessage);
        while(true){
            data = askNextFromUser(sc);
            System.out.println(data);
            System.out.println(validator.isValid(data));
            if(!validator.isValid(data)){
                view.printMessage(messageResouce.getProperty("error"));
            } else {
                break;
            }
        }
        return data;
    }

    private String askNextFromUser(Scanner sc){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
