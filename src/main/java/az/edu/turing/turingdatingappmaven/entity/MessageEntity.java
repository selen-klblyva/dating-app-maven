package az.edu.turing.turingdatingappmaven.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageEntity {
    private String message;
    private long id;
    private LocalDate date;
    private long senderId;
    private long receiverId;
}
