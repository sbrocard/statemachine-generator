
package net.sb.statemachine.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StmStandaloneSetup extends StmStandaloneSetupGenerated{

	public static void doSetup() {
		new StmStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

