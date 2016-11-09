import java.lang.annotation.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by click on 11/9/2016.
 */
public class Reflection {

    public static final String FIELDS_DATA = "Fields data: ";
    public static final String NAME = "Name: ";
    public static final String MODIFIERS = "Modifiers: ";
    public static final String ANNOTATIONS = "Annotations: ";
    public static final String INTERFACES = "Interfaces: ";
    public static final String PARAM = " param: ";
    public static final String ANNOTATED_METHODS = "Annotated methods:";
    public static final String CLASS_NAME = "Class name:";
    public static final String CONSTRUCTORS = "Constructors: ";
    public static final String COUNT_OF_PARAMETERS = "Count of parameters: ";
    public static final String CLASS_MODIFIERS = "Class modifiers: ";
    public static final String PACKAGE = "Package: ";
    public static final String SHORT_NAME = "Short name: ";
    public static final String SUPERCLASS = "Superclass: ";

    public void annotatedMethods(Class<?> type, Class<? extends Annotation> annotation){
        System.out.println(ANNOTATED_METHODS);
        while(type != Object.class){
            List<Method> existedMethods = Arrays.asList(type.getDeclaredMethods());
            for(Method method: existedMethods){
                if(method.isAnnotationPresent(annotation)){
                    System.out.print(method.getName() + " ");
                    for(Class c: method.getParameterTypes()){
                        System.out.print(PARAM + c.getName());
                    }
                }
            }
            type = type.getSuperclass();
        }
        System.out.println();
    }

    public void printClassName(Class<?> type){
        System.out.println(CLASS_NAME);
        System.out.println(type.getName());
        System.out.println();
    }

    public void printConstructorList(Class<?> type){
        System.out.println(CONSTRUCTORS);
        Constructor[] constructors = type.getDeclaredConstructors();
        for(Constructor constructor: constructors){
            System.out.println(COUNT_OF_PARAMETERS + constructor.getParameterCount());
            Class[] parameters = constructor.getParameterTypes();
            for(Class parameter: parameters){
                System.out.print(parameter.getSimpleName() + " ");
            }
        }
        System.out.println();
    }

    public void printClassModifiers(Class<?> type){
        System.out.println(CLASS_MODIFIERS);
        int modifiers = type.getModifiers();
        Method[] methods = Modifier.class.getMethods();
    }

    public void printPackageNameAndShortName(Class type){
        try {
            System.out.println(PACKAGE + type.getPackage().getName());

        } catch (Exception e){

        }
        System.out.println(SHORT_NAME + type.getSimpleName());
        System.out.println(SUPERCLASS + type.getSuperclass().getName());
    }

    public void printFieldInfo(Class type){
        Field[] fields = type.getFields();
        System.out.println(FIELDS_DATA);
        for (Field f: fields){
            System.out.println(NAME + f.getName());
            System.out.println(MODIFIERS);
        }
    }

    public void printAnnotationsAndInterfaces(Class type){
        System.out.println(ANNOTATIONS);
        Annotation[] annotations = type.getAnnotations();
        for(Annotation a: annotations){
            System.out.println(a.getClass().getName());
        }
        System.out.println(INTERFACES);
        Class[] interfaces = type.getInterfaces();
        for (Class i: interfaces){
            System.out.println(i.getName());
        }
        System.out.println();
    }


}
