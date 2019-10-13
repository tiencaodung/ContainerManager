package imic;

import Business.ContainerController;
import UI.Container;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    static ArrayList<Container> listCon = new ArrayList<Container>();
    public static void xulyCon() {
        ContainerController ec = new ContainerController();
        listCon = ec.addCon();
    }
    public static void main( String[] args )
    {

        xulyCon();
    }
}
