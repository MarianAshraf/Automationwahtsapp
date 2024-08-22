package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static List<Contact> readCsv(String filePath) {
        List<Contact> contacts = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> allData = reader.readAll();
            for (String[] row : allData) {
                // Assuming the contact name is in the first column and phone number in the second column
                String name = row[0];
                String phoneNumber = row[1];
                contacts.add(new Contact(name, phoneNumber));
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}
