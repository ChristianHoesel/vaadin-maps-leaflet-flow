package software.xdev.vaadin.maps.leaflet.layer.raster;

import software.xdev.vaadin.maps.leaflet.layer.LAbstractImageOverlayOptions;


/**
 * @see <a href="https://leafletjs.com/reference.html#videooverlay">Leaflet docs</a>
 */
public class LVideoOverlayOptions extends LAbstractImageOverlayOptions<LVideoOverlayOptions>
{
	private Boolean autoplay;
	private Boolean loop;
	private Boolean keepAspectRatio;
	private Boolean muted;
	private Boolean playsInline;
	
	public Boolean getAutoplay()
	{
		return this.autoplay;
	}
	
	public void setAutoplay(final Boolean autoplay)
	{
		this.autoplay = autoplay;
	}
	
	public LVideoOverlayOptions withAutoplay(final Boolean autoplay)
	{
		this.setAutoplay(autoplay);
		return this.self();
	}
	
	public Boolean getLoop()
	{
		return this.loop;
	}
	
	public void setLoop(final Boolean loop)
	{
		this.loop = loop;
	}
	
	public LVideoOverlayOptions withLoop(final Boolean loop)
	{
		this.setLoop(loop);
		return this.self();
	}
	
	public Boolean getKeepAspectRatio()
	{
		return this.keepAspectRatio;
	}
	
	public void setKeepAspectRatio(final Boolean keepAspectRatio)
	{
		this.keepAspectRatio = keepAspectRatio;
	}
	
	public LVideoOverlayOptions withKeepAspectRatio(final Boolean keepAspectRatio)
	{
		this.setKeepAspectRatio(keepAspectRatio);
		return this.self();
	}
	
	public Boolean getMuted()
	{
		return this.muted;
	}
	
	public void setMuted(final Boolean muted)
	{
		this.muted = muted;
	}
	
	public LVideoOverlayOptions withMuted(final Boolean muted)
	{
		this.setMuted(muted);
		return this.self();
	}
	
	public Boolean getPlaysInline()
	{
		return this.playsInline;
	}
	
	public void setPlaysInline(final Boolean playsInline)
	{
		this.playsInline = playsInline;
	}
	
	public LVideoOverlayOptions withPlaysInline(final Boolean playsInline)
	{
		this.setPlaysInline(playsInline);
		return this.self();
	}
}
