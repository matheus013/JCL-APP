package laccan.persistence;

import java.io.File;

public class ReadCSVProxy extends CSVProxy {
    private String path;

    public ReadCSVProxy(String filename) {
        this.filename = filename;

    }

    public boolean load() {
        if (!validPath()) return false;
        File file = new File(filename);

        return file.exists();
    }
}
