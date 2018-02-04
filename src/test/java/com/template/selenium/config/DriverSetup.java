package com.template.selenium.config;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface DriverSetup {

    RemoteWebDriver getWebDriverObject(MutableCapabilities driverOptions);
    MutableCapabilities getDesiredCapabilities(Proxy proxySettings);
}