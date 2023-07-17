package kz.bitlab.techorda.spring_final_project.service;

import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.mapper.PriceMapper;
import kz.bitlab.techorda.spring_final_project.model.Price;
import kz.bitlab.techorda.spring_final_project.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceService {


    private final PriceRepository priceRepository;

    private final PriceMapper priceMapper;


    public List<PriceDTO> getAllPrices() {
            return priceMapper.toDtoList(priceRepository.findAll());
    }

    public PriceDTO getPrice(Long id) {
        return  priceMapper.toDto(priceRepository.findById(id).orElse(new Price()));
    }

    public PriceDTO addPrice(PriceDTO price) {
        return priceMapper.toDto(priceRepository.save(priceMapper.toModel(price)));
    }



}
