package org.training.notebook.controllers;

import org.training.notebook.models.entities.Address;
import org.training.notebook.models.entities.Group;
import org.training.notebook.models.NotebookModel;
import org.training.notebook.models.entities.Record;
import org.training.notebook.validators.Validator;
import org.training.notebook.views.View;

import java.util.Scanner;

/**
 * Created by click on 11/6/2016.
 */
public class Controller {
    private NotebookModel notebook;
    private View view;
    private Scanner sc;

    private Validator<String> nameValidator;
    private Validator<String> nicknameValidator;
    private Validator<String> commentValidator;
    private Validator<String> groupValidator;
    private Validator<String> phoneValidator;
    private Validator<String> emailValidator;
    private Validator<String> numberValidator;

    public Controller(NotebookModel notebook, View view, Scanner sc, Validator<String> nameValidator,
                      Validator<String> nicknameValidator, Validator<String> commentValidator,
                      Validator<String> groupValidator, Validator<String> phoneValidator,
                      Validator<String> emailValidator, Validator<String> numberValidator) {
        this.notebook = notebook;
        this.view = view;
        this.sc = sc;
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
        record.setFirstName(getValidData(View.ASK_FIRST_NAME, nameValidator));
        record.setMiddleName(getValidData(View.ASK_MIDDLE_NAME, nameValidator));
        record.setLastName(getValidData(View.ASK_LAST_NAME, nameValidator));
        record.setNickname(getValidData(View.ASK_NICKNAME, nicknameValidator));
    }

    private void askPhoneNumbers(Record record){
        record.setHomePhone(getValidData(View.ASK_HOME_PHONE, phoneValidator));
        record.setMobilePhone(getValidData(View.ASK_GROUP, phoneValidator));
        record.setMobilePhone2(getValidData(View.ASK_GROUP, phoneValidator));
    }

    private void askSocial(Record record){
        // email, skype
        record.setEmail(getValidData(View.ASK_GROUP, emailValidator));
        record.setSkype(getValidData(View.ASK_GROUP, nicknameValidator));
    }

    private void askAddress( Record record){
        Address address = new Address();
        address.setCity(getValidData(View.ASK_GROUP, nameValidator));
        address.setStreet(getValidData(View.ASK_GROUP, nameValidator));
        address.setBuildNum(getValidData(View.ASK_GROUP, numberValidator));
        address.setApartmentNum(getValidData(View.ASK_GROUP, numberValidator));
    }

    private void askAdditionInfo(Record record){
        String group = getValidData(View.ASK_GROUP, groupValidator);
        record.setGroup(Group.valueOf(group));
        record.setComment(getValidData(View.ASK_GROUP, commentValidator));
    }

    private String getValidData(String askDataMessage, Validator<String> validator){
        String data;
        view.printMessage(askDataMessage);
        while(true){
            data = askNextFromUser(sc);
            if(!validator.isValid(data)){
                view.printMessage(View.ERROR);
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
