package laccan.memory.reduction;

import laccan.devices.MicazMsg;

import java.util.ArrayList;
import java.util.Random;

/**
 * Algoritmo de redução, com descarte baseado em aleatorio
 */
public class RandomReduction extends Container {
    private int capacity;

    public RandomReduction(int capacity) {
        super();
        this.capacity = capacity;
        this.content = new ArrayList<MicazMsg>();
    }

    /**
     * Adiciona nova mensagem ao buffer, se buffer estiver cheio aplica politica de redução
     *
     * @param msg nova mensagem
     */
    @Override
    public void add(MicazMsg msg) {
        // TODO Auto-generated method stub
        if (length() < capacity) {
            content.add(msg);
        } else {
            Random rand = new Random();
            content.set(rand.nextInt(capacity), msg);
        }

    }

}
