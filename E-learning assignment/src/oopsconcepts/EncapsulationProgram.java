package oopsconcepts;
class Encapsulate {
    private String Name;
    private int id;
    private int Age;
    public int getAge() { 
    	return Age;
    	}
    public String getName() {
    	return Name;
    	}
    public int getid() {
    	return id;
    	}
    public void setAge(int newAge) {
    	Age = newAge; 
    	}
    public void setName(String newName)
    {
      Name = newName;
    }
    public void setid(int newid) { id = newid; }
}
 

public class EncapsulationProgram {
	 public static void main(String[] args)
	    {
	        Encapsulate obj = new Encapsulate();
	        obj.setName("riya");
	        obj.setAge(22);
	        obj.setid(101);
	        System.out.println(" name: " + obj.getName());
	        System.out.println(" age: " + obj.getAge());
	        System.out.println(" id: " + obj.getid());
	    }
	}


