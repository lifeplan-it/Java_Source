// Class_Super_Base.java
public class Main {
    public static void main(String[] args) throws Exception {
        
        SubClass sub = new SubClass();
    }
}
 
class SuperClass {
 
    public SuperClass(){
        System.out.println("Super_Const");
    }
 
    public SuperClass(String str){
        System.out.println("str : " + str);
    }
    public SuperClass(int num){
        System.out.println("num : " + num);
    }
}
 
class SubClass extends SuperClass {
 
    public SubClass(){
        super("apple");
    }
}