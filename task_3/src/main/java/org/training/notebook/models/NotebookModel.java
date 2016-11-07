package org.training.notebook.models;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.training.notebook.models.entities.Address;
import org.training.notebook.models.entities.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

/**
 * Created by click on 11/6/2016.
 */
public class NotebookModel {
    private List<Record> records;

    public NotebookModel() {
        records = new ArrayList<Record>();
    }

    public void addRecord(Record record){
        record.setShortName(generateShortName(record.getFirstName(), record.getLastName()));
        record.setStringAddress(generateAddressString(record.getAddress()));
        records.add(record);
    }

    public String generateShortName(String firstName, String lastName){
        String smallName = String.format("%s %s.", lastName, firstName.charAt(0));
        System.out.println(smallName);
        return smallName;
    }

    public String generateAddressString(Address address){
        String addressString = String.format("%s, %s street %s, apt %s.", address.getCity(), address.getStreet(),
                address.getBuildNum(), address.getApartmentNum());
        System.out.println(addressString);
        return addressString;
    }
    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
