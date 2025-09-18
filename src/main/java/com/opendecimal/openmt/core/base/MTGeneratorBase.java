package com.opendecimal.openmt.core.base;

import com.opendecimal.openmt.core.MTGenerator;
import com.opendecimal.openmt.core.PackageVersion;
import com.opendecimal.openmt.core.Version;

import java.io.IOException;

public abstract class MTGeneratorBase extends MTGenerator {

    protected boolean closed;

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override
    public void close() throws IOException {
        if (!closed) {
            closed = true;
        }
    }

    @Override
    public void flush() {
    }
}
