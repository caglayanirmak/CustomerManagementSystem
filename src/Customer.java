import java.util.Scanner;
public class Customer {
         Scanner scan=new Scanner(System.in);
	
		
		  private String name;
          private String surname;
          private String email;
          private String password;
          private String address;

        
          public Customer(String name, String surname, String email, String password, String address) {
        	  this.email=email;
        	  this.password=password;
        	  this.name=name;
        	  this.surname=surname;
        	  this.address=address;
          }
          
          
          public void setName(String name) {
        	  this.name=name;
          }
          public String getName() {
        	  return this.name;
          }
          public void setSurname(String surname) {
        	  this.surname=surname;
          }
          public String getSurname() {
        	  return this.surname;
          }
          public void setEmail(String email) {
        	  this.email=email;
          }
          public String getEmail() {
        	  return this.email;
          }
          public void setPassword(String password) {
        	  this.password=password;
          }
          public String getPassword() {
        	  return this.password;
          }
          public void setAddress(String address) {
        	  this.address=address;
          }
          public String getAddress() {
        	  return this.address;
          }

         
          
          public void showInfos() {
        	 
        	  System.out.println("Name: "+this.name);
        	  System.out.println("Surname: "+this.surname);
        	  System.out.println("Address: "+this.address);
        	  System.out.println("E-mail: "+this.email);
        	  String passwordLength="";
        	  for(int j=0;j<this.password.length();j++) {
        		  passwordLength += "*";
        	  }
              System.out.println("Password: "+passwordLength);
                      	  
         }
       
          public void changeInfos() {
        	  boolean cont=true;
        	  while(cont) {
        	  System.out.println();
        	  System.out.println("Press 0 to view password");
        	  System.out.println("Press 1 to change address");
        	  System.out.println("Press 2 to change e-mail");
        	  System.out.println("Press 3 to change password");
        	  System.out.println("Press 4 to finish the process");
        	  int change=scan.nextInt();
          	switch(change) {
          	case 0:
          	  System.out.println("Password: "+this.password);
          	  break;
          	case 1:
          		System.out.print("New Address: ");
          		String adr=scan.next();
          		this.address=adr;
          		System.out.println("Address Updated...");
          		System.out.println();
          		System.out.println("Name: "+this.name);
          		System.out.println("Surname: "+this.surname);
          		System.out.println("Address: "+this.address);
          		System.out.println("E-mail: "+this.email);
          	  String passwordLength1="";
          	  for(int j=0;j<this.password.length();j++) {
          		  passwordLength1 += "*";
          	  }
                System.out.println("Password: "+passwordLength1);
          		break;
          	case 2:
          		System.out.println("New e-mail: ");
          		String ema=scan.next();
          		this.email=ema;
          		System.out.println("E-mail Updated...");
          		System.out.println();
          		System.out.println("Name: "+this.name);
          		System.out.println("Surname: "+this.surname);
          		System.out.println("Address: "+this.address);
          		System.out.println("E-mail: "+this.email);
          	  String passwordLength2="";
          	  for(int j=0;j<this.password.length();j++) {
          		  passwordLength2+= "*";
          	  }
          	     System.out.println("Password: "+passwordLength2);
          	   break;
          	case 3:
          		System.out.println("New password: ");
          		String pass=scan.next();
          		this.password=pass;
          		System.out.println("Password Updated...");
          		System.out.println();
          		System.out.println("Name: "+this.name);
          		System.out.println("Surname: "+this.surname);
          		System.out.println("Address: "+this.address);
          		System.out.println("E-mail: "+this.email);
          	  String passwordLength3="";
          	  for(int j=0;j<pass.length();j++) {
          		  passwordLength3 += "*";
          	  }
          	     System.out.println("Password: "+passwordLength3);
          	break;
          	case 4:
          		System.out.println("Informations Updated...");
          		cont=false;
          		break;
          	          
          	}	
          	
        	  }
          
          }
          

}
				