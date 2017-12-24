package ioPackage;

import java.io.File;
import java.io.IOException;

/*
 * File:
 * 		
 * 			File f = new File ("abc.txt");
 * 
 * 	# This above line won't create any physical file, if it's already available then f pointing to that file.
 * 	# If it's not available then f represents just name of the file without creating any physical file
 * 
 */

public class CreateAFolderOrFile {

	public static void main(String[] args) throws IOException {
		
		// 1. Create a folder in a current working directory
		// File f = new File (String name);
		
		File folder = new File ("Multitude");
		System.out.println(folder.exists()); // Output: false
		folder.mkdir(); // In this line only a physical folder will be created in a cwd.
		System.out.println(folder.exists()); // Output: True
		
		// Note: If you run the program second time you will get the output as true and true, cause already a folder is created.
		
		// 2. Create a file in a current working directory
		// File f = new File (String name);
		
		File file = new File ("Multitude.txt");
		System.out.println(file.exists()); // Output: false
		file.createNewFile(); // In this line only a physical file will be created in a cwd.
		System.out.println(file.exists()); // Output: True
		
		// Note: If you run the program second time you will get the output as true and true, cause already a file is created.
		
		// 3. Create a file or folder in specified sub-directory.
		// File f = new File (String subdir, String name); & 
		
		File newFolder = new File ("D:\\","Multitude");
		newFolder.mkdir();
		
		File newFile = new File ("D:\\","abc.txt");
		newFile.createNewFile();
		
		// 4. File f = new File (File subdir, String name); -> where "Subdir" is of "File type" pointing to the sub directory
		
		File f = new File (newFolder, "Hello.docx");
		f.createNewFile();
		
	}

}
