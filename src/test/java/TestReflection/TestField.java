package TestReflection;

import java.lang.reflect.Field;

public class TestField {

    public void show(Class clazz) {
        //可以获取到私有的属性
        System.out.println("第一种形式");
        Field[] field = clazz.getDeclaredFields();
        for (Field field2 : field) {
            System.out.println(field2.getName());
            System.out.println(field2.getType());
        }

        //只可以获取到公有的属性

        System.out.println("第二种形式");
        Field[] field3 = clazz.getFields();
        for (Field field2 : field3) {
            System.out.println(field2.getName());
            System.out.println(field2.getType());
        }


    }

    public void show(Object obj) {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        try {
            for (Field field : fields) {
                //无法访问私有，需启用访问控制权限
//                field.setAccessible(true);
                System.out.println(field.getName() + field.get(obj));
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setAge(20);
        p.setTitle("teacher");
        p.setSex("man");

        TestField tf = new TestField();
//        tf.show(Person.class);
        tf.show(p);
    }
}
