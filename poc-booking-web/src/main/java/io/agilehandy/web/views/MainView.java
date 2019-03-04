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


package io.agilehandy.web.views;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author Haytham Mohamed
 **/

@Route
@StyleSheet("frontend://styles/styles.css")
public class MainView extends VerticalLayout {

	public MainView() {
		setDefaultHorizontalComponentAlignment(Alignment.CENTER);
		setSizeFull();
		addClassName("main-layout");

		H1 header = new H1("OOCL Shipping Application");
		header.getElement().getThemeList().add("dark");

		add(header);
	}

}
