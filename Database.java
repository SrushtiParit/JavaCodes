import java.sql.*;      //step 1

class Database
{
    public static void main (String A[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/PPA41" ;
        String Username = "root" ;
        String Password = "root" ;
        String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL, Username, Password);  //step 2
        Statement sobj = cobj.createStatement();   //step 3
        ResultSet robj = sobj.executeQuery(Query);   //step 4

        while (robj.next())     ////step 5
        {
            System.out.println("RID: " +robj.getInt("RID"));
            System.out.println("Name: " +robj.getInt("Name"));
            System.out.println("City: " +robj.getInt("City"));
            System.out.println("Marks: " +robj.getInt("Marks"));

        }

    }
}

//execute()           create table
//executeQuery()      select
//executeUpdate()     delete/ update/ alter/ insert