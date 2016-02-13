package serialdeserializtion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserialUser {

	public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
ObjectInputStream oi=new ObjectInputStream(new FileInputStream(new File("E:\\user.txt")));
	user user = (user)oi.readObject();
	System.out.println(user);
	}

}
