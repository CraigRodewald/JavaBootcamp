import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountriesTextFile {

	private CountriesTextFile() {

	}

	public static ArrayList<String> readFromFile(String fileName, List<String> list) {
		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
			list = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return (ArrayList<String>) list;
	}

	public static void writeToFile(String fileName, List<String> list) throws IOException {
		try {
			FileWriter writer = new FileWriter(fileName);
			for (String country : list) {
				writer.write(country);
				writer.write("\n");
			}
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
