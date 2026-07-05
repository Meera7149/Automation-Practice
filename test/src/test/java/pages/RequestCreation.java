package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestCreation {

@FindBy(xpath="//*[@class='fa fa-user-circle']") WebElement Retail_button;
@FindBy(xpath="(//*[@class='user-image'])[3]") WebElement Corporate_button;
@FindBy(xpath="//*[@id=\"atu_mobile\"]") WebElement Retail_mobile;
@FindBy(xpath="(//*[@id='rusearch']") WebElement Retail_search;
@FindBy(xpath="((//*[@class='radio rc'])[1]") WebElement Mobile_select;
@FindBy(xpath="(//*[@id='rusubmit']") WebElement Mobile_go;
@FindBy(xpath="(//*[@id='flightsource_1']") WebElement Departure_from;
@FindBy(xpath="(//*[@id='flightdestination_1']") WebElement Arrival_to;
@FindBy(xpath="(//*[@name='DepartureDate[1]']") WebElement Departure_date;
@FindBy(xpath="(//*[@name='flight_adult[1]']") WebElement adult_count;
@FindBy(xpath="(//*[@name='flight_child[1]']']") WebElement child_count;
@FindBy(xpath="(//*[@name='flight_infant[1]']") WebElement infant_count;
@FindBy(xpath="((//*[text()='Save'])[1]") WebElement SR_Save;
@FindBy(xpath="((//*[@id='search_button_mptb_1'])") WebElement SR_Search;

public RequestCreation(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void retail_buttonclick() {
	Retail_button.click();	
}

public void retail_mobile_enter(String mobile) {
	Retail_mobile.sendKeys(mobile);
}

public void Retail_search_click() {
	Retail_search.click();
}
public void Mobile_go_click() {
	Mobile_go.click();
}
public void Departure_from_enter(String departure) {
	Departure_from.sendKeys(departure);
}

public void Arrival_to_enter(String arrival) {
	Arrival_to.sendKeys(arrival);
}
public void Departure_date_select(String deptdate) {
	Departure_date.sendKeys(deptdate);
}

public void adult_count_select(int adult) {
	adult_count.click();
	adult_count.sendKeys(Integer.toString(adult),Keys.ENTER);
}
public void child_count_select(int child) {
	child_count.click();
	child_count.sendKeys(Integer.toString(child),Keys.ENTER);
}
public void infant_count_select(int infant) {
	infant_count.click();
	infant_count.sendKeys(Integer.toString(infant),Keys.ENTER);
}
public void SR_Save_click() {
	SR_Save.click();
}
public void sr_search_click(){
	SR_Search.click();
}



}
