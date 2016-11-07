package org.training.notebook.validators;

import org.training.notebook.models.entities.Group;

/**
 * Created by click on 11/6/2016.
 */
public class GroupValidator implements Validator<String> {
    @Override
    public boolean isValid(String group) {
        return Group.valueOf(group) != null;
    }
}
