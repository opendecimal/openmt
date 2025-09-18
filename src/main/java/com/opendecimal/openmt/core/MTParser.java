package com.opendecimal.openmt.core;

import java.io.Closeable;
import java.io.IOException;

public abstract class MTParser implements Closeable, Versioned {

    @Override
    public abstract Version version();

    @Override
    public abstract void close() throws IOException;
}
