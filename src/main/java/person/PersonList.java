package person;
import java.util.Scanner;
public class PersonList {
    private Person[] list=null;
    private int count =0;
    public PersonList(int size)
    {
    if(size<10)
        size=10;
    list =new Person[size];
    }
    int find(String aCode)
    {
        for(int i=0;i<count;i++)
            if(aCode.equals(list[i].getCode()))
            {
                return i;
            }
        return -1;
    }
     public void add()
    {
        if(count==list.length)
            System.out.println("List is full");
        else 
        {
            String newCode,newName;
            int newAge;
            Scanner sc=new Scanner(System.in);
            int pos;
            do
            {
             System.out.print("Nhap code:");
             newCode=sc.nextLine().toUpperCase();
             pos=find(newCode);
             if(pos>=0)
                 System.out.print("\tThis code existed!");
        }while(pos>=0);
            System.out.print("Nhap ten:");
            newName=sc.nextLine().toUpperCase();
            System.out.print("Nhap tuoi:");
            newAge=Integer.parseInt(sc.nextLine());
            list[count++]=new Person(newCode,newName,newAge);
            System.out.println("Nguoi moi da duoc them.");
        }
       }
     public void remove()
     {
         if(count==0)
         {
         System.out.println("Danh sach trong.");
         return;
         }
         String removeCode;
         Scanner sc=new Scanner(System.in);
         System.out.print("Nhap code cua nguoi bi xoa:");
         removeCode=sc.nextLine().toUpperCase();
         int pos=find(removeCode);
         if(pos<0)
             System.out.println("Nguoi nay khong ton tai.");
         else 
         {
             for(int i=pos;i<count-1;i++)
                 list[i]=list[i+1];
             count--;
             System.out.println("Nguoi nay"+removeCode+"da xoa");
         }
     }
     public void update()
     {
         if(count==0)
         {
         System.out.println("Danh sach trong.");
         return;
         }
         String code;
         Scanner sc=new Scanner(System.in);
         System.out.print("Nhap code da cap nhat vao:");
         code=sc.nextLine().toUpperCase();
         int pos=find(code);
         if(pos<0)
             System.out.println("Nguoi nay khong ton tai.");
         else {
         String newName;
         int newAge;
         System.out.print("Nhap ten:");
         newName=sc.nextLine().toUpperCase();
         System.out.print("Nhap tuoi:");
         newAge=Integer.parseInt(sc.nextLine());
         list[pos].setName(newName);
         list[pos].setAge(newAge);
         System.out.println("Nguoi nay"+code+"da duoc cap nhat");
         }
     }
     public void print()
     {
         if(count==0)
         {
             System.out.println("Danh sach trong");
             return;
         }
         System.out.println("Danh sach cua moi nguoi");
        for(int i=0;i<count;i++)
        {
            System.out.println(list[i]);
        }
     }
     void sort()
     {
         if(count==0)
             return;
         for(int i=0;i<count-1;i++)
             for(int j=count-1;j>i;j--)
                 if(list[j].getAge()> list[j-1].getAge())
                 {
                 Person p=list[j];
                 list[j]=list[j-1];
                 list[j-1]=p;
                 }
     }
  }
