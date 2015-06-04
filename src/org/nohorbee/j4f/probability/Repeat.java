package org.nohorbee.j4f.probability;

import java.util.HashMap;
import java.util.Map;

public class Repeat {
	
	public static void go(int keyLen, int times) {
		System.out.println("RUNNING " + times + " times for keylen " + keyLen);
		Map<String, Integer> generatedKeys = new HashMap<String, Integer>();
		int repetitions=0;
		for(int i=0;i<=times;i++) {
			String rndKey = RandomString.randomString(keyLen);
			if (generatedKeys.get(rndKey)!=null) {
				repetitions++;
				generatedKeys.put(rndKey, generatedKeys.get(rndKey)+1);
				System.out.println("REPETITION: " + rndKey + " appears " + (generatedKeys.get(rndKey)) + " times" );		
			} else {
				generatedKeys.put(rndKey, 1);
			}
			
			
			
		}
		
		System.out.println("TOTAL REPETITIONS: " + repetitions);
	}

}
