package org.training.notebook.validators;

/**
 * Created by click on 11/6/2016.
 */
public class CommentValidator implements Validator<String> {
    private int maxSize;

    public CommentValidator(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean isValid(String text) {
        return text.length() < maxSize;
    }
}
