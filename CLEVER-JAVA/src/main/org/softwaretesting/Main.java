package org.softwaretesting;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

import gov.nasa.jpf.shadow.RunnerShadow_JPF;
import gov.nasa.jpf.shadow.SymExParameter;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
      // System.out.println("this is a test!");
      SymExParameter Add = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
            "${jpf-shadow}/src/examples", "jpf2019.add", "Add", "add", "add(sym#sym)", 1, "",
            "evaluation-results/04_ADD_JPF/shadow-results/", null);

      RunnerShadow_JPF.main(new String[] {serialize(Add)});;
    }

    private static String serialize( Serializable o ) throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream( baos );
      oos.writeObject( o );
      oos.close();
      return Base64.getEncoder().encodeToString(baos.toByteArray()); 
  }
}