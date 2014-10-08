package de.flapdoodle.data;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;


public abstract class Builder<T> {

	MutableTypedMap map=new MutableTypedMapImpl();
	
	public <X> Builder<T> set(Property<X> key, X value) {
		X oldValue = map.set(key, value);
		Preconditions.checkNotNull(oldValue,"setting property %s to %s failed. already set to %s",key,value,oldValue);
		return this;
	}
	
	protected TypedMap map() {
		return map.asImmutable();
	}
	
	public abstract T build();
	
	
}
