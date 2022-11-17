package edu.uco.monitoria.data.dao;

import edu.uco.monitoria.domain.PlaceDTO;

import java.util.List

public interface PlaceDAO {
	List<PlaceDTO> find(final PlaceDTO place);
    void create(final PlaceDTO place);
    void update(final PlaceDTO place);
    void delete(PlaceDTO place);
}
