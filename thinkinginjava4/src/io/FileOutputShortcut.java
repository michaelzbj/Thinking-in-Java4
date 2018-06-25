package io;

//: io/FileOutputShortcut.java
import java.io.*;

public class FileOutputShortcut {

	static String file = "TESTIOFILE.out";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("TESTIOFILE.java")));

		// Here's the shortcut:

		PrintWriter out = new PrintWriter(file);
		/**
		 * By Contrast PrintWriter out = new PrintWriter(new BufferedWriter(new
		 * FileWriter(file)));
		 */

		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null)
			out.println(lineCount++ + ": " + s);
		out.close();
		// Show the stored file:
		System.out.println(BufferedInputFile.read(file));
	}
} /* (Execute to see output) */// :~
