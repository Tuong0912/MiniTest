package com.example.picture.controller;

import com.example.picture.model.Picture;
import com.example.picture.service.InterfacePicture;
import com.example.picture.service.PictureIplm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/picture")
public class PictureController {
    int id = 4;
    @Autowired
    InterfacePicture interfacePicture;

    @RequestMapping("")
    public String showListPicture(Model model) {
        List<Picture> pictures = this.interfacePicture.findAll();
        model.addAttribute("picture", pictures);
        return "picture/list";
    }

    @GetMapping("createForm")
    public String createFormPicture(Model model) {
        model.addAttribute("picture", new Picture());
        return "picture/create";
    }

    @PostMapping("create")
    public String createPicture(@RequestParam int maPicture,
                                @RequestParam double dai,
                                @RequestParam double rong,
                                @RequestParam String chatLieu,
                                @RequestParam String moTa,
                                @RequestParam double price) {
        Picture picture = new Picture(id, maPicture, dai, rong, chatLieu, moTa, price);
        this.interfacePicture.addNew(picture);
        return "redirect:/picture";
    }

    @GetMapping("{id}/edit")
    public String editForm(Model model, @PathVariable int id) {
        model.addAttribute("picture", this.interfacePicture.findById(id));
        return "picture/edit";
    }

    @PostMapping("update")
    public String updatePicture(Picture picture) {
        this.interfacePicture.update(picture.getId(), picture);
        return "redirect:/picture";
    }

    @GetMapping("{id}/delete")
    public String deleteForm(Model model, @PathVariable int id, RedirectAttributes redirect) {
        model.addAttribute("picture", this.interfacePicture.findById(id));
        redirect.addFlashAttribute("success", "Update success");
        return "picture/delete";
    }

    @PostMapping("deletePicture")
    public String deletePicture(Picture picture, RedirectAttributes redirect) {
        this.interfacePicture.delete(picture.getId());
        redirect.addFlashAttribute("success", "Delete success");
        return "redirect:/picture";
    }

    @GetMapping("{id}/view")
    public String viewPicture(Model model, @PathVariable int id) {
        model.addAttribute("picture", this.interfacePicture.findById(id));
        return "picture/view";
    }
}
