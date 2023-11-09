package ee.mainor.classroom.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductDto {

    private Long id;
    private String name;
    private double price;

    // Getters and setters can be generated using Lombok's @Data annotation
}

