package laccan.memory.data.reduction;

import laccan.devices.MicazMsg;
import laccan.memory.Container;
import laccan.devices.compare.MicazCompareTemperature;

import java.util.*;

/**
 * Algoritmo de redução, com descarte baseado em correlação
 */
public class CorrelationReduction extends Container {
    private int capacity;

    public CorrelationReduction(int capacity) {
        super();
        this.capacity = capacity;
        content = new ArrayList<MicazMsg>();
    }

    private ArrayList<MicazMsg> sort(ArrayList<MicazMsg> array) {
        Collections.sort(array, new MicazCompareTemperature());
        return array;
    }

    private ArrayList<MicazMsg> midst(ArrayList<MicazMsg> array) {
        int length = array.size();
        ArrayList<MicazMsg> result = new ArrayList<MicazMsg>();
        int mid = length / 2;
        result.add(array.get(mid));
        result.add(array.get(mid + 1));
        return result;
    }

    /**
     * Adiciona nova mensagem ao buffer, se buffer estiver cheio aplica algoritmo de redução
     *
     * @param msg nova mensagem
     */
    @Override
    public void add(MicazMsg msg) {
        if (length() < capacity) {
            content.add(msg);
        } else {
            HashMap<String, ArrayList<MicazMsg>> aux = new HashMap<String, ArrayList<MicazMsg>>();
            for (MicazMsg micazMsg : content) {
                String key = String.valueOf(micazMsg.get_nodeid());
                if (aux.containsKey(key)) {
                    aux.get(key).add(micazMsg);
                } else {
                    aux.put(key, new ArrayList<MicazMsg>());
                    aux.get(key).add(micazMsg);
                }
            }

            for (Map.Entry<String, ArrayList<MicazMsg>> entry : aux.entrySet()) {
                ArrayList<MicazMsg> temp = entry.getValue();
                temp = sort(temp);
                temp = midst(temp);
                entry.setValue(temp);
            }

        }

    }

}
