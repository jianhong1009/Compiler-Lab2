grammar lab2;

// 删除左递归的方法（改写成右递归）
// A: Aa | b;
// becomes
// A: bR;
// fragment R: (aR)?;

// 以下三行是有左递归的文法，要改写成右递归
// DecimalConst: NonzeroDigit | DecimalConst Digit;
// OctalConst: '0' | OctalConst OctalDigit;
// HexadecimalConst: HexadecimalPrefix HexadecimalDigit | HexadecimalConst HexadecimalDigit;

// 用来skip spaces, tabs, newlines
WS: [ \t\r\n]+ -> skip;

DecimalConst: NonzeroDigit DC;
fragment DC: (Digit DC)?;
OctalConst: '0' OC;
fragment OC: (OctalDigit OC)?;
HexadecimalConst: HexadecimalPrefix HexadecimalDigit HC;
fragment HC: (HexadecimalDigit HC)?;

HexadecimalPrefix: '0x' | '0X';
Digit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
NonzeroDigit: '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
OctalDigit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
HexadecimalDigit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

//Exp: AddExp;
//// addExp: mulExp | addExp ('+' | '−') mulExp;
//AddExp: MulExp AE;
//fragment AE: (('+' | '−') MulExp AE)?;
//// mulExp: unaryExp | mulExp ('*' | '/' | '%') unaryExp;
//MulExp: UnaryExp ME;
//fragment ME: (('*' | '/' | '%') UnaryExp ME)?;
//UnaryExp: PrimaryExp | UnaryOp UnaryExp;
//PrimaryExp: '(' Exp ')' | Number;
//UnaryOp: '+' | '-';
//Number: DecimalConst | OctalConst | HexadecimalConst;

// compUnit是文法的起点
compUnit: funcDef;
funcDef: funcType ident '(' ')' block;
funcType: 'int';
ident: 'main';
block: '{' stmt '}';
stmt: 'return' exp ';';

exp: addExp;
addExp: mulExp | addExp addSub mulExp;
addSub: '+' | '-';
mulExp: unaryExp | mulExp mulDiv unaryExp;
mulDiv: '*' | '/' | '%';
unaryExp: primaryExp | unaryOp unaryExp;
primaryExp: '(' exp ')' | number;
unaryOp: '+' | '-';
number: DecimalConst | OctalConst | HexadecimalConst;

