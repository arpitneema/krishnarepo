package hackerrank;


import java.util.*;
import java.lang.*;
import java.io.*;


import java.io.*;
class Student implements Comparable{
int rollno;
String name;
int age;
Student(int rollno,String name,int age){
this.rollno=rollno;
this.name=name;
this.age=age;
}

public int compareTo(Object obj){
Student st=(Student)obj;
if(age==st.age)
return 0;
else if(age>st.age)
return 1;
else
return -1;
}

}




 class TestSort3{
public static void main(String args[]){

ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(101,"Vijay",23));
al.add(new Student(106,"Ajay",27));
al.add(new Student(105,"Jai",21));
Student stu1=al.get(0);
Student stu2=al.get(1);

System.out.println(stu1.compareTo(stu2));

Collections.sort(al);
Iterator<Student> itr=al.iterator();
while(itr.hasNext()){
Student st=(Student)itr.next();

  }
}
}
