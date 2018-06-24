/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTSingleMemberAnnotation.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTSingleMemberAnnotation extends AbstractJavaTypeNode {
    public ASTSingleMemberAnnotation(int id) {
        super(id);
    }

    public ASTSingleMemberAnnotation(JavaParser p, int id) {
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
