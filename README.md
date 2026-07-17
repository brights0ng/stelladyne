# Stelladyne

A physically-grounded, procedural generator for star systems and their planets.

## What this is

Stelladyne builds star systems, including stars, protoplanetary disks, and the planets
that emerge from them, from a single deterministic seed, using models drawn
from current protoplanetary-disk and planet-formation literature (pebble
accretion, viscous disk evolution, disk chemistry and snow lines, among
others) rather than arbitrary procedural-generation heuristics.

## Status

Extremely early, active development. The project structure and build are in place; the
physics engine itself has not been implemented yet. Treat this README as a
snapshot, not a guarantee — it will lag behind the actual state of the code
for a while.

## Modules

- **`core`** — the physics engine itself. Pure Java, zero runtime
  dependencies beyond the JDK. Meant to be genuinely reusable: consuming
  `core` shouldn't drag in a serialization library, a CLI framework, or
  anything else a consumer didn't ask for.
- **`cli`** — a real command-line interface for driving `core` without
  writing Java: generating systems, inspecting output, and (eventually)
  exporting data for external analysis or plotting.
- **`visualizer`** *(planned)* — tooling for visualizing generated systems,
  likely built on top of data `cli` exports.

## Requirements

- JDK 21+

## Running the CLI

Not yet functional — `cli` is currently scaffolding only. This section will
be filled in once real commands exist.

## Design philosophy

- **Physical accuracy over shortcuts.** Models in `core` should be traceable
  to specific sources in the literature. Approximations and assumptions made will be 
documented; the parts of the engine that are from empirical observations over mechanics (likely due to my own inability to understand the literature, or in cases like angular momentum diffusion, because nobody really knows right now) will be acknowledged.
- **Determinism.** A given input seed always produces the same system.
- **No planets is a valid outcome.** Will likely add features that allow stepping into the pipeline at different points.e

## Contributing

I don't know how contributing works, so reach out if you're interested.

## License

Apache License 2.0 — see [LICENSE](./LICENSE).