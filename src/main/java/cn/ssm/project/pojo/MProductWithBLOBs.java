package cn.ssm.project.pojo;

public class MProductWithBLOBs extends MProduct {
    private String documentnote;

    private String help;

    private String bulletPoint1;

    private String bulletPoint2;

    private String bulletPoint3;

    private String bulletPoint4;

    private String bulletPoint5;

    private String genericKeywords1;

    private String genericKeywords2;

    private String genericKeywords3;

    private String genericKeywords4;

    private String genericKeywords5;

    private String targetAudienceKeywords;

    private String productDescription;

    private String moreDetails;

    public String getDocumentnote() {
        return documentnote;
    }

    public void setDocumentnote(String documentnote) {
        this.documentnote = documentnote == null ? null : documentnote.trim();
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help == null ? null : help.trim();
    }

    public String getBulletPoint1() {
        return bulletPoint1;
    }

    public void setBulletPoint1(String bulletPoint1) {
        this.bulletPoint1 = bulletPoint1 == null ? null : bulletPoint1.trim();
    }

    public String getBulletPoint2() {
        return bulletPoint2;
    }

    public void setBulletPoint2(String bulletPoint2) {
        this.bulletPoint2 = bulletPoint2 == null ? null : bulletPoint2.trim();
    }

    public String getBulletPoint3() {
        return bulletPoint3;
    }

    public void setBulletPoint3(String bulletPoint3) {
        this.bulletPoint3 = bulletPoint3 == null ? null : bulletPoint3.trim();
    }

    public String getBulletPoint4() {
        return bulletPoint4;
    }

    public void setBulletPoint4(String bulletPoint4) {
        this.bulletPoint4 = bulletPoint4 == null ? null : bulletPoint4.trim();
    }

    public String getBulletPoint5() {
        return bulletPoint5;
    }

    public void setBulletPoint5(String bulletPoint5) {
        this.bulletPoint5 = bulletPoint5 == null ? null : bulletPoint5.trim();
    }

    public String getGenericKeywords1() {
        return genericKeywords1;
    }

    public void setGenericKeywords1(String genericKeywords1) {
        this.genericKeywords1 = genericKeywords1 == null ? null : genericKeywords1.trim();
    }

    public String getGenericKeywords2() {
        return genericKeywords2;
    }

    public void setGenericKeywords2(String genericKeywords2) {
        this.genericKeywords2 = genericKeywords2 == null ? null : genericKeywords2.trim();
    }

    public String getGenericKeywords3() {
        return genericKeywords3;
    }

    public void setGenericKeywords3(String genericKeywords3) {
        this.genericKeywords3 = genericKeywords3 == null ? null : genericKeywords3.trim();
    }

    public String getGenericKeywords4() {
        return genericKeywords4;
    }

    public void setGenericKeywords4(String genericKeywords4) {
        this.genericKeywords4 = genericKeywords4 == null ? null : genericKeywords4.trim();
    }

    public String getGenericKeywords5() {
        return genericKeywords5;
    }

    public void setGenericKeywords5(String genericKeywords5) {
        this.genericKeywords5 = genericKeywords5 == null ? null : genericKeywords5.trim();
    }

    public String getTargetAudienceKeywords() {
        return targetAudienceKeywords;
    }

    public void setTargetAudienceKeywords(String targetAudienceKeywords) {
        this.targetAudienceKeywords = targetAudienceKeywords == null ? null : targetAudienceKeywords.trim();
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails == null ? null : moreDetails.trim();
    }
}