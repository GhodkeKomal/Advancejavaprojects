package empprjDemo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TesEmployee {
	 public static void main(String[] args)
	    {
	        int id;
	        String name;
	        float salary;
	        long contact_no;
	        String email_id;

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> al = new ArrayList<Emoloyee>();

	        File f = null;
	        FileInputStream fis = null;
	        ObjectInputStream ois = null;
	        FileOutputStream fos = null;
	        ObjectOutputStream oos = null;
	        try {
	            f = new File(import java.io.File;
	

	@suppressWarning("serial")
	class TestEmployee implements Serializable{

	    int id;
	    String name;
	    float salary;
	    long contact_no;
	    String email_id;

	public Employee(int id,String name,float salary,long contact_no,String email_id)
	{
	    this.id=id;
	    this.name=name;
	    this.salary=salary;
	    this.contact_no=contact_no;
	    this.email_id=email_id;
	}
	public String toString()
	{
	    return
	}
	public class Employeemanagment
	{
	    static void display(ArrayList<Employee> al) 
	    {
	        System.out.println("\n          -----------Employee List----------");
	        System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", "ID", "NAME", "SALARY", "CONTACT NO", "Email-Id"));
	        for (Employee e : al) 
	        {
	            System.out.println(String.format("-5s%-20s%-10s%-15s%-10s", e.id, e.name, e.salary, e.contact_no, e.email_id));
	        }
	    }

	    @suppressWarning("unchecked")
	    public static void main(String[] args)
	    {
	        int id;
	        String name;
	        float salary;
	        long contact_no;
	        String email_id;

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> al = new ArrayList<Emoloyee>();

	        File f = null;
	        FileInputStream fis = null;
	        ObjectInputStream ois = null;
	        FileOutputStream fos = null;
	        ObjectOutputStream oos = null;
	        try {
	            f = new File(import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;
	import java.sql.SQLOutput;
	import java.util.ArrayList;
	import java.util.Scanner;

	@suppressWarning("serial")
	class Employee implements Serializable{

	    int id;
	    String name;
	    float salary;
	    long contact_no;
	    String email_id;

	public Employee(int id,String name,float salary,long contact_no,String email_id)
	{
	    this.id=id;
	    this.name=name;
	    this.salary=salary;
	    this.contact_no=contact_no;
	    this.email_id=email_id;
	}
	public String toString()
	{
	    return
	}
	public class Employeemanagment
	{
	    static void display(ArrayList<Employee> al) 
	    {
	        System.out.println("\n          -----------Employee List----------");
	        System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", "ID", "NAME", "SALARY", "CONTACT NO", "Email-Id"));
	        for (Employee e : al) 
	        {
	            System.out.println(String.format("-5s%-20s%-10s%-15s%-10s", e.id, e.name, e.salary, e.contact_no, e.email_id));
	        }
	    }

	    @suppressWarning("unchecked")
	    public static void main(String[] args)
	    {
	        int id;
	        String name;
	        float salary;
	        long contact_no;
	        String email_id;

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> al = new ArrayList<Emoloyee>();

	        File f = null;
	        FileInputStream fis = null;
	        ObjectInputStream ois = null;
	        FileOutputStream fos = null;
	        ObjectOutputStream oos = null;
	        try {
	            f = new File();
	            if (f.exists()) 
	            {
	                fis = new FileInputStream(f);
	                ois = new ObjectInputStream(fis);
	                al = (ArrayList<Employee>) ois.readobject();
	            }
	        } 
	            catch (Exception exp) {
	            System.out.println(exp);
	        }
	        do
	        {
	            System.out.println("\n******** WELCOME TO THE EMPLOYEE MANAGMENT SYSTEM********\n");
	            System.out.println(" 1) Add Employee to the Database\n" +
	                    "2) Search for Employee\n" +
	                    "3) Edit Employee details\n" +
	                    "4) Delete Employee details\n" +
	                    "5) Display all Employee Working in this company\n " +
	                    "6)EXIT\n");
	            System.out.println("Enter your choice: ");
	            int ch = sc.nextInt();

	            Switch(ch)
	            {
	                case1:
	                System.out.println("\nEnter the following details to ADD List:\n");
	                System.out.println("Enter ID :");
	                id = sc.nextInt();
	                System.out.println("Enter Name :");
	                name = sc.next();
	                System.out.println("Enter salary :");
	                salary = sc.nextFloat();
	                System.out.println("Enter contact No :");
	                Contact_no = sc.nextlong();
	                System.out.println("Enter Email-ID :");
	                email_id = sc.next();
	                al.add(new Employee(id, name, salary, contact_no, email_id));
	                display(al);
	                break;
	                case2:
	                System.out.println("\nEnter the Employee ID to search :");
	                id = sc.nextInt();
	                int i = 0;
	                for (Employee e : al) 
	                {
	                    if (id == e.id)
	                    {
	                        System.out.println(e + "\n");
	                        i++;
	                    }
	                }
	                if (i == 0)
	                {
	                    System.out.println("\nEmployee details are not available please enter a valid ID!!");
	                }
	                break;
	                case3:
	                System.out.println("\nEnter the Employee ID to EDIT the details ");
	                id = sc.nextInt();
	                int j = 0;
	                for (Employee e : al) 
	                {
	                    if (id == e.id)
	                    {
	                        j++;
	                        do {
	                            int ch1 = 0;
	                            System.out.println("\n Edit Employee Details :\n" +
	                                    "1).Employee Id\n" +
	                                    "2). Name\n" +
	                                    "3). salary\n" +
	                                    "4). contact No.\n" +
	                                    "5). Email-ID\n" +
	                                    "6). Go Back\n");
	                            System.out.println("Enter your choice :");
	                            ch1 = sc.nextInt();
	                            switch (ch1) 
	                            {
	                                case 1:
	                                    System.out.println("\nEnter new Employee Id:");
	                                    e.id = sc.nextInt();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 2:
	                                    System.out.println("Enter new Employee Name:");
	                                    sc.nextInt();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 3:
	                                    System.out.println("Enter new Employee salary:");
	                                    e.salary = sc.nextFloat();
	                                    System.out.println(e + "\n");
	                                case 4:
	                                    System.out.println("Enter new Employee contact No. :");
	                                    e.contact_no = sc.nextLong();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 5:
	                                    System.out.println("Enter new Employee Email-ID :");
	                                    e.email_id = sc.next();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 6:
	                                    j++;
	                                    break;
	                                default:
	                                    System.out.println("\nEnter a correct from the List!");
	                                    break;

	                            }
	                        }
	                        while (j == 1);
	                    }
	                }
	                if (j == 0)
	                {
	                    System.out.println("\nEnter Employee ID to Delete from the Database:");
	                }
	                break;
	                case4:
	                System.out.println("\nEnter Employee Id to Delete from the Database: ");
	                id = sc.nextInt();
	                int k = 0;
	                try {
	                    for (Employee e : al) 
	                    {
	                        if (id == e.id) 
	                        {
	                            al.remove(e);
	                            display(al);
	                            k++;
	                        }
	                    }
	                    if (k == 0) 
	                    {
	                        System.out.println("\nEmployee Details are not available ,please enter a valid ID!!");
	                    }
	                    } 
	                    catch (Exception ex) {
	                    System.out.println(ex);
	                }
	                break;
	                case5:
	                try {
	                    al = (ArrayList<Employee>) ois.readObject();
	                } catch (ClassNotFoundException e2) {
	                    System.out.println(e2);
	                } catch (Exception e2) {
	                    System.out.println(e2)
	                }
	                display(al);
	                break;
	                case6:
	                try {
	                    fos = new FileOutputStream(f);
	                    oos = new ObjectOutputStream(fos);
	                    oos.WriteObject(al);
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                } 
	                  catch (Exception e2) {
	                    e2.printStackTrace();
	                }
	                Finally {
	                     try {
	                    fis.close();
	                    ois.close();
	                    fos.close();
	                    oos.close();
	                } catch (Exception e1) {
	                    e1.printStackTrace();
	                }
	            }
	                System.out.println("\nYou have chosen EXIT!! saving Files and closing the tool.");
	                sc.close();
	                System.exit(0);
	                break;
	                default:
	                    System.out.println("\nEnter a correct choice from the List :");
	                    break;
	            }
	        }
	        while (true);
	    }
	});
	            if (f.exists()) 
	            {
	                fis = new FileInputStream(f);
	                ois = new ObjectInputStream(fis);
	                al = (ArrayList<Employee>) ois.readobject();
	            }
	        } 
	            catch (Exception exp) {
	            System.out.println(exp);
	        }
	        do
	        {
	            System.out.println("\n******** WELCOME TO THE EMPLOYEE MANAGMENT SYSTEM********\n");
	            System.out.println(" 1) Add Employee to the Database\n" +
	                    "2) Search for Employee\n" +
	                    "3) Edit Employee details\n" +
	                    "4) Delete Employee details\n" +
	                    "5) Display all Employee Working in this company\n " +
	                    "6)EXIT\n");
	            System.out.println("Enter your choice: ");
	            int ch = sc.nextInt();

	            Switch(ch)
	            {
	                case1:
	                System.out.println("\nEnter the following details to ADD List:\n");
	                System.out.println("Enter ID :");
	                id = sc.nextInt();
	                System.out.println("Enter Name :");
	                name = sc.next();
	                System.out.println("Enter salary :");
	                salary = sc.nextFloat();
	                System.out.println("Enter contact No :");
	                Contact_no = sc.nextlong();
	                System.out.println("Enter Email-ID :");
	                email_id = sc.next();
	                al.add(new Employee(id, name, salary, contact_no, email_id));
	                display(al);
	                break;
	                case2:
	                System.out.println("\nEnter the Employee ID to search :");
	                id = sc.nextInt();
	                int i = 0;
	                for (Employee e : al) 
	                {
	                    if (id == e.id)
	                    {
	                        System.out.println(e + "\n");
	                        i++;
	                    }
	                }
	                if (i == 0)
	                {
	                    System.out.println("\nEmployee details are not available please enter a valid ID!!");
	                }
	                break;
	                case3:
	                System.out.println("\nEnter the Employee ID to EDIT the details ");
	                id = sc.nextInt();
	                int j = 0;
	                for (Employee e : al) 
	                {
	                    if (id == e.id)
	                    {
	                        j++;
	                        do {
	                            int ch1 = 0;
	                            System.out.println("\n Edit Employee Details :\n" +
	                                    "1).Employee Id\n" +
	                                    "2). Name\n" +
	                                    "3). salary\n" +
	                                    "4). contact No.\n" +
	                                    "5). Email-ID\n" +
	                                    "6). Go Back\n");
	                            System.out.println("Enter your choice :");
	                            ch1 = sc.nextInt();
	                            switch (ch1) 
	                            {
	                                case 1:
	                                    System.out.println("\nEnter new Employee Id:");
	                                    e.id = sc.nextInt();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 2:
	                                    System.out.println("Enter new Employee Name:");
	                                    sc.nextInt();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 3:
	                                    System.out.println("Enter new Employee salary:");
	                                    e.salary = sc.nextFloat();
	                                    System.out.println(e + "\n");
	                                case 4:
	                                    System.out.println("Enter new Employee contact No. :");
	                                    e.contact_no = sc.nextLong();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 5:
	                                    System.out.println("Enter new Employee Email-ID :");
	                                    e.email_id = sc.next();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 6:
	                                    j++;
	                                    break;
	                                default:
	                                    System.out.println("\nEnter a correct from the List!");
	                                    break;

	                            }
	                        }
	                        while (j == 1);
	                    }
	                }
	                if (j == 0)
	                {
	                    System.out.println("\nEnter Employee ID to Delete from the Database:");
	                }
	                break;
	                case4:
	                System.out.println("\nEnter Employee Id to Delete from the Database: ");
	                id = sc.nextInt();
	                int k = 0;
	                try {
	                    for (Employee e : al) 
	                    {
	                        if (id == e.id) 
	                        {
	                            al.remove(e);
	                            display(al);
	                            k++;
	                        }
	                    }
	                    if (k == 0) 
	                    {
	                        System.out.println("\nEmployee Details are not available ,please enter a valid ID!!");
	                    }
	                    } 
	                    catch (Exception ex) {
	                    System.out.println(ex);
	                }
	                break;
	                case5:
	                try {
	                    al = (ArrayList<Employee>) ois.readObject();
	                } catch (ClassNotFoundException e2) {
	                    System.out.println(e2);
	                } catch (Exception e2) {
	                    System.out.println(e2)
	                }
	                display(al);
	                break;
	                case6:
	                try {
	                    fos = new FileOutputStream(f);
	                    oos = new ObjectOutputStream(fos);
	                    oos.WriteObject(al);
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                } 
	                  catch (Exception e2) {
	                    e2.printStackTrace();
	                }
	                Finally {
	                     try {
	                    fis.close();
	                    ois.close();
	                    fos.close();
	                    oos.close();
	                } catch (Exception e1) {
	                    e1.printStackTrace();
	                }
	            }
	                System.out.println("\nYou have chosen EXIT!! saving Files and closing the tool.");
	                sc.close();
	                System.exit(0);
	                break;
	                default:
	                    System.out.println("\nEnter a correct choice from the List :");
	                    break;
	            }
	        }
	        while (true);
	    }
	});
	            if (f.exists()) 
	            {
	                fis = new FileInputStream(f);
	                ois = new ObjectInputStream(fis);
	                al = (ArrayList<Employee>) ois.readobject();
	            }
	        } 
	            catch (Exception exp) {
	            System.out.println(exp);
	        }
	        do
	        {
	            System.out.println("\n******** WELCOME TO THE EMPLOYEE MANAGMENT SYSTEM********\n");
	            System.out.println(" 1) Add Employee to the Database\n" +
	                    "2) Search for Employee\n" +
	                    "3) Edit Employee details\n" +
	                    "4) Delete Employee details\n" +
	                    "5) Display all Employee Working in this company\n " +
	                    "6)EXIT\n");
	            System.out.println("Enter your choice: ");
	            int ch = sc.nextInt();

	            Switch(ch)
	            {
	                case1:
	                System.out.println("\nEnter the following details to ADD List:\n");
	                System.out.println("Enter ID :");
	                id = sc.nextInt();
	                System.out.println("Enter Name :");
	                name = sc.next();
	                System.out.println("Enter salary :");
	                salary = sc.nextFloat();
	                System.out.println("Enter contact No :");
	                Contact_no = sc.nextlong();
	                System.out.println("Enter Email-ID :");
	                email_id = sc.next();
	                al.add(new Employee(id, name, salary, contact_no, email_id));
	                display(al);
	                break;
	                case2:
	                System.out.println("\nEnter the Employee ID to search :");
	                id = sc.nextInt();
	                int i = 0;
	                for (Employee e : al) 
	                {
	                    if (id == e.id)
	                    {
	                        System.out.println(e + "\n");
	                        i++;
	                    }
	                }
	                if (i == 0)
	                {
	                    System.out.println("\nEmployee details are not available please enter a valid ID!!");
	                }
	                break;
	                case3:
	                System.out.println("\nEnter the Employee ID to EDIT the details ");
	                id = sc.nextInt();
	                int j = 0;
	                for (Employee e : al) 
	                {
	                    if (id == e.id)
	                    {
	                        j++;
	                        do {
	                            int ch1 = 0;
	                            System.out.println("\n Edit Employee Details :\n" +
	                                    "1).Employee Id\n" +
	                                    "2). Name\n" +
	                                    "3). salary\n" +
	                                    "4). contact No.\n" +
	                                    "5). Email-ID\n" +
	                                    "6). Go Back\n");
	                            System.out.println("Enter your choice :");
	                            ch1 = sc.nextInt();
	                            switch (ch1) 
	                            {
	                                case 1:
	                                    System.out.println("\nEnter new Employee Id:");
	                                    e.id = sc.nextInt();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 2:
	                                    System.out.println("Enter new Employee Name:");
	                                    sc.nextInt();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 3:
	                                    System.out.println("Enter new Employee salary:");
	                                    e.salary = sc.nextFloat();
	                                    System.out.println(e + "\n");
	                                case 4:
	                                    System.out.println("Enter new Employee contact No. :");
	                                    e.contact_no = sc.nextLong();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 5:
	                                    System.out.println("Enter new Employee Email-ID :");
	                                    e.email_id = sc.next();
	                                    System.out.println(e + "\n");
	                                    break;
	                                case 6:
	                                    j++;
	                                    break;
	                                default:
	                                    System.out.println("\nEnter a correct from the List!");
	                                    break;

	                            }
	                        }
	                        while (j == 1);
	                    }
	                }
	                if (j == 0)
	                {
	                    System.out.println("\nEnter Employee ID to Delete from the Database:");
	                }
	                break;
	                case4:
	                System.out.println("\nEnter Employee Id to Delete from the Database: ");
	                id = sc.nextInt();
	                int k = 0;
	                try {
	                    for (Employee e : al) 
	                    {
	                        if (id == e.id) 
	                        {
	                            al.remove(e);
	                            display(al);
	                            k++;
	                        }
	                    }
	                    if (k == 0) 
	                    {
	                        System.out.println("\nEmployee Details are not available ,please enter a valid ID!!");
	                    }
	                    } 
	                    catch (Exception ex) {
	                    System.out.println(ex);
	                }
	                break;
	                case5:
	                try {
	                    al = (ArrayList<Employee>) ois.readObject();
	                } catch (ClassNotFoundException e2) {
	                    System.out.println(e2);
	                } catch (Exception e2) {
	                    System.out.println(e2)
	                }
	                display(al);
	                break;
	                case6:
	                try {
	                    fos = new FileOutputStream(f);
	                    oos = new ObjectOutputStream(fos);
	                    oos.WriteObject(al);
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                } 
	                  catch (Exception e2) {
	                    e2.printStackTrace();
	                }
	                Finally {
	                     try {
	                    fis.close();
	                    ois.close();
	                    fos.close();
	                    oos.close();
	                } catch (Exception e1) {
	                    e1.printStackTrace();
	                }
	            }
	                System.out.println("\nYou have chosen EXIT!! saving Files and closing the tool.");
	                sc.close();
	                System.exit(0);
	                break;
	                default:
	                    System.out.println("\nEnter a correct choice from the List :");
	                    break;
	            }
	        }
	        while (true);
	    }
	}

}
