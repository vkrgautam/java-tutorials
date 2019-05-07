package com.test.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * We want to write our objects to file and then deserialize it from the same
 * file. So we need utility methods that will use ObjectInputStream and
 * ObjectOutputStream for serialization purposes.
 * 
 * @author GautamV
 *
 */
public class SerializationUtil {

	// serialize the given object and save it to file
	public static void serialize(Object object, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(object);
		fos.close();
	}

	// deserialize to Object from given file
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
}
