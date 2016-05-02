
package com.aiss.omnidrive.shared.drive.user;

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
    "application/vnd.google-apps.form",
    "application/vnd.google-apps.document",
    "application/vnd.google-apps.drawing",
    "application/vnd.google-apps.spreadsheet",
    "application/vnd.google-apps.script",
    "application/vnd.google-apps.presentation"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class DriveExportFormats implements Serializable {

    @JsonProperty("application/vnd.google-apps.form")
    private List<String> applicationVndGoogleAppsForm = new ArrayList<String>();
    @JsonProperty("application/vnd.google-apps.document")
    private List<String> applicationVndGoogleAppsDocument = new ArrayList<String>();
    @JsonProperty("application/vnd.google-apps.drawing")
    private List<String> applicationVndGoogleAppsDrawing = new ArrayList<String>();
    @JsonProperty("application/vnd.google-apps.spreadsheet")
    private List<String> applicationVndGoogleAppsSpreadsheet = new ArrayList<String>();
    @JsonProperty("application/vnd.google-apps.script")
    private List<String> applicationVndGoogleAppsScript = new ArrayList<String>();
    @JsonProperty("application/vnd.google-apps.presentation")
    private List<String> applicationVndGoogleAppsPresentation = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsForm
     */
    @JsonProperty("application/vnd.google-apps.form")
    public List<String> getApplicationVndGoogleAppsForm() {
        return applicationVndGoogleAppsForm;
    }

    /**
     * 
     * @param applicationVndGoogleAppsForm
     *     The application/vnd.google-apps.form
     */
    @JsonProperty("application/vnd.google-apps.form")
    public void setApplicationVndGoogleAppsForm(List<String> applicationVndGoogleAppsForm) {
        this.applicationVndGoogleAppsForm = applicationVndGoogleAppsForm;
    }

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsDocument
     */
    @JsonProperty("application/vnd.google-apps.document")
    public List<String> getApplicationVndGoogleAppsDocument() {
        return applicationVndGoogleAppsDocument;
    }

    /**
     * 
     * @param applicationVndGoogleAppsDocument
     *     The application/vnd.google-apps.document
     */
    @JsonProperty("application/vnd.google-apps.document")
    public void setApplicationVndGoogleAppsDocument(List<String> applicationVndGoogleAppsDocument) {
        this.applicationVndGoogleAppsDocument = applicationVndGoogleAppsDocument;
    }

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsDrawing
     */
    @JsonProperty("application/vnd.google-apps.drawing")
    public List<String> getApplicationVndGoogleAppsDrawing() {
        return applicationVndGoogleAppsDrawing;
    }

    /**
     * 
     * @param applicationVndGoogleAppsDrawing
     *     The application/vnd.google-apps.drawing
     */
    @JsonProperty("application/vnd.google-apps.drawing")
    public void setApplicationVndGoogleAppsDrawing(List<String> applicationVndGoogleAppsDrawing) {
        this.applicationVndGoogleAppsDrawing = applicationVndGoogleAppsDrawing;
    }

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsSpreadsheet
     */
    @JsonProperty("application/vnd.google-apps.spreadsheet")
    public List<String> getApplicationVndGoogleAppsSpreadsheet() {
        return applicationVndGoogleAppsSpreadsheet;
    }

    /**
     * 
     * @param applicationVndGoogleAppsSpreadsheet
     *     The application/vnd.google-apps.spreadsheet
     */
    @JsonProperty("application/vnd.google-apps.spreadsheet")
    public void setApplicationVndGoogleAppsSpreadsheet(List<String> applicationVndGoogleAppsSpreadsheet) {
        this.applicationVndGoogleAppsSpreadsheet = applicationVndGoogleAppsSpreadsheet;
    }

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsScript
     */
    @JsonProperty("application/vnd.google-apps.script")
    public List<String> getApplicationVndGoogleAppsScript() {
        return applicationVndGoogleAppsScript;
    }

    /**
     * 
     * @param applicationVndGoogleAppsScript
     *     The application/vnd.google-apps.script
     */
    @JsonProperty("application/vnd.google-apps.script")
    public void setApplicationVndGoogleAppsScript(List<String> applicationVndGoogleAppsScript) {
        this.applicationVndGoogleAppsScript = applicationVndGoogleAppsScript;
    }

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsPresentation
     */
    @JsonProperty("application/vnd.google-apps.presentation")
    public List<String> getApplicationVndGoogleAppsPresentation() {
        return applicationVndGoogleAppsPresentation;
    }

    /**
     * 
     * @param applicationVndGoogleAppsPresentation
     *     The application/vnd.google-apps.presentation
     */
    @JsonProperty("application/vnd.google-apps.presentation")
    public void setApplicationVndGoogleAppsPresentation(List<String> applicationVndGoogleAppsPresentation) {
        this.applicationVndGoogleAppsPresentation = applicationVndGoogleAppsPresentation;
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
