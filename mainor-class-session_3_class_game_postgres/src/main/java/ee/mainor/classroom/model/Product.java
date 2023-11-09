package ee.mainor.classroom.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "product")
public class Product {

    @Id
    private Long id;

    private String name;
    private double price;

    // Getters and setters can be generated using Lombok's @Data annotation
}
