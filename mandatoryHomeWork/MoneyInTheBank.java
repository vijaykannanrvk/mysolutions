package mysolutions.mandatoryHomeWork;

import org.junit.Test;
import org.junit.Assert;

public class MoneyInTheBank {
    public int totalMoney(int n) {
        int sum=0,moneyeveryday=1;
        for(int i=1;i<=n;i++)
        {
            if(i%7==0)
            {
            sum=sum+moneyeveryday;
            ++moneyeveryday;
            moneyeveryday=1+i/7;
            }
            else
            {
                sum=sum+moneyeveryday;
                ++moneyeveryday;
            }
        }
        return sum;
    }
    
    @Test
    public void test1() {
    	Assert.assertEquals(10, totalMoney(4));
    }
    
    @Test
    public void test2() {
    	Assert.assertEquals(37, totalMoney(10));
    }
}