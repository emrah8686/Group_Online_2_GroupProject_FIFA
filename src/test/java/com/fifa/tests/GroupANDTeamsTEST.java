package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fifa.pages.GroupsPage;

public class GroupANDTeamsTEST extends TestBase {

<<<<<<< HEAD
	@Test(priority = 1, groups = { "smoke" })
=======
	@Test(groups = { "smoke" })
>>>>>>> branch 'master' of https://github.com/DmitriyOgnev/Group_Online_2_GroupProject_FIFA.git
	public void checkGroupG() {
<<<<<<< HEAD
		// name of the test
		extentLogger = report.createTest("test1");
		// info () --> to print a message
		extentLogger.info("Verifying FIFA Website Title");
=======
		extentLogger = report.createTest("Test 1");

>>>>>>> branch 'master' of https://github.com/DmitriyOgnev/Group_Online_2_GroupProject_FIFA.git
		GroupsPage g = new GroupsPage();

		assertTrue(g.groupIcon.isDisplayed());

		g.groupIcon.click();
<<<<<<< HEAD
		assertTrue(g.groupGicon.isDisplayed());

		g.groupGicon.click();
=======
		
>>>>>>> branch 'master' of https://github.com/DmitriyOgnev/Group_Online_2_GroupProject_FIFA.git
		assertEquals(g.Belg.getText(), "Belgium");
		assertEquals(g.Engl.getText(), "England");
		assertEquals(g.Tuns.getText(), "Tunisia");
		assertEquals(g.Pana.getText(), "Panama");
<<<<<<< HEAD
		// pass --> message the tells us what passed
		extentLogger.pass("Page title verified");

	}

	@Test(priority = 2, groups = { "smoke" })
=======
		extentLogger.pass("Page title verified");

	}

	@Test(groups = { "smoke" })
>>>>>>> branch 'master' of https://github.com/DmitriyOgnev/Group_Online_2_GroupProject_FIFA.git
	public void checkAllTeam() {
<<<<<<< HEAD
		// name of the test
		extentLogger = report.createTest("test 2");
		// info () --> to print a message
		extentLogger.info("Verifying FIFA Website Title");
=======
		extentLogger = report.createTest("Test 2");
>>>>>>> branch 'master' of https://github.com/DmitriyOgnev/Group_Online_2_GroupProject_FIFA.git
		GroupsPage g = new GroupsPage();
		g.teamMain.click();
		assertEquals(g.allTeam.size(), 32);
<<<<<<< HEAD

		// pass --> message the tells us what passed
		extentLogger.pass("Page title verified");
=======
		extentLogger.pass("Page title verified");

>>>>>>> branch 'master' of https://github.com/DmitriyOgnev/Group_Online_2_GroupProject_FIFA.git

	}
}
