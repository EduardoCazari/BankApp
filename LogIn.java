class Login {

   private String userName;
   private String password;
   
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void confirmation() {
        System.out.println("Welcome " + userName + "! We checked your password and it is " + password.length() + " characters long.");
    }
    
}