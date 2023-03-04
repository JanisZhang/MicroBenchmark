package org.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void init(){
        //Do nothing
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(
                BenchmarkRunner.class.getSimpleName())
                .forks(2)
                .build();
        new Runner(opt).run();
    }


}
