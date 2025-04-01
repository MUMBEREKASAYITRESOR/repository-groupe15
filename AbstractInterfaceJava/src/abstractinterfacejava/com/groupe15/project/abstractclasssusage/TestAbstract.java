package abstractinterfacejava.com.groupe15.project.abstractclasssusage;
import abstractinterfacejava.com.groupe15.projects.connectionsample.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;


public class TestAbstract {
    public static void main(String[] args) {
        Connection connection = null;
        
        try {
            // Récupération d'une connexion SQL
            connection = ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION);
            
            // Création et insertion des employés
            Person e1 = new Employee(1, "MUNGUAKONKWA", "DORCAS", "23LIAGDRYR7746");
            e1.add(e1);
            System.out.println("Employee 1 inserted successfully!");
            
            Person e2 = new Employee(2, "MUMBERE", "TRESOR", "23LIAGD7746");
            e2.add(e2);
            System.out.println("Employee 2 inserted successfully!");
            
            
            
                                                
            // Création et insertion des étudiants
                      
            Person s1 = new Student(1, "MUNGUAKONKWA", "DORACS", "23LIAGEDERYUI999");
            s1.add(s1);
            System.out.println("Student 1 inserted successfully!");
            
             Person s2 = new Student(2, "MUMBERE", "TRESOR", "23LIAGEDERYUFE9");
            s2.add(s2);
            System.out.println("Student 2 inserted successfully!");
            
                       
            // Affichage des employés insérés
            System.out.println("----- Employee Records -----");
            e1.showDynamicIdentity(e1.getId());
            System.out.println("----- Employee Records -----");
            e1.showDynamicIdentity(e1.getId());
            
         
           

            // Affichage des étudiants insérés
            System.out.println("----- Student Records -----");
            s1.showDynamicIdentity(s1.getId());
           System.out.println("----- Student Records -----");
            s2.showDynamicIdentity(s2.getId());
            

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Failed to insert records into the Database");
            e.printStackTrace();
        } finally {
            closeConnection(connection, "MySQL");
        }
    }

    private static void closeConnection(Connection con, String dbType) {
        if (con != null) {
            try {
                con.close();
                System.out.println("Connection to " + dbType + " closed.");
            } catch (SQLException e) {
                System.err.println("Error while closing the " + dbType + " connection: " + e.getMessage());
            }
        }
    }
}
