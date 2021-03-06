/*
 * generated by Xtext
 */
package net.sb.statemachine.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.sb.statemachine.dsl.ui.internal.StmActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StmExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StmActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return StmActivator.getInstance().getInjector(StmActivator.NET_SB_STATEMACHINE_DSL_STM);
	}
	
}
