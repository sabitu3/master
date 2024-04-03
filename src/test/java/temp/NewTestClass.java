package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewTestClass {

    String xpath = "//span/a[text()='Services']";
    String items="//a[contains(@class,'top-navigation__item')]";
    WebDriver driver;
    public NewTestClass(WebDriver d){
        this.driver=d;

    }


    public WebElement clickServices(){
        return driver.findElement(By.xpath(xpath));
    }

    public List<WebElement> findTopNavItems(){
        return driver.findElements(By.xpath(items));
    }
}
