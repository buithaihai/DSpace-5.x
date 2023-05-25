/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */

package org.dspace.discovery.configuration;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A configuration to support (and later, replace) DSpace's Browse feature
 */
public class DiscoveryBrowseConfiguration {

    private List<String> browseIndices;

    private Map<String, DiscoverySortFieldConfiguration> browseSortOptions;

    public DiscoveryBrowseConfiguration() {

    }

    public List<String> getBrowseIndices() {
        return browseIndices;
    }

    public void setBrowseIndices(List<String> browseIndices) {
        this.browseIndices = browseIndices;
    }

    public Map<String, DiscoverySortFieldConfiguration> getBrowseSortOptions() {
        return browseSortOptions;
    }

    public void setBrowseSortOptions(Map<String, DiscoverySortFieldConfiguration> browseSortOptions) {
        this.browseSortOptions = browseSortOptions;
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder(3, 19)
                .append(this.getBrowseIndices())
                .append(this.getBrowseSortOptions())
                .toHashCode();
    }
}
