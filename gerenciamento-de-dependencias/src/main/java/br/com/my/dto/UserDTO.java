/** Transporta os dados de usuário entre as camadas da aplicação. */
package br.com.my.dto;

import java.time.LocalDate;

import lombok.Data;



@Data
public class UserDTO {
	
	private int id;
	private String name;
	private LocalDate birthday;
	
	
	
}
