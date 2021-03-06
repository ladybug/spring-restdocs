/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.restdocs.restassured3.operation.preprocess;

import org.springframework.restdocs.operation.Operation;
import org.springframework.restdocs.operation.OperationRequest;
import org.springframework.restdocs.operation.OperationResponse;
import org.springframework.restdocs.operation.preprocess.Preprocessors;
import org.springframework.restdocs.operation.preprocess.UriModifyingOperationPreprocessor;

/**
 * Static factory methods for creating
 * {@link org.springframework.restdocs.operation.preprocess.OperationPreprocessor
 * OperationPreprocessors} for use with REST Assured 3. They can be applied to an
 * {@link Operation Operation's} {@link OperationRequest request} or
 * {@link OperationResponse response} before it is documented.
 *
 * @author Andy Wilkinson
 * @since 1.1.0
 * @deprecated since 2.0.1 in favor of {@link Preprocessors} and, specifically,
 * {@link Preprocessors#modifyUris()}
 */
@Deprecated
public abstract class RestAssuredPreprocessors {

	private RestAssuredPreprocessors() {

	}

	/**
	 * Returns a {@code UriModifyingOperationPreprocessor} that will modify URIs in the
	 * request or response by changing one or more of their host, scheme, and port.
	 * @return the preprocessor
	 * @deprecated since 2.0.1 in favor of {@link Preprocessors#modifyUris()}
	 */
	@Deprecated
	public static UriModifyingOperationPreprocessor modifyUris() {
		return new UriModifyingOperationPreprocessor();
	}

}
