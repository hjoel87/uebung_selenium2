import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.directory.Attributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

//add product to chart
public class test3 {

    WebDriver driver;

    public test3(){
        driver=new ChromeDriver();
    }

    public void clickLinkByHref(String url) {
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        while(i.hasNext()) {
            WebElement anchor = i.next();
            String currentURL=anchor.getAttribute("href");
            System.out.println(currentURL);
            if(url.equals(currentURL)){
                System.out.println("test");
            }

        }
    }
    
    
    public static void main(String[] args){

        test3 obj = new test3();

        obj.driver.get("https://www.amazon.com/ref=nav_logo");
        WebElement searchTermField = obj.driver.findElement(By.id("twotabsearchtextbox"));
        String str_search = "gladiator blu ray";
        searchTermField.sendKeys(str_search);

        //test

        WebElement execSearch=obj.driver.findElement(By.name("site-search"));
        execSearch.submit();

        obj.clickLinkByHref("https://www.amazon.com/dp/B008F2823C/ref=sr_1_2?__mk_de_DE=%C3%85M%C3%85%C5%BD%C3%95%C3%91&keywords=gladiator+blu+ray&qid=1573826444&sr=8-2");

    }

}
