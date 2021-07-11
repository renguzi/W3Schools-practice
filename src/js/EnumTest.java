package js;

/**
 * @Author:asher
 * @Date:2021/7/11 17:22
 * @Description:js
 * @Version:1.0
 */
public class EnumTest {
    public static void main(String[] args) {
        Thread.State[] values = Thread.State.values();
        for (Thread.State s: values ) {
            System.out.println(s);
        }
    }
}
