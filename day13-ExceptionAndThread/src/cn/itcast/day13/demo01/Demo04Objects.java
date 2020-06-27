package cn.itcast.day13.demo01;

import java.util.Objects;

/*
* 对参数进行合法性判断，判断是否为null，可以直接用Objects中的静态方法requireNonNull，简化代码的书写
*
* Objects类中的静态方法：
*   public static <T> T requireNonNull(T obj)：查看指定引用对象不是null
*
*   源码：
*       public static <T> T requireNonNull(T obj){
*           if(obj == null)
*               throw new NullPointerException();
*           return obj;
*       }
* */
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
/*
        //未使用Objects中的静态方法requireNonNull，一般的做法：
        //对传递过来的参数进行合法性判断，判断是否为null
        if(obj == null){
            throw new NullPointerException("传递的对象的值是null");
        }
*/

        //使用Objects中的静态方法requireNonNull，简化代码的书写
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象的值是null");
    }
}
