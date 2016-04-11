package nl.topicus.onderwijs.seleniumide.plugin;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "generate-java-tests", defaultPhase = LifecyclePhase.GENERATE_TEST_RESOURCES)
public class GenerateJavaTests extends AbstractMojo
{
	@Parameter(property = "generate-java-tests.testcasesSourceDirectory", required = true)
	private File testcasesSourceDirectory;

	@Parameter(property = "generate-java-tests.javaTestsTargetDirectory", required = true)
	private File javaTestsTargetDirectory;

	@Parameter(property = "generate-java-tests.javaTestTemplate", required = true)
	private File javaTestTemplate;

	@Parameter(property = "generate-java-tests.cleanDirectories", required = false)
	private boolean cleanDirectories = true;

	@Override
	public void execute() throws MojoExecutionException
	{
		Util.generateJavaTests(testcasesSourceDirectory, javaTestsTargetDirectory, javaTestTemplate, cleanDirectories, getLog());
	}
}
