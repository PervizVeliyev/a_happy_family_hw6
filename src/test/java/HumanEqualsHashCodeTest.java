import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HumanEqualsHashCodeTest {
    Human child = new Human("Elnur","Ismayilov",2000,94, null);
    Human child1 = new Human("Emil","Ismayilov",1996,92, null);
    Human child2 = new Human("Elvin","Ismayilov",1996,92, null);
    Human child3 = new Human("Elvin","Ismayilov",1996,92, null);

    @Test
    void testEquals() {
        Assertions.assertEquals(false, child.equals(child1));
        Assertions.assertEquals(true, child3.equals(child2));
    }

    @Test
    void testHashCode() {
        Assertions.assertTrue(child2.hashCode()==child3.hashCode());
        Assertions.assertFalse(child.hashCode()==child1.hashCode());
    }
}