/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.List;

class StudentInfo implements Serializable
{
 //transient data members will not take part in Serialization   
 String name;
 int rid;
 String addr;
 StudentInfo(String n, String addr, int r)
 {
  this.name = n;
  this.rid = r;
  this.addr = addr;
 }

 void printStudentInfo()
 {
     System.out.println("StudentInfo details Test:"+name+" "+rid+" "+addr);
 }
 
 public String toString()
 {
     return "name="+name+", id="+rid;
 }
}


class StudentInfoArray implements Serializable{
    StudentInfo arr[];
    
    StudentInfoArray(StudentInfo arr[])
    {
        this.arr = arr;
    }
}

class StudentInfoList implements Serializable{
    List  lst;
    
    StudentInfoList(List lst)
    {
        this.lst = lst;
    }
}