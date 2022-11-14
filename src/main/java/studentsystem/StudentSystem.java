package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("---------welcome----------");
            System.out.println("1: add");
            System.out.println("2: delete");
            System.out.println("3: modify");
            System.out.println("4: find");
            System.out.println("5: exit");
            System.out.println("please enter");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" :
                    System.out.println("add");
                    addStudent(list);
                    break;
                case "2" : System.out.println("delete");
                    deleteStudent(list);
                    break;
                case "3" : System.out.println("modify");
                    modifyStudent(list);
                    break;
                case "4" : System.out.println("find");
                    queryStudent(list);
                    break;
                case "5" : System.out.println("exit");
                    // break loop;
                    System.exit(0);  // stop virtual machine
                default :
                    System.out.println("no option");
            }
        }

    }

    // add
    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();

        System.out.println("add student");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please enter id");
            String id = sc.next();

            boolean flag = contains(list,id);

            if (flag) {
                System.out.println("id exist");
            } else {
                s.setId(id);
                break;
            }
        }

        System.out.println("please enter name");
        String name = sc.next();
        s.setName(name);

        System.out.println("please enter age");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("please enter address");
        String address = sc.next();
        s.setAddress(address);

        list.add(s); 

        System.out.println("add success");
        
    }

    // delete
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("enter id");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("delete success");
        } else {
            System.out.println("not exist");
        }
    }

    public static void modifyStudent(ArrayList<Student> list) {
        System.out.println("enter id");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("not exist");
            return;
        }

        Student s = list.get(index);
        System.out.println("please enter student name");
        String name = sc.next();
        s.setName(name);
        System.out.println("please enter student age");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("please enter student address");
        String address = sc.next();
        s.setAddress(address);        
    }

    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("query");
        if (list.size() == 0) {
            System.out.println("no info");
            return;
        }
        System.out.println("id\tname\tage\taddress");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(
                    s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress()
            );
        }
    }
    
    public static boolean contains(ArrayList<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (id.equals(s.getId())) {
                return i;
            }
        }
        return -1;
    }
    

}
