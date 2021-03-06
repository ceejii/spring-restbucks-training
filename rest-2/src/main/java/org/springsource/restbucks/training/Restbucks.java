/*
 * Copyright 2013 the original author or authors.
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
package org.springsource.restbucks.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.SpringBootServletInitializer;

/**
 * Central application class containing both general application and web configuration as well as a main-method to
 * bootstrap the app using Spring Boot.
 * 
 * @see #main(String[])
 * @see SpringApplication
 * @author Oliver Gierke
 */
public class Restbucks extends SpringBootServletInitializer {

	public static String CURIE_NAMESPACE = "restbucks";

	/**
	 * Bootstraps the application in standalone mode (i.e. java -jar).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebConfiguration.class, args);
	}

	/**
	 * Allows the application to be started when being deployed into a Servlet 3 container.
	 * 
	 * @see org.springframework.boot.web.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebConfiguration.class);
	}
}
