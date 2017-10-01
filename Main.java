package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// two source files
		File fileOne = new File("/home/bogdan/workspace/Java/FolderFrom/Doc1.txt");
		File fileTwo = new File("/home/bogdan/workspace/Java/FolderFrom/Doc2.txt");
		// output file
		File resultFile = new File("/home/bogdan/workspace/Java/FolderFrom/result.txt");
		// parse, compare and write
		parseCompareWrite(fileOne, fileTwo, resultFile);
	}

	public static void parseCompareWrite(File fileone, File filetwo, File resultfile) {
		ArrayList<String> fileOneParsed = parseFile(fileone);
		ArrayList<String> fileTwoParsed = parseFile(filetwo);
		try (FileOutputStream fos = new FileOutputStream(resultfile)) {
			for (String string : fileTwoParsed) {
				if (fileOneParsed.contains(string)) {
					fos.write((string + " ").getBytes());
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static ArrayList<String> parseFile(File file) {
		try (Scanner s = new Scanner(file)) {
			ArrayList<String> list = new ArrayList<String>();
			while (s.hasNext()) {
				list.add(s.next());
			}
			return list;
		} catch (IOException e) {
			System.out.println(e);
		}
		return null;
	}
}
