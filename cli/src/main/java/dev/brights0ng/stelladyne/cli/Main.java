package dev.brights0ng.stelladyne.cli;

import picocli.CommandLine;

public class Main {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new StelladyneCommand()).execute(args);
        System.exit(exitCode);
    }
}
