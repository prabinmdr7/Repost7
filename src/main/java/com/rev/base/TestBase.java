package com.rev.base;

import java.util.Properties;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		prop = new Properties();
		FileInputStream input = new FileInputStream("C:\Users\prabin\eclipse-workspace\com.rev.qa\src\"
				+ "main\java\com\rev\config\config.properties");
		prop.load(input);
	
	}
}
