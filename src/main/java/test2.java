import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import java.util.List;


public class test2 {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wog.ch/index.cfm/login/redirectTo/myWoG/fromCart/false");
        WebElement searchTermField = driver.findElement(By.id("searchTerm"));
        String str_search = "Fifa";
        searchTermField.sendKeys(str_search);

        //test

        WebElement execSearch=driver.findElement(By.id("search-form"));
        execSearch.submit();

        //driver.get("https://www.wog.ch/index.cfm/search/type/Games/term/"+str_search);

        List <WebElement> results = driver.findElements(By.className("selected"));
        WebElement result = results.get(1);
        String text = result.getAttribute("innerText");

        System.out.println(text);


        /*try {

            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);

        } catch (AWTException e) {
            e.printStackTrace();
        }*/


        //WebElement passwordElement = driver.findElement(By.id("password"));

        //usernameElement.sendKeys("Joel Henz");
        //passwordElement.sendKeys("test");

    }

}

