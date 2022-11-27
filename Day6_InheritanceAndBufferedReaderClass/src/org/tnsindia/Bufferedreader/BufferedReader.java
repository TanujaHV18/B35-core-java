package org.tnsindia.Bufferedreader;

import java.io.IOException;
import java.io.InputStreamReader;
//Demo on BufferedReader class
public class BufferedReader {

public BufferedReader(InputStreamReader inputStreamReader) {
		
	}

public static void main(String[] args) throws IOException {
	BufferedReader b=new BufferedReader(new
			InputStreamReader(System.in));
	String name=b.readLine();
	System.out.println(name);

}

private String readLine() {
	
	return null;
}

}
