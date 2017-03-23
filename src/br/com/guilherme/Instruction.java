package br.com.guilherme;
/**
 * 
 * @author guilherme
 *
 */
public interface Instruction {
	void bind(Rover rover);
	void execute();
}
