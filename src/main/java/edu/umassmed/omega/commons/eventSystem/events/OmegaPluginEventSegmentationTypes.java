package edu.umassmed.omega.commons.eventSystem.events;

import java.util.List;

import edu.umassmed.omega.commons.data.trajectoryElements.OmegaSegmentationTypes;
import edu.umassmed.omega.commons.plugins.OmegaPlugin;

public class OmegaPluginEventSegmentationTypes extends OmegaPluginEvent {

	private final List<OmegaSegmentationTypes> segmTypesList;

	public OmegaPluginEventSegmentationTypes(
	        final List<OmegaSegmentationTypes> segmTypesList) {
		this(null, segmTypesList);
	}

	public OmegaPluginEventSegmentationTypes(final OmegaPlugin source,
	        final List<OmegaSegmentationTypes> segmTypesList) {
		super(source);
		this.segmTypesList = segmTypesList;
	}

	public List<OmegaSegmentationTypes> getSegmentationTypesList() {
		return this.segmTypesList;
	}
}
