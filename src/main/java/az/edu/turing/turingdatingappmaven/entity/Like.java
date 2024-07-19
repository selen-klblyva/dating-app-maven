package az.edu.turing.turingdatingappmaven.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LIKES")

public class Like {
    @Id
    private Long id;
    private Long likeSenderId;
    private Long likeReceiverId;


}
