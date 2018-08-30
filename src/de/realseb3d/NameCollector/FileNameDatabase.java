package de.realseb3d.NameCollector;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileNameDatabase implements NameDatabase {

	@Override
	public String[] readAllNames() throws NameDatabaseException {
		try (BufferedReader b = new BufferedReader(new FileReader("datenbank.txt"))) {
			String[] names = new String[0];
			while (b.ready()) {
				String name = b.readLine();
				names = Arrays.copyOf(names, names.length + 1);
				names[names.length - 1] = name;
			}
			return names;
		} catch (FileNotFoundException e) {
			throw new NameDatabaseException(e);
		} catch (IOException e) {
			throw new NameDatabaseException(e);
		}
	}

	@Override
	public void addName(String name1) throws NameDatabaseException {
		try (BufferedWriter b = new BufferedWriter(new FileWriter("datenbank.txt", true))) {
			b.write("\n" + name1);
		} catch (FileNotFoundException e) {
			throw new NameDatabaseException(e);
		} catch (IOException e) {
			throw new NameDatabaseException(e);
		}
		 
	}

}
