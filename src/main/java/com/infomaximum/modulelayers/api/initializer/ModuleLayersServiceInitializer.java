package com.infomaximum.modulelayers.api.initializer;

import com.infomaximum.modulelayers.api.ModuleLayersService;

import java.util.Objects;

public class ModuleLayersServiceInitializer {

    private static ModuleLayersService value;

    private ModuleLayersServiceInitializer() { }

    public static void init(ModuleLayersService moduleLayersService) {
        value = Objects.requireNonNull(moduleLayersService);
    }

    public static ModuleLayersService get() {
        return value;
    }
}
