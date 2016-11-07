package org.training.notebook.controllers;

import org.training.notebook.models.entities.Address;
import org.training.notebook.models.entities.Group;
import org.training.notebook.models.NotebookModel;
import org.training.notebook.models.entities.Record;
import org.training.notebook.validators.Validator;
import org.training.notebook.validators.pool.ValidatorsPool;
import org.training.notebook.views.View;

import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by click on 11/6/2016.
 */
public class Controller {
    /**
     *
     */
    private NotebookModel notebook;

    /**
     *
     */
    private View view;
    private Scanner sc;

    /**
     *
     */
    private Properties messageResouce;

    /**
     *
     */
    private ValidatorsPool validators;

    public Controller(NotebookModel notebook, View view, Scanner sc,
                      Properties messageResouce, ValidatorsPool validators) {
        this.notebook = notebook;
        this.view = view;
        this.sc = sc;
        this.messageResouce = messageResouce;
        this.validators = validators;
    }

    /**
     *
     */
    public void newRecord(){
        Record record = new Record();
        askNames(record);
        askPhoneNumbers(record);
        askSocial(record);
        askAddress(record);
        askAdditionInfo(record);
        notebook.addRecord(record);
    }

    /**
     *
     * @param record
     */
    private void askNames(Record record){
        record.setFirstName(getValidData(messageResouce.getProperty("firstname"), validators.getNameValidator()));
        record.setMiddleName(getValidData(messageResouce.getProperty("middlename"), validators.getNameValidator()));
        record.setLastName(getValidData(messageResouce.getProperty("lastname"), validators.getNameValidator()));
        record.setNickname(getValidData(messageResouce.getProperty("nickname"), validators.getNicknameValidator()));
    }

    /**
     *
     * @param record
     */
    private void askPhoneNumbers(Record record){
        record.setHomePhone(getValidData(messageResouce.getProperty("phone.home"),
                validators.getPhoneValidator()));
        record.setMobilePhone(getValidData(messageResouce.getProperty("phone.mobile"),
                validators.getPhoneValidator()));
        record.setMobilePhone2(getValidData(messageResouce.getProperty("phone.mobile"),
                validators.getPhoneValidator()));
    }

    /**
     *
     * @param record
     */
    private void askSocial(Record record){
        record.setEmail(getValidData(messageResouce.getProperty("email"), validators.getEmailValidator()));
        record.setSkype(getValidData(messageResouce.getProperty("skype"), validators.getNicknameValidator()));
    }

    /**
     *
     * @param record
     */
    private void askAddress(Record record){
        Address address = new Address();
        address.setCity(getValidData(messageResouce.getProperty("address.city"),
                validators.getNameValidator()));
        address.setStreet(getValidData(messageResouce.getProperty("address.street"),
                validators.getNameValidator()));
        address.setBuildNum(getValidData(messageResouce.getProperty("address.build.num"),
                validators.getBuildNumValidator()));
        address.setApartmentNum(getValidData(messageResouce.getProperty("address.apartment.num"),
                validators.getAptValidator()));
        record.setAddress(address);
    }

    /**
     *
     * @param record
     */
    private void askAdditionInfo(Record record){
        String group = getValidData(messageResouce.getProperty("group") + Arrays.toString(Group.values()),
                validators.getGroupValidator());
        record.setGroup(Group.valueOf(group));
        record.setComment(getValidData(messageResouce.getProperty("comment"),
                validators.getCommentValidator()));
    }

    /**
     *
     * @param askDataMessage
     * @param validator
     * @return
     */
    private String getValidData(String askDataMessage, Validator<String> validator){
        String data;
        view.printMessage(askDataMessage);
        while(true){
            data = askNextFromUser(sc);
            if(!validator.isValid(data)){
                view.printMessage(messageResouce.getProperty("error"));
            } else {
                break;
            }
        }
        return data;
    }

    /**
     *
     * @param sc
     * @return
     */
    private String askNextFromUser(Scanner sc){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
