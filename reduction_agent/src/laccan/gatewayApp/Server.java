/**
 * @author <Geymerson Ramos>
 * @email: <geymerson@laccan.ufal.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at August 19, 2017
 **/

package laccan.gatewayApp;

import implementations.sm_kernel.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.MicazMsg;
import laccan.memory.Memory;
import net.tinyos.message.Message;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Server {

    private static String serverURL = "my server address";
    private String databaseName;
    private String dataString;

    void setServerURL(String url) {
        this.serverURL = url;
    }

    String getServerURL() {
        return serverURL;
    }

    void setDatabaseName(String database) {
        this.databaseName = database;
    }

    String getDatabaseName() {
        return databaseName;
    }

    void setDataString(String dataString) {
        this.dataString = dataString;
    }

    String getDataString() {
        return dataString;
    }

    public static void toFog(Message message) {
        MicazMsg micazTemp = (MicazMsg) message;
        String key = String.valueOf(micazTemp.get_nodeid());
        nodeCheck(key);

        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = jcl.getValueLocking("buffer");

        Memory buffer = (Memory) result.getCorrectResult();
        buffer.add(micazTemp);

        jcl.setValueUnlocking("buffer", buffer);
    }

    private static void nodeCheck(String id) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = jcl.getValueLocking("nodes");
        ArrayList<String> buffer = (ArrayList<String>) result.getCorrectResult();
        if(!buffer.contains(id)){
            buffer.add(id);
        }
    }

//    public static void init(int[] node_ids) {
//        JCL_facade jcl = JCL_FacadeImpl.getInstance();
//        for (int x : node_ids) {
//            String key = String.valueOf(x);
//            if (!jcl.containsGlobalVar(key))
//                jcl.instantiateGlobalVarAsy(key, new Memory());
//            System.out.println(key);
//        }
//        System.out.println("buffer started successfully");
//    }

    public static void saveData(String data) {
        try {

            //Set URL address
            URL url = new URL(serverURL);

            //Request connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //Set request type
            conn.setRequestMethod("POST");
            //Set request properties
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            conn.setRequestProperty("Accept-Language", "pt-br");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("charset", "UTF-8");
            conn.setDoOutput(true);

            //Write data to server
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            wr.writeBytes(data);

            //Close connection
            wr.close();

            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Response Code : " + conn.getResponseCode());


        } catch (MalformedURLException e) {
            System.out.println("A malformed URL exception has occurred" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
