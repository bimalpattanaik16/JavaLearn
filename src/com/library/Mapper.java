package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mapper {
	public static void main(String[] args) {
		
		Book p = new Book( 1, "phy","physics", 5,"Rc", "K.Das") ;
		Book q = new Book( 23, "che","chemistry", 6,"Lc", "S.Das") ;
		Book r = new Book( 67, "Math","Mathematics", 7,"sc", "B.pattanaik") ;
		
		List<Book> booklist = new ArrayList< >();
		
		booklist.add(p);
		booklist.add(q);
		booklist.add(r);
		
		Student bimal = new Student(2,"lula", "CSE", 6);
		Student pattanaik = new Student(4,"tiki", "EE", 1);
		Student babul = new Student(9,"Nirmal", "Civel", 2);
		
		List<Student> studentlist = new ArrayList<>();
		
		studentlist.add(bimal);
		studentlist.add(pattanaik);
		studentlist.add(babul);		
			
		Tray obj = new Tray(booklist,studentlist);
		System.out.println("obj has :" +obj.getStudents());
		System.out.println("obj has :" +obj.getUnoccupiedList());
		
			System.out.println("book name:"+p.getName());
			System.out.println("dept name:"+babul.getDept());
			System.out.println("subject name:"+r.getSub());
			
			  while(true){
				  Scanner input = new Scanner(System.in);
			        int bookid = input.nextInt();
			        int studentid = input.nextInt();
			        if(bookid == 67)
			            break;
			        //if((book % 100 == 0 && book % 400 == 0) || (book % 4 == 0 && book % 100 != 0))
			            System.out.println(bookid + " issue");
			        //else();
			        	System.out.println("student id:"+studentid);
			        
			    }
				
			
		}
		
	}


	
	

