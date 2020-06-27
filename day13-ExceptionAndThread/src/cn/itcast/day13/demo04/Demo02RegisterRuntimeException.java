package cn.itcast.day13.demo04;

import java.util.Scanner;

/*
* 要求：模拟注册操作，如果用户名已经存在，则抛出异类并提示：该用户名已经被注册
*
* 分析：
*       1、使用数组保存已经注册过的用户名(以后用数据库)
*       2、使用Scanner获取用户输入的注册的用户名(以后用前端，页面)
*       3、定义一个方法，对用户输入的注册的用户名进行判断
*           遍历存储已经注册过用户名的数组，获取每一个用户名
*           使用获取到的用户名和用户输入的用户名比较
*               true：
*                   用户名已经存在，抛出RegisterException异常，告知用户“该用户名已经被注册”
*               false：
*                   继续遍历比较
*           如果循环结束了，还没有找到重复的用户名，提示用户“恭喜您，注册成功”
* */
public class Demo02RegisterRuntimeException {
    //1、使用数组保存已经注册过的用户名
    static String[] userNames = {"源氏", "半藏", "麦克雷"};

    public static void main(String[] args) {
        //2、使用Scanner获取用户输入的注册的用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的名称：");
        String userName = sc.next();
        checkUserName(userName);
    }

    //3、定义一个方法，对用户输入的注册的用户名进行判断
    public static void checkUserName(String userName) {
        //遍历存储已经注册过用户名的数组，获取每一个用户名
        for (String name : userNames) {
            //使用获取到的用户名和用户输入的用户名比较
            if(userName.equals(name)){
                //用户名已经存在，抛出RegisterRuntimeException异常，告知用户“该用户名已经被注册”
                throw new RegisterRuntimeException("该用户名已经被注册");    //抛出运行期异常，无需处理，交给JVM处理，中断处理
            }
        }

        //如果循环结束了，还没有找到重复的用户名，提示用户“恭喜您，注册成功”
        System.out.println("恭喜您，注册成功");
    }
}
