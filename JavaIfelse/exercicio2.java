import java.util.Scanner;
import java.util.Calendar;
public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar data = Calendar.getInstance();
		
		System.out.print(data.get(Calendar.DAY_OF_MONTH));
		System.out.print("/"+data.get(Calendar.MONTH));
		System.out.print("/"+data.get(Calendar.YEAR));
		
	}

}
