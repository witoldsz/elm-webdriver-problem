
import static java.lang.System.getProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String userDir = getProperty("user.dir");
        System.out.println("user.dir: " + userDir);

        String chromeDriverDir = getProperty("webdriver.chrome.driver", userDir);
        System.out.println("webdriver.chrome.driver: "
            + chromeDriverDir
            + " (to override: java -Dwebdriver.chrome.driver=/my/path -jar ...)"
        );
        System.setProperty("webdriver.chrome.driver", chromeDriverDir);

        driver.get("https://api.runelm.io/c/nx0/result");

        for (int i = 1; i <= 20; ++i) {
            driver
                .findElement(By.id("elm-webdriver-problem-" + i))
                .sendKeys("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        }
    }
}
