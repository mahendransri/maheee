package org.stepsdefiniton;

import java.io.IOException;

import org.helper.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal {
	@Before
	public void BeforeScenario() {
		System.out.println("starts Scenario");
		openchrome();
	}

	@After
	public void AfterScenario(Scenario s) throws IOException, InterruptedException {
		String name = s.getName();
		String scenarioname = name.replace(" ", "_");
		takesnap(scenarioname);
		Thread.sleep(2000);
		closeBrowser();

	}

}
