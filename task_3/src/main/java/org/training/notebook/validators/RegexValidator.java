package org.training.notebook.validators;

import java.util.regex.Pattern;

/**
 * Created by click on 11/6/2016.
 */
public class RegexValidator implements Validator<String> {
    private Pattern pattern;

    public RegexValidator(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean isValid(String string) {
        return pattern.matcher(string).matches();
    }
}
