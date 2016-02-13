package serialdeserializtion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialUser {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		user user=new user(10,"dinesh");
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(new File("E:\\user.txt")));
		o.writeObject(user);
	}

}
