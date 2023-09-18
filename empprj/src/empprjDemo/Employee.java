package empprjDemo;
import java.io.File;
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
public class Employee implements Serializable {

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
	            f = new File(_idimport java.io.File;
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

}
