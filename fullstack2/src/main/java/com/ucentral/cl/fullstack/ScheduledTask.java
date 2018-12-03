
package com.ucentral.cl.fullstack;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    
    public static final String url = "http://cinehoyts.cl/cartelera/santiago-oriente/";
    
    @Scheduled(fixedRate = 2000000)
    public void create(){
        System.out.println("*********");
        int status = Scrapping.checkStatusConnection(url);
        if (status==200) {
            Document doc = Scrapping.getHtmlDocument(url);
            System.out.println(doc);
        }
        else{
            System.out.println("Problema en conexión");
        }
    }
}
