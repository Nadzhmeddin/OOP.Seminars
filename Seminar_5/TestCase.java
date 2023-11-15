package Seminar_5;

import java.util.List;

public class TestCase {

    public <T> void move(List<T> from, List<T> to) {
        to.addAll(from);
        from.clear();
    }

    // TDD - Test Driven Development
    public String removeSpacesToUpperCase(String text) {
        return text.replaceAll("\\s+", "").toUpperCase();
    }
}
