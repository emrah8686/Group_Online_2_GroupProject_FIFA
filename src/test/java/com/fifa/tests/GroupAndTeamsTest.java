package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.fifa.pages.GroupsPage;

public class GroupAndTeamsTest extends TestBase {

	@Test
	public void checkGroupG() {

		extentLogger = report.createTest("Test1");

		extentLogger.info("Verifying Group G Team names");

		GroupsPage g = new GroupsPage();

		assertTrue(g.groupIcon.isDisplayed());

		g.groupIcon.click();

		assertTrue(g.groupGicon.isDisplayed());

		g.groupGicon.click();

		assertEquals(g.Belg.getText(), "Belgium");
		assertEquals(g.Engl.getText(), "England");
		assertEquals(g.Tuns.getText(), "Tunisia");
		assertEquals(g.Pana.getText(), "Panama");

		// pass --> message the tells us what passed
		extentLogger.pass("Group G icon and Group G Team names verified");

	}

	@Test
	public void checkGroupE() {
		
		extentLogger = report.createTest("Test2");

		extentLogger.info("Verifying Group E Team names");


		GroupsPage g = new GroupsPage();

		assertTrue(g.groupIcon.isDisplayed());

		g.groupIcon.click();

		assertTrue(g.groupEicon.isDisplayed());

		g.groupEicon.click();

		assertEquals(g.Brazil.getText(), "Brazil");
		assertEquals(g.Switzerland.getText(), "Switzerland");
		assertEquals(g.Serbia.getText(), "Serbia");
		assertEquals(g.CostaRica.getText(), "Costa Rica");

		// pass --> message the tells us what passed
		extentLogger.pass("Group E icon and Group E Teams name verified");

	}

	@Test(groups = { "smoke" })
	public void checkAllTeam() {
		
		extentLogger = report.createTest("Test3");

		extentLogger.info("Verifying all team numbers");


		GroupsPage g = new GroupsPage();
		g.teamMain.click();
		assertEquals(g.allTeam.size(), 32);

		// pass --> message the tells us what passed
		extentLogger.pass("All team numbers are verified");

	}

	@Test
	public void checkGroupH() {
		
		
		extentLogger = report.createTest("Test4");

		extentLogger.info("Verifying Group H Team names");


		GroupsPage g = new GroupsPage();

		assertTrue(g.groupIcon.isDisplayed());

		g.groupIcon.click();

		assertTrue(g.groupHicon.isDisplayed());

		g.groupEicon.click();

		assertEquals(g.Colombia.getText(), "Colombia");
		assertEquals(g.Japan.getText(), "Japan");
		assertEquals(g.Senegal.getText(), "Senegal");
		assertEquals(g.Poland.getText(), "Poland");

		// pass --> message the tells us what passed
		extentLogger.pass("Group H icon and Group H Team names verified");

	}

}
