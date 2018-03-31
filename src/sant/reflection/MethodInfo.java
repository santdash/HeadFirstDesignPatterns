package sant.reflection;

import com.sun.deploy.util.StringUtils;
import sant.reflection.helper.MyThing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class MethodInfo {
    public static void main(String[] args) {

        System.out.println("========Getting all public methods, this class and inherited========= ");
        getAllPublicMethods(MyThing.class);

        try {
            System.out.println("======Getting few public methods by name, this class and inherited======");
            printMethod(MyThing.class.getMethod("setCounter",int.class));
            printMethod(MyThing.class.getMethod("setCounter",Integer.class));
        } catch (NoSuchMethodException e) {
            System.out.println("Exception: no public method: " +e.getMessage());
        }

        System.out.println("======= Getting all methods of any visibility, for this class only, no inheritance ==========");
        getAllMethods(MyThing.class);

        try {
            printMethod(MyThing.class.getDeclaredMethod("setName", String.class));
            printMethod(MyThing.class.getDeclaredMethod("getRandomInteger"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("=============Find all getters and setters==============");
        for (Method method: findGettersAndSetters(MyThing.class)){
            System.out.println(method);
        }
    }

    private static void getAllMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods){
            printMethod(method);
        }
    }

    private static void getAllPublicMethods(Class<?> clazz){
        final Method[] methods = clazz.getMethods();
        for (Method method: methods){
            printMethod(method);
        }
    }

    private static void printMethod(Method method) {
        String throwClause = "";
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        if (exceptionTypes.length > 0) {
            throwClause += " throws ";
            for(Class<?> exceptions: exceptionTypes){
                throwClause += exceptions.getName() + ", ";
            }
        }
        String throwsString = "";
        if (throwClause.length() > 0 ) {
            throwsString = throwClause.substring(0, throwClause.lastIndexOf(","));
        }

        System.out.println(Modifier.toString(method.getModifiers()) + " "
                + method.getReturnType().getSimpleName() + " "
                + method.getName() + " ("
                + getParameterClassAsString(method) + ")" + throwsString
        );
    }

    private static String getParametersAsString(Method method){
        Parameter[] parameters = method.getParameters();
        String s = "";
        for (Parameter parameter: parameters){
            s += parameter.getName() + " ";
        }
        return s;
    }

    private static String getParameterClassAsString(Method method){
        Class<?>[] parameterTypes = method.getParameterTypes();
        String s = "";
        for (Class<?> param: parameterTypes){
            s += param.getName() + " ";
        }
        return StringUtils.trimWhitespace(s);
    }

    private static List<Method> findGettersAndSetters(Class<?> clazz){
        List<Method> gNs = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods){
            if ( isGetter(method) || isSetter(method)){
                gNs.add(method);
            }
        }
        return gNs;
    }

    private static boolean isSetter(Method method) {
        if ( Modifier.isPublic(method.getModifiers())
                && method.getReturnType().equals(void.class)
                && method.getName().matches("^set[A-Z].*")
                && method.getParameterCount() == 1)
            return true;

        return false;
    }

    private static boolean isGetter(Method method) {
        if ( Modifier.isPublic(method.getModifiers())
                && ! method.getReturnType().equals(void.class)
                && method.getName().matches("^get[A-Z].*")
                && method.getParameterCount() == 0)
            return true;

        if ( Modifier.isPublic(method.getModifiers())
                && method.getReturnType().equals(boolean.class)
                && method.getName().matches("is[A-Z].*")
                && method.getParameterCount() == 0 )
            return true;

        return false;
    }


}
