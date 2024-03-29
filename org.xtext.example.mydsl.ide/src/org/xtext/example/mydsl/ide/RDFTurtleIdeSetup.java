/*
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.RDFTurtleRuntimeModule;
import org.xtext.example.mydsl.RDFTurtleStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class RDFTurtleIdeSetup extends RDFTurtleStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RDFTurtleRuntimeModule(), new RDFTurtleIdeModule()));
	}
	
}
