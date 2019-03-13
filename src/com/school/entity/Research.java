package com.school.entity;

import java.util.Date;

public class Research {
    private int researchId;
    private String content;
    private String author;
    private Date publishdate;
    private short isBackground;
    private String researchImage;
    private String researchTitle;
    private int researchArea;
    private String researchType;

    public int getResearchId() {
        return researchId;
    }

    public void setResearchId(int researchId) {
        this.researchId = researchId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public short getIsBackground() {
        return isBackground;
    }

    public void setIsBackground(short isBackground) {
        this.isBackground = isBackground;
    }

    public String getResearchImage() {
        return researchImage;
    }

    public void setResearchImage(String researchImage) {
        this.researchImage = researchImage;
    }

    public String getResearchTitle() {
        return researchTitle;
    }

    public void setResearchTitle(String researchTitle) {
        this.researchTitle = researchTitle;
    }

    public int getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(int researchArea) {
        this.researchArea = researchArea;
    }

    public String getResearchType() {
        return researchType;
    }

    public void setResearchType(String researchType) {
        this.researchType = researchType;
    }

    @Override
    public String toString() {
        return "Research{" +
                "researchId=" + researchId +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", publishdate=" + publishdate +
                ", isBackground=" + isBackground +
                ", researchImage='" + researchImage + '\'' +
                ", researchTitle='" + researchTitle + '\'' +
                ", researchArea=" + researchArea +
                ", researchType='" + researchType + '\'' +
                '}';
    }
}
