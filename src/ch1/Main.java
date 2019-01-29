package ch1;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        System.out.println(Class.forName("ch1.Main"));
        //通过反射来创建类的实例
        Class cla = Example.class;
        Example d = (Example) cla.newInstance();
        Example nonarg = (Example) cla.getConstructor().newInstance();
        Example hasarg = (Example) cla.getConstructor(int.class,String.class).newInstance(520,"aaaaa");

        System.out.println("d's id is: " + d.id);
        System.out.println("nonarg's id is: " + nonarg.id);
        System.out.println("hasarg's id is: " + hasarg.id);
    }
}

class Example{
    int id;
    String name;

    public Example(){
        id = 0;
        name = "laozaihao";
    }

    public Example(int _id,String _name){
        id = _id;
        name = _name;
    }
}
