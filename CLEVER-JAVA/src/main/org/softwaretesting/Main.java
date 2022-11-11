package org.softwaretesting;

import gov.nasa.jpf.shadow.SymExParameter;


public class Main {
    public static void main(String[] args) {
      System.out.println("this is a test!");
      SymExParameter Add = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
            "${jpf-shadow}/src/examples", "jpf2019.add", "Add", "add", "add(sym#sym)", 1, "",
            "evaluation-results/04_ADD_JPF/shadow-results/", null);

      System.out.println(Add);
    }
}