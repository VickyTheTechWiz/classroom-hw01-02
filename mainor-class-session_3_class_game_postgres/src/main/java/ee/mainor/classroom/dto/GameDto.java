package ee.mainor.classroom.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GameDto {

    private Long id;
    private String name;

}
