package net.spadws.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * The interface Collection Controller
 */
@Tag(name = "CollectionsContoller", description = "Collection services")
public interface CollectionController {
    /**
     * Add new volume to collection.
     *
     * @param
     * @return
     */
    @Operation(summary = "Add new volume into personal collection",
            description = "Endpoint that inserts a new volume register into the users collection")
    String addVolumeToCollection();

    /**
     * Delete a volume from collection.
     *
     * @param
     * @return
     */
    @Operation(summary = "Delete a volume from personal collection",
            description = "Endpoint that deletes an existenr volume from the users collection")
    String deleteVolumeFromCollection();

    /**
     * Get collection list.
     *
     * @param
     * @return
     */
    @Operation(summary = "get volume list from personal collection",
            description = "Endpoint that gets volume list from personal collection")
    String getCollectionList();

}
