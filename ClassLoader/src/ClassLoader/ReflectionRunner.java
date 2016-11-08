package ClassLoader;

/**
 * Created by Dyvak on 08.11.2016.
 */
import java.lang.reflect.Method;

public class ReflectionRunner {
    public static void main(String[] args) throws Exception {

        Class clazz = Class.forName("ClassLoader.Data");
        Object  instance = (Data)clazz.newInstance(); // new  ua.training.Line()

        for(Method m : clazz.getMethods()) {
            System.out.println( m.getName() );

            if( m.getName().startsWith("get")){
                System.out.println( m.invoke( instance ) );

            } else if( m.isAnnotationPresent( Override.class ) ){
                System.out.println( m.invoke( instance ));
            }
            Anno cool = m.getAnnotation(Anno.class);
            if( cool != null && cool.enabled() ){
                System.out.println("Call by " + Anno.class.getName() +
                        m.invoke( instance ));
            }


        }
    }
}