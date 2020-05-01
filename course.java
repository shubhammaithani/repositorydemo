import java.util.*;

class Course{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of course:");
        int x=sc.nextInt();
        
        if(x==0)
        {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        
        String[] str=new String[10];
        
        
        System.out.println("Enter course names:");
        for(int i=0;i<x;i++)
        { 
            String s=sc.next();
            str[i]=s;
            
        }
        
        System.out.println("Enter the course to be searched:");
        String s1=sc.next();
        
        for(int i=0;i<x;i++)
    {
            if((str[i].equals(s1))==true)
        {
            System.out.println(s1+" course is available");
            break;
        }
        else if(i==x-1 && str[i].equals(s1)==false)
        {
            System.out.println(s1+" course is not available");
        }
        else{
            continue;
        }
            
    }

        
    }

    
}