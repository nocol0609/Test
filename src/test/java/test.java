/**
 * @author £ºliuxp
 * @date £ºCreated in 2020/4/13 11:23
 * @description £º
 */
public class test {
    public static void main(String[] args) {
        String s="Ð¡ºÚ24353";
        s=s.replaceAll("[^\\u0000-\\uFFFF]", "");
        System.out.println(">>>>>>>>>>>"+s);
    }
}
