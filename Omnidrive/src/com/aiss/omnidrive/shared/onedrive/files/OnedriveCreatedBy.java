
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
    "application",
    "user",
    "oneDriveSync"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class OnedriveCreatedBy implements Serializable {

    @JsonProperty("application")
    private OnedriveApplication application;
    @JsonProperty("user")
    private OnedriveUser user;
    @JsonProperty("oneDriveSync")
    private OneDriveSync oneDriveSync;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The application
     */
    @JsonProperty("application")
    public OnedriveApplication getApplication() {
        return application;
    }

    /**
     * 
     * @param application
     *     The application
     */
    @JsonProperty("application")
    public void setApplication(OnedriveApplication application) {
        this.application = application;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public OnedriveUser getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(OnedriveUser user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The oneDriveSync
     */
    @JsonProperty("oneDriveSync")
    public OneDriveSync getOneDriveSync() {
        return oneDriveSync;
    }

    /**
     * 
     * @param oneDriveSync
     *     The oneDriveSync
     */
    @JsonProperty("oneDriveSync")
    public void setOneDriveSync(OneDriveSync oneDriveSync) {
        this.oneDriveSync = oneDriveSync;
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
