package dev.brights0ng.stelladyne.pipeline;

import dev.brights0ng.stelladyne.result.StarSystem;

import java.util.*;

public class FormationPipeline {

    private final List<PipelineStage> stages = List.of(
            new StarStage()
    );

    public StarSystem run(long seed){

        SystemState state = new SystemState(seed, stages);

        for (PipelineStage stage : stages) {
            EpochOutcome outcome = stage.execute(state, state.randomFor(stage.name()));
            if (outcome instanceof Failed) {
                throw new RuntimeException("Stage " +  stage.name() + " failed.");
            } else if (outcome instanceof Aborted) {
                System.out.println("Stage " + stage.name() + " aborted.");
                break;
            } else if (outcome instanceof Success) {
                System.out.println("Stage " + stage.name() + " successful.");
            }
        }

        List<String> planets = new ArrayList<>(); // placeholder
        return new StarSystem(seed, planets);
    }

}
