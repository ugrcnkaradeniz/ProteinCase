package com.ProteinTech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //for html reporting I put plugin
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        //I put for location of features file
        features = "src/test/resources/features",
        //I put for location of step_definitions
        glue = "com/ProteinTech/step_definitions",
        //if I do it true I get undefined step definitions
        dryRun = false,
        //I put for execute specific scenerio
        tags = "@user_story1"


)
public class CukesRunner {
}
