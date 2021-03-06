/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.controller;

import e.dialog.HeaderDialog;
import e.dialog.ImageDialog;
import e.dialog.ListDialog;
import e.dialog.ParagraphDialog;
import e.dialog.SlideshowDialog;
import e.dialog.VideoDialog;
import e.view.EPortfolioMakerView;

/**
 *
 * @author jieliang
 */
public class EditComponentController {
    private EPortfolioMakerView ui;
    
    public EditComponentController(EPortfolioMakerView initUI) {
        ui = initUI;
    }

    public void handleAddImageRequest() {
        ImageDialog imageDialog = new ImageDialog(ui.getWindow());
        imageDialog.show("Image");
        String selection = imageDialog.getSelection();
        boolean addComponent = selection.equals(imageDialog.YES);
        if (addComponent) {
            ui.getEPortfolio().getSelectedPage().addComponent(imageDialog.getComponent());
        }

    }

    public void handleAddVideoRequest() {
        VideoDialog videoDialog = new VideoDialog(ui.getWindow());
        videoDialog.show("Video");
        String selection = videoDialog.getSelection();
        boolean addComponent = selection.equals(videoDialog.YES);
        if (addComponent) {
            ui.getEPortfolio().getSelectedPage().addComponent(videoDialog.getComponent());
        }
    }

    public void handleAddSlideshowRequest() {
        SlideshowDialog slideshowDialog = new SlideshowDialog(ui.getWindow());
        slideshowDialog.show("Slideshow");
        String selection = slideshowDialog.getSelection();
        boolean addComponent = selection.equals(slideshowDialog.YES);
        if (addComponent) {
            ui.getEPortfolio().getSelectedPage().addComponent(slideshowDialog.getComponent());
        }
    }

    public void handleAddHeaderRequest() {
        HeaderDialog headerDialog = new HeaderDialog(ui.getWindow());
        headerDialog.show("Header");
        String selection = headerDialog.getSelection();
        boolean addComponent = selection.equals(headerDialog.YES);
        if (addComponent) {
            ui.getEPortfolio().getSelectedPage().addComponent(headerDialog.getComponent());
            ui.updateFileToolbarControls(!addComponent);
        }
    }

    public void handleAddParagraphRequest() {
        ParagraphDialog paragraphDialog = new ParagraphDialog(ui.getWindow());
        paragraphDialog.show("Paragraph");
        String selection = paragraphDialog.getSelection();
        boolean addComponent = selection.equals(paragraphDialog.YES);
        if (addComponent) {
            ui.getEPortfolio().getSelectedPage().addComponent(paragraphDialog.getComponent());
            ui.updateFileToolbarControls(!addComponent);
        }
    }

    public void handleAddListRequest() {
        ListDialog listDialog = new ListDialog(ui.getWindow());
        listDialog.show("List");
        String selection = listDialog.getSelection();
        boolean addComponent = selection.equals(listDialog.YES);
        if (addComponent) {
            ui.getEPortfolio().getSelectedPage().addComponent(listDialog.getComponent());
            ui.updateFileToolbarControls(!addComponent);
        }
    }
    
}
