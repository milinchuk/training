package org.training.notebook.validators;

/**
 * Created by click on 11/6/2016.
 */
public interface Validator<T> {
    public boolean isValid(T t);
}
