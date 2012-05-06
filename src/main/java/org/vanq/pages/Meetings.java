package org.vanq.pages;

import org.openqa.selenium.WebDriver;

public class Meetings extends AbstractPageObject {

    public Meetings(WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getExpectedH2Content() {
        return "Past Meetings and Materials";
    }
}
