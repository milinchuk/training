package org.training.notebook.validators;

import java.util.Properties;

/**
 * Created by click on 11/7/2016.
 */
public class ValidatorStore {
    private Properties regexProperties;

    private Validator<String> nameValidator;
    private Validator<String> nicknameValidator;
    private Validator<String> commentValidator;
    private Validator<String> groupValidator;
    private Validator<String> phoneValidator;
    private Validator<String> emailValidator;
    private Validator<String> aptValidator;
    private Validator<String> buildNumValidator;

    public ValidatorStore(Properties regexResource) {
        this.regexProperties = regexResource;
        initValidators();
    }

    private void initValidators(){
        nameValidator = new SimpleTextValidator(regexProperties.getProperty("name"));
        nicknameValidator = new SimpleTextValidator(regexProperties.getProperty("nickname"));
        commentValidator = new SimpleTextValidator(regexProperties.getProperty("comment"));
        groupValidator = new GroupValidator();
        phoneValidator = new SimpleTextValidator(regexProperties.getProperty("phone"));
        emailValidator = new SimpleTextValidator(regexProperties.getProperty("email"));
        aptValidator = new SimpleTextValidator(regexProperties.getProperty("apartment"));
        buildNumValidator = new SimpleTextValidator(regexProperties.getProperty("build"));
    }

    public Properties getRegexProperties() {
        return regexProperties;
    }

    public Validator<String> getNameValidator() {
        return nameValidator;
    }

    public Validator<String> getNicknameValidator() {
        return nicknameValidator;
    }

    public Validator<String> getCommentValidator() {
        return commentValidator;
    }

    public Validator<String> getGroupValidator() {
        return groupValidator;
    }

    public Validator<String> getPhoneValidator() {
        return phoneValidator;
    }

    public Validator<String> getEmailValidator() {
        return emailValidator;
    }

    public Validator<String> getAptValidator() {
        return aptValidator;
    }

    public Validator<String> getBuildNumValidator() {
        return buildNumValidator;
    }
}
