package fruit;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Fruit {
    private final String name;
    private final double weight;
}
