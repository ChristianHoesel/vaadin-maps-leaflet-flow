package software.xdev.vaadin.maps.leaflet.layer;

import java.io.Serializable;

import software.xdev.vaadin.maps.leaflet.base.has.LHasBringTo;
import software.xdev.vaadin.maps.leaflet.base.has.LHasOpacity;
import software.xdev.vaadin.maps.leaflet.base.has.LHasRedraw;
import software.xdev.vaadin.maps.leaflet.base.has.LHasSetZIndex;
import software.xdev.vaadin.maps.leaflet.registry.LComponentManagementRegistry;


/**
 * @see <a href="https://leafletjs.com/reference.html#gridlayer">Leaflet docs</a>
 */
public abstract class LGridLayer<S extends LGridLayer<S>> extends LLayer<S>
	implements LHasBringTo<S>, LHasOpacity<S>, LHasRedraw<S>, LHasSetZIndex<S>
{
	protected LGridLayer(
		final LComponentManagementRegistry compReg,
		final String jsConstructorCallExpression,
		final Serializable... parameters)
	{
		super(compReg, jsConstructorCallExpression, parameters);
	}
}
