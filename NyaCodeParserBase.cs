using Antlr4.Runtime;

namespace Antlr4.Ewample;

public abstract class NyaCodeParserBase : Parser
{
	public NyaCodeParserBase(ITokenStream input) : base(input)
	{
	}
	public NyaCodeParserBase(ITokenStream input, TextWriter output, TextWriter errorOutput) : base(input, output, errorOutput)
	{
	}
}
