import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

//add product to chart
public class test4 {

    WebDriver driver;

    public test4(){
        driver=new ChromeDriver();
    }



    public static void main(String[] args){

        test4 obj = new test4();

        obj.driver.get("https://www.amazon.com/dp/B01M7SPZGG/ref=sr_1_1?__mk_de_DE=%C3%85M%C3%85%C5%BD%C3%95%C3%91&keywords=gladiator+blu+ray&qid=1573826444&sr=8-1");

        WebElement addToCart=obj.driver.findElement(By.id("addToCart"));
        addToCart.submit();

        obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement cart = obj.driver.findElement(By.id("nav-cart"));
        System.out.println(cart.getAttribute("aria-label"));

    }

}