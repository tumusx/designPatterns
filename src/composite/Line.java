package composite;

import java.util.List;

public class Line extends Grafico {

	@Override
	public void add(Grafico grafico) {
	}

	@Override
	public void remove(Grafico grafico) {
	}

	@Override
	public List<Grafico> getChilds() {
		return null;
	}

	@Override
	public void drawlable() {
		System.out.print("Line");
	}

}
