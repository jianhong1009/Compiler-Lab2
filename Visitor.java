/*
compUnit: funcDef;
funcDef: funcType ident '(' ')' block;
funcType: 'int';
ident: 'main';
block: '{' stmt '}';
stmt: 'return' number ';';
number: DecimalConst | OctalConst | HexadecimalConst;
*/

public class Visitor extends lab1BaseVisitor<Void> {
    public static String str = "";

    @Override
    public Void visitCompUnit(lab1Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(lab1Parser.FuncDefContext ctx) {
        str += "define dso_local ";
        // System.out.print("define dso_local ");
        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitFuncType(lab1Parser.FuncTypeContext ctx) {
        str += "i32 ";
        // System.out.print("i32 ");
        return null;
    }

    @Override
    public Void visitIdent(lab1Parser.IdentContext ctx) {
        str += "@main() ";
        // System.out.print("@main() ");
        return null;
    }

    @Override
    public Void visitBlock(lab1Parser.BlockContext ctx) {
        str += "{\n";
        // System.out.println("{");
        visit(ctx.stmt());
        str += "}\n";
        // System.out.println("}");
        return null;
    }

    @Override
    public Void visitStmt(lab1Parser.StmtContext ctx) {
        str += "    ret ";
        // System.out.print("    ret ");
        visit(ctx.number());
        return null;
    }

    @Override
    public Void visitNumber(lab1Parser.NumberContext ctx) {
        str += "i32 ";
        // System.out.print("i32 ");
        if (ctx.DecimalConst() != null) {
            str += ctx.DecimalConst().getText();
            str += '\n';
            // System.out.println(ctx.DecimalConst().getText());
        } else if (ctx.OctalConst() != null) {
            String s = ctx.OctalConst().getText().substring(1);
            str += String.valueOf(Integer.parseInt(s, 8));
            str += '\n';
            // System.out.println(Integer.parseInt(s, 8));
        } else {
            String s = ctx.HexadecimalConst().getText().substring(2);
            str += String.valueOf(Integer.parseInt(s, 16));
            str += '\n';
            // System.out.println(Integer.parseInt(s, 16));
        }
        return null;
    }
}
