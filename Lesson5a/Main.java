package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		// specify source and target folders
		File folderFrom = new File("/home/bogdan/workspace/Java/FolderFrom");
		File folderTo = new File("/home/bogdan/workspace/Java/FolderTo");
		// specify file filter
		MyFileFilter mFF = new MyFileFilter("doc", "odt");
		File[] fileList = folderFrom.listFiles(mFF);

		//copy all files
		File fileTo =  null;
		for (File filefrom : fileList) {
			fileTo = new File(folderTo + filefrom.getName());
			copyFile(filefrom, fileTo);
		}

	}
	
	public static void copyFile(File filefrom, File fileto ) {

		try (FileInputStream fis = new FileInputStream(filefrom);
				FileOutputStream fos = new FileOutputStream(fileto)) {
			byte[] buffer = new byte[1024];
			int byteread = 0;
			for (; (byteread = fis.read(buffer)) > 0;) {
				fos.write(buffer, 0, byteread);
			}
			System.out.println("file copied - " + filefrom.getName());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
