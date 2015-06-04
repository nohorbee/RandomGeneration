package org.nohorbee.j4f.probability;


public class TestRepetitions {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("ERROR | Usage: java TestRepetitions.jar keylen times");
			return;
		}
		try {
			int keyLen = new Integer(args[0]);
			int times = new Integer(args[1]);
			
			
			Repeat.go(keyLen, times);
			
		} catch(NumberFormatException e) {
			System.out.println("ERROR | Usage: java TestRepetitions.jar keylen length. Both parameters are Integer");
			return;
		}
	}

}
