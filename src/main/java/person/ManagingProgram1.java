package person;
import java.util.Scanner;
public class ManagingProgram1 {

    public static void main(String[] args) {
        Menu menu=new Menu(5);
        menu.add("Them ten nguoi moi");
        menu.add("Xoa nguoi nay");
        menu.add("Cap nhat ten nguoi nay");
        menu.add("Danh sach");
        menu.add("Thoat");
        int choice;
        PersonList list = new PersonList(50);
        do
        {
            System.out.println("\nQUAN LI NHAN SU");
            choice=menu.getChoice();
            switch(choice)
            {
                case 1: list.add();
                break;
                case 2: list.remove();
                break;
                case 3: list.update();
                break;
                case 4: list.sort();
                        list.print();
                break;
            }
        }
        while(choice>=1&&choice<5);
    }
}
