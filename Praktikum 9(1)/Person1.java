/**
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 */
 
 import java.io.*;
 // class Person
 class Person1 implements Serializable{
	private String name;
	public Person(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
 }