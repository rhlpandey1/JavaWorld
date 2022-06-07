package sony.round2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckSeleniumDropDownIsSortedOrNot {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.twoplugs.com/newsearchserviceneed");
        driver.manage().window().maximize();

        Select options = new Select(driver.findElement(By.name("category_id")));

        // Get all options from category dropdown
        List<WebElement> lists = options.getOptions();

        //Creating a List to store all dropdown values
        List<String> OriginalList = new ArrayList<>();

        //Using for-each loop fetch all options one by one and get their values
        for(WebElement ele : lists) {

            OriginalList.add(ele.getText());
        }

        System.out.println("Options in dropdown: " +OriginalList);

        //Creating temp List - same copy of Original for comparing purpose
        List<String> templist = new ArrayList<>(OriginalList);

        System.out.println("Temp List: " + templist);

        //Sorting the Original List
        Collections.sort(OriginalList);
        System.out.println("Sorted List:" + OriginalList );


        // In IF Condition we will compare both List
        if(OriginalList.equals(templist)) {

            System.out.println("List is Sorted");

        }else {

            System.out.println("List is unsorted");
        }

        driver.quit();
    }
}
