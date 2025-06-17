package com.wangzji.releaseplease;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Main application class for Release Please Demo
 */
public class Application {
    
    private static final String VERSION_FILE = "/version.properties";
    
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
    
    public void run() {
        System.out.println(greet("World"));
        System.out.println(showVersion());
        System.out.println("This is a Java demo for release-please automation!");
        
        // Demo the calculator functionality
        Calculator calc = new Calculator();
        System.out.println("Demo calculation: 5 + 3 = " + calc.add(5, 3));
    }
    
    public String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            name = "World";
        }
        return "Hello, " + name + "!";
    }
    
    public String showVersion() {
        String version = getVersion();
        return "Release Please Demo v" + version;
    }
    
    private String getVersion() {
        try (InputStream input = getClass().getResourceAsStream(VERSION_FILE)) {
            if (input != null) {
                Properties prop = new Properties();
                prop.load(input);
                return prop.getProperty("version", "1.0.0");
            }
        } catch (IOException e) {
            System.err.println("Could not read version from properties file: " + e.getMessage());
        }
        
        // Fallback: try to read from Maven properties
        String version = getClass().getPackage().getImplementationVersion();
        return version != null ? version : "1.0.0";
    }
} 