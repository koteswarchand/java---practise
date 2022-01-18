import java.sql.*;
public class create {

    

    public void credb() throws SQLException{
       //inserting data into the table participants
       Connection c = DriverManager.getConnection("jdbc:mysql://localhost/capg", "root", "root");
       PreparedStatement ps = c.prepareStatement("insert into participants values(?,?)");
       ps.setInt(1, 5);
       ps.setString(2, "mikasa");
       ps.execute();
       
    }

   public void manipluate() throws SQLException{
    //updatin table using update
    Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost/capg", "root", "root");
      Statement s = c1.createStatement();

      //update property in mysql
       String query = "update participants set age = 24 where id = 6";
       s.execute(query);

      ResultSet rs = s.executeQuery("select * from participants");
      while(rs.next()){
          System.out.print( "ID: " +  rs.getInt("id") + "\t");
          System.out.print("Name: " + rs.getString("name") + "\t");
          System.out.print("Age: " + rs.getInt("age") + "\n");
          
      }


   }

   public void alteration() throws SQLException{

    //alter command

        Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost/capg", "root", "root");
        Statement s1 = c2.createStatement();
        //String query = "alter table participants add column age int";
        //s1.execute(query);
        ResultSet rs = s1.executeQuery("select * from participants where age > 21");
        while(rs.next()){

            System.out.print("Id: " + rs.getInt("id") + "\t");
            System.out.print("Name: " + rs.getString("name") + "\t");
            System.out.print("Age: " + rs.getInt("age") + "\n");
        }
     
   }
    
    public void operators() throws SQLException{

     Connection c4 = DriverManager.getConnection("jdbc:mysql://localhost/capg", "root", "root");
     Statement s5 = c4.createStatement();
     //between operator acsts as range 
     ResultSet rs = s5.executeQuery("select * from participants where name between 'john' and 'mikasa' ");
     
     while(rs.next()){

        System.out.print(rs.getInt("id") + "\t");
        System.out.print(rs.getString("name") + "\t");
        System.out.print(rs.getInt("age") + "\t");
        System.out.print(rs.getString("country") + "\n");

     }
    }
    
     public void queries() throws SQLException {
  
    Connection c3 = DriverManager.getConnection("jdbc:mysql://localhost/capg", "root", "root");
    Statement s2 = c3.createStatement();

    //logical operators - and,or,not
    //String query = "select * from participants where id = 1 and name = 'john'";
    ResultSet rs = s2.executeQuery("select * from participants where id = 1 or country = 'USA'");
    //and operator
     //ResultSet rs = s2.executeQuery("select * from participants where id = 1 and country = 'USA'");
         
   //not operaor
          //ResultSet rs = s2.executeQuery("select * from participants where id = 1 not country = 'USA'");
    
        while(rs.next()){

        System.out.print("ID: " + rs.getInt("id") + "\t");
        System.out.print("Name: " + rs.getString("name") + "\t");
        System.out.print("Age: " + rs.getInt("age") + "\t");
        System.out.print("Country: " + rs.getString("country") + "\n");
    }

   }

  

    public static void main(String[] args) throws SQLException {
        
        create c1 = new create();
       // c1.credb();
       //c1.manipluate();
       c1.alteration();
        c1.operators();
        c1.queries();
    }
}
