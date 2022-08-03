import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HumanEqualsHashCodeTest {
    Human child = new Human("Elnur","Ismayilov",2000,94, null);
    Human child1 = new Human("Emil","Ismayilov",1996,92, null);
    Human child2 = new Human("Elvin","Ismayilov",1996,92, null);
    Human child3 = new Human("Elvin","Ismayilov",1996,92, null);

    @Test
    void testEquals() {
        Assertions.assertNotEquals(child, child1);
        Assertions.assertEquals(child3, child2);
    }

    @Test
    void testHashCode() {
        Assertions.assertEquals(child2.hashCode(), child3.hashCode());
        Assertions.assertNotEquals(child.hashCode(), child1.hashCode());
    }
}