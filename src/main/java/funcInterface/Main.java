package funcInterface;

//public class Main {
//    public static void main(String[] args) {
//        //Java created in 2014
//        // new updates come:
//        //Lambda expresstion
//        //Date and time API
//        //String
//        ////before lambda we had functional interface
//        //Functional Interface: an interface with only one abstract method
//        //lambda expresstion: an anonymous method and its witout name.
//        //syntax : (parameter list)->lambda body
//       /* //e.g :  double getPIValue(){}
//       return 3.14}
//
//       //concice method
//       ()->3.14;
//
//        */
//        //////////////////////////////////////////////////////////////////////
//        MyFunctionalInterface func= () ->System.out.println("Lambda Expressions are greate ! ");
////
//        func.getValue();
//
//
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Using a Predicate to filter even numbers
        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> evenNumbers = filterList(numbers, isEven);
        System.out.println("Even numbers: " + evenNumbers);

        Predicate<Student> chekAD= (student)-> student.age()>18;
        System.out.println(filterList(getAllStudent(), chekAD));
    }

    static <Student> List<Student> filterList(List<Student> list, Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        for (Student item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
    static List <Student> getAllStudent(){
     return    Arrays.asList(
                 new Student(5,"Qodos",34),
                new Student(5,"Nain",34),
                new Student(1,"Adam",34),
                new Student(2,"Fahim",56),
                new Student(3,"Samir",12),
                new Student(6,"John",23)



        );

    }
}