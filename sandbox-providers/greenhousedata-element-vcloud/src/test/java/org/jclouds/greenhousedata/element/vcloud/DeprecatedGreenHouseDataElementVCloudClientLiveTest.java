/**
 *
 * Copyright (C) 2011 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package org.jclouds.greenhousedata.element.vcloud;

import org.jclouds.vcloud.DeprecatedVCloudClientLiveTest;
import org.testng.annotations.Test;

/**
 * 
 * @author Adrian Cole
 */
@Deprecated
@Test(groups = "live", singleThreaded = true, testName = "DeprecatedGreenHouseDataElementVCloudClientLiveTest")
public class DeprecatedGreenHouseDataElementVCloudClientLiveTest extends DeprecatedVCloudClientLiveTest {
   public DeprecatedGreenHouseDataElementVCloudClientLiveTest() {
      provider = "greenhousedata-element-vcloud";
   }

}
