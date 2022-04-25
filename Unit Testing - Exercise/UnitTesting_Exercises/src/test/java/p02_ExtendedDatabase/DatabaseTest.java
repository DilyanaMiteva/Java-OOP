package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    Person[] people = new Person[]{
            new Person(1, "A"),
            new Person(2, "B"),
            new Person(3, "C")
    };

    private Database database;

    @Before
    public void setUp() throws OperationNotSupportedException {
        this.database = new Database(people);
    }

    @Test
    public void test1() throws OperationNotSupportedException {
        assertEquals(people.length, database.getElements().length);
        assertArrayEquals(people, database.getElements());
    }
    @Test(expected = OperationNotSupportedException.class)
    public void test2() throws OperationNotSupportedException {
        new Database(new Person[17]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test3() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void test4() throws OperationNotSupportedException {
        database.add(new Person(5, "P"));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test5() throws OperationNotSupportedException {
        database.remove();
        database.remove();
        database.remove();
        database.remove();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test6() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test()
    public void test7() throws OperationNotSupportedException {
        Person actualPerson = database.findByUsername("B");
        assertEquals(people[1].getId(), actualPerson.getId());
        assertEquals(people[1].getUsername(), actualPerson.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test8() throws OperationNotSupportedException {
        database.remove();
        database.remove();
        database.remove();
        database.findByUsername("A");
    }

    @Test()
    public void test9() throws OperationNotSupportedException {
        Person person = database.findById(2);
        assertEquals(people[1].getId(), person.getId());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test10() throws OperationNotSupportedException {
        database.remove();
        database.remove();
        database.remove();
        database.findById(1);
    }


}
