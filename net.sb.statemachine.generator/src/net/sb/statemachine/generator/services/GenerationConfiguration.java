package net.sb.statemachine.generator.services;

public class GenerationConfiguration {

	private boolean generateAbstractStateMachine_ = true;
	private boolean generateUtils_ = true;
	private boolean generateAdapter_ = true;
	private String implementationSuffix_ = "impl";

	public String getImplementationSuffix() {
		return implementationSuffix_;
	}

	public void setImplementationSuffix(String implementationSuffix) {
		implementationSuffix_ = implementationSuffix;
	}

	public boolean isGenerateUtils() {
		return generateUtils_;
	}

	public void setGenerateUtils(boolean generateUtils) {
		generateUtils_ = generateUtils;
	}

	public boolean isGenerateAdapter() {
		return generateAdapter_;
	}

	public void setGenerateAdapter(boolean generateAdapter) {
		generateAdapter_ = generateAdapter;
	}

	public boolean isGenerateAbstractStateMachine() {
		return generateAbstractStateMachine_;
	}

	public void setGenerateAbstractStateMachine(boolean generateAbstractStateMachine) {
		generateAbstractStateMachine_ = generateAbstractStateMachine;
	}

}
