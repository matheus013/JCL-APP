package laccan.persistence;

import java.io.File;

public class CSVProxy {
    protected String filename;

    public boolean validPath() {
        return filename != null && !filename.equals("") && !(new File(filename).isDirectory());
    }
}
