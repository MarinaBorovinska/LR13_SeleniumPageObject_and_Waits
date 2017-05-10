import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateSubtask{

    By subtaskCreate = By.xpath(".//*[@id='stqc_show']");
    By subtaskSummary = By.xpath(".//*[@id='summary']");
    By subtaskSubmit = By.xpath(".//*[@id='create-issue-submit']");

    private final WebDriver driver;

    public CreateSubtask(WebDriver driver){
        this.driver = driver;
    }

    public CreateSubtask createNewSubtask(){
        driver.findElement(subtaskCreate).click();
        return this;
    }

    public CreateSubtask inputSummarySubtask(String summary){
        (new WebDriverWait(driver, 3)).until(ExpectedConditions.presenceOfElementLocated(subtaskSummary));
        driver.findElement(subtaskSummary).clear();
        driver.findElement(subtaskSummary).sendKeys(summary);
        return this;
    }

    public CreateSubtask submitSubtask(){
        driver.findElement(subtaskSubmit).submit();
        return this;
    }

    public CreateSubtask open(){
        driver.get("http://soft.it-hillel.com.ua:8080/browse/QAAUT-60");
        driver.manage().window().maximize();
        return this;
    }
}
