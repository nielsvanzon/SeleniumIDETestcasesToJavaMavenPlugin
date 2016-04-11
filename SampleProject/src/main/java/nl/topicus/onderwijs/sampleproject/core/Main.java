package nl.topicus.onderwijs.sampleproject.core;

import java.util.Arrays;
import java.util.List;

import nl.topicus.onderwijs.sampleproject.entities.Foo;
import nl.topicus.onderwijs.sampleproject.util.Valuator;

public class Main
{

	public static void main(String[] args)
	{
		List<Foo> foos = Arrays.asList(new Foo(2), new Foo(9), new Foo(1));
		int sumValue = Valuator.valuate(foos);

		System.out.println("The sum value of these " + foos.size() + " is " + sumValue);
	}
}
