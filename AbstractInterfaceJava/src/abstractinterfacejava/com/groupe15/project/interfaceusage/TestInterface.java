package abstractinterfacejava.com.groupe15.project.interfaceusage;

import java.sql.SQLException;

public class TestInterface {
    public static void main(String[] args) {
        try {
            IPerson e3 = new Employee();
            ((Employee) e3).setId(3);
            ((Employee) e3).setFirstName("MULUME");
            ((Employee) e3).setLastName("ISAAC");
            ((Employee) e3).setCnss("22LIAGELJ1ERER");

            e3.add();
            System.out.println("Employee inserted successfully!");
            
            IPerson e4 = new Employee();
            ((Employee) e4).setId(4);
            ((Employee) e4).setFirstName("MUHINDO");
            ((Employee) e4).setLastName("MOISE");
            ((Employee) e4).setCnss("22LDGELhjhJ1ERER");

            e4.add();
            System.out.println("Employee inserted successfully!");

           
          
            
            IPerson s3 = new Student(3, "MULUME", "ISAAC", "22LIAGEDFDF364");
            s3.add();
            System.out.println("Student 3 inserted successfully!");
            
             IPerson s4 = new Student(4, "MUHINDO", "MOISE", "22LIEDFDF364");
            s4.add();
            System.out.println("Student 4 inserted successfully!");
            
         
            
           

            e3.showDynamicIdentity(((Employee) e3).getId());
            System.out.println("-----------------------------------------");
            e4.showDynamicIdentity(((Employee) e4).getId());
            System.out.println("-----------------------------------------");
           

            
            s3.showDynamicIdentity(((Student) s3).getId());
            System.out.println("-----------------------------------------");
            s4.showDynamicIdentity(((Student) s4).getId());
            System.out.println("-----------------------------------------");
          
         

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Failed to insert records into the Database");
            e.printStackTrace();
        } 
    }
}
