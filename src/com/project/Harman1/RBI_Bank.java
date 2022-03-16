package com.project.Harman1;

abstract class RBI_Bank {

    abstract void set_Interest_Rate();  // Set Interest Rate is Common !!!
}

class SBI_Bank extends RBI_Bank
{
    void set_Interest_Rate()
    {
        System.out.println("7 %");
    }
}

class ICICI_Bank extends RBI_Bank
{
    void set_Interest_Rate()
    {
        System.out.println("7.5 %");
    }
}

class Union_Bank   // Accessed in Union Bank with the above two banks !!!
{
    public static void main(String[] args) {

        RBI_Bank sbi_obj = new SBI_Bank();

        RBI_Bank icici_obj = new ICICI_Bank();

        System.out.println("SBI Bank Interest Rate: ");
        sbi_obj.set_Interest_Rate();

        System.out.println("ICICI Bank Interest Rate: ");
        icici_obj.set_Interest_Rate();
    }
}