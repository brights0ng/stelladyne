package dev.brights0ng.stelladyne.pipeline;

import java.util.SplittableRandom;

public class StarStage implements PipelineStage{

    @Override
    public EpochOutcome execute(SystemState state, SplittableRandom starRandom) {

        return new Success();
    }

    @Override
    public String name() {
        return "star";
    }


}
