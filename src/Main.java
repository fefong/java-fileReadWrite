import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	private final static String FILE = "YOUR_LOG.log";

	public static void main(String[] args) {
		createFile();
		readFile();
	}

	private static void readFile() {

		File file = new File(FILE);

		if (file.exists()) {
			System.out.println("- File exists: File Name: " + file + " -");
		} else {
			System.out.println("- File not exists -");
			return;
		}
		try {
			FileReader reader = new FileReader(FILE);
			BufferedReader buffer = new BufferedReader(reader);

			String line = null;
			while ((line = buffer.readLine()) != null) {
				System.out.printf("%s\n", line);
			}

			System.out.println("- End file -");
			buffer.close();

		} catch (IOException e) {
			System.err.format("Error! Exception %s%n", e);

		}

	}

	
	private static void createFile() {
		File file = new File(FILE);

		if (file.exists()) {
			System.out.println("- Update File -");
		} else {
			System.out.println("- Create File-");
		}

		String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\nMaecenas quis rutrum enim.\nAliquam fringilla tincidunt diam in condimentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vehicula commodo ornare. Praesent a tortor ac elit vulputate interdum et eget lectus. Fusce enim nunc, elementum a turpis et, finibus dapibus sem. Nulla iaculis elementum ipsum ac dictum. Curabitur at ullamcorper risus. Aenean commodo leo leo, vitae fringilla velit iaculis eu. Praesent at gravida tortor.\r\n";
		try {
			FileWriter writer = new FileWriter(FILE);
			BufferedWriter buffer = new BufferedWriter(writer);

			buffer.write(content);

			System.out.println("Success! You file is saved!");
			buffer.close();
		} catch (IOException e) {
			System.err.format("Error! Exception %s%n", e);

		}

	}

}
