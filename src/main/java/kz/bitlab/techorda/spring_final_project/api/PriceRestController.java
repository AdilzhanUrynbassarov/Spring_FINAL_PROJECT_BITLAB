package kz.bitlab.techorda.spring_final_project.api;


import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/market")
@RequiredArgsConstructor
public class PriceRestController {

    private final PriceService priceService;

    @GetMapping
    public List<PriceDTO> priceList() {return priceService.getAllPrices();}

    @GetMapping(value = "{id}")
    public PriceDTO getPrice(@PathVariable(name = "id")Long id) { return priceService.getPrice(id);}

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public PriceDTO addPrice(@RequestBody PriceDTO price) {
        return priceService.addPrice(price);
    }


    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public PriceDTO updatePrice(@RequestBody PriceDTO price) {
        return priceService.updatePrice(price);
    }
    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void deletePrice(@PathVariable(name = "id") Long id) {
        priceService.deletePrice(id);
    }
}
