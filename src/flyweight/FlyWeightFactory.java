package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

	private Map<Character, FlyWeight> files = new HashMap<Character, FlyWeight>();

	public FlyWeight factory(Character state) {

		FlyWeight file = files.get(state);
		if( file == null ) {
			file = new ConcreteFlyWeight(state);
			files.put(state, file);
		}
		return file;
	}

}
