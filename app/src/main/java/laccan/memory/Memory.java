package laccan.memory;

import laccan.devices.Sample;
import laccan.memory.data.reduction.KeepingAll;

/**
 * Classe responsavel por contruir o buffer.
 */
public class Memory {
    private Container dataContainer;

    public Memory() {
    }

    /**
     * inicia buffer com novo tamanho, usando algoritmo de redução aleatoria.
     */
    private void buildContainer() {
        dataContainer = new KeepingAll();
    }

    /**
     * @return todas as mensagens no buffer
     */
    public Container getMemory() {
        return dataContainer;
    }


    /**
     * Adiciona mensagem ao buffer
     *
     * @param msg nova mensagem
     */
    public void add(Sample msg) {
        this.getMemory().add(msg);
    }

    /**
     * Constroi de acordo com escolha
     */
    public void build() {
        this.buildContainer();
    }
}
