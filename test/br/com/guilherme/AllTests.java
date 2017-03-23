package br.com.guilherme;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 * @author guilherme
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CompassBehavior.class,
	PlateauBehavior.class,
	RoverBehavior.class
})
public class AllTests {
}
