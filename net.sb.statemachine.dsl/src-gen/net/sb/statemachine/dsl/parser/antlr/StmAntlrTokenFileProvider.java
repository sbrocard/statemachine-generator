/*
* generated by Xtext
*/
package net.sb.statemachine.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StmAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.tokens");
	}
}
