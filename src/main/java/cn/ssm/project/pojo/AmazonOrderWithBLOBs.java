package cn.ssm.project.pojo;

public class AmazonOrderWithBLOBs extends AmazonOrder {
    private String contentText;

    private String description;

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText == null ? null : contentText.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}