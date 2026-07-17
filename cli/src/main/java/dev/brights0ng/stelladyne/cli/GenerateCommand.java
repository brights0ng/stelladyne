package dev.brights0ng.stelladyne.cli;

import dev.brights0ng.stelladyne.core.pipeline.FormationPipeline;
import dev.brights0ng.stelladyne.core.result.StarSystem;
import dev.brights0ng.stelladyne.util.SeedGenerator;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "generate", mixinStandardHelpOptions = true)
public class GenerateCommand implements Callable<Integer> {

    @Option(names = "--seed", required = true)
        String seedInput;

    @Override
    public Integer call() throws Exception {
        long seed = 0; // fallback

        try {
            seed = Long.parseLong(seedInput);
        } catch (NumberFormatException e) {
            seed = SeedGenerator.stringToSeed(seedInput);
        }
        StarSystem system = new FormationPipeline().run(seed);
        System.out.println(system);
        return 0;
    }
}
