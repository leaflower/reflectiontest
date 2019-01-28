package TestReflection;

public class TestClass {
    public static void main(String[] args) {
        Class cl1 = null;
        Class cl2 = null;
        Class cl3 = null;

        try {
            cl1 = Class.forName("TestReflection.Person");
            System.out.println("第一种方式：" + cl1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Person person = new Person();
        cl2 = person.getClass();
        System.out.println("第二种方式："+cl2);

        cl3 = Person.class;
        System.out.println("第三种方式："+cl3);

        try {
            Person person1 = (Person) cl3.newInstance();
            person1.setName("张三");
            System.out.println(person1.getName()+":对象"+person1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
