package xunit;

public class Assert {
    public static void assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            System.out.println(expected + " != " + actual);
            throw new AssertionError("expected:" + expected + ", but was:" + actual);
        }
    }
}
