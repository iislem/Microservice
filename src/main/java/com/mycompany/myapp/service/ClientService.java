package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.ClientDTO;
import java.util.List;

/**
 * Service Interface for managing Client.
 */
public interface ClientService {

    /**
     * Save a client.
     *
     * @param clientDTO the entity to save
     * @return the persisted entity
     */
    ClientDTO save(ClientDTO clientDTO);

    /**
     * Get all the clients.
     *
     * @return the list of entities
     */
    List<ClientDTO> findAll();

    /**
     * Get the "id" client.
     *
     * @param id the id of the entity
     * @return the entity
     */
    ClientDTO findOne(Long id);

    /**
     * Delete the "id" client.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
