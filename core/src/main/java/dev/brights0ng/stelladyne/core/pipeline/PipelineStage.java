package dev.brights0ng.stelladyne.core.pipeline;

import java.util.SplittableRandom;

public interface PipelineStage {
    EpochOutcome execute(SystemState state, SplittableRandom stageRandom);

    String name();
}
