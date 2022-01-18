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

  

    public static void main(String[] args) throws SQLException {
        
        create c1 = new create();
       // c1.credb();
       //c1.manipluate();
       c1.alteration();
    }
}
