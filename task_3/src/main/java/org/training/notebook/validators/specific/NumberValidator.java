package org.training.notebook.validators.specific;

import org.training.notebook.validators.Validator;

import java.util.regex.Pattern;

/**
 * Created by click on 11/6/2016.
 */
public class NumberValidator implements Validator<String> {
    private final String regex = "^[1-9]/d*$";
    private Pattern pattern;

    public NumberValidator() {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean isValid(String number) {
        return pattern.matcher(number).matches();
    }
}
