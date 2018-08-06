package com.fifa.tests;



import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;


import com.fifa.pages.HomePage;
import com.fifa.pages.TeamsPage;

public class TeamsVerification extends TestBase{
	
	
	@Test(groups= {"smoke"})
	public void allTeamsVerification() {
		
		String [] all32Teams = {"ARGENTINA", "AUSTRALIA", "BELGIUM", "BRAZIL", "COLOMBIA", "COSTA RICA", "CROATIA", "DENMARK", "EGYPT", "ENGLAND", "FRANCE", "GERMANY", "ICELAND", "IR IRAN", "JAPAN", "KOREA REPUBLIC", "MEXICO", "MOROCCO", "NIGERIA", "PANAMA", "PERU","POLAND", "PORTUGAL", "RUSSIA", "SAUDI ARABIA", "SENEGAL", "SERBIA", "SPAIN", "SWEDEN", "SWITZERLAND", "TUNISIA", "URUGUAY"};		
		extentLogger = report.createTest("Test1");
		
		extentLogger.info("Verifying all 32 World Cup Teams");
		
		
		HomePage homePage = new HomePage();
		homePage.headerMenuTeams.click();
		
		TeamsPage teamsPage = new TeamsPage();
		
		for (int i = 0; i < teamsPage.allTeams.size(); i++) {
			
		String expected = all32Teams[i];
		String actual = teamsPage.allTeams.get(i).getText();	
		
		assertEquals(actual, expected);
			
		}
		extentLogger.pass("All 32 Team Names Verified");	
		
	}

}
