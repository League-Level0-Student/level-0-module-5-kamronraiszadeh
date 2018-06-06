
public class fibonacci {
public static void main(String[] args) {
	
	int numone=0;
	int numtwo=1;
	System.out.println(numone);
	System.out.println(numtwo);
	for (int i = 0; i < 100; i++) {
		
	
	int numthree=numone+numtwo;
	 numone=numtwo;
	 numtwo=numthree;
	 System.out.println(numtwo);
}
}
}
