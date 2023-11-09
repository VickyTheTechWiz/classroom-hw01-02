package ee.mainor.classroom.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "guessing_game")
public class GuessingGame {

    @Id
    private Long id;

    private Integer correctAnswer;
    private String name;

}
