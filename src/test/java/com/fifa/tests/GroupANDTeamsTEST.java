package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.fifa.pages.GroupsPage;

public class GroupANDTeamsTEST extends TestBase {

	@Test(priority = 1, groups = { "smoke" })
	public void checkGroupG() {

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
		extentLogger.pass("Group G icon and Group G Teams name verified");

	}
	@Test(priority = 3, groups = { "smoke" })
	public void checkGroupE() {

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

	@Test(priority = 2, groups = { "smoke" })
	public void checkAllTeam() {

		GroupsPage g = new GroupsPage();
		g.teamMain.click();
		assertEquals(g.allTeam.size(), 32);
		
		// pass --> message the tells us what passed
	extentLogger.pass("All team numbers are verified");

	}
}
