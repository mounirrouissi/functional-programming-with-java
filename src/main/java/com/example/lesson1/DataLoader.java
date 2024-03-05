package com.example.lesson1;

public class DataLoader {
    
    protected record Person(String name, int age) {}

    protected  static class Loader {

        private final Person p;

        public Loader(Boolean b){
            p=LoaderPerson(b);
        }

        public Person LoaderPerson (Boolean isReal) {

            if(isReal) {
             return realPerson()    ;
            }
            return fakePerson();
        }

        


        private Person realPerson(){
            System.out.println("Loading real person");
            return new Person("real", 23);
        }    
        private Person fakePerson(){
            System.out.println("Loading fake person");
            return new Person("real", 23);
        } 

       
    }
  
    public static void main(String[] args) {
       Loader loader = new Loader(false);
        System.out.println(loader.p);
    }
}
