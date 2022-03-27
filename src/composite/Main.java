package composite;

public class Main {
	public static void main(String[] args) {
		Grafico grafico = new Picture();
		Picture picture = new Picture();
		Retangulo retangulo = new Retangulo();
		Text texto = new Text();
		Line line = new Line();
		
		picture.add(retangulo);
		picture.add(texto);
		picture.add(line);
		
		Line l1 = new Line();
		Retangulo r1 = new Retangulo();
		
		grafico.add(picture);
		grafico.add(l1);
		grafico.add(r1);
		
		grafico.drawlable();
	}
}
