public class bank {
    private String acountname;
    private String password;
    private String user;

    public void setacountname(String acountname){
        if(user == "meenu"){
            this.acountname = acountname;
        }
    }

    public String getacountname(){
        // if(user == "meenu"){
        return acountname;
        // }
    }

    public void setpassword(String password){
        if(password != ""){
            this.password = password;
        }    
    }

    public String getpasword(){
        return password;
    }

    public void setuser(String user){
            this.user = user;     
    }

    public String getuser(){
        return user;
    }

public class details{
    public static void main(String[] args) {
        bank creds = new bank();
        
        creds.setuser("meenu");
        creds.setacountname("salryacc");
        creds.setpassword("meenufw");
        
        System.out.println("The account type is " + creds.getacountname() + " account password " + creds.getpasword() + " The acount user " + creds.getuser());
    }
}    

}
