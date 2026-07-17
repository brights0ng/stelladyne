package dev.brights0ng.stelladyne.cli;

import dev.brights0ng.stelladyne.pipeline.FormationPipeline;
import dev.brights0ng.stelladyne.result.StarSystem;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "generate", mixinStandardHelpOptions = true)
public class GenerateCommand implements Callable<Integer> {

    @Option(names = "--seed", required = true)
        long seed;

    @Override
    public Integer call() throws Exception {
        StarSystem system = new FormationPipeline().run(seed);
        System.out.println(system);
        return 0;
    }
}
