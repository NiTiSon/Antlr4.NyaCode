using Antlr4.Runtime;

namespace Antlr4.Ewample;

public abstract class NyaCodeLexerBase : Lexer
{
	private readonly ICharStream input;
	public NyaCodeLexerBase(ICharStream input)
		: base(input)
	{
		this.input = input;
	}
	public NyaCodeLexerBase(ICharStream input, TextWriter output, TextWriter errorOutput)
		: base(input, output, errorOutput)
	{
		this.input = input;
	}
	public uint nyaCount;
	public void Nya()
	{
		Console.WriteLine($"Nya N.{++nyaCount} at l{Line} c{Column}");
	}
}
