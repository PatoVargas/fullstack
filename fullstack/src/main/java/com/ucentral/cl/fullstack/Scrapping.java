
package com.ucentral.cl.fullstack;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author patricio
 */

public class Scrapping {
    
    public static int checkStatusConnection(String url){
        
        Connection.Response response = null;
        try {
            response = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).ignoreHttpErrors(true).execute();
        } catch (IOException ex) {
            System.out.println("Excepción al obtener el Status Code: " + ex.getMessage());
        }
        return response.statusCode();
    }
    
    public static Document getHtmlDocument(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        
        Document doc = Jsoup.parse(driver.getPageSource());
        return doc;
    }
}
