package dev.brights0ng.stelladyne.cli;

import picocli.CommandLine;

@CommandLine.Command(name = "stelladyne", mixinStandardHelpOptions = true,
        subcommands = { GenerateCommand.class })
public class StelladyneCommand {
}
