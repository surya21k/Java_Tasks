public class loginAuthentication {
//Task 4: Login Authentication
//Write a Java program to:
//Accept:
//Username
//Password
//Conditions:
//Username = admin
//Password = 1234
//If both are correct, display Login Successful.
//Otherwise, display Invalid Username or Password.
//Output Format
//Enter Username : admin
//Enter Password : 1234.
//Login Successful.

    public String userName;
    public String Password;

    public void setUserName(String me){
        userName = me;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setPassword(String pass){
        Password = pass;
    }
    public String getPassword(){
        return this.Password;
    }
    public boolean authenticate(String inputUser, String inputPass) {
        return userName.equals(inputUser) && Password.equals(inputPass);
    }


}
