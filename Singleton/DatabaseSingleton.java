class DatabaseSingleton {

    public Database database;

    DatabaseSingleton(){}

    public void startDatabase(){
        this.database = new Database();
    }

    /**
     * Prevents the creation of more than one instance of Database Object
     * @return the dbConnection
     */
    public Database getDatabaseInstance() {

        if(this.database == null){
            System.out.println("First time i'm existing");
            this.database = new Database();
        } else {
            System.out.println("I'm already existing");
        }

        return this.database;
        
    }
}