package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] counts = new int[26];
		String[] letters = new String[26];
		File fileText = new File("/home/bogdan/workspace/Java/FolderFrom/shakespeare.txt");
		Charset encoding = Charset.defaultCharset();
		try (InputStream in = new FileInputStream(fileText);
				Reader reader = new InputStreamReader(in, encoding);
				Reader buffer = new BufferedReader(reader)) {
			countLetters(buffer, counts);
		} catch (IOException e) {
			System.out.println(e);
		}

		letters = sort(counts);
		print(counts, letters);
	}

	private static int[] countLetters(Reader reader, int[] counts) throws IOException {
		int r;
		while ((r = reader.read()) != -1) {
			for (int i = 0; i < counts.length; i++) {
				if (r == i + 65 || r == i + 97) {
					counts[i]++;
				}
			}
		}
		return counts;
	}

	private static String[] sort(int[] counts) {
		final String[] letters = new String[26];
		for (int i = 0; i < counts.length; i++)
			letters[i] = Character.toString((char) (i + 65));
		for (int min = 0; min < counts.length - 1; min++) {
			int least = min;
			for (int j = min + 1; j < counts.length; j++) {
				if (counts[j] < counts[least]) {
					least = j;
				}
			}
			int tmp = counts[min];
			counts[min] = counts[least];
			counts[least] = tmp;
			String tmp2 = letters[min];
			letters[min] = letters[least];
			letters[least] = tmp2;
		}
		return letters;
	}

	private static void print(int[] counts, String[] letters) {
		double sum = IntStream.of(counts).sum();
		DecimalFormat f = new DecimalFormat("#0.00");
		for (int i = 25; i > 0; i--)
			System.out.println(letters[i] + " - " + f.format(counts[i] / sum * 100) + "% (" + +counts[i] + ")");
	}
}
