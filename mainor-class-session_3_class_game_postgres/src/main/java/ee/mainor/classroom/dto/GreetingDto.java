package ee.mainor.classroom.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GreetingDto {

    private String fullName;
    private String university;

}
