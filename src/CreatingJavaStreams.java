import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingJavaStreams {
    public static void main(String[] args) {

        // Streams from values
        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");

        // empty stream using the empty method
        Stream<String> emptyStream = Stream.empty();

        // Streams from arrays
        int[] array = {1,2,3,4,5,6};
        IntStream numbers = Arrays.stream(array);

        // Streams from files
        long uniqueWords = 0 ;
        try(Stream<String> lines =
                    Files.lines(Paths.get("data.txt"), Charset.defaultCharset())){
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        }catch (IOException e){

        }

    }
}
