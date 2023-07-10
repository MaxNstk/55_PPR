import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflexzao {

    public static void main(String[] args) throws Exception{

        Class<?> c = Class.forName("Cliente");
        System.out.println(c);

        Constructor<?> constructor = c.getConstructor();
        constructor.newInstance();

        Object cliente = constructor.newInstance();
        System.out.println(cliente);

        constructor = c.getConstructor(String.class);
        cliente = constructor.newInstance("UDESC");
        System.out.println(cliente);

        constructor = c.getConstructor(int.class);
        cliente = constructor.newInstance(23);
        System.out.println(cliente);

        Method setNome = c.getMethod("setNome", String.class);
        setNome.invoke(cliente, "Teste");
        System.out.println(cliente);

        Method getNome = c.getMethod("getNome");
        Object nome = getNome.invoke(cliente);
        System.out.println(nome);

        Method privateMethod = c.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(cliente);
    }
}
