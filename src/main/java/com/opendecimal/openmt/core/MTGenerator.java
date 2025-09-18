package com.opendecimal.openmt.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class MTGenerator implements Closeable, Flushable, Versioned {

    @Override
    public abstract Version version();

    @Override
    public abstract void close();

    @Override
    public abstract void flush();
}
