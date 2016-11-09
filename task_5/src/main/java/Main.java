/**
 * Created by click on 11/9/2016.
 */
public class Main {
    public static void main(String args[]){
        Reflection reflection = new Reflection();
        Notebook notebook = new Notebook();
        reflection.annotatedMethods(notebook.getClass(), Annotation.class);
        reflection.printClassName(notebook.getClass());
        reflection.printConstructorList(notebook.getClass());
        reflection.printClassModifiers(Date.class);
        reflection.printPackageNameAndShortName(Notebook.class);
    }
}
