/**
 * @author ��liuxp
 * @date ��Created in 2020/4/13 11:23
 * @description ��
 */
public class test {
    public static void main(String[] args) {
        String s="С��24353";
        s=s.replaceAll("[^\\u0000-\\uFFFF]", "");
        System.out.println(">>>>>>>>>>>"+s);
    }
}
