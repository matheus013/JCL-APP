package laccan.persistence;

import java.io.File;
import java.io.IOException;

public class SaveCSVProxy extends CSVProxy {

    private String path;

    public SaveCSVProxy(String filename) {
        this.filename = filename;

    }

    public boolean load() throws IOException {
        if (!validPath()) return false;
        File file = new File(filename);
        path = file.getParent();
        File folder = new File(path);
        System.out.println(folder.exists());
        if (!folder.exists()) {
            boolean success = folder.mkdirs();
            if (!success) {
                System.out.println("failed to create folder");
                return false;
            }
        }

        File f = new File(filename);
        if (!f.exists()) {
            boolean success = f.createNewFile();
            if (!success) {
                System.out.println("failed to create file");
                return false;
            }

        }
        return true;
    }
}
