import org.antlr.v4.runtime.tree.TerminalNode;

public enum Types {
    INT, BOOL, UNIT, UNKNOWN;

    public static Types toType(Task3GramParser.TypeContext type)
    {

        Types t = switch (((TerminalNode) (type.getChild(0))).getSymbol().getType()) {

            case Task3GramParser.IntType -> INT;

            case Task3GramParser.BoolType -> BOOL;

            case Task3GramParser.UnitType -> UNIT;

            default -> throw new RuntimeException("Shouldn't be here - wrong argument for Types.toType().");

        };
        return t;
    }
}

