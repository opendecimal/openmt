package com.opendecimal.openmt.core;

public class PackageVersion implements Versioned {
    public final static Version VERSION = new Version(1, 0, "-");

    @Override
    public Version version() {
        return VERSION;
    }
}
