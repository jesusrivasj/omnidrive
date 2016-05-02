
package com.aiss.omnidrive.shared.drive.files;

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
    "kind",
    "displayName",
    "me",
    "permissionId",
    "emailAddress"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class DriveOwner implements Serializable {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("me")
    private Boolean me;
    @JsonProperty("permissionId")
    private String permissionId;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The me
     */
    @JsonProperty("me")
    public Boolean getMe() {
        return me;
    }

    /**
     * 
     * @param me
     *     The me
     */
    @JsonProperty("me")
    public void setMe(Boolean me) {
        this.me = me;
    }

    /**
     * 
     * @return
     *     The permissionId
     */
    @JsonProperty("permissionId")
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 
     * @param permissionId
     *     The permissionId
     */
    @JsonProperty("permissionId")
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 
     * @return
     *     The emailAddress
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The emailAddress
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
