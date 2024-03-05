package com.example.intro;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
    Employee e1 = new  Employee("Kal",23) ;  
    var e2 =new   Employee("Kal",23) ;  
    var e3 = new  Employee("Kal",23) ;  

    var listEmployeesNames = Stream.of(e1,e2,e3).map(Employee::name).toList();

    System.out.println(listEmployeesNames);


    }
}


