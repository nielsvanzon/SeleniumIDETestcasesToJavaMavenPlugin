package nl.topicus.onderwijs.sampleproject.util;

import java.util.Collection;

import nl.topicus.onderwijs.sampleproject.entities.Foo;

public class Valuator
{
	public static int valuate(Collection<Foo> foos)
	{
		return foos.stream().mapToInt(Foo::getValue).sum();
	}
}
