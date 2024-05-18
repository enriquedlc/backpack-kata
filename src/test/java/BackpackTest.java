import org.example.Backpack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackpackTest {
    @DisplayName("display class name")
    @Test
    public void display_class_name() {
        assertEquals("Backpack", Backpack.displayName());
    }
}
