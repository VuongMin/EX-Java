/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li.ngan.hang;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author Administrator
 */

public class NonTerm  extends Book{
    public void Export()
{
        super.Export();
       System.out.print("\n Lai suat :" +this.TinhLai());
}
    public double TinhLai() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
       return super.deposits*super.interest_rate*(cal.getTime().getYear()-super.getDayCreateBook().getYear());
    }
    
}
