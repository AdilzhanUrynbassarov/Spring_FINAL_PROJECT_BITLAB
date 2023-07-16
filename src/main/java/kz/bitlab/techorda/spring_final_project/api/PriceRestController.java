package kz.bitlab.techorda.spring_final_project.api;


import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.model.Price;
import kz.bitlab.techorda.spring_final_project.service.PriceService;
import kz.bitlab.techorda.spring_final_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/market")
@RequiredArgsConstructor
public class PriceRestController {

    private final PriceService priceService;

    @GetMapping
    public List<PriceDTO> priceList() {return priceService.getAllPrices();}

//    @GetMapping(value = "/get-price-list")
//    public String showPrice(Model model) {
//
//        return "marketPrice";
//    }


}
