package com.infomaximum.modulelayers.api;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public interface ModuleLayersService {

    void addLayer(String id, Set<String> parentIds) throws IOException;

    void removeLayer(String layerId) throws IOException;

    void restart(Path configPath, Path layersPath, Runnable appStopper) throws IOException;

    List<ModuleLayer> getModuleLayers();
}
