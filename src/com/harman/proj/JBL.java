package com.harman.proj;

abstract class JBL {

    abstract void systems_Checking();

}

class Harman extends JBL
{
    void systems_Checking()
    {
        System.out.println("Sound Checking = Normal & Frequency Analysing = Good");
    }

    public static void main(String[] args) {

        JBL headphones = new Harman();
        System.out.println("JBL Working Condition: ");
        headphones.systems_Checking();
    }
}