package gustavo.respository;


import gustavo.dto.PecasResponseDto;
import gustavo.model.BlocoPeca;
import jakarta.persistence.*;
import gustavo.model.Pecas;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class PecasRepository implements PanacheRepository<Pecas> {

}
