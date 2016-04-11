package nl.topicus.onderwijs.seleniumide.plugin;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "clean-java-tests", defaultPhase = LifecyclePhase.CLEAN)
public class CleanJavaTests extends AbstractMojo
{
	@Parameter(property = "clean-java-tests.javaTestsTargetDirectory", required = true)
	private File javaTestsTargetDirectory;

	@Parameter(property = "generate-java-tests.cleanDirectories", required = false)
	private boolean cleanDirectories = true;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException
	{
		Util.cleanJavaTests(javaTestsTargetDirectory, cleanDirectories, getLog());
	}
}
