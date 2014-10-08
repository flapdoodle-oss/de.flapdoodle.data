package de.flapdoodle.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDataset {

	static final Property<String> FOO = Property.named("foo", String.class);
	
	@Test
	public void thatPutAndGetBasicallyWorks() {
		Dataset ds = Dataset.EMPTY;
		ds = ds.put(FOO, "bar");
		
		assertEquals("bar", ds.get(FOO));
	}
}
