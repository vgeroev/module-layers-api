package com.infomaximum.modulelayers.api;

import com.infomaximum.modulelayers.api.initializer.ModuleLayersServiceInitializer;

public class ModuleLayersServiceHolder {

    private ModuleLayersServiceHolder() { }

    public static ModuleLayersService get() {
        return ModuleLayersServiceInitializer.get();
    }
}
