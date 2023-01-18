class LogIn {

   private String userName;
   private String password;
   


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void confirmation() {
        System.out.println("your user name is " + userName + " and your password has " + password.length() + " characters long");
    }
    
}