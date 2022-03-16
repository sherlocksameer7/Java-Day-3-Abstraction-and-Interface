package com.admin.harman;

public interface College_Fee_Structure {

    void set_Academic_Fee();
}

class CSE_Dept implements College_Fee_Structure
{
    public void set_Academic_Fee()
    {
        System.out.println("INR. 77,000");
    }
}

class Mech_Dept implements College_Fee_Structure
{
    public void set_Academic_Fee()
    {
        System.out.println("INR. 81,000");
    }
}

class Colleg_Managing_Administrator
{
    public static void main(String[] args)
    {

        College_Fee_Structure cse_ob = new CSE_Dept();  // College fee to print CSE only !!

        College_Fee_Structure mech_ob = new Mech_Dept(); // This is for Mech Only !!

        System.out.println("CSE Dept Fee: ");
        cse_ob.set_Academic_Fee();

        System.out.println("Mech Dept Fee: ");
        mech_ob.set_Academic_Fee();
    }
}
