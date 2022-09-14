using Antlr4.Ewample;
using Antlr4.Runtime;

public sealed class Program
{
	public static void Main(string[] args)
	{
		AntlrInputStream stream = new(File.ReadAllText("test.nya"));

		NyaCodeLexer lexer = new(stream);
		CommonTokenStream tokenStream = new(lexer);
		NyaCodeParser parser = new(tokenStream);
		NyaCodeParser.Compilation_unitContext u = parser.compilation_unit();

		NyaCodeParserBaseVisitor<object> visitor = new();
		visitor.Visit(u);
	}
}