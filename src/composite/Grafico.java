package composite;

import java.util.List;

public abstract class Grafico {
	// sempre tem que ser abstrato
	
	public abstract void add(Grafico grafico);
	public abstract void remove(Grafico grafico);
	public abstract  List<Grafico> getChilds();
	
	public abstract void drawlable();
}
