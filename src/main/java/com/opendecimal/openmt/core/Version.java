package com.opendecimal.openmt.core;

import java.util.Objects;

public class Version
        implements Comparable<Version>, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private final static Version UNKNOWN_VERSION = new Version(0, 0);

    protected final int majorVersion;

    protected final int minorVersion;

    /**
     * Additional information for snapshot versions; null for non-snapshot
     * (release) versions.
     */
    protected final String _snapshotInfo;

    public Version(int major, int minor, String snapshotInfo) {
        majorVersion = major;
        minorVersion = minor;
        _snapshotInfo = snapshotInfo;
    }

    public Version(int major, int minor) {
        this(major, minor, null);
    }

    public static Version unknownVersion() {
        return UNKNOWN_VERSION;
    }

    public boolean isUnknownVersion() {
        return (this == UNKNOWN_VERSION);
    }

    public boolean isSnapshot() {
        return (_snapshotInfo != null) && !_snapshotInfo.isEmpty();
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(majorVersion).append('.');
        sb.append(minorVersion).append('.');
        if (isSnapshot()) {
            sb.append('-').append(_snapshotInfo);
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(_snapshotInfo)
                + majorVersion - minorVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() != getClass()) return false;
        Version other = (Version) o;
        return (other.majorVersion == majorVersion)
                && (other.minorVersion == minorVersion)
                && Objects.equals(other._snapshotInfo, _snapshotInfo);
    }

    @Override
    public int compareTo(Version other) {
        int diff = 0;
        if (other == this) return diff;
        if (diff == 0) {
            diff = majorVersion - other.majorVersion;
            if (diff == 0) {
                diff = minorVersion - other.minorVersion;
                if (diff == 0) {
                    // Snapshot: non-snapshot AFTER snapshot, otherwise alphabetical
                    if (isSnapshot()) {
                        if (other.isSnapshot()) {
                            diff = _snapshotInfo.compareTo(other._snapshotInfo);
                        } else {
                            diff = -1;
                        }
                    } else if (other.isSnapshot()) {
                        diff = 1;
                    } else {
                        diff = 0;
                    }
                }
            }
        }
        return diff;
    }
}
