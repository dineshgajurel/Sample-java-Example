package serialdeserializtion;

import java.io.Serializable;

public class user implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1723091510908580860L;
	private int id;
	private String name;
	public user(int i,String n){
		
		setId(i);
		setName(n);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString(){
		return (id +" " +name);
	}

}
