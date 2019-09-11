package com.atmecs.phptravels.helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	WebElement element;
	static String xpath;
	WebDriver driver;
	String sendkeys;

	public void explicitWaitClick() {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.click();
	}

	public void explicitWaitSendKeys() {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.sendKeys(sendkeys);
	}

	public void fluentWait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	}
}
