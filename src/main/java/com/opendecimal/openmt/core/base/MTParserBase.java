package com.opendecimal.openmt.core.base;

import com.opendecimal.openmt.core.MTParser;
import com.opendecimal.openmt.core.PackageVersion;
import com.opendecimal.openmt.core.Version;

import java.io.IOException;

public abstract class MTParserBase extends MTParser {

    protected boolean closed;

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override
    public void close() throws IOException {
        if (!closed) {
            closed = true;
            closeInput();
        }
    }

    public boolean isClosed() { return closed; }

    public abstract void closeInput() throws IOException;
}
