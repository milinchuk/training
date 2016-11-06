package org.training.notebook.validators.specific;

import org.training.notebook.validators.Validator;

import java.util.regex.Pattern;

/**
 * Created by click on 11/6/2016.
 */
public class EmailValidator implements Validator<String> {
    private final String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                                 "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;

    public EmailValidator() {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean isValid(String email) {
        return pattern.matcher(email).matches();
    }
}
