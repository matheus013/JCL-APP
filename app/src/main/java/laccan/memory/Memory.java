package laccan.memory;

import laccan.devices.MicazMsg;
import laccan.memory.data.reduction.AllaReduction;
import laccan.memory.data.reduction.KeepingAll;
import laccan.memory.data.reduction.RandomReduction;

/**
 * Classe responsavel por contruir o buffer.
 */
public class Memory {
    private KeepingAll keepingAll;
    private Container dataContainer;
    private int capacity;

    public Memory() {
    }

    /**
     * @return todas as mensagens recebidas.
     */
    public KeepingAll getFull() {
        return keepingAll;
    }

    /**
     * inicia buffer com tamanho padrão 100, usando algoritmo de redução aleatoria.
     */
    private void buildRandomReduction() {
        buildRandomReduction(this.capacity);
    }

    /**
     * inicia buffer com novo tamanho, usando algoritmo de redução aleatoria.
     *
     * @param capacity tamanho do buffer
     */
    private void buildRandomReduction(int capacity) {
        dataContainer = new RandomReduction(capacity);
        keepingAll = new KeepingAll();
        this.capacity = capacity;
    }

    /**
     * inicia buffer com tamanho padrão 100, usando algoritmo de redução baseado em coorelação.
     */
    private void buildAllaReduction() {
        buildAllaReduction(this.capacity);
    }

    /**
     * inicia buffer com novo tamanho, usando algoritmo de redução baseado em coorelação.
     *
     * @param capacity tamanho do buffer
     */
    private void buildAllaReduction(int capacity) {
        dataContainer = new AllaReduction(capacity);
        keepingAll = new KeepingAll();
        this.capacity = capacity;
    }

    /**
     * @return todas as mensagens no buffer
     */
    public Container getMemory() {
        return dataContainer;
    }

    /**
     * Seleciona capacidade do buffer
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Adiciona mensagem ao buffer
     *
     * @param msg nova mensagem
     */
    public void add(MicazMsg msg) {
        getFull().add(msg);
        getMemory().add(msg);
    }

    /**
     * Constroi de acordo com escolha
     *
     * @param reducerType
     */
    public void build(String reducerType) {
        this.capacity = 100;
        if (reducerType.equals("alla")) {
            buildAllaReduction();
        } else if (reducerType.equals("random")) {
            buildRandomReduction();
        } else {
            buildRandomReduction();
        }
    }
}
