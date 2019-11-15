import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class test2 {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/ref=nav_logo");
        WebElement searchTermField = driver.findElement(By.id("twotabsearchtextbox"));
        String str_search = "gladiator blu ray";
        searchTermField.sendKeys(str_search);

        //test

        WebElement execSearch=driver.findElement(By.name("site-search"));
        execSearch.submit();
        List <WebElement> resultSearch = driver.findElements(By.tagName("span"));

        for(WebElement w:resultSearch){
            String text = w.getText();

            if (text.contains("Ergebnissen") && text.contains("Vorschlägen")){
                String [] parts= text.split("von");
                StringTokenizer st = new StringTokenizer(parts[1]);
                List <String> stList= new ArrayList();
                while (st.hasMoreTokens()) {
                    stList.add(st.nextToken());

                }

                //print number of search results
                System.out.println(stList.get(0));
                break;
            }
        }

        /*
        WebElement resultSearch = driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
        List <WebElement> children = resultSearch.findElements(By.tagName("span"));*/
        /*
        String resultSearchText = resultSearch.getText();
        String [] parts= resultSearchText.split("von");
        for(String s: parts){
            System.out.println(s);
        }*/

        //String resultSearchText_cleaned = resultSearchText.replaceAll("\\D+","");

        //int numberOfResults = Integer.parseInt("");
        //driver.get("https://www.wog.ch/index.cfm/search/type/Games/term/"+str_search);
        /*
        List <WebElement> results = driver.findElements(By.className("selected"));
        WebElement result = results.get(1);
        String text = result.getAttribute("innerText");

        System.out.println(text);*/


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

