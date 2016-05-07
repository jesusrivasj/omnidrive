
package com.aiss.omnidrive.shared.dropbox.user;

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
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "shared",
    "quota",
    "normal"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class DropboxQuotaInfo implements Serializable {

    @JsonProperty("shared")
    private String shared;
    @JsonProperty("quota")
    private String quota;
    @JsonProperty("normal")
    private String normal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The shared
     */
    @JsonProperty("shared")
    public String getShared() {
        return shared;
    }

    /**
     * 
     * @param shared
     *     The shared
     */
    @JsonProperty("shared")
    @JsonDeserialize(contentAs=String.class)
    public void setShared(String shared) {
        this.shared = shared;
    }

    /**
     * 
     * @return
     *     The quota
     */
    @JsonProperty("quota")
    @JsonDeserialize(contentAs=String.class)
    public String getQuota() {
        return quota;
    }

    /**
     * 
     * @param quota
     *     The quota
     */
    @JsonProperty("quota")
    @JsonDeserialize(contentAs=String.class)
    public void setQuota(String quota) {
        this.quota = quota;
    }

    /**
     * 
     * @return
     *     The normal
     */
    @JsonProperty("normal")
    public String getNormal() {
        return normal;
    }

    /**
     * 
     * @param normal
     *     The normal
     */
    @JsonProperty("normal")
    public void setNormal(String normal) {
        this.normal = normal;
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
