/*
 * Copyright © 2019 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package software.xdev.vaadin.maps.leaflet.basictypes;

import software.xdev.vaadin.maps.leaflet.base.LBaseComponent;
import software.xdev.vaadin.maps.leaflet.registry.LComponentManagementRegistry;


/**
 * @see <a href="https://leafletjs.com/reference.html#icon">Leaflet docs</a>
 */
public class LIcon extends LBaseComponent<LIcon>
{
	protected LIcon(
		final LComponentManagementRegistry compReg,
		final String jsCreate,
		final LAbstractIconOptions<?> options)
	{
		super(compReg, jsCreate + "(" + compReg.writeOptions(options) + ")");
	}
	
	public LIcon(
		final LComponentManagementRegistry compReg,
		final LIconOptions options)
	{
		this(compReg, "L.icon", options);
	}
}
