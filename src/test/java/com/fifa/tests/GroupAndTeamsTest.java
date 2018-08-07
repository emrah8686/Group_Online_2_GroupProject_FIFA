package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.fifa.pages.GroupsPage;
import com.fifa.pages.HomePage;

public class GroupAndTeamsTest extends TestBase {

	@Test
	public void checkGroupG() {

		extentLogger = report.createTest("Group G");

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
		
		extentLogger = report.createTest("Group E");

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
		
		extentLogger = report.createTest("Verify the count of all teams");

		extentLogger.info("Verifying all team numbers");


		GroupsPage g = new GroupsPage();
		g.teamMain.click();
		assertEquals(g.allTeam.size(), 32);

		// pass --> message the tells us what passed
		extentLogger.pass("All team numbers are verified");

	}

	@Test
	public void checkGroupH() {
		
		
		extentLogger = report.createTest("Group H");

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
	
	@Test(groups = { "smoke" })
	public void ValidateAllGroupMembers() {

		HomePage homePage = new HomePage();
		homePage.headerLinkGroups.click();

		GroupsPage groupPage = new GroupsPage();

		extentLogger = report.createTest("Validate All Group Members");

		extentLogger.info("Verifying Group A Team members");

		assertEquals(groupPage.getNthTableGroupTitle(1).getText().toLowerCase(), "group a");
		assertEquals(groupPage.getNthTeamFromTthGroup(1, 1).getText().toLowerCase(), "uruguay");
		assertEquals(groupPage.getNthTeamFromTthGroup(1, 2).getText().toLowerCase(), "russia");
		assertEquals(groupPage.getNthTeamFromTthGroup(1, 3).getText().toLowerCase(), "saudi arabia");
		assertEquals(groupPage.getNthTeamFromTthGroup(1, 4).getText().toLowerCase(), "egypt");

		extentLogger.pass("Group A members are verified");

		extentLogger.info("Verifying Group B Team members");

		assertEquals(groupPage.getNthTableGroupTitle(2).getText().toLowerCase(), "group b");
		assertEquals(groupPage.getNthTeamFromTthGroup(2, 1).getText().toLowerCase(), "spain");
		assertEquals(groupPage.getNthTeamFromTthGroup(2, 2).getText().toLowerCase(), "portugal");
		assertEquals(groupPage.getNthTeamFromTthGroup(2, 3).getText().toLowerCase(), "ir iran");
		assertEquals(groupPage.getNthTeamFromTthGroup(2, 4).getText().toLowerCase(), "morocco");

		extentLogger.pass("Group B members are verified");
		
		extentLogger.info("Verifying Group C Team members");

		assertEquals(groupPage.getNthTableGroupTitle(3).getText().toLowerCase(), "group c");
		assertEquals(groupPage.getNthTeamFromTthGroup(3, 1).getText().toLowerCase(), "france");
		assertEquals(groupPage.getNthTeamFromTthGroup(3, 2).getText().toLowerCase(), "denmark");
		assertEquals(groupPage.getNthTeamFromTthGroup(3, 3).getText().toLowerCase(), "peru");
		assertEquals(groupPage.getNthTeamFromTthGroup(3, 4).getText().toLowerCase(), "australia");

		extentLogger.pass("Group C members are verified");

		extentLogger.info("Verifying Group D Team members");

		assertEquals(groupPage.getNthTableGroupTitle(4).getText().toLowerCase(), "group d");
		assertEquals(groupPage.getNthTeamFromTthGroup(4, 1).getText().toLowerCase(), "croatia");
		assertEquals(groupPage.getNthTeamFromTthGroup(4, 2).getText().toLowerCase(), "argentina");
		assertEquals(groupPage.getNthTeamFromTthGroup(4, 3).getText().toLowerCase(), "nigeria");
		assertEquals(groupPage.getNthTeamFromTthGroup(4, 4).getText().toLowerCase(), "iceland");

		extentLogger.pass("Group D members are verified");
		
		extentLogger.info("Verifying Group E Team members");

		assertEquals(groupPage.getNthTableGroupTitle(5).getText().toLowerCase(), "group e");
		assertEquals(groupPage.getNthTeamFromTthGroup(5, 1).getText().toLowerCase(), "brazil");
		assertEquals(groupPage.getNthTeamFromTthGroup(5, 2).getText().toLowerCase(), "switzerland");
		assertEquals(groupPage.getNthTeamFromTthGroup(5, 3).getText().toLowerCase(), "serbia");
		assertEquals(groupPage.getNthTeamFromTthGroup(5, 4).getText().toLowerCase(), "costa rica");

		extentLogger.pass("Group E members are verified");
		
		extentLogger.info("Verifying Group F Team members");

		assertEquals(groupPage.getNthTableGroupTitle(6).getText().toLowerCase(), "group f");
		assertEquals(groupPage.getNthTeamFromTthGroup(6, 1).getText().toLowerCase(), "sweden");
		assertEquals(groupPage.getNthTeamFromTthGroup(6, 2).getText().toLowerCase(), "mexico");
		assertEquals(groupPage.getNthTeamFromTthGroup(6, 3).getText().toLowerCase(), "korea republic");
		assertEquals(groupPage.getNthTeamFromTthGroup(6, 4).getText().toLowerCase(), "germany");

		extentLogger.pass("Group F members are verified");
		
		extentLogger.info("Verifying Group G Team members");

		assertEquals(groupPage.getNthTableGroupTitle(7).getText().toLowerCase(), "group g");
		assertEquals(groupPage.getNthTeamFromTthGroup(7, 1).getText().toLowerCase(), "belgium");
		assertEquals(groupPage.getNthTeamFromTthGroup(7, 2).getText().toLowerCase(), "england");
		assertEquals(groupPage.getNthTeamFromTthGroup(7, 3).getText().toLowerCase(), "tunisia");
		assertEquals(groupPage.getNthTeamFromTthGroup(7, 4).getText().toLowerCase(), "panama");

		extentLogger.pass("Group G members are verified");
		
		extentLogger.info("Verifying Group H Team members");

		assertEquals(groupPage.getNthTableGroupTitle(8).getText().toLowerCase(), "group h");
		assertEquals(groupPage.getNthTeamFromTthGroup(8, 1).getText().toLowerCase(), "colombia");
		assertEquals(groupPage.getNthTeamFromTthGroup(8, 2).getText().toLowerCase(), "japan");
		assertEquals(groupPage.getNthTeamFromTthGroup(8, 3).getText().toLowerCase(), "senegal");
		assertEquals(groupPage.getNthTeamFromTthGroup(8, 4).getText().toLowerCase(), "poland");

		extentLogger.pass("Group H members are verified");
		
	}

}

