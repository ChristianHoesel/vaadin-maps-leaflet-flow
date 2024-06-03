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
package software.xdev.vaadin.maps.leaflet.map;

import software.xdev.vaadin.maps.leaflet.basictypes.LPoint;


/**
 * @see <a href="https://leafletjs.com/reference.html#fitbounds-options-option">Leaflet docs</a>
 */
public class LMapFitBoundOptions
	implements
	LMapZoomBaseOptions<LMapFitBoundOptions>,
	LMapPanBaseOptions<LMapFitBoundOptions>,
	LMapPaddingBaseOptions<LMapFitBoundOptions>
{
	private Boolean animate;
	private Double duration;
	private Double easeLinearity;
	private Boolean noMoveStart;
	
	private LPoint paddingTopLeft;
	private LPoint paddingBottomRight;
	private LPoint padding;
	
	private Integer maxZoom;
	
	@Override
	public Boolean getAnimate()
	{
		return this.animate;
	}
	
	@Override
	public void setAnimate(final Boolean animate)
	{
		this.animate = animate;
	}
	
	@Override
	public LMapFitBoundOptions withAnimate(final Boolean animate)
	{
		return LMapZoomBaseOptions.super.withAnimate(animate);
	}
	
	@Override
	public Double getDuration()
	{
		return this.duration;
	}
	
	@Override
	public void setDuration(final Double duration)
	{
		this.duration = duration;
	}
	
	@Override
	public Double getEaseLinearity()
	{
		return this.easeLinearity;
	}
	
	@Override
	public void setEaseLinearity(final Double easeLinearity)
	{
		this.easeLinearity = easeLinearity;
	}
	
	@Override
	public Boolean getNoMoveStart()
	{
		return this.noMoveStart;
	}
	
	@Override
	public void setNoMoveStart(final Boolean noMoveStart)
	{
		this.noMoveStart = noMoveStart;
	}
	
	@Override
	public LPoint getPaddingTopLeft()
	{
		return this.paddingTopLeft;
	}
	
	@Override
	public void setPaddingTopLeft(final LPoint paddingTopLeft)
	{
		this.paddingTopLeft = paddingTopLeft;
	}
	
	@Override
	public LPoint getPaddingBottomRight()
	{
		return this.paddingBottomRight;
	}
	
	@Override
	public void setPaddingBottomRight(final LPoint paddingBottomRight)
	{
		this.paddingBottomRight = paddingBottomRight;
	}
	
	@Override
	public LPoint getPadding()
	{
		return this.padding;
	}
	
	@Override
	public void setPadding(final LPoint padding)
	{
		this.padding = padding;
	}
	
	public Integer getMaxZoom()
	{
		return this.maxZoom;
	}
	
	public void setMaxZoom(final Integer maxZoom)
	{
		this.maxZoom = maxZoom;
	}
	
	public LMapFitBoundOptions withMaxZoom(final Integer maxZoom)
	{
		this.setMaxZoom(maxZoom);
		return this.self();
	}
}
