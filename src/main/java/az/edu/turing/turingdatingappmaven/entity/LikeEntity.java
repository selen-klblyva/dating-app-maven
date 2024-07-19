package az.edu.turing.turingdatingappmaven.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LIKES")

public class LikeEntity {
    private long id;
    private Boolean reaction;
    private long likeSenderId;
    private long likeReceiverId;
}
