package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Lib extends BaseTest implements Constant{
public void getProperty() {
	
}
public void getExcelData() {
	
}

public void getSellValue() {
	
}
public void getScreenshot() {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile=new File("f://s.png");
	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
