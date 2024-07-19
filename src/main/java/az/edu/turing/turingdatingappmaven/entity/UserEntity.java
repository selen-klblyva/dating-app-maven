package az.edu.turing.turingdatingappmaven.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String photoURL;
}

