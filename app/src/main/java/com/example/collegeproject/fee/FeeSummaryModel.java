package com.example.collegeproject.fee;

public class FeeSummaryModel {

    private final int image;
    private final String name;
    private final String rno;
    private final String total;
    private final String submit;



    public FeeSummaryModel(int image, String name, String rno, String total, String submit) {
        this.image = image;
        this.name = name;
        this.rno = rno;
        this.total = total;
        this.submit = submit;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getRno() {
        return rno;
    }

    public String getTotal() {
        return total;
    }

    public String getSubmit() {
        return submit;
    }
}