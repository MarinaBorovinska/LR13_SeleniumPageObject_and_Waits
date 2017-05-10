import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    By loginElement = By.id("login-form-username");
    By passwordElement = By.id("login-form-password");
    By loginSubmit = By.id("login-form-submit");

    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage inputLogin(String login){
        driver.findElement(loginElement).sendKeys(login);
        return this;
    }

    public LoginPage inputPassword(String password){
        driver.findElement(passwordElement).sendKeys(password);
        return this;
    }

    public LoginPage clickLogin(){
        driver.findElement(loginSubmit).submit();
        return this;
    }

    public LoginPage openLoginPage(){
        driver.get("http://soft.it-hillel.com.ua:8080/login.jsp");
        return this;
    }
}
