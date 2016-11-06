package org.training.notebook.models;

import org.training.notebook.models.entities.Record;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by click on 11/6/2016.
 */
public class NotebookModel {
    private List<Record> records;

    public NotebookModel() {
        records = new ArrayList<Record>();
    }

    public void addRecord(Record record){
        records.add(record);
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
