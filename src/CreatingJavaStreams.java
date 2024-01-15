import java.util.stream.Stream;

public class CreatingJavaStreams {
    public static void main(String[] args) {

        // Streams from values
        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");

        // empty stream using the empty method
        Stream<String> emptyStream = Stream.empty();

    }
}
