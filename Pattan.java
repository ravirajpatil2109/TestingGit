//Tack student information
//Using users
//Name agr address and mobile number
import java.io.*;
class Pattan
{
    public void show(String name,int age,String adr, String grd)
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+adr);
        System.out.println("Gread : "+grd);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        System.out.print("Enter Name : ");
        int age=Integer.parseInt(br.readLine());
        System.out.print("Enter Age : ");
        String adr=br.readLine();
        System.out.print("Enter Address : ");
        String grd=br.readLine();
        System.out.print("Enter Gread : ");
        Pattan A=new Pattan();
        A.show(name,age,adr,grd);
    }
}