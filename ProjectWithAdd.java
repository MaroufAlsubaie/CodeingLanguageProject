package JavaProject;
import java.util.Scanner;

public class ProjectWithAdd {
	static String[] NewLang = new String[4];
	static void Guide1() {
		System.out.println("Gudie(Do you want to learn about a language or do you want to add an info about a language?)");
		System.out.println(" if you to learn press = 1  -----  if you want to add an info press = 2");
		System.out.println("Note: if you alredey add a language you can't add another!");
		System.out.print("Enter the number: ");
		
	}
	static void Guide () {
		System.out.println("Gudie if you want to learn about any language enter the number of the language");
		System.out.println("Java=0 "+" Python=1 "+" C++=2 "+" SQL=3"+" TheLanguageYouAdd=4");
		System.out.print("Enter the number of the language: ");
	}
	 static void programminglanguages() {
		Scanner reader = new Scanner(System.in);
		int Add;
		int Lang;
		Add = reader.nextInt();
		String[] Elment= {"The language name: ","The creator of the language: ","Year of released: ", "A little bit of description: "};
		String[] Java= {"java","James Gosling", "Since "+1995 ,"Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible."};
		String[] Python= {"Python","Guido van Rossum", "Since "+1991 ,"high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace."};
		String[] CPlusPlus= {"C++","Bjarne Stroustrup", "Since "+1985 ,"C++ was designed with a bias toward system programming and embedded, resource-constrained software and large systems, with performance, efficiency, and flexibility of use as its design highlights."};
		String[] SQL= {"SQL","Raymond Boyce And Donald Chamberlin", "Since "+1970 ,"it's a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS), or for stream processing in a relational data stream management system (RDSMS)."};
		if (Add == 1) {
			Guide();
			Lang = reader.nextInt();
				if (Lang == 0) {
					 for (int i=0 ; i<Java.length; i++) {
					 System.out.print(Elment[i]);
					 System.out.println(Java[i]);
					 } 		     }
				 else if(Lang == 1) {
					 for (int i=0 ; i<Python.length; i++) {
						 System.out.print(Elment[i]);
						 System.out.println(Python[i]);
						 } 	
				 }
				 else if(Lang == 2) {
					 for (int i=0 ; i<CPlusPlus.length; i++) {
						 System.out.print(Elment[i]);
						 System.out.println(CPlusPlus[i]);
						 } 	
				 }
				 else if(Lang == 3) {
					 for (int i=0 ; i<SQL.length; i++) {
						 System.out.print(Elment[i]);
						 System.out.println(SQL[i]);
						 } 	
				 }
				 else if(Lang == 4) {
					 for (int i=0 ; i<NewLang.length; i++) {
						 System.out.print(Elment[i]);
						 System.out.println(NewLang[i]);
						 } 	
				 }
				 else {
					 System.out.println("Wrong Number!!");
				 }
		}
		else if(Add == 2) {
			for (int i=0; i<Elment.length; i++) {
				System.out.print(Elment[i]);
				NewLang[i] = reader.next();
				System.out.println();
				
				
			}
			
		}
		else {
			System.out.println("Wrong Number!!");
		}
		 
			 }
			 
		 
	public static void main(String[] args) {
		for(int i =0; i < 99; i++) {
		Guide1();
		programminglanguages();
		}
	}

}
