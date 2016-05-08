
package com.aiss.omnidrive.shared.dropbox.files;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "entries",
    "cursor",
    "has_more"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class DropboxFilesList implements Serializable {

    @JsonProperty("entries")
    private List<DropboxFile> entries = new ArrayList<DropboxFile>();
    @JsonProperty("cursor")
    private String cursor;
    @JsonProperty("has_more")
    private Boolean hasMore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The entries
     */
    @JsonProperty("entries")
    public List<DropboxFile> getEntries() {
        return entries;
    }

    /**
     * 
     * @param entries
     *     The entries
     */
    @JsonProperty("entries")
    public void setEntries(List<DropboxFile> entries) {
        this.entries = entries;
    }

    /**
     * 
     * @return
     *     The cursor
     */
    @JsonProperty("cursor")
    public String getCursor() {
        return cursor;
    }

    /**
     * 
     * @param cursor
     *     The cursor
     */
    @JsonProperty("cursor")
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    /**
     * 
     * @return
     *     The hasMore
     */
    @JsonProperty("has_more")
    public Boolean getHasMore() {
        return hasMore;
    }

    /**
     * 
     * @param hasMore
     *     The has_more
     */
    @JsonProperty("has_more")
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    
    public void clearAdditionalProperties(){
    	this.additionalProperties.clear();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
