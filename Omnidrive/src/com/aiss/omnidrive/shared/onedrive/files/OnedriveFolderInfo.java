
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
    "childCount"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class OnedriveFolderInfo implements Serializable {

    @JsonProperty("childCount")
    private Long childCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The childCount
     */
    @JsonProperty("childCount")
    public Long getChildCount() {
        return childCount;
    }

    /**
     * 
     * @param childCount
     *     The childCount
     */
    @JsonProperty("childCount")
    public void setChildCount(Long childCount) {
        this.childCount = childCount;
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