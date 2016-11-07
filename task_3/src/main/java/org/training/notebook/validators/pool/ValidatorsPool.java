package org.training.notebook.validators.pool;

import org.training.notebook.validators.GroupValidator;
import org.training.notebook.validators.RegexValidator;
import org.training.notebook.validators.Validator;

import java.util.Properties;

/**
 * Created by click on 11/7/2016.
 */
public class ValidatorsPool {
    private Properties regexProperties;

    private Validator<String> nameValidator;
    private Validator<String> nicknameValidator;
    private Validator<String> commentValidator;
    private Validator<String> groupValidator;
    private Validator<String> phoneValidator;
    private Validator<String> emailValidator;
    private Validator<String> aptValidator;
    private Validator<String> buildNumValidator;

    public ValidatorsPool(Properties regexResource) {
        this.regexProperties = regexResource;
        initValidators();
    }

    private void initValidators(){
        nameValidator = new RegexValidator(regexProperties.getProperty("name"));
        nicknameValidator = new RegexValidator(regexProperties.getProperty("nickname"));
        commentValidator = new RegexValidator(regexProperties.getProperty("comment"));
        groupValidator = new GroupValidator();
        phoneValidator = new RegexValidator(regexProperties.getProperty("phone"));
        emailValidator = new RegexValidator(regexProperties.getProperty("email"));
        aptValidator = new RegexValidator(regexProperties.getProperty("apartment"));
        buildNumValidator = new RegexValidator(regexProperties.getProperty("build"));
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
