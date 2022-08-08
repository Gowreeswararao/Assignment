package com.assignn;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


 public class Rcb {
@Test	
public void Sample() throws StreamReadException, DatabindException, IOException {
	File file=new File("C:\\Users\\Kumar\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Rcb.json");
	
	ObjectMapper map=new ObjectMapper();
	DatasInJson d=map.readValue(file, DatasInJson.class);
	ArrayList<Player> player=d.getPlayer();
	System.out.println("Team as only four foreign players they are listed below:");
	int count=0;
	for (Player da : player) {
		
		if (! da.getCountry().equals("India")) {
			
			System.out.println("NAME:"+da.getName());
			System.out.println("COUNTRY:"+da.getCountry());
			System.out.println("ROLE:"+da.getRole());
			System.out.println("PRICEINCRORES:"+da.getPriceInCrores());
			count++;
			
		}
		
	}
       
	Assert.assertEquals(count, 4); 
	System.out.println();
       System.out.println("Team as one Wicketkeeper:");
       int count1=0;
       for (Player da2 : player) {
    	   if (da2.getRole().equals("Wicket-keeper")) {
    		   System.out.println("NAME:"+da2.getName());
    		   System.out.println("COUNTRY:"+da2.getCountry());
    		   System.out.println("ROLE:"+da2.getRole());
    		   System.out.println("PRICEINCRORES:"+da2.getPriceInCrores());
    		   count1++;
    		   
			
		}
		
	}
	Assert.assertEquals(count1, 1);
}
 }
