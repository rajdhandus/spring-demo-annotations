/**
 * 
 */
package com.raj.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @author rajkumarpurushothaman
 *
 */
@Component
public class FileFortuneService implements FortuneService {

	/**
	 * 
	 */
	
	private String[] fortunes;
	
	@SuppressWarnings("unused")
	private void readFortunesFromFile(){
		Path file = Paths.get("fortune.txt");
		
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    List<String> lines = new ArrayList<String>();
		    while ((line = reader.readLine()) != null) {
		    	lines.add(line);
		    }
	        fortunes =  lines.toArray(new String[lines.size()]);
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
	
	private int getRandomNumber(){
		Random myRandom = new Random();
		readFortunesFromFile();
		return myRandom.nextInt(fortunes.length);
	}
	
	public FileFortuneService() {
	}

	/* (non-Javadoc)
	 * @see com.raj.spring.FortuneService#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		int index = getRandomNumber();
		return fortunes[index];
	}
	
//	public static void main(String[] args){
//		FileFortuneService ffs = new FileFortuneService();
//		ffs.readFortunesFromFile("fortune.txt");
//		System.out.println(ffs.getDailyFortune());
//	}

}
