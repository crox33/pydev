// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class UnaryOp extends exprType implements unaryopType {
    public int op;
    public exprType operand;

    public UnaryOp(int op, exprType operand) {
        this.op = op;
        this.operand = operand;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + op;
        result = prime * result + ((operand == null) ? 0 : operand.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UnaryOp other = (UnaryOp) obj;
        if (this.op != other.op)
            return false;
        if (operand == null) {
            if (other.operand != null)
                return false;
        } else if (!operand.equals(other.operand))
            return false;
        return true;
    }

    public UnaryOp createCopy() {
        return createCopy(true);
    }

    public UnaryOp createCopy(boolean copyComments) {
        UnaryOp temp = new UnaryOp(op,
                operand != null ? (exprType) operand.createCopy(copyComments) : null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if (this.specialsBefore != null && copyComments) {
            for (Object o : this.specialsBefore) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if (this.specialsAfter != null && copyComments) {
            for (Object o : this.specialsAfter) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("UnaryOp[");
        sb.append("op=");
        sb.append(dumpThis(this.op, unaryopType.unaryopTypeNames));
        sb.append(", ");
        sb.append("operand=");
        sb.append(dumpThis(this.operand));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitUnaryOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (operand != null) {
            operand.accept(visitor);
        }
    }

}