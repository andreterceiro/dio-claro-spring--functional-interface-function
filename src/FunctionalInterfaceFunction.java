import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfaceFunction {
    public static void main(String[] args) throws Exception {
        FunctionalInterfaceFunction.forma1();
    }

    public static void forma1() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros
            .stream()
            .map(dobrar)
            .collect(Collectors.toList());

        System.out.println(numerosDobrados);
        
        // Another way of printing, this time every value instead the whole list
        numerosDobrados.forEach(numero -> System.out.println(numero));

    }
}
