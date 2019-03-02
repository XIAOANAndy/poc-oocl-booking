/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.agilehandy.common.api.bookings;

import io.agilehandy.common.api.BaseCommand;
import io.agilehandy.common.api.ParentCommand;
import io.agilehandy.common.api.model.Location;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Haytham Mohamed
 **/
@Data
public class BookingCreateCommand extends ParentCommand implements BaseCommand, Serializable {

	UUID customerId;
	Location origin;
	Location destination;
	LocalDateTime cutOffDate;

	@Data
	public static class Builder {

		private BookingCreateCommand commandToBuild;

		public Builder() {
			commandToBuild = new BookingCreateCommand();
		}

		public BookingCreateCommand build() {
			BookingCreateCommand commandBuilt = commandToBuild;
			commandToBuild = new BookingCreateCommand();
			return commandBuilt;
		}

		public Builder setCustomerId(UUID customerId) {
			commandToBuild.setCustomerId(customerId);
			return this;
		}

		public Builder setOrigin(Location origin) {
			commandToBuild.setOrigin(origin);
			return this;
		}

		public Builder setDestination(Location destination) {
			commandToBuild.setDestination(destination);
			return this;
		}

		public Builder setCutOffDate(LocalDateTime cutoffDate) {
			commandToBuild.setCutOffDate(cutoffDate);
			return this;
		}
	}

}
