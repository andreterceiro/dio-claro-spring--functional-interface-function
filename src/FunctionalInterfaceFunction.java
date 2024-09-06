import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfaceFunction {
    /**
     * List of the numbers to be mapped to other numbers in the methods
     */
    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    /**
     * Main method to allow us execute manual tests in the CLI
     * @param args CLI arguments (ignored)
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FunctionalInterfaceFunction.forma1();
        System.out.println("----------------------");
        FunctionalInterfaceFunction.forma2();
        System.out.println("----------------------");
        FunctionalInterfaceFunction.forma3();
    }

    /**
     * Way 1 to use functional interface function
     */
    public static void forma1() {
        Function<Integer, Double> dobrar = numero -> numero * 2.0;

        List<Double> numerosDobrados = FunctionalInterfaceFunction.numeros
            .stream()
            .map(dobrar)
            .collect(Collectors.toList()); /* direct .toList() in Java 16+ */

        System.out.println(numerosDobrados);
        
        // Another way of printing, this time every value instead the whole list
        numerosDobrados.forEach(numero -> System.out.println(numero));

    }

    /**
     * Way 2 to use functional interface function
     */
    public static void forma2() {
        Function<Integer, Double> dobrar = numero -> numero * 2.0;

        List<Double> numerosDobrados = FunctionalInterfaceFunction.numeros
            .stream()
            .map(dobrar)
            .collect(Collectors.toList()); /* direct .toList() in Java 16+ */

        System.out.println(numerosDobrados);

        // Another way of printing, this time every value instead the whole list
        numerosDobrados.forEach(System.out::println);
    }

    /**
     * Way 3 to use functional interface function
     */
    public static void forma3() {
        List<Integer> numerosDobrados = FunctionalInterfaceFunction.numeros
            .stream()
            .map(new Function<Integer,Integer>() {
                public Integer apply(Integer n) {
                    return n * 2;
                }
                
            })
            .collect(Collectors.toList()); /* direct .toList() in Java 16+ */

        System.out.println(numerosDobrados);

        // Another way of printing, this time every value instead the whole list
        numerosDobrados.forEach(System.out::println);
    }

    /**
     * Way 4 to use functional interface function
     */
    public static void forma4() {
        List<Integer> numerosDobrados = FunctionalInterfaceFunction.numeros
            .stream()
            .map(n -> n * 2)
            .collect(Collectors.toList()); /* direct .toList() in Java 16+ */

        System.out.println(numerosDobrados);

        // Another way of printing, this time every value instead the whole list
        numerosDobrados.forEach(System.out::println);
    }
}
