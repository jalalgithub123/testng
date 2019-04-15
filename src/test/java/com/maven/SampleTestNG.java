package com.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestNG {
@Test
public void sampleTest() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\CUCUMBER\\FaceBookTest\\lib\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
}
}
