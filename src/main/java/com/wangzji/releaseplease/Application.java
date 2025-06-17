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
        System.out.println("Demo calculation: 10 % 3 = " + calc.modulo(10, 3));
        
        // Demo the transaction manager
        TransactionManager tm = new TransactionManager();
        String txId = tm.begin();
        System.out.println("Transaction demo: " + txId);
        tm.commit();
        
        // Demo the new validation feature
        System.out.println("PR validation status: " + validatePRWorkflow());
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
    
    /**
     * New method to validate PR workflow functionality
     * @return validation status message
     */
    public String validatePRWorkflow() {
        return "PR title validation and automatic changelog generation are active";
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