import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Visitor extends lab2BaseVisitor<Void> {
    public PrintStream ps = new PrintStream(new FileOutputStream(Test.outputPath));
    public static String exp = "";

    public Visitor() throws FileNotFoundException {
        System.setOut(ps);
    }

    @Override
    public Void visitCompUnit(lab2Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(lab2Parser.FuncDefContext ctx) {
        System.out.print("define dso_local ");
        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitFuncType(lab2Parser.FuncTypeContext ctx) {
        System.out.print("i32 ");
        return null;
    }

    @Override
    public Void visitIdent(lab2Parser.IdentContext ctx) {
        System.out.print("@main() ");
        return null;
    }

    @Override
    public Void visitBlock(lab2Parser.BlockContext ctx) {
        System.out.println("{");
        visit(ctx.stmt());
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitStmt(lab2Parser.StmtContext ctx) {
        visit(ctx.exp());
        //System.out.print("    ret i32 ");
        new PostfixExpression().func(exp);
        return null;
    }

    @Override
    public Void visitExp(lab2Parser.ExpContext ctx) {
        return super.visitExp(ctx);
    }

    @Override
    public Void visitAddExp(lab2Parser.AddExpContext ctx) {
        return super.visitAddExp(ctx);
    }

    @Override
    public Void visitAddSub(lab2Parser.AddSubContext ctx) {
        exp += ctx.getText();
        return super.visitAddSub(ctx);
    }

    @Override
    public Void visitMulExp(lab2Parser.MulExpContext ctx) {
        return super.visitMulExp(ctx);
    }

    @Override
    public Void visitMulDiv(lab2Parser.MulDivContext ctx) {
        exp += ctx.getText();
        return super.visitMulDiv(ctx);
    }

    @Override
    public Void visitUnaryExp(lab2Parser.UnaryExpContext ctx) {
        return super.visitUnaryExp(ctx);
    }

    @Override
    public Void visitPrimaryExp(lab2Parser.PrimaryExpContext ctx) {
        if (ctx.number() != null) {
            visit(ctx.number());
        } else {
            exp += "(";
            visit(ctx.exp());
            exp += ")";
        }
        return null;
    }

    @Override
    public Void visitUnaryOp(lab2Parser.UnaryOpContext ctx) {
        exp += ctx.getText();
        return super.visitUnaryOp(ctx);
    }

    @Override
    public Void visitNumber(lab2Parser.NumberContext ctx) {
        if (ctx.DecimalConst() != null) {
            exp += ctx.DecimalConst().getText();
        } else if (ctx.OctalConst() != null) {
            String s = ctx.OctalConst().getText().substring(1);
            exp += String.valueOf(Integer.parseInt(s, 8));
        } else {
            String s = ctx.HexadecimalConst().getText().substring(2);
            exp += String.valueOf(Integer.parseInt(s, 16));
        }
        return null;
    }
}
