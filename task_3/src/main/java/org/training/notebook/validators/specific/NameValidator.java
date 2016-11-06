package org.training.notebook.validators.specific;

import org.training.notebook.validators.Validator;

import java.util.regex.Pattern;

/**
 * Created by click on 11/6/2016.
 */
public class NameValidator implements Validator<String> {
    private final String regex = "/^[a-z ,.'-]+$/i";
    private Pattern pattern;

    public NameValidator() {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean isValid(String name){
        return pattern.matcher(name).matches();
    }
}
