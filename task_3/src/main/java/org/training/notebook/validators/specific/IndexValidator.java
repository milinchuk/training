package org.training.notebook.validators.specific;

import org.training.notebook.validators.Validator;

import java.util.regex.Pattern;

/**
 * Created by click on 11/6/2016.
 */
public class IndexValidator implements Validator<Integer> {
    private final String regex = "^\\d{5}$";
    private Pattern pattern;

    public IndexValidator() {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean isValid(Integer integer) {
        return false;
    }
}
