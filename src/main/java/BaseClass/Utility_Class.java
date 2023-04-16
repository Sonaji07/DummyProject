package BaseClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Config.PathConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility_Class {
	
	//WebDriver driver;
	
	public WebDriver setUp()
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		 WebDriver driver = new ChromeDriver(chromeOptions);
        
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\SONAJI AMBADAS KHAND\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get(PathConfig.SignupUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	
	
}
