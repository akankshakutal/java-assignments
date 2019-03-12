package com.step.assignment.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        console.display("Hello World");
        PDFPage pdfPage = new PDFPage();
        pdfPage.getText();
        NonInteractiveWebPage nonInteractiveWebPage = new NonInteractiveWebPage();
        nonInteractiveWebPage.click();
        Returnable webPage = new WebPage();
        Displayable webPage1 = new WebPage();
        webPage1.display("Hello");
        System.out.println(webPage.getText());
        ((WebPage) webPage).click();
    }
}
