package nl.topicus.onderwijs.sampleproject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public abstract class BaseTest
{
	private static int count = 0;

	protected void readTest(String location)
	{
		URL url = BaseTest.class.getResource("/testcases/" + location);

		List<String> lines;

		try
		{
			Path path = Paths.get(url.toURI());

			lines = Files.readAllLines(path);

			for (String line : lines)
			{
				System.out.println(line);
			}
		}
		catch (IOException | URISyntaxException e)
		{
			e.printStackTrace();
		}

		count++;

	}

	public static int getCount()
	{
		return count;
	}
}
