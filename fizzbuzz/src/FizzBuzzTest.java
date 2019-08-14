import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void whenNumberReturnsItself(){
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    public void whenMultipleOf3ReturnsFizz() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void whenMultipleOf5ReturnsBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void whenMultipleOf3And5Buzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));

    }

    @Test
    public void whenMultipleOf7ReturnsFuzz() {
        assertEquals("Fuzz", FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void whenMultipleOf3And7FizzFuzz() {
        assertEquals("FizzFuzz", FizzBuzz.fizzBuzz(21));

    }

    @Test
    public void whenMultipleOf5And7BuzzFuzz() {
        assertEquals("BuzzFuzz", FizzBuzz.fizzBuzz(35));

    }
    @Test
    public void whenMultipleOf357FizzBuzzFuzz() {
        assertEquals("FizzBuzzFuzz", FizzBuzz.fizzBuzz(105));

    }
}