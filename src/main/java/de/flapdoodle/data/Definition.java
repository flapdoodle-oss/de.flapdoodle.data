package de.flapdoodle.data;

import com.google.common.collect.ImmutableList;


public interface Definition<C extends Container> {

	ImmutableList<? extends Property<?>> properties();
	
	Builder<C> builder();
}
