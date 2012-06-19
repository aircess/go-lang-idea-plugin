package ro.redeul.google.go.lang.psi.resolve;

import ro.redeul.google.go.lang.psi.resolve.references.CallOrConversionReference;
import ro.redeul.google.go.lang.psi.toplevel.GoFunctionDeclaration;
import ro.redeul.google.go.lang.psi.toplevel.GoMethodDeclaration;
import ro.redeul.google.go.lang.psi.toplevel.GoTypeSpec;

public class MethodOrTypeNameResolver extends GoPsiReferenceResolver<CallOrConversionReference>
{
    public MethodOrTypeNameResolver(CallOrConversionReference reference) {
        super(reference);
    }

    @Override
    public void visitFunctionDeclaration(GoFunctionDeclaration declaration) {
        if  ( getReference().isReferenceTo(declaration) )
            addDeclaration(declaration);
    }

    @Override
    public void visitMethodDeclaration(GoMethodDeclaration declaration) {
        if  ( getReference().isReferenceTo(declaration) )
            addDeclaration(declaration);
    }

    @Override
    public void visitTypeSpec(GoTypeSpec type) {
        if ( getReference().isReferenceTo(type) )
            addDeclaration(type);
    }
}
