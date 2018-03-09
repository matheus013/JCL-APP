package laccan.memory.data.reduction;

import laccan.devices.Sample;
import laccan.memory.Container;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Algoritmo de redução, com descarte baseado em correlação
 */
public class AllaReduction extends Container {
    private int capacity;

    public AllaReduction(int capacity) {
        super();
        this.capacity = capacity;
        content = new ArrayList<Sample>();
    }

    private List<Sample> sort(List<Sample> array) {
        List<Sample> result = array
                .stream()
                .sorted(Comparator.comparingDouble(Sample::getTemperature))
                .collect(Collectors.toList());

        return result;
    }

    private List<Sample> midst(List<Sample> array) {
        int length = array.size();
        List<Sample> result = new ArrayList<Sample>();
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
    public void add(Sample msg) {
        if (length() < capacity) {
            content.add(msg);
        } else {
            HashMap<String, List<Sample>> aux = new HashMap<String, List<Sample>>();
            for (Sample Sample : content) {
                String key = String.valueOf(Sample.getNode());
                if (aux.containsKey(key)) {
                    aux.get(key).add(Sample);
                } else {
                    aux.put(key, new ArrayList<Sample>());
                    aux.get(key).add(Sample);
                }
            }

            for (Map.Entry<String, List<Sample>> entry : aux.entrySet()) {
                List<Sample> temp = entry.getValue();
                temp = sort(temp);
                temp = midst(temp);
                entry.setValue(temp);
            }

        }

    }

}
