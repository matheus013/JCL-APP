package laccan.persistence;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StorageCSV implements Storage {
    protected String filename;

    public StorageCSV local(String filename) {
        this.filename = filename;
        return this;
    }

    public void save(String[] instance) throws IOException {
        Writer writer = Files.newBufferedWriter(Paths.get(this.filename));

        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);
        csvWriter.writeNext(instance);
    }
}
