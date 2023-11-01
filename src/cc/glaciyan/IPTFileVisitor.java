package cc.glaciyan;

import cc.glaciyan.ipt.IPTBaseVisitor;
import cc.glaciyan.ipt.IPTParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class IPTFileVisitor extends IPTBaseVisitor<IPTAny> {
    @Override
    public IPTAny visitStart(IPTParser.StartContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public IPTAny visitList(IPTParser.ListContext ctx) {
        var result = new IPTList();

        for (int i = 0; i < ctx.getChildCount(); ++i) {
            ParseTree c = ctx.getChild(i);
            IPTAny childResult = c.accept(this);
            result.add(childResult);
        }

        return result;
    }

    @Override
    public IPTAny visitValue(IPTParser.ValueContext ctx) {
        if (ctx.STRING() != null) {
            var text = ctx.STRING().getText();
            return new IPTString(text.substring(1, text.length() - 1));
        }

        if (ctx.NUMBER() != null) {
            var text = ctx.NUMBER().getText();
            return new IPTNumber(Integer.parseInt(text));
        }

        return visitChildren(ctx);
    }

    @Override
    public IPTAny visitNamed(IPTParser.NamedContext ctx) {
        var val = ctx.value();

        if (val.STRING() != null) {
            var text = visitChildren(ctx);
            return new IPTNamed.String(ctx.VARNAME().getText(), (IPTString) text);
        }


        if (val.NUMBER() != null) {
            var num = visitChildren(ctx);
            return new IPTNamed.Number(ctx.VARNAME().getText(), (IPTNumber) num);
        }

        if (val.list() != null) {
            var list = visitChildren(ctx);
            return new IPTNamed.List(ctx.VARNAME().getText(), (IPTList) list);
        }

        return null;
    }
}
