package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.GarageDoor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 02:01
 */
class GarageDoorCloseCommandImplTest {
	private final Command command = GarageDoorCloseCommandImpl.builder()
		.garageDoor(GarageDoor.builder().build())
		.build();

	@Test
	void testGarageDoorCloseCommand() {
		assertThat(command.execute()).isEqualTo("Close garage door");
	}
}
