/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTArrayInitializer.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTArrayInitializer extends AbstractJavaNode {
    public ASTArrayInitializer(int id) {
        super(id);
    }

    public ASTArrayInitializer(JavaParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
