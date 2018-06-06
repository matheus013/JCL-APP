package laccan.persistence;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class StorageCSV implements Storage {
    protected String filename;

    public StorageCSV local(String filename) {
        this.filename = filename;
        return this;
    }

    public void save(String[] instance) throws IOException {
        FileWriter fileWriter = new FileWriter(filename, true);
//        Writer writer = Files.newBufferedWriter(Paths.get(this.filename));

        CSVWriter csvWriter = new CSVWriter(fileWriter,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);
//        csvWriter.
        csvWriter.writeNext(instance);
        csvWriter.close();
    }
}
