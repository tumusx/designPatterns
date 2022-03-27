package composite;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Grafico {
private List<Grafico> childs = new ArrayList<Grafico>();

	
	@Override
	public void add(Grafico grafico) {
		childs.add(grafico);
	}

	@Override
	public void remove(Grafico grafico) {
		childs.remove(grafico);
	}

	@Override
	public List<Grafico> getChilds() {
		return childs;
	}

	@Override
	public void drawlable() {
		for(Grafico grafico : childs) {
			grafico.drawlable();
		}
	}
}
