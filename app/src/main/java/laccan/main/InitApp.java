package laccan.main;

import laccan.devices.helper.utils.Assistant;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Inicia variaveis globais do JCL
 *
 * @author Matheus In&aacute;cio
 */
public class InitApp {
    public static void main(String[] args) {
        Options options = new Options();

        options.addOption("p", "predictor",
                true, "Select new prediction algorithm.");

        try {
            CommandLine line = new BasicParser().parse(options, args);

            if (line.hasOption("predictor")) {
                Assistant.predictorType = line.getOptionValue("predictor");
            }

        } catch (ParseException exp) {
            System.out.println("Unexpected exception:" + exp.getMessage());
        }
        Assistant.init();

    }


}
