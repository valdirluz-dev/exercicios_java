/** Representa o modelo de usuário persistido pela aplicação. */
package br.com.my.model;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class UserModel {
    private int code;
    private String userName; 
    private LocalDate birthday;
}
