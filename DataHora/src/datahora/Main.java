package datahora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(localDate));

		System.out.println("=============================");
	}

}
