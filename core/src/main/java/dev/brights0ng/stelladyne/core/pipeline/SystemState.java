package dev.brights0ng.stelladyne.core.pipeline;

import java.util.*;

public class SystemState {

    private final long seed;
    private final SplittableRandom rootRandom;

    private final Map<String, SplittableRandom> stageRandoms;

    public SystemState(long seed, List<PipelineStage> stages) {
        this.seed = seed;
        this.rootRandom = new SplittableRandom(seed);

        this.stageRandoms = new HashMap<>();
        for (PipelineStage stage : stages) {
            this.stageRandoms.put(stage.name(), rootRandom.split());
        }


    }

    public long getSeed() {
        return seed;
    }

    public SplittableRandom randomFor(String stage){
        return stageRandoms.get(stage);
    }
}
