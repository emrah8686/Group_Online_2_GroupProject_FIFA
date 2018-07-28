package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fifa.pages.GroupsPage;

public class GroupANDTeamsTEST extends TestBase {

	@Test(groups = { "smoke" })
	public void checkGroupG() {
		extentLogger = report.createTest("Test 1");

		GroupsPage g = new GroupsPage();

		assertTrue(g.groupIcon.isDisplayed());

		g.groupIcon.click();
		
		assertEquals(g.Belg.getText(), "Belgium");
		assertEquals(g.Engl.getText(), "England");
		assertEquals(g.Tuns.getText(), "Tunisia");
		assertEquals(g.Pana.getText(), "Panama");
		extentLogger.pass("Page title verified");

	}

	@Test(groups = { "smoke" })
	public void checkAllTeam() {
		extentLogger = report.createTest("Test 2");
		GroupsPage g = new GroupsPage();
		g.teamMain.click();
		assertEquals(g.allTeam.size(), 32);
		extentLogger.pass("Page title verified");


	}
}
