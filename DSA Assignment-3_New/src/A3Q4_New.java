/* Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.
*/
class Box <T>{
    private T t ;
    Box(T a ) {
        t = a;
    }
    public void add(T t ){
        this.t =t ;
    }
    public T get(){
        return t;
    }
}
public class A3Q4_New {
    public static void main(String[] args) {
        Box <String> sB1 = new Box <String> ("Welcome");
        Box <String> sB2 = sB1;
        System.out.println(sB2.get());
        System.out.println("Hello");
        System.out.println(sB2.get());

        Box<Integer> iB1 = new Box<Integer>(10);
        Box <Integer> iB2 = iB1;
        System.out.println(iB2.get());
        iB1.add(20);
        System.out.println(iB2.get());

        Box <Object> obj1 = new Box <Object> ("Hi");
        Box <Object> obj2 = obj1 ;
        System.out.println(obj2.get());
        obj1.add(15);
        System.out.println(obj2.get());
        obj1.add("Hello");
        System.out.println(obj2.get());
    }
}
