import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Banco {

	private String nome;
	private List<Conta> contas;
		
}
