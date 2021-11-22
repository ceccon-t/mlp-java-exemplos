import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClasseExterna {

    public static class ClasseInternaA {
        /* A classe interna A tenta invocar um método privado da classe interna B por reflexão
           Isso não era permitido antes da JDK 11, gerando uma IllegalAccessException
           A partir dessa versão, isso passou a ser permitido */
        public void printName() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {

            ClasseInternaB obj = new ClasseInternaB();
            final Method m = ClasseInternaB.class.getDeclaredMethod("printName");
            m.invoke(obj);
        }
    }

    public static class ClasseInternaB {
        private void printName() {
            System.out.println("Print da classe interna B");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException,
        IllegalAccessException, InvocationTargetException {

        ClasseInternaA obj = new ClasseInternaA();
        obj.printName();
    }
}