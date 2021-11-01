/**
 * Project name(项目名称)：Number类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/1
 * Time(创建时间)： 12:17
 * Version(版本): 1.0
 * Description(描述)： Number 是一个抽象类，也是一个超类（即父类）。Number 类属于 java.lang 包，
 * 所有的包装类（如 Double、Float、Byte、Short、Integer 以及 Long）都是抽象类 Number 的子类。
 * Number类的方法
 * 方法	说明
 * byte byteValue();  	返回 byte 类型的值
 * double doubleValue();	返回 double 类型的值
 * float floatValue();	返回 float 类型的值
 * int intValue();	返回 int 类型的值
 * long longValue();	返回 long 类型的值
 * short shortValue();	返回 short 类型的值
 * 抽象类不能直接实例化，而是必须实例化其具体的子类。
 */

public class test
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Number data = new Double(3256.23213698);
        System.out.println(data.doubleValue());
        System.out.println(data.byteValue());
        System.out.println(data.shortValue());
        System.out.println(data.intValue());
        System.out.println(data.longValue());
        System.out.println(data.floatValue());
        System.out.println(data.getClass().getName());
        System.out.println(data.toString());
        System.out.println(data.hashCode());
        System.out.println(data.equals(3256.2321369));
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
