package dev.sithuhtet.runnerz.run;

import java.time.LocalDateTime;

public record Run(
		Integer Id,
		String title,
		LocalDateTime startedOn,
		String completedOn,
		Integer miles,
		Location location) {

}
