package com.seleniumprograms.javaprograms;

public class DuplicateString2 {

	public static void main(String[] args) {

		String prgs[] = { "java", "phython", "dotnet", "java", "oracle" };

		for (int i = 0; i < prgs.length - 1; i++) {

			// System.out.println(prgs[i]);

			for (int j = i + 1; j < prgs.length; j++) {

				if (prgs[i].equals(prgs[j]) && (i != j)) {

					System.out.println(prgs[i]);

				}

			}

		}

	}

}
