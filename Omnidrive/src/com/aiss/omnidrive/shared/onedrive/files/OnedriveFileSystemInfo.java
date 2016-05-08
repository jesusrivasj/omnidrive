
package com.aiss.omnidrive.shared.onedrive.files;

import java.io.Serializable;
import java.util.HashMap;
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
    "createdDateTime",
    "lastModifiedDateTime"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class OnedriveFileSystemInfo implements Serializable {

    @JsonProperty("createdDateTime")
    private String createdDateTime;
    @JsonProperty("lastModifiedDateTime")
    private String lastModifiedDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The createdDateTime
     */
    @JsonProperty("createdDateTime")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * 
     * @param createdDateTime
     *     The createdDateTime
     */
    @JsonProperty("createdDateTime")
    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * 
     * @return
     *     The lastModifiedDateTime
     */
    @JsonProperty("lastModifiedDateTime")
    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * 
     * @param lastModifiedDateTime
     *     The lastModifiedDateTime
     */
    @JsonProperty("lastModifiedDateTime")
    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
