package org.training.notebook.validators.specific;

import org.training.notebook.validators.Validator;

import java.util.regex.Pattern;

/**
 * Created by click on 11/6/2016.
 */
public class NicknameValidator implements Validator<String> {
    private final String regex = "^[a-z0-9_-]{3,15}$";
    private Pattern pattern;

    public NicknameValidator() {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean isValid(String nickname){
        return pattern.matcher(nickname).matches();
    }
}
