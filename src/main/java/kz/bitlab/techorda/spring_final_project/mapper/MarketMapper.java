package kz.bitlab.techorda.spring_final_project.mapper;

import kz.bitlab.techorda.spring_final_project.dto.MarketDTO;
import kz.bitlab.techorda.spring_final_project.model.Market;

public interface MarketMapper {

    MarketDTO toDto(Market market);
    Market toModel(MarketDTO marketDTO);

}
