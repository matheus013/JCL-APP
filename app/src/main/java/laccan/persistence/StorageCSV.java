package laccan.persistence;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import laccan.devices.Sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StorageCSV implements Storage {
    private String filename;

    public StorageCSV local(String filename) {
        this.filename = "./csv/" + filename;
        return this;
    }

    public List<Sample> read() {
        List<Sample> list = new ArrayList<>();
        ReadCSVProxy csvProxy = new ReadCSVProxy(filename);
        if (!csvProxy.load()) return null;
        try (Reader reader = Files.newBufferedReader(Paths.get(this.filename))) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                String[] nextRecord;
                NumericValidation validation = new NumericValidation();
                while ((nextRecord = csvReader.readNext()) != null) {
//                    System.out.println(nextRecord[]);
                    if (!validation.testWithSize(nextRecord, 2)) continue;
//                    System.out.println(nextRecord);
                    list.add(new Sample("2", Double.valueOf(nextRecord[1]), Long.valueOf(nextRecord[0])));
//                    System.out.println(nextRecord);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void save(String[] instance) throws IOException {
        SaveCSVProxy csvProxy = new SaveCSVProxy(filename);

        if (!csvProxy.load()) return;

        FileWriter fileWriter = new FileWriter(filename, true);
        CSVWriter csvWriter = new CSVWriter(fileWriter,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        csvWriter.writeNext(instance);
        csvWriter.close();
    }
}