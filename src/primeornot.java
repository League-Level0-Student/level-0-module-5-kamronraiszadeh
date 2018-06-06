import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	String num= JOptionPane.showInputDialog("Enter a number");
	
int a=	Integer.parseInt(num);

for (int i = 2; i <= a/2; i++) {
if (a%i==0) {
	JOptionPane.showMessageDialog(null,"Your number that you said is not prime.");
	System.exit(0);
	}	


}
JOptionPane.showMessageDialog(null,"Your number that you said is prime.");
	
}
}
