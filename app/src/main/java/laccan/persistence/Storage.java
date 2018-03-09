package laccan.persistence;

import java.io.IOException;

public interface Storage {

    public void save(String[] str) throws IOException;
}
