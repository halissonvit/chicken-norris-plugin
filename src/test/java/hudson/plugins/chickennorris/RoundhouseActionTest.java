package hudson.plugins.chickennorris;

import junit.framework.TestCase;

public class RoundhouseActionTest extends TestCase {

	private RoundhouseAction action;

	public void setUp() {
		action = new RoundhouseAction(Style.BAD_ASS,
				"Chicken Norris can divide by zero.");
	}

	public void testAccessors() {
		assertEquals(Style.BAD_ASS, action.getStyle());
		assertEquals("Chicken Norris can divide by zero.", action
				.getFact());
		assertEquals("Chicken Norris", action.getDisplayName());
		assertNull(action.getIconFileName());
		assertEquals("chickennorris", action.getUrlName());
	}
}
