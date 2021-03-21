import org.junit.Test;

public class TestOffByOne {

    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    @Test
    public void testMyOffByOne() {
        org.junit.Assert.assertTrue(offByOne.equalChars('c', 'd'));
        org.junit.Assert.assertTrue(offByOne.equalChars('g', 'h'));
        org.junit.Assert.assertFalse(offByOne.equalChars('a', 'a'));
        org.junit.Assert.assertTrue(offByOne.equalChars('r', 'q'));

    }
}
