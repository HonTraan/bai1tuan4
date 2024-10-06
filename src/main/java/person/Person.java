package person;
import java.util.Scanner;
public class Person {
    private String code="", name="";
    private int age=0;
    public Person()  {}
    public Person(String c,String n,int a)
    {
        code=c;
        name=n;
        age=a>0?a:0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap code:");
        code = sc.nextLine();
        System.out.println("Nhap ten:");
        name=sc.nextLine();
        System.out.println("Nhap tuoi:");
        age=Integer.parseInt(sc.nextLine());
    }
    public String toString()
    {
        return code+","+name+","+age;
    } 
}
