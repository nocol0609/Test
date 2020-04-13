import java.math.BigDecimal;

/**
 * @author ：liuxp
 * @date ：Created in 2019/7/30 16:51
 * @description ：
 */
public class QualityCommitTest {
    public static void main(String[] args) {

        Long purCost=2044991L;
        Integer num=10;
        Long totalCost=32480910L;
        /*20元*/
        Double shipFree=20000.0;

        Long purSkuTotalCost=(purCost * num.longValue());
        float percent= BigDecimal.valueOf(purSkuTotalCost).divide(BigDecimal.valueOf(totalCost), 2, BigDecimal.ROUND_HALF_UP).floatValue();
        long purShipPrice = BigDecimal.valueOf(percent).multiply(BigDecimal.valueOf(totalCost)).longValue();

        System.out.println("======num.longValue()===== "+num.longValue());
        System.out.println("=====purCost * num.longValue()====== "+purCost * num.longValue());
        System.out.println("=======percent==== "+percent);
        System.out.println("=========== "+purShipPrice);
    }
}
