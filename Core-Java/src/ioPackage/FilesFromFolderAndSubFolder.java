package ioPackage;

import java.io.File;

public class FilesFromFolderAndSubFolder {

	public void listAllFiles(String directoryName){
		
		File directory = new File(directoryName);
		
		File[] fList = directory.listFiles();//get all the files and sub-directories from a directory
		
		for (File file : fList){
			// If it's a file print the name
			if (file.isFile()){
				System.out.println(file.getName());
			}
			// else pass the directory name to the method
			else if (file.isDirectory()){
				listAllFiles(file.toString()); // converting File to String type using toString() method
			}
		}
	}

	public static void main(String[] args) {

		FilesFromFolderAndSubFolder obj = new FilesFromFolderAndSubFolder();
		obj.listAllFiles("G:\\Java Related\\");

	}
}



