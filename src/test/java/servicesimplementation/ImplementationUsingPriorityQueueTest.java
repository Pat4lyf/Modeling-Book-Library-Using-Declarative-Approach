package servicesimplementation;

import model.Book;
import model.Library;
import model.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ImplementationUsingPriorityQueueTest {

    static Person person = new Person("Bola", "Junior Student");
    static Book book2 = new Book("The Orphan Boy", "Alex Jobs");
    static model.Person person1 = new Person("Glory", "Senior Student");
    static Person person2 = new Person("Pat", "Teacher");

    @BeforeAll
    static void setUp() {
        person.requestForBook(book2);
        person1.requestForBook(book2);
        person2.requestForBook(book2);
    }

    @Test
    void testForGiveBookBasedOnPriority() {
        Library.getAddingToBooks().addToListOfBooks(book2, 6);
        ImplementationUsingPriorityQueue implementationUsingPriorityQueue = new ImplementationUsingPriorityQueue();
        implementationUsingPriorityQueue.giveBookBasedOnPriority();

        assertEquals(3, Library.getMapOfBorrowers().size());
        assertNotEquals(0, Library.getMapOfBorrowers().size());

    }
}