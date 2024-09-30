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
package software.xdev.vaadin.maps.leaflet.layer.other;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import software.xdev.vaadin.maps.leaflet.layer.LAbstractLayerGroup;
import software.xdev.vaadin.maps.leaflet.layer.LLayer;
import software.xdev.vaadin.maps.leaflet.layer.LLayerOptions;
import software.xdev.vaadin.maps.leaflet.registry.LComponentManagementRegistry;


/**
 * @see <a href="https://leafletjs.com/reference.html#featuregroup">Leaflet docs</a>
 */
public class LFeatureGroup extends LAbstractLayerGroup<LFeatureGroup>
{
	public LFeatureGroup(
		final LComponentManagementRegistry compReg,
		final LLayer<?>[] layers,
		final LLayerOptions<?>[] options)
	{
		super(
			compReg,
			"L.featureGroup("
				+ (layers != null
				? "[" + Stream.of(layers)
				.map(LLayer::clientComponentJsAccessor)
				.collect(Collectors.joining(",")) + "]"
				: "")
				+ (options != null
				? ", [" + Stream.of(options)
				.map(compReg::writeOptionsOrEmptyObject)
				.collect(Collectors.joining(",")) + "]"
				: "")
				+ ")");
	}
	
	public LFeatureGroup(
		final LComponentManagementRegistry compReg,
		final LLayer<?>... layers)
	{
		this(compReg, layers, null);
	}
}
