package az.edu.turing.turingdatingappmaven.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {
    @Id
    private Long id;
    private String message;
    private LocalDate date;
    private Long senderId;
    private Long receiverId;
}
