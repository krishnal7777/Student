package numbers;

public class Divisor {
public static void main(String[] args) {
	int n=100;
	for(int i=1;i<=100;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
}
}
