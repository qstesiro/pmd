/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTContent.java */

package net.sourceforge.pmd.lang.jsp.ast;

public class ASTContent extends AbstractJspNode {
    public ASTContent(int id) {
        super(id);
    }

    public ASTContent(JspParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
