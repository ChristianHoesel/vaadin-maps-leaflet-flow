package software.xdev.vaadin.maps.leaflet.layer.ui;

import software.xdev.vaadin.maps.leaflet.basictypes.LPoint;


public class LPopupOptions extends LDivOverlayOptions<LPopupOptions>
{
	private Integer maxWidth;
	private Integer minWidth;
	private Boolean autoPan;
	private LPoint autoPanPaddingTopLeft;
	private LPoint autoPanPaddingBottomRight;
	private LPoint autoPanPadding;
	private Boolean keepInView;
	private Boolean closeButton;
	private Boolean autoClose;
	private Boolean closeOnEscapeKey;
	private Boolean closeOnClick;
	
	public Integer getMaxWidth()
	{
		return this.maxWidth;
	}
	
	public void setMaxWidth(final Integer maxWidth)
	{
		this.maxWidth = maxWidth;
	}
	
	public LPopupOptions withMaxWidth(final Integer maxWidth)
	{
		this.setMaxWidth(maxWidth);
		return this.self();
	}
	
	public Integer getMinWidth()
	{
		return this.minWidth;
	}
	
	public void setMinWidth(final Integer minWidth)
	{
		this.minWidth = minWidth;
	}
	
	public LPopupOptions withMinWidth(final Integer minWidth)
	{
		this.setMinWidth(minWidth);
		return this.self();
	}
	
	public Boolean getAutoPan()
	{
		return this.autoPan;
	}
	
	public void setAutoPan(final Boolean autoPan)
	{
		this.autoPan = autoPan;
	}
	
	public LPopupOptions withAutoPan(final Boolean autoPan)
	{
		this.setAutoPan(autoPan);
		return this.self();
	}
	
	public LPoint getAutoPanPaddingTopLeft()
	{
		return this.autoPanPaddingTopLeft;
	}
	
	public void setAutoPanPaddingTopLeft(final LPoint autoPanPaddingTopLeft)
	{
		this.autoPanPaddingTopLeft = autoPanPaddingTopLeft;
	}
	
	public LPopupOptions withAutoPanPaddingTopLeft(final LPoint autoPanPaddingTopLeft)
	{
		this.setAutoPanPaddingTopLeft(autoPanPaddingTopLeft);
		return this.self();
	}
	
	public LPoint getAutoPanPaddingBottomRight()
	{
		return this.autoPanPaddingBottomRight;
	}
	
	public void setAutoPanPaddingBottomRight(final LPoint autoPanPaddingBottomRight)
	{
		this.autoPanPaddingBottomRight = autoPanPaddingBottomRight;
	}
	
	public LPopupOptions withAutoPanPaddingBottomRight(final LPoint autoPanPaddingBottomRight)
	{
		this.setAutoPanPaddingBottomRight(autoPanPaddingBottomRight);
		return this.self();
	}
	
	public LPoint getAutoPanPadding()
	{
		return this.autoPanPadding;
	}
	
	public void setAutoPanPadding(final LPoint autoPanPadding)
	{
		this.autoPanPadding = autoPanPadding;
	}
	
	public LPopupOptions withAutoPanPadding(final LPoint autoPanPadding)
	{
		this.setAutoPanPadding(autoPanPadding);
		return this.self();
	}
	
	public Boolean getKeepInView()
	{
		return this.keepInView;
	}
	
	public void setKeepInView(final Boolean keepInView)
	{
		this.keepInView = keepInView;
	}
	
	public LPopupOptions withKeepInView(final Boolean keepInView)
	{
		this.setKeepInView(keepInView);
		return this.self();
	}
	
	public Boolean getCloseButton()
	{
		return this.closeButton;
	}
	
	public void setCloseButton(final Boolean closeButton)
	{
		this.closeButton = closeButton;
	}
	
	public LPopupOptions withCloseButton(final Boolean closeButton)
	{
		this.setCloseButton(closeButton);
		return this.self();
	}
	
	public Boolean getAutoClose()
	{
		return this.autoClose;
	}
	
	public void setAutoClose(final Boolean autoClose)
	{
		this.autoClose = autoClose;
	}
	
	public LPopupOptions withAutoClose(final Boolean autoClose)
	{
		this.setAutoClose(autoClose);
		return this.self();
	}
	
	public Boolean getCloseOnEscapeKey()
	{
		return this.closeOnEscapeKey;
	}
	
	public void setCloseOnEscapeKey(final Boolean closeOnEscapeKey)
	{
		this.closeOnEscapeKey = closeOnEscapeKey;
	}
	
	public LPopupOptions withCloseOnEscapeKey(final Boolean closeOnEscapeKey)
	{
		this.setCloseOnEscapeKey(closeOnEscapeKey);
		return this.self();
	}
	
	public Boolean getCloseOnClick()
	{
		return this.closeOnClick;
	}
	
	public void setCloseOnClick(final Boolean closeOnClick)
	{
		this.closeOnClick = closeOnClick;
	}
	
	public LPopupOptions withCloseOnClick(final Boolean closeOnClick)
	{
		this.setCloseOnClick(closeOnClick);
		return this.self();
	}
}
