
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
    "application/x-vnd.oasis.opendocument.presentation",
    "text/tab-separated-values",
    "image/jpeg",
    "image/bmp",
    "image/gif",
    "application/vnd.ms-excel.sheet.macroenabled.12",
    "application/vnd.openxmlformats-officedocument.wordprocessingml.template",
    "application/vnd.ms-powerpoint.presentation.macroenabled.12",
    "application/vnd.ms-word.template.macroenabled.12",
    "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
    "image/pjpeg",
    "application/vnd.google-apps.script+text/plain",
    "application/vnd.ms-excel",
    "application/vnd.sun.xml.writer",
    "application/vnd.ms-word.document.macroenabled.12",
    "application/vnd.ms-powerpoint.slideshow.macroenabled.12",
    "text/rtf",
    "text/plain",
    "application/vnd.oasis.opendocument.spreadsheet",
    "application/x-vnd.oasis.opendocument.spreadsheet",
    "image/png",
    "application/x-vnd.oasis.opendocument.text",
    "application/msword",
    "application/pdf",
    "application/json",
    "application/x-msmetafile",
    "application/vnd.openxmlformats-officedocument.spreadsheetml.template",
    "application/vnd.ms-powerpoint",
    "application/vnd.ms-excel.template.macroenabled.12",
    "image/x-bmp",
    "application/rtf",
    "application/vnd.openxmlformats-officedocument.presentationml.template",
    "image/x-png",
    "text/html",
    "application/vnd.oasis.opendocument.text",
    "application/vnd.openxmlformats-officedocument.presentationml.presentation",
    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
    "application/vnd.google-apps.script+json",
    "application/vnd.openxmlformats-officedocument.presentationml.slideshow",
    "application/vnd.ms-powerpoint.template.macroenabled.12",
    "text/csv",
    "application/vnd.oasis.opendocument.presentation",
    "image/jpg",
    "text/richtext"
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class DriveImportFormats implements Serializable {

    @JsonProperty("application/x-vnd.oasis.opendocument.presentation")
    private List<String> applicationXVndOasisOpendocumentPresentation = new ArrayList<String>();
    @JsonProperty("text/tab-separated-values")
    private List<String> textTabSeparatedValues = new ArrayList<String>();
    @JsonProperty("image/jpeg")
    private List<String> imageJpeg = new ArrayList<String>();
    @JsonProperty("image/bmp")
    private List<String> imageBmp = new ArrayList<String>();
    @JsonProperty("image/gif")
    private List<String> imageGif = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-excel.sheet.macroenabled.12")
    private List<String> applicationVndMsExcelSheetMacroenabled12 = new ArrayList<String>();
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.template")
    private List<String> applicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-powerpoint.presentation.macroenabled.12")
    private List<String> applicationVndMsPowerpointPresentationMacroenabled12 = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-word.template.macroenabled.12")
    private List<String> applicationVndMsWordTemplateMacroenabled12 = new ArrayList<String>();
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    private List<String> applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument = new ArrayList<String>();
    @JsonProperty("image/pjpeg")
    private List<String> imagePjpeg = new ArrayList<String>();
    @JsonProperty("application/vnd.google-apps.script+text/plain")
    private List<String> applicationVndGoogleAppsScriptTextPlain = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-excel")
    private List<String> applicationVndMsExcel = new ArrayList<String>();
    @JsonProperty("application/vnd.sun.xml.writer")
    private List<String> applicationVndSunXmlWriter = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-word.document.macroenabled.12")
    private List<String> applicationVndMsWordDocumentMacroenabled12 = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-powerpoint.slideshow.macroenabled.12")
    private List<String> applicationVndMsPowerpointSlideshowMacroenabled12 = new ArrayList<String>();
    @JsonProperty("text/rtf")
    private List<String> textRtf = new ArrayList<String>();
    @JsonProperty("text/plain")
    private List<String> textPlain = new ArrayList<String>();
    @JsonProperty("application/vnd.oasis.opendocument.spreadsheet")
    private List<String> applicationVndOasisOpendocumentSpreadsheet = new ArrayList<String>();
    @JsonProperty("application/x-vnd.oasis.opendocument.spreadsheet")
    private List<String> applicationXVndOasisOpendocumentSpreadsheet = new ArrayList<String>();
    @JsonProperty("image/png")
    private List<String> imagePng = new ArrayList<String>();
    @JsonProperty("application/x-vnd.oasis.opendocument.text")
    private List<String> applicationXVndOasisOpendocumentText = new ArrayList<String>();
    @JsonProperty("application/msword")
    private List<String> applicationMsword = new ArrayList<String>();
    @JsonProperty("application/pdf")
    private List<String> applicationPdf = new ArrayList<String>();
    @JsonProperty("application/json")
    private List<String> applicationJson = new ArrayList<String>();
    @JsonProperty("application/x-msmetafile")
    private List<String> applicationXMsmetafile = new ArrayList<String>();
    @JsonProperty("application/vnd.openxmlformats-officedocument.spreadsheetml.template")
    private List<String> applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-powerpoint")
    private List<String> applicationVndMsPowerpoint = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-excel.template.macroenabled.12")
    private List<String> applicationVndMsExcelTemplateMacroenabled12 = new ArrayList<String>();
    @JsonProperty("image/x-bmp")
    private List<String> imageXBmp = new ArrayList<String>();
    @JsonProperty("application/rtf")
    private List<String> applicationRtf = new ArrayList<String>();
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.template")
    private List<String> applicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate = new ArrayList<String>();
    @JsonProperty("image/x-png")
    private List<String> imageXPng = new ArrayList<String>();
    @JsonProperty("text/html")
    private List<String> textHtml = new ArrayList<String>();
    @JsonProperty("application/vnd.oasis.opendocument.text")
    private List<String> applicationVndOasisOpendocumentText = new ArrayList<String>();
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.presentation")
    private List<String> applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation = new ArrayList<String>();
    @JsonProperty("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    private List<String> applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet = new ArrayList<String>();
    @JsonProperty("application/vnd.google-apps.script+json")
    private List<String> applicationVndGoogleAppsScriptJson = new ArrayList<String>();
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.slideshow")
    private List<String> applicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow = new ArrayList<String>();
    @JsonProperty("application/vnd.ms-powerpoint.template.macroenabled.12")
    private List<String> applicationVndMsPowerpointTemplateMacroenabled12 = new ArrayList<String>();
    @JsonProperty("text/csv")
    private List<String> textCsv = new ArrayList<String>();
    @JsonProperty("application/vnd.oasis.opendocument.presentation")
    private List<String> applicationVndOasisOpendocumentPresentation = new ArrayList<String>();
    @JsonProperty("image/jpg")
    private List<String> imageJpg = new ArrayList<String>();
    @JsonProperty("text/richtext")
    private List<String> textRichtext = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The applicationXVndOasisOpendocumentPresentation
     */
    @JsonProperty("application/x-vnd.oasis.opendocument.presentation")
    public List<String> getApplicationXVndOasisOpendocumentPresentation() {
        return applicationXVndOasisOpendocumentPresentation;
    }

    /**
     * 
     * @param applicationXVndOasisOpendocumentPresentation
     *     The application/x-vnd.oasis.opendocument.presentation
     */
    @JsonProperty("application/x-vnd.oasis.opendocument.presentation")
    public void setApplicationXVndOasisOpendocumentPresentation(List<String> applicationXVndOasisOpendocumentPresentation) {
        this.applicationXVndOasisOpendocumentPresentation = applicationXVndOasisOpendocumentPresentation;
    }

    /**
     * 
     * @return
     *     The textTabSeparatedValues
     */
    @JsonProperty("text/tab-separated-values")
    public List<String> getTextTabSeparatedValues() {
        return textTabSeparatedValues;
    }

    /**
     * 
     * @param textTabSeparatedValues
     *     The text/tab-separated-values
     */
    @JsonProperty("text/tab-separated-values")
    public void setTextTabSeparatedValues(List<String> textTabSeparatedValues) {
        this.textTabSeparatedValues = textTabSeparatedValues;
    }

    /**
     * 
     * @return
     *     The imageJpeg
     */
    @JsonProperty("image/jpeg")
    public List<String> getImageJpeg() {
        return imageJpeg;
    }

    /**
     * 
     * @param imageJpeg
     *     The image/jpeg
     */
    @JsonProperty("image/jpeg")
    public void setImageJpeg(List<String> imageJpeg) {
        this.imageJpeg = imageJpeg;
    }

    /**
     * 
     * @return
     *     The imageBmp
     */
    @JsonProperty("image/bmp")
    public List<String> getImageBmp() {
        return imageBmp;
    }

    /**
     * 
     * @param imageBmp
     *     The image/bmp
     */
    @JsonProperty("image/bmp")
    public void setImageBmp(List<String> imageBmp) {
        this.imageBmp = imageBmp;
    }

    /**
     * 
     * @return
     *     The imageGif
     */
    @JsonProperty("image/gif")
    public List<String> getImageGif() {
        return imageGif;
    }

    /**
     * 
     * @param imageGif
     *     The image/gif
     */
    @JsonProperty("image/gif")
    public void setImageGif(List<String> imageGif) {
        this.imageGif = imageGif;
    }

    /**
     * 
     * @return
     *     The applicationVndMsExcelSheetMacroenabled12
     */
    @JsonProperty("application/vnd.ms-excel.sheet.macroenabled.12")
    public List<String> getApplicationVndMsExcelSheetMacroenabled12() {
        return applicationVndMsExcelSheetMacroenabled12;
    }

    /**
     * 
     * @param applicationVndMsExcelSheetMacroenabled12
     *     The application/vnd.ms-excel.sheet.macroenabled.12
     */
    @JsonProperty("application/vnd.ms-excel.sheet.macroenabled.12")
    public void setApplicationVndMsExcelSheetMacroenabled12(List<String> applicationVndMsExcelSheetMacroenabled12) {
        this.applicationVndMsExcelSheetMacroenabled12 = applicationVndMsExcelSheetMacroenabled12;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.template")
    public List<String> getApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate() {
        return applicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate
     *     The application/vnd.openxmlformats-officedocument.wordprocessingml.template
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.template")
    public void setApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate(List<String> applicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate) {
        this.applicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate = applicationVndOpenxmlformatsOfficedocumentWordprocessingmlTemplate;
    }

    /**
     * 
     * @return
     *     The applicationVndMsPowerpointPresentationMacroenabled12
     */
    @JsonProperty("application/vnd.ms-powerpoint.presentation.macroenabled.12")
    public List<String> getApplicationVndMsPowerpointPresentationMacroenabled12() {
        return applicationVndMsPowerpointPresentationMacroenabled12;
    }

    /**
     * 
     * @param applicationVndMsPowerpointPresentationMacroenabled12
     *     The application/vnd.ms-powerpoint.presentation.macroenabled.12
     */
    @JsonProperty("application/vnd.ms-powerpoint.presentation.macroenabled.12")
    public void setApplicationVndMsPowerpointPresentationMacroenabled12(List<String> applicationVndMsPowerpointPresentationMacroenabled12) {
        this.applicationVndMsPowerpointPresentationMacroenabled12 = applicationVndMsPowerpointPresentationMacroenabled12;
    }

    /**
     * 
     * @return
     *     The applicationVndMsWordTemplateMacroenabled12
     */
    @JsonProperty("application/vnd.ms-word.template.macroenabled.12")
    public List<String> getApplicationVndMsWordTemplateMacroenabled12() {
        return applicationVndMsWordTemplateMacroenabled12;
    }

    /**
     * 
     * @param applicationVndMsWordTemplateMacroenabled12
     *     The application/vnd.ms-word.template.macroenabled.12
     */
    @JsonProperty("application/vnd.ms-word.template.macroenabled.12")
    public void setApplicationVndMsWordTemplateMacroenabled12(List<String> applicationVndMsWordTemplateMacroenabled12) {
        this.applicationVndMsWordTemplateMacroenabled12 = applicationVndMsWordTemplateMacroenabled12;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public List<String> getApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument() {
        return applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument
     *     The application/vnd.openxmlformats-officedocument.wordprocessingml.document
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public void setApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument(List<String> applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument) {
        this.applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument = applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    }

    /**
     * 
     * @return
     *     The imagePjpeg
     */
    @JsonProperty("image/pjpeg")
    public List<String> getImagePjpeg() {
        return imagePjpeg;
    }

    /**
     * 
     * @param imagePjpeg
     *     The image/pjpeg
     */
    @JsonProperty("image/pjpeg")
    public void setImagePjpeg(List<String> imagePjpeg) {
        this.imagePjpeg = imagePjpeg;
    }

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsScriptTextPlain
     */
    @JsonProperty("application/vnd.google-apps.script+text/plain")
    public List<String> getApplicationVndGoogleAppsScriptTextPlain() {
        return applicationVndGoogleAppsScriptTextPlain;
    }

    /**
     * 
     * @param applicationVndGoogleAppsScriptTextPlain
     *     The application/vnd.google-apps.script+text/plain
     */
    @JsonProperty("application/vnd.google-apps.script+text/plain")
    public void setApplicationVndGoogleAppsScriptTextPlain(List<String> applicationVndGoogleAppsScriptTextPlain) {
        this.applicationVndGoogleAppsScriptTextPlain = applicationVndGoogleAppsScriptTextPlain;
    }

    /**
     * 
     * @return
     *     The applicationVndMsExcel
     */
    @JsonProperty("application/vnd.ms-excel")
    public List<String> getApplicationVndMsExcel() {
        return applicationVndMsExcel;
    }

    /**
     * 
     * @param applicationVndMsExcel
     *     The application/vnd.ms-excel
     */
    @JsonProperty("application/vnd.ms-excel")
    public void setApplicationVndMsExcel(List<String> applicationVndMsExcel) {
        this.applicationVndMsExcel = applicationVndMsExcel;
    }

    /**
     * 
     * @return
     *     The applicationVndSunXmlWriter
     */
    @JsonProperty("application/vnd.sun.xml.writer")
    public List<String> getApplicationVndSunXmlWriter() {
        return applicationVndSunXmlWriter;
    }

    /**
     * 
     * @param applicationVndSunXmlWriter
     *     The application/vnd.sun.xml.writer
     */
    @JsonProperty("application/vnd.sun.xml.writer")
    public void setApplicationVndSunXmlWriter(List<String> applicationVndSunXmlWriter) {
        this.applicationVndSunXmlWriter = applicationVndSunXmlWriter;
    }

    /**
     * 
     * @return
     *     The applicationVndMsWordDocumentMacroenabled12
     */
    @JsonProperty("application/vnd.ms-word.document.macroenabled.12")
    public List<String> getApplicationVndMsWordDocumentMacroenabled12() {
        return applicationVndMsWordDocumentMacroenabled12;
    }

    /**
     * 
     * @param applicationVndMsWordDocumentMacroenabled12
     *     The application/vnd.ms-word.document.macroenabled.12
     */
    @JsonProperty("application/vnd.ms-word.document.macroenabled.12")
    public void setApplicationVndMsWordDocumentMacroenabled12(List<String> applicationVndMsWordDocumentMacroenabled12) {
        this.applicationVndMsWordDocumentMacroenabled12 = applicationVndMsWordDocumentMacroenabled12;
    }

    /**
     * 
     * @return
     *     The applicationVndMsPowerpointSlideshowMacroenabled12
     */
    @JsonProperty("application/vnd.ms-powerpoint.slideshow.macroenabled.12")
    public List<String> getApplicationVndMsPowerpointSlideshowMacroenabled12() {
        return applicationVndMsPowerpointSlideshowMacroenabled12;
    }

    /**
     * 
     * @param applicationVndMsPowerpointSlideshowMacroenabled12
     *     The application/vnd.ms-powerpoint.slideshow.macroenabled.12
     */
    @JsonProperty("application/vnd.ms-powerpoint.slideshow.macroenabled.12")
    public void setApplicationVndMsPowerpointSlideshowMacroenabled12(List<String> applicationVndMsPowerpointSlideshowMacroenabled12) {
        this.applicationVndMsPowerpointSlideshowMacroenabled12 = applicationVndMsPowerpointSlideshowMacroenabled12;
    }

    /**
     * 
     * @return
     *     The textRtf
     */
    @JsonProperty("text/rtf")
    public List<String> getTextRtf() {
        return textRtf;
    }

    /**
     * 
     * @param textRtf
     *     The text/rtf
     */
    @JsonProperty("text/rtf")
    public void setTextRtf(List<String> textRtf) {
        this.textRtf = textRtf;
    }

    /**
     * 
     * @return
     *     The textPlain
     */
    @JsonProperty("text/plain")
    public List<String> getTextPlain() {
        return textPlain;
    }

    /**
     * 
     * @param textPlain
     *     The text/plain
     */
    @JsonProperty("text/plain")
    public void setTextPlain(List<String> textPlain) {
        this.textPlain = textPlain;
    }

    /**
     * 
     * @return
     *     The applicationVndOasisOpendocumentSpreadsheet
     */
    @JsonProperty("application/vnd.oasis.opendocument.spreadsheet")
    public List<String> getApplicationVndOasisOpendocumentSpreadsheet() {
        return applicationVndOasisOpendocumentSpreadsheet;
    }

    /**
     * 
     * @param applicationVndOasisOpendocumentSpreadsheet
     *     The application/vnd.oasis.opendocument.spreadsheet
     */
    @JsonProperty("application/vnd.oasis.opendocument.spreadsheet")
    public void setApplicationVndOasisOpendocumentSpreadsheet(List<String> applicationVndOasisOpendocumentSpreadsheet) {
        this.applicationVndOasisOpendocumentSpreadsheet = applicationVndOasisOpendocumentSpreadsheet;
    }

    /**
     * 
     * @return
     *     The applicationXVndOasisOpendocumentSpreadsheet
     */
    @JsonProperty("application/x-vnd.oasis.opendocument.spreadsheet")
    public List<String> getApplicationXVndOasisOpendocumentSpreadsheet() {
        return applicationXVndOasisOpendocumentSpreadsheet;
    }

    /**
     * 
     * @param applicationXVndOasisOpendocumentSpreadsheet
     *     The application/x-vnd.oasis.opendocument.spreadsheet
     */
    @JsonProperty("application/x-vnd.oasis.opendocument.spreadsheet")
    public void setApplicationXVndOasisOpendocumentSpreadsheet(List<String> applicationXVndOasisOpendocumentSpreadsheet) {
        this.applicationXVndOasisOpendocumentSpreadsheet = applicationXVndOasisOpendocumentSpreadsheet;
    }

    /**
     * 
     * @return
     *     The imagePng
     */
    @JsonProperty("image/png")
    public List<String> getImagePng() {
        return imagePng;
    }

    /**
     * 
     * @param imagePng
     *     The image/png
     */
    @JsonProperty("image/png")
    public void setImagePng(List<String> imagePng) {
        this.imagePng = imagePng;
    }

    /**
     * 
     * @return
     *     The applicationXVndOasisOpendocumentText
     */
    @JsonProperty("application/x-vnd.oasis.opendocument.text")
    public List<String> getApplicationXVndOasisOpendocumentText() {
        return applicationXVndOasisOpendocumentText;
    }

    /**
     * 
     * @param applicationXVndOasisOpendocumentText
     *     The application/x-vnd.oasis.opendocument.text
     */
    @JsonProperty("application/x-vnd.oasis.opendocument.text")
    public void setApplicationXVndOasisOpendocumentText(List<String> applicationXVndOasisOpendocumentText) {
        this.applicationXVndOasisOpendocumentText = applicationXVndOasisOpendocumentText;
    }

    /**
     * 
     * @return
     *     The applicationMsword
     */
    @JsonProperty("application/msword")
    public List<String> getApplicationMsword() {
        return applicationMsword;
    }

    /**
     * 
     * @param applicationMsword
     *     The application/msword
     */
    @JsonProperty("application/msword")
    public void setApplicationMsword(List<String> applicationMsword) {
        this.applicationMsword = applicationMsword;
    }

    /**
     * 
     * @return
     *     The applicationPdf
     */
    @JsonProperty("application/pdf")
    public List<String> getApplicationPdf() {
        return applicationPdf;
    }

    /**
     * 
     * @param applicationPdf
     *     The application/pdf
     */
    @JsonProperty("application/pdf")
    public void setApplicationPdf(List<String> applicationPdf) {
        this.applicationPdf = applicationPdf;
    }

    /**
     * 
     * @return
     *     The applicationJson
     */
    @JsonProperty("application/json")
    public List<String> getApplicationJson() {
        return applicationJson;
    }

    /**
     * 
     * @param applicationJson
     *     The application/json
     */
    @JsonProperty("application/json")
    public void setApplicationJson(List<String> applicationJson) {
        this.applicationJson = applicationJson;
    }

    /**
     * 
     * @return
     *     The applicationXMsmetafile
     */
    @JsonProperty("application/x-msmetafile")
    public List<String> getApplicationXMsmetafile() {
        return applicationXMsmetafile;
    }

    /**
     * 
     * @param applicationXMsmetafile
     *     The application/x-msmetafile
     */
    @JsonProperty("application/x-msmetafile")
    public void setApplicationXMsmetafile(List<String> applicationXMsmetafile) {
        this.applicationXMsmetafile = applicationXMsmetafile;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.spreadsheetml.template")
    public List<String> getApplicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate() {
        return applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate
     *     The application/vnd.openxmlformats-officedocument.spreadsheetml.template
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.spreadsheetml.template")
    public void setApplicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate(List<String> applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate) {
        this.applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate = applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlTemplate;
    }

    /**
     * 
     * @return
     *     The applicationVndMsPowerpoint
     */
    @JsonProperty("application/vnd.ms-powerpoint")
    public List<String> getApplicationVndMsPowerpoint() {
        return applicationVndMsPowerpoint;
    }

    /**
     * 
     * @param applicationVndMsPowerpoint
     *     The application/vnd.ms-powerpoint
     */
    @JsonProperty("application/vnd.ms-powerpoint")
    public void setApplicationVndMsPowerpoint(List<String> applicationVndMsPowerpoint) {
        this.applicationVndMsPowerpoint = applicationVndMsPowerpoint;
    }

    /**
     * 
     * @return
     *     The applicationVndMsExcelTemplateMacroenabled12
     */
    @JsonProperty("application/vnd.ms-excel.template.macroenabled.12")
    public List<String> getApplicationVndMsExcelTemplateMacroenabled12() {
        return applicationVndMsExcelTemplateMacroenabled12;
    }

    /**
     * 
     * @param applicationVndMsExcelTemplateMacroenabled12
     *     The application/vnd.ms-excel.template.macroenabled.12
     */
    @JsonProperty("application/vnd.ms-excel.template.macroenabled.12")
    public void setApplicationVndMsExcelTemplateMacroenabled12(List<String> applicationVndMsExcelTemplateMacroenabled12) {
        this.applicationVndMsExcelTemplateMacroenabled12 = applicationVndMsExcelTemplateMacroenabled12;
    }

    /**
     * 
     * @return
     *     The imageXBmp
     */
    @JsonProperty("image/x-bmp")
    public List<String> getImageXBmp() {
        return imageXBmp;
    }

    /**
     * 
     * @param imageXBmp
     *     The image/x-bmp
     */
    @JsonProperty("image/x-bmp")
    public void setImageXBmp(List<String> imageXBmp) {
        this.imageXBmp = imageXBmp;
    }

    /**
     * 
     * @return
     *     The applicationRtf
     */
    @JsonProperty("application/rtf")
    public List<String> getApplicationRtf() {
        return applicationRtf;
    }

    /**
     * 
     * @param applicationRtf
     *     The application/rtf
     */
    @JsonProperty("application/rtf")
    public void setApplicationRtf(List<String> applicationRtf) {
        this.applicationRtf = applicationRtf;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.template")
    public List<String> getApplicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate() {
        return applicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate
     *     The application/vnd.openxmlformats-officedocument.presentationml.template
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.template")
    public void setApplicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate(List<String> applicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate) {
        this.applicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate = applicationVndOpenxmlformatsOfficedocumentPresentationmlTemplate;
    }

    /**
     * 
     * @return
     *     The imageXPng
     */
    @JsonProperty("image/x-png")
    public List<String> getImageXPng() {
        return imageXPng;
    }

    /**
     * 
     * @param imageXPng
     *     The image/x-png
     */
    @JsonProperty("image/x-png")
    public void setImageXPng(List<String> imageXPng) {
        this.imageXPng = imageXPng;
    }

    /**
     * 
     * @return
     *     The textHtml
     */
    @JsonProperty("text/html")
    public List<String> getTextHtml() {
        return textHtml;
    }

    /**
     * 
     * @param textHtml
     *     The text/html
     */
    @JsonProperty("text/html")
    public void setTextHtml(List<String> textHtml) {
        this.textHtml = textHtml;
    }

    /**
     * 
     * @return
     *     The applicationVndOasisOpendocumentText
     */
    @JsonProperty("application/vnd.oasis.opendocument.text")
    public List<String> getApplicationVndOasisOpendocumentText() {
        return applicationVndOasisOpendocumentText;
    }

    /**
     * 
     * @param applicationVndOasisOpendocumentText
     *     The application/vnd.oasis.opendocument.text
     */
    @JsonProperty("application/vnd.oasis.opendocument.text")
    public void setApplicationVndOasisOpendocumentText(List<String> applicationVndOasisOpendocumentText) {
        this.applicationVndOasisOpendocumentText = applicationVndOasisOpendocumentText;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.presentation")
    public List<String> getApplicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation() {
        return applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation
     *     The application/vnd.openxmlformats-officedocument.presentationml.presentation
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.presentation")
    public void setApplicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation(List<String> applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation) {
        this.applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation = applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    public List<String> getApplicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet() {
        return applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet
     *     The application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    public void setApplicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet(List<String> applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet) {
        this.applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet = applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet;
    }

    /**
     * 
     * @return
     *     The applicationVndGoogleAppsScriptJson
     */
    @JsonProperty("application/vnd.google-apps.script+json")
    public List<String> getApplicationVndGoogleAppsScriptJson() {
        return applicationVndGoogleAppsScriptJson;
    }

    /**
     * 
     * @param applicationVndGoogleAppsScriptJson
     *     The application/vnd.google-apps.script+json
     */
    @JsonProperty("application/vnd.google-apps.script+json")
    public void setApplicationVndGoogleAppsScriptJson(List<String> applicationVndGoogleAppsScriptJson) {
        this.applicationVndGoogleAppsScriptJson = applicationVndGoogleAppsScriptJson;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.slideshow")
    public List<String> getApplicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow() {
        return applicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow
     *     The application/vnd.openxmlformats-officedocument.presentationml.slideshow
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.presentationml.slideshow")
    public void setApplicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow(List<String> applicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow) {
        this.applicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow = applicationVndOpenxmlformatsOfficedocumentPresentationmlSlideshow;
    }

    /**
     * 
     * @return
     *     The applicationVndMsPowerpointTemplateMacroenabled12
     */
    @JsonProperty("application/vnd.ms-powerpoint.template.macroenabled.12")
    public List<String> getApplicationVndMsPowerpointTemplateMacroenabled12() {
        return applicationVndMsPowerpointTemplateMacroenabled12;
    }

    /**
     * 
     * @param applicationVndMsPowerpointTemplateMacroenabled12
     *     The application/vnd.ms-powerpoint.template.macroenabled.12
     */
    @JsonProperty("application/vnd.ms-powerpoint.template.macroenabled.12")
    public void setApplicationVndMsPowerpointTemplateMacroenabled12(List<String> applicationVndMsPowerpointTemplateMacroenabled12) {
        this.applicationVndMsPowerpointTemplateMacroenabled12 = applicationVndMsPowerpointTemplateMacroenabled12;
    }

    /**
     * 
     * @return
     *     The textCsv
     */
    @JsonProperty("text/csv")
    public List<String> getTextCsv() {
        return textCsv;
    }

    /**
     * 
     * @param textCsv
     *     The text/csv
     */
    @JsonProperty("text/csv")
    public void setTextCsv(List<String> textCsv) {
        this.textCsv = textCsv;
    }

    /**
     * 
     * @return
     *     The applicationVndOasisOpendocumentPresentation
     */
    @JsonProperty("application/vnd.oasis.opendocument.presentation")
    public List<String> getApplicationVndOasisOpendocumentPresentation() {
        return applicationVndOasisOpendocumentPresentation;
    }

    /**
     * 
     * @param applicationVndOasisOpendocumentPresentation
     *     The application/vnd.oasis.opendocument.presentation
     */
    @JsonProperty("application/vnd.oasis.opendocument.presentation")
    public void setApplicationVndOasisOpendocumentPresentation(List<String> applicationVndOasisOpendocumentPresentation) {
        this.applicationVndOasisOpendocumentPresentation = applicationVndOasisOpendocumentPresentation;
    }

    /**
     * 
     * @return
     *     The imageJpg
     */
    @JsonProperty("image/jpg")
    public List<String> getImageJpg() {
        return imageJpg;
    }

    /**
     * 
     * @param imageJpg
     *     The image/jpg
     */
    @JsonProperty("image/jpg")
    public void setImageJpg(List<String> imageJpg) {
        this.imageJpg = imageJpg;
    }

    /**
     * 
     * @return
     *     The textRichtext
     */
    @JsonProperty("text/richtext")
    public List<String> getTextRichtext() {
        return textRichtext;
    }

    /**
     * 
     * @param textRichtext
     *     The text/richtext
     */
    @JsonProperty("text/richtext")
    public void setTextRichtext(List<String> textRichtext) {
        this.textRichtext = textRichtext;
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
