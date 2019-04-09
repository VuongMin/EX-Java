/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li.ngan.hang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Book {

    protected String CMND, Name;
    protected Date DayCreateBook;
    protected double deposits, interest_rate;

    public Book() {
    }

    public Book(String cmnd, String name, Date ngaylapso, double laisuat, double tiengui) {
        this.CMND = cmnd;
        this.Name = name;
        this.deposits = tiengui;
        this.deposits = laisuat;
        this.DayCreateBook = ngaylapso;
    }

    public void Input() throws ParseException {
        System.out.print("\n Nhap vao Hoten :");
        setName(new Scanner(System.in).nextLine());
        System.out.print("\n Nhap vao CMND :");
        setCMND(new Scanner(System.in).nextLine());
        System.out.print("\n Nhap vao Ngay lap so :");
        String x = new Scanner(System.in).nextLine();
        DayCreateBook = new SimpleDateFormat("yyyy/MM/dd").parse(x);

        boolean checkDepostis;
        do {
            checkDepostis = true;
            System.out.printf("\n Nhap vao Tien gui:");
            deposits = Double.parseDouble(new Scanner(System.in).nextLine());
            if (getDeposits() < 1000) {
                System.out.print("\n Tien gui Khong hop le!( > 1000)");
                checkDepostis = false;

            }
        } while (checkDepostis == false);
        boolean checkLai;
        do {
            checkLai = true;
            System.out.printf("\n Nhap vao Lai xuat:");
            this.setInterest_rate(Double.parseDouble(new Scanner(System.in).nextLine()));
            if (getInterest_rate() < 0) {
                System.out.print("\n Lai suat Khong hop le!");
                checkLai = false;

            }
        } while (checkLai == false);

    }

    public void Export() {
        System.out.print("\n Ho ten :" + getName());
        System.out.print("\n CMND :" + getCMND());
        System.out.print("\n Ngay lap :" + getDayCreateBook());
        System.out.print("\n Lai suat :" + getInterest_rate());
        System.out.print("\n Tien Gui :" + getDeposits());
    }

    /**
     * @return the CMND
     */
    public String getCMND() {
        return CMND;
    }

    /**
     * @param CMND the CMND to set
     */
    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the DayCreateBook
     */
    public Date getDayCreateBook() {
        return DayCreateBook;
    }

    /**
     * @param DayCreateBook the DayCreateBook to set
     */
    public void setDayCreateBook(Date DayCreateBook) {
        this.DayCreateBook = DayCreateBook;
    }

    /**
     * @return the deposits
     */
    public double getDeposits() {
        return deposits;
    }

    /**
     * @param deposits the deposits to set
     */
    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    /**
     * @return the interest_rate
     */
    public double getInterest_rate() {
        return interest_rate;
    }

    /**
     * @param interest_rate the interest_rate to set
     */
    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }
}
