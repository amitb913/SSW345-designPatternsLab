package designPatternsLab;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
