package za.ac.cput.okuhle;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class SoftwareTest {

    /*
     * Collections===============================================
     * ADD
     * REMOVE
     * Remove
     * */
    @Test
    public void CollectionAdd(){
        Collection <String> Mylist = new ArrayList<>();
        Mylist.add("Acer");
        Mylist.add("Samsung");
        Mylist.add("Asus");
        Mylist.add("Iphone");
        for(int i = 0; i< 4;i++){}
        System.out.println("Software :" + Mylist );

        assertEqauls(4, Mylist.size());





    }
    @Test
    public void CollectionRemove(){
        Collection<String> Mylist = new ArrayList<>();
        Mylist.add("Acer");
        Mylist.add("Samsung");
        Mylist.add("Asus");
        Mylist.add("Iphone");

        for (int i =0; i <3; i++);
        System.out.println("Software removed is" + " " + Mylist);

        assertEqauls(3, Mylist.size());
    }
    @Test
    public void CollectionFind(){
        Collection <String> Mylist = new ArrayList<>();
        Mylist.add("Acer");
        Mylist.add("Samsung");
        Mylist.add("Asus");
        Mylist.add("Iphone");

        Mylist.contains("Acer");
        System.out.println("List Software have" + Mylist.contains("Acer"));
    }


//=======================Map=========================

    @Test
    public void MapAdd(){
        Map<Integer, String> Mylist = new HashMap<>();
        Mylist.put(13,"Acer");
        Mylist.put(26,"Samsug");
        Mylist.put(36, "Asus");
        Mylist.put(74, "Iphone");

        System.out.println("Software" + Mylist);
        assertEqauls(4,Mylist.size());




    }
    @Test
    public void MapRemove(){

        Map <Integer, String> MyListMap = new HashMap<>();
        MyListMap.put(1, "Acer");
        MyListMap.put(2,"Samsung");
        MyListMap.put(3, "Asus");
        MyListMap.put(4, "Iphone");

        System.out.println("Stock left" + MyListMap);
        assertEqauls(4, MyListMap.size());
    }
    //Map Find

    @Test
    public void MapFind(){
        Map <Integer, String> MyListFind = new HashMap<>();
        MyListFind.put(6, "Acer");
        MyListFind.put(9,"Samsung");
        MyListFind.put(18, "Asus");
        MyListFind.put(88,"Iphone");
        MyListFind.get(88);

        System.out.println("The Map find is" + " " + MyListFind.get(88));
    }

    /*
     * List=====================================================
     * Add
     * Remove
     * Find
     * */
    @Test
    public void ListAdd(){
        List<String> MyList = new ArrayList<>();
        MyList.add("Acer");
        MyList.add("Sansung");
        MyList.add("Asus");
        MyList.add("Iphone");

        for (int i = 0; i< MyList.size(); i++ ){
            System.out.println("Software :" + MyList.get(i));
        }

        assertEqauls(4, MyList.size());

    }

    private void assertEqauls(int i, int size) {
    }

    @Test
    public void listRemove(){
        List<String> MyList = new ArrayList<>();
        MyList.add("Acer");
        MyList.add("Samsung");
        MyList.add("Asus");
        MyList.add("Iphone");

        boolean isremoved = MyList.remove("Acer");
        System.out.println("Results after remove method" + MyList);

    }
    @Test
    public void listFind(){
        List <String> MyList = new ArrayList<>();
        MyList.add("Acer");
        MyList.add("Sansung");
        MyList.add("Asus");
        MyList.add("Iphone");
        System.out.println("Software find are:" + MyList.indexOf("Asus"));
    }
    /* Set all methods,
     * add
     * remove
     * find
     * */
    @Test
    public void SetAdd(){
        Set <Software> MyList = new HashSet<>();
        MyList.add(new Software("Acer", 654));
        MyList.add(new Software("Samsung", 234));
        MyList.add(new Software("Asus", 444));
        MyList.add(new Software("Iphone",232));
        System.out.println("Software: " + MyList);
        assertEqauls(4, MyList.size());

    }
    @Test
    public void SetRemove(){
        Set <String> Mylist = new HashSet<String>();

        Mylist.add("Acer");
        Mylist.add("Samsung");
        Mylist.add("Asus");
        Mylist.add("Iphone");
        boolean isremoved = Mylist.remove("Asus");
        System.out.println("Left softwares after remove"+ Mylist);
    }

    @Test
    public void SetFind(){
        Set<String> MyList = new HashSet<String>();
        MyList.add("Acer");
        MyList.add("Sumsung");
        MyList.add("Asus");
        MyList.add("Iphone");

        MyList.contains("Acer");
        MyList.contains("Iphone");
        System.out.println("Software in stock" + MyList.contains("Acer"));
        System.out.println("Software in stock" + MyList.contains("Iphone"));

    }

}

