package net.spadws.controller.impl;

import net.spadws.controller.CollectionController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class CollectionControllerImpl implements CollectionController {

    @Override
    @PostMapping()
    public String addVolumeToCollection() {
        return "";
    }

    @Override
    @DeleteMapping()
    public String deleteVolumeFromCollection() {
        return "";
    }

    @Override
    @GetMapping()
    public String getCollectionList() {
        return "";
    }
}
