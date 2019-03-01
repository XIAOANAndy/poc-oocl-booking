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


package io.agilehandy.common.api;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Haytham Mohamed
 **/
@Data
public class ParentCommand implements Serializable, BaseCommand {

	private UUID subjectId;
	private LocalDateTime commandTimestamp;
	private String Type;

	public ParentCommand() {}

	public ParentCommand(UUID id, LocalDateTime ts) {
		this.subjectId = subjectId;
		this.commandTimestamp = ts;
	}
}
