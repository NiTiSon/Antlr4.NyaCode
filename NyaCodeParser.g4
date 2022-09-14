parser grammar NyaCodeParser;

options { tokenVocab=NyaCodeLexer; superClass = NyaCodeParserBase; }

compilation_unit
    : NYA* EOF
    ;