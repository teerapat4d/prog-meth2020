package logic;

import java.util.ArrayList;


public class GuildDatabase {
	private ArrayList<Department> myDepartments;
	
	public GuildDatabase(){
		
		myDepartments = new ArrayList<>();
	}
	
	public boolean createDepartment(String name) {
		
		if(isExists(name)) {
			return false;
		}else {
			Department anotherDepartment = new Department(name);
			myDepartments.add(anotherDepartment);
			return true;
		}
		
		
		
	}
	
	public boolean isExists(String name) {
		
		for(Department i:myDepartments){
			if(i.getName().equals(name)) {			
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<GuildMember> removeDepartment(int index){
		//TODO: Remove a department at the given index from the list, and return a list containing all the members in that department.
		Department removeDepartment = myDepartments.get(index);
		
		myDepartments.remove(index);
		
		return removeDepartment.getAllMembers();
	}
	
	//------------------------------------------
	//---do not edit anything below this line---
	//----but feel free to look at the code!----
	//------------------------------------------
	
	public Department getDepartment(int index) {
		return myDepartments.get(index);
	}
	
	public void printDepartments() {
		int i = 0;
		for (Department d : myDepartments) {
			System.out.println(i + ") " + d);
			i++;
		}
	}
	
	public int departmentCount() {
		return myDepartments.size();
	}
}
