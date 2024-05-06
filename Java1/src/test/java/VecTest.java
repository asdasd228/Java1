import com.Gnidskiy.Vec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VecTest {
    @Test
    void testLength() {
        Vec<Integer> vec = new Vec<>(1, 2, 3, 4, 5);

        Assertions.assertEquals(vec.length(), 5);
    }

    @Test
    void testAt() {
        Integer[] testArray = new Integer[] { 1, 2, 3 };

        Vec<Integer> vec = new Vec<>(testArray);

        for (int i = 0; i < vec.length(); ++i)
            Assertions.assertEquals(vec.at(i), testArray[i]);

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            vec.at(-4);
        });

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            vec.at(4);
        });
    }

    @Test
    void testInsert() {
        Vec<Integer> vec = new Vec<>(1, 2, 3);

        vec.insert(0, 0);
        vec.insert(4, 10);
        vec.insert(2, 1);

        Assertions.assertEquals(vec.length(), 6);
        Assertions.assertEquals(vec.at(0), 0);
        Assertions.assertEquals(vec.at(2), 1);
    }

    @Test
    void testPush() {
        Vec<Integer> vec = new Vec<>();

        for (int i = 0; i < 5; ++i)
            vec.push(i);

        for (int i = 0; i < 5; ++i)
            Assertions.assertEquals(vec.at(i), i);
    }

    @Test
    void testRemove() {
        Vec<Integer> vec = new Vec<>(1, 2, 3, 4, 5);

        vec.remove(2);

        Assertions.assertEquals(vec.length(), 4);
        Assertions.assertEquals(vec.at(2), 4);
    }

    @Test
    void testToString() {
        Vec<Integer> vec = new Vec<>(1, 2, 3, 4);

        Assertions.assertEquals(vec.toString(), "1 2 3 4");
    }
}
