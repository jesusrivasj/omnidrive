
package com.aiss.omnidrive.shared;

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
    "access_token",
    "token_type",
    "expires_in",
    "refresh_token",
    "error",
    "error_description"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class OAuthToken implements Serializable{

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private Integer expiresIn;
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("error")
    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The accessToken
     */
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 
     * @param accessToken
     *     The access_token
     */
    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 
     * @return
     *     The tokenType
     */
    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    /**
     * 
     * @param tokenType
     *     The token_type
     */
    @JsonProperty("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * 
     * @return
     *     The expiresIn
     */
    @JsonProperty("expires_in")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * 
     * @param expiresIn
     *     The expires_in
     */
    @JsonProperty("expires_in")
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * 
     * @return
     *     The refreshToken
     */
    @JsonProperty("refresh_token")
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 
     * @param refreshToken
     *     The refresh_token
     */
    @JsonProperty("refresh_token")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 
     * @return
     *     The error
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * 
     * @return
     *     The errorDescription
     */
    @JsonProperty("error_description")
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * 
     * @param errorDescription
     *     The error_description
     */
    @JsonProperty("error_description")
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    public Boolean isCorrect(){
    	Boolean isCorrect;
    	
    	isCorrect = (this.getError() == null);
    	
    	return isCorrect;
    }

}
