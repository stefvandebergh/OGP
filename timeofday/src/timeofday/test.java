package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test1() {
		TimeOfDay tijd1 = new TimeOfDay(1,49);
		assertEquals(tijd1.getMinuten(),49 );
		assert tijd1.getUren() == 1;
	}
	@Test
	void test2() {
		TimeOfDay tijd2 = new TimeOfDay(1,2);
		tijd2.setMinuten(60);
	}
	@Test
	void test3() {
		TimeOfDay tijd2 = new TimeOfDay(1,2);
		tijd2.setUren(24);
	}
}

