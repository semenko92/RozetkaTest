package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class Helpers {

	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException{
		TakesScreenshot ts=(TakesScreenshot) driver;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat timeOnly = new SimpleDateFormat("HH:mm:ss");
		String filePath="src/main/java/resources/screenshots/"+fileName+timeOnly.format(cal.getTime())+".png";
		//String filePath="./screenshots/"+".png "+timeOnly.format(cal.getTime());
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(filePath));
	}
	public static List <LogEntry> getBrowserLogs(WebDriver driver){
		LogEntries logs=driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logsList=logs.getAll();
		return logsList;
	}
}
