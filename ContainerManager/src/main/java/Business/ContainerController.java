package Business;
import java.util.ArrayList;
import java.util.Scanner;
import UI.Container;

public class ContainerController {


    public ArrayList<Container> addCon() {
        Scanner sc= new Scanner(System.in);
        Container c= new Container();
        System.out.println("Please input Container ID");
        c.containerID = sc.nextLine();
        System.out.println("Please input Container Width");
        c.containerWidth = sc.nextLine();
        System.out.println("Please input Container Height");
        c.containerHeight = sc.nextLine();
        System.out.println("Please input Container Style");
        c.containerStyle= sc.nextLine();
        System.out.println("Please input Container tinh trang");
        String t = sc.nextLine();
        if(t.equals("true")) {
            System.out.println("normal");
        } else {
            System.out.println("broken");
        }
        listCon.add(c);
        return listCon;

    }

    public void displayCon() {
        for(Container c:addCon()) {
            System.out.println(c.toString());
        }
    }
}
