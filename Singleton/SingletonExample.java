class SingletonExample {
    public static void main(String[] args) {
        DatabaseSingleton dbSingleton = new DatabaseSingleton();
        Database db1 = dbSingleton.newDatabase();
        Database db2 = dbSingleton.newDatabase();

        if (db1.equals(db2)){
            System.out.println("We are the same instance of Database!");
        }
    }
}