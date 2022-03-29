package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaMain {
    public MedunnaMain(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css= "[id=\"account-menu\"]")
    public WebElement SignInLinki;

}
