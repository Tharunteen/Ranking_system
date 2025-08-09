import java.sql.*;
public class Rankings {
    public static void main(String[] args) throws Exception {
                  insertrecord();
                  getrecords();
    }
        public static void getrecords() throws Exception {
            String id="root";
            String pass="10Sep@2004";
            String url="jdbc:mysql://localhost:3306/beast";
            String q="select * from attis";
            Connection con = DriverManager.getConnection(url,id,pass);
            Statement st =con.createStatement();
            ResultSet ans =st.executeQuery(q);
            while(ans.next()) {
                System.out.print("Id is " + ans.getInt(1) + " ,");
                System.out.print("Name is " + ans.getString(2) + " ,");
                System.out.print("Gpa is " + ans.getFloat(3) + " ,");
                System.out.println("Dept is " + ans.getString(4) + ".");
            }
            con.close();
            }
            public static void insertrecord() throws Exception {
                String id="root";
                String pass="10Sep@2004";
                String url="jdbc:mysql://localhost:3306/beast";
                int ids=10;
                String namen="tharun";
                double gpa=9.0;
                String dept="AIML";
                String qi="insert into attis values(?,?,?,?)";
                Connection con = DriverManager.getConnection(url,id,pass);
                PreparedStatement pst = con.prepareStatement(qi);
                pst.setInt(1,ids);
                pst.setString(2,namen);
                pst.setDouble(3,gpa);
                pst.setString(4,dept);
                int rows=pst.executeUpdate();
                System.out.println("No of rows affected: "+ rows);
                con.close();
                }
}
