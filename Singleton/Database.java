import java.sql.*; 

class Database {

    public Connection connection;

    Database(){}

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return this.connection;
    }

    /**
     * Creates a typical mysql connection
     */
    public void setConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");  
            Statement stmt = conn.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from users"); 

            while(rs.next()){
                System.out.println(rs.getString(1));  
                conn.close(); 
            }

        } catch (SQLException s){
            System.out.println(s);
        }
        
    }
}