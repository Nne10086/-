package Fanshe_try;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class f1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class cla = Class.forName("Fanshe_try.chushi_class");
        Constructor c = cla.getDeclaredConstructor();
        Object o = c.newInstance();
        Constructor c1 = cla.getDeclaredConstructor(int.class);  //调用含参构造器，参数为int类型
        c1.setAccessible(true);
        Object o1 = c1.newInstance(5);         //创建对象
        Field f = cla.getDeclaredField("name");  //属性名为name
        System.out.println(f.get(o));                  //调用属性，用get方法
        Field f1 = cla.getDeclaredField("name1");
        f1.setAccessible(true);                        //爆破
        System.out.println(f.get(o));
        Method m = cla.getDeclaredMethod("fangfa1  " , int.class);  //方法名为fangfa1，形参类型为int
        m.setAccessible(true);                         //爆破
        m.invoke(o1 , 5);                       //选择对象，调用方法并且传入数值

    }
}
