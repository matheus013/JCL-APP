package laccan.persistence;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StorageCSVTest {

    @Test
    void read() {
        StorageCSV storageCSV = new StorageCSV();
        storageCSV.read();
        storageCSV.local("").read();
        storageCSV.local("test.csv").read();

    }

    @Test
    void save() {
        StorageCSV storageCSV = new StorageCSV();

        try {
            storageCSV.save(new String[]{""});
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            storageCSV.local("").save(new String[]{"Matheus"});
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            storageCSV.local("test.csv").save(new String[]{"Matheus", "1213"});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}