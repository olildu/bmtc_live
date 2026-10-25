package app.chalo.uistate.components;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.UISize;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/FilledIconSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FilledIconSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UISize f9935a;

    public FilledIconSpec(UISize uISize) {
        UIShape.Circle circle = UIShape.Circle.p;
        this.f9935a = uISize;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilledIconSpec)) {
            return false;
        }
        FilledIconSpec filledIconSpec = (FilledIconSpec) obj;
        ChaloColorToken.Orange2 orange2 = ChaloColorToken.Orange2.f9830a;
        if (!orange2.equals(orange2)) {
            return false;
        }
        UIShape.Circle circle = UIShape.Circle.p;
        return circle.equals(circle) && this.f9935a.equals(filledIconSpec.f9935a);
    }

    public final int hashCode() {
        UIShape.Circle circle = UIShape.Circle.p;
        return this.f9935a.hashCode() - 1888139795;
    }

    public final String toString() {
        return "FilledIconSpec(backgroundColor=" + ChaloColorToken.Orange2.f9830a + ", shape=" + UIShape.Circle.p + ", size=" + this.f9935a + ")";
    }
}
