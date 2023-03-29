package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuapPage {
    public HerokuapPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css="button[onclick=\"addElement()\"]")
    public WebElement addElementButton;

    @FindBy(css="button[class=\"added-manually\"]")
    public WebElement deleteButton;

    @FindBy(xpath="//h3[.='Add/Remove Elements']")
    public WebElement addRemoveElements;

    @FindBy(xpath="//body")
    public WebElement body;

    @FindBy(xpath = "//*[@class\"added-manually\"]")
    public List<WebElement>addRemovesElementsLists;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteElement;

}
