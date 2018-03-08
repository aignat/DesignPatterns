package designpatterns.structural;

import designpatterns.structural.adapter.Adaptee;
import designpatterns.structural.adapter.AdapteeImpl;
import designpatterns.structural.adapter.Adapter;
import designpatterns.structural.adapter.Target;
import org.junit.Test;

public class TestAdapter {


    @Test
    public void testPayD() {

        Adaptee adaptee = new AdapteeImpl();
        adaptee.setCreditCardNo("4789565874102365");
        adaptee.setCustomerName("Max Warner");
        adaptee.setCardExpMonth("09");
        adaptee.setCardExpYear("25");
        adaptee.setCardCVVNo((short) 235);
        adaptee.setAmount(2565.23);
        Target target = new Adapter(adaptee);

        System.out.println(target.getCardOwnerName());
        System.out.println(target.getCustCardNo());
        System.out.println(target.getCardExpMonthDate());
        System.out.println(target.getCVVNo());
        System.out.println(target.getTotalAmount());
    }


}




