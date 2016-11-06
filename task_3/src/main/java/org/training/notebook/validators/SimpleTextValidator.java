package org.training.notebook.validators;

import java.util.regex.Pattern;

/**
 * Created by click on 11/6/2016.
 */
public class SimpleTextValidator implements Validator<String> {
    private Pattern pattern;

    public SimpleTextValidator(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean isValid(String string) {
        return pattern.matcher(string).matches();
    }
}
