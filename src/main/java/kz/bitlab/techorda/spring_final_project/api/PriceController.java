package kz.bitlab.techorda.spring_final_project.api;

import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/market")
public class PriceController {

    private final PriceService priceService;


    @PostMapping(value = "/add-price")
    public PriceDTO addPrice(@RequestBody PriceDTO price) {
        return priceService.addPrice(price);
    }

    public List<PriceDTO> getAllPrices() {
        return priceService.getAllPrices();
    }


}
