package de.flapdoodle.data.example;

import static org.junit.Assert.*;

import org.junit.Test;

import de.flapdoodle.data.Builder;


public class TestSampleData {

	@Test
	public void createInstance() {
		
		Builder<SampleData> builder = SampleDataDefinition.INSTANCE.builder();
		
		SampleData sampleData = builder.build();
		
		assertNotNull(sampleData);
	}
}
