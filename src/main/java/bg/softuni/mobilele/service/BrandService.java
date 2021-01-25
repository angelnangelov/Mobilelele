package bg.softuni.mobilele.service;

import bg.softuni.mobilele.model.entities.view.BrandViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
  List<BrandViewModel> getAllBrands();
}
