package ClassLoader;

/**
 * Created by Dyvak on 08.11.2016.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionRunner {
    public static void main(String[] args) throws Exception {

        Class clazz = Class.forName("ClassLoader.Data");
        Object  instance = (Data)clazz.newInstance();

        System.out.println("Class-->" + clazz.getName());
        System.out.println("-------------------------------------------------");

        Constructor[] constructors = clazz.getConstructors();
        for(Constructor constructor: constructors){
            System.out.println("Constructor-->"+constructor.getName());
            Class[] paramTypes = constructor.getParameterTypes();
            for(Class paramType : paramTypes) {
                System.out.println("Parameter---------->"+paramType.getName() + "");
            }
             }
        System.out.println("-------------------------------------------------");

        Method[] methods = clazz.getMethods();
        for(Method method : methods) {
            System.out.println("Method-->"+method.getName());
            Class[] paramTypes = method.getParameterTypes();
            for(Class paramType : paramTypes) {
                System.out.println("Parameter---------->"+paramType.getName() + "");
            }
           }

        for(Method m : clazz.getMethods()) {

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









