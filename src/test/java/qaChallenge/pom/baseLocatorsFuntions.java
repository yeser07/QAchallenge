package qaChallenge.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class baseLocatorsFuntions extends Wrapper {
	
	By pageTitle = By.linkText("PARKING COST CALCULATOR");
	By  parkingLot = By.id("ParkingLot");
	By startingDate = By.id("StartingDate");
	By leavingDate = By.id("LeavingDate");
	By startingTime = By.id("StartingTime");
	By leavingTime= By.id("LeavingTime");
	By startingTimeAM = By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input[3]");
	By startingTimePM = By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input[4]");
	By leavingTimeAM =By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[3]");
	By leavingTimePM =By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[4]");
	By calculateButton = By.name("Submit");
	By answerResultMessage = By.tagName("b");
	
	String resultValetParkingxDay ="$ 18.00";

	public baseLocatorsFuntions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void clearForm() {
		clear(startingDate);
		clear(leavingDate);
		clear(startingTime);
		clear(leavingTime);
	}
	
	public void inputTextValues(String starting_Date, String leaving_Date,String starting_Time, String leaving_Time) {
		type(startingDate,starting_Date);
		type(leavingDate,leaving_Date);
		type(startingTime, starting_Time);
		type(leavingTime, leaving_Time);
	}
	
	public void setStartingTimePM() {
		click(startingTimePM);
	}
	public void setLeavingTimePM() {
		click(leavingTimePM);
	}
	
	public void summitButton() {
		click(calculateButton);
	}
	
	public Boolean titleDisplay() {
		if(isDisplayed(pageTitle)==true){
			System.out.println("Title Displayed");
		}
		return false;		
	}
	
	public void dropDownListParkingLot(String parking_Lot) {
		select(parkingLot,parking_Lot);
	}
	
	public String expectedResult() {
		String expectec_result = getText(answerResultMessage);
		return expectec_result;
	}


}