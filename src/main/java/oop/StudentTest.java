package oop;

public class StudentTest {


    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "S1", 23);
        Student stu2 = new Student(2, "S2", 25);
        Student stu3 = new Student(3, "S3", 24);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // add new student and check duplicate
        Student stu4 = new Student(4, "zhaoliu", 26);
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("exists");
        } else {
            // full
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                arr[count] = stu4;
                printArr(arr);
            }
        }

        // delete
        int index = getIndex(arr, 2);
        System.out.println(index);
        if (index >= 0) {
            arr[index] = null;
            printArr(arr);
        } else {
            System.out.println("delete failed");
        }

        // find and modify
        int addIndex = getIndex(arr, 3);
        System.out.println(addIndex);
        if (addIndex >= 0) {
            arr[addIndex].setAge(arr[addIndex].getAge() + 1);
            printArr(arr);
        } else {
            System.out.println("modify failed");
        }





    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu!=null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId());
            }
        }
    }

    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
              if (arr[i] != null) {
                  count++;
              }
        }
        return count;
    }

    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if ( stu != null && stu.getId() == id) {
                return true;
            }
        }
        return false;
    }


}
