package com.sap.hana.cloud.samples.jenkins.common;

/*
 * #%L
 * SAP HANA Cloud Platform Samples - Cloud Jenkins
 * %%
 * Copyright (C) 2013 SAP AG
 * %%
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
 * #L%
 */

import java.io.InputStream;

import com.sap.hana.cloud.samples.jenkins.storage.Storage;

public interface ConfigurationProvider {

    /**
     * @return the bytes of an zip archive containing the configuration files.
     */
    InputStream getConfigurationStream();

    Storage getStorage();
}
