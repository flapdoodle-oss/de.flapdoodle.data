package de.flapdoodle.data;

import java.util.Collection;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;


public abstract class AbstractDefinition<C extends Container> implements Definition<C> {

	private ImmutableList<Property<?>> properties;

	protected AbstractDefinition(Property<?> property, Property<?> properties) {
		this.properties = ImmutableList.<Property<?>>builder()
				.add(Preconditions.checkNotNull(property,"property is null"))
				.add(Preconditions.checkNotNull(properties,"properties is null"))
				.build();
		
//		FluentIterable.from(this.properties).
		
		Collection<String> names = Collections2.transform(this.properties, Property.asName);
		Set<String> asSet = Sets.newHashSet(names);
		
		Preconditions.checkNotNull(names.size()==asSet.size(),"name collision: %s",names);
	}
	
	@Override
	public ImmutableList<? extends Property<?>> properties() {
		return properties;
	}
}
