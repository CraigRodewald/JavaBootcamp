package com.CraigRodewald.lab15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountriesTextFile {
	static final Path countriesPath = Paths
			.get("C:\\Users\\Craig\\workspace\\Grand-Circus\\JavaBootcamp\\LabNumber15\\src\\countries.txt");
	static final File countriesFile = countriesPath.toFile();
	static List<Country> countries = getAll();

	static List<Country> getAll() {
		/*
		 * if (countries != null) { return countries; }
		 */

		countries = new ArrayList<>();
		if (Files.exists(countriesPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {
				StringBuilder sb = new StringBuilder();
				String line = in.readLine();
				while (line != null) {
					sb.append(line);
					sb.append(System.lineSeparator());
					Country c = new Country(sb.toString());
					c.setName(sb.toString());
					countries.add(c);
					line = in.readLine();
				}
			} catch (IOException e) {
				System.out.println(e);
				return null;
			}
		}
		return countries;
	}

	public static Country get(String name) {
		for (Country c : countries) {
			if (c.getName().equals(name))
				return c;
		}
		return null;
	}

	private static boolean saveAll() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))) {
			for (Country c : countries) {
				out.print(c.getName());
			}
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}

		return true;
	}

	public static boolean add(Country c) {
		countries.add(c);
		return saveAll();
	}

	public static boolean delete(Country c) {
		countries.remove(c);
		return saveAll();
	}

}
