import java.util.Scanner;
public class Program{
    private String FirstName;
    private String LastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength=10;
    private String companySuffix="abc.com";
    //Constructor to receive the first name and last name
    public Program(String FirstName, String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
       // System.out.println("Email Created:"+this.FirstName+" "+this.LastName);
        //call a method for department, return the department
        this.department=setDepartment();
       // System.out.println("Department:"+this.department);
       System.out.println("Dear "+this.FirstName+" your generated credentials are as follows:\n");
        //combine element to generate Email
        email=FirstName.toLowerCase()+""+LastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Email:"+this.email+"\n");
        //call a method that returns a random password
        this.password=randomPaswword(defaultPasswordLength);
        System.out.println("Password:"+this.password+"\n");
    }
    //ask for department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES:\n1 Technical\n2 Admin\n3 Human Resource\n4 Legal\nEnter code:");
        Scanner in=new Scanner(System.in);
        int depchoice=in.nextInt();
        if(depchoice==1){
            return "technical";
        }
        else if(depchoice==2){
            return "admin";
        }
        else if(depchoice==3){
            return "humanresource";
        }
        else if(depchoice==4){
            return "legal";
        }
        else{
            return "";
        }
    }
    //generate a random password
    private String randomPaswword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //change password
    public void changePaswword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public static void main(String[]args){
        Program em1=new Program("Samiksha","Dalvi");
        //System.out.println(em1.showInfo());
    }
}