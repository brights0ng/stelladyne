package dev.brights0ng.stelladyne.pipeline;

public sealed interface EpochOutcome permits Success, Aborted, Failed {
}

record Success() implements EpochOutcome{

}

record Aborted() implements EpochOutcome{

}

record Failed() implements EpochOutcome{

}