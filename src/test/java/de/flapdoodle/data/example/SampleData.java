package de.flapdoodle.data.example;

import de.flapdoodle.data.AbstractContainer;
import de.flapdoodle.data.Container;
import de.flapdoodle.data.Definition;
import de.flapdoodle.data.TypedMap;


public class SampleData extends AbstractContainer {

	public SampleData(TypedMap valueMap) {
		super(valueMap);
	}

	@Override
	public Definition<? extends Container> definition() {
		return SampleDataDefinition.INSTANCE;
	}
}
