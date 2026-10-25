package app.chalo.compose.theme;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/ShapedContentUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShapedContentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1924a;
    public final BorderUISpec b;
    public final ChaloColorToken c;

    public ShapedContentUIState(float f, BorderUISpec borderUISpec, ChaloColorToken fillColor) {
        UIShape.Circle circle = UIShape.Circle.p;
        Intrinsics.i(fillColor, "fillColor");
        this.f1924a = f;
        this.b = borderUISpec;
        this.c = fillColor;
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
        if (!(obj instanceof ShapedContentUIState)) {
            return false;
        }
        ShapedContentUIState shapedContentUIState = (ShapedContentUIState) obj;
        if (!Dp.m7283equalsimpl0(this.f1924a, shapedContentUIState.f1924a)) {
            return false;
        }
        UIShape.Circle circle = UIShape.Circle.p;
        return circle.equals(circle) && this.b.equals(shapedContentUIState.b) && Intrinsics.d(this.c, shapedContentUIState.c);
    }

    public final int hashCode() {
        int iM7284hashCodeimpl = Dp.m7284hashCodeimpl(this.f1924a) * 31;
        UIShape.Circle circle = UIShape.Circle.p;
        return this.c.hashCode() + ((this.b.hashCode() + ((755485070 + iM7284hashCodeimpl) * 31)) * 31);
    }

    public final String toString() {
        return "ShapedContentUIState(size=" + Dp.m7289toStringimpl(this.f1924a) + ", shape=" + UIShape.Circle.p + ", border=" + this.b + ", fillColor=" + this.c + ")";
    }
}
