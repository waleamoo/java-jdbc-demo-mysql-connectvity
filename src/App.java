import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/students";
        String uname = "root";
        String pass = "";
        int userId = 0;
        String firstname = "Sukurat";
        String lastname = "Amoo";

        String query = "INSERT INTO users VALUES (?, ?, ?)";
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, userId);
        st.setString(2, firstname);
        st.setString(3, lastname);
        int row = st.executeUpdate(); // return the data and the table structure
        System.out.println(row + " row(s) affected");        
        // close 
        st.close();
        conn.close();
    }
}
