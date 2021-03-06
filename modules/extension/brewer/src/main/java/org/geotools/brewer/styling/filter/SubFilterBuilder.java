package org.geotools.brewer.styling.filter;

public class SubFilterBuilder<P> extends FilterBuilder {
    P parent;

    public SubFilterBuilder(P parent) {
        this.parent = parent;
    }

    P end() {
        return parent;
    }
}
