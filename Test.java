import java.io.*;
class Test 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your Choice : ");
        int ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
            System.out.println("Base");
            break;
            case 2:
            System.out.println("Average");
            break;
            case 3:
            System.out.println("Excellent");
            break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
    }
}
// 1 - Base 2- Avg 3- Excellent