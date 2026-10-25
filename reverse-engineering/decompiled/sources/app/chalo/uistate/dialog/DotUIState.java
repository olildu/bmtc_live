package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DotUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DotUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9992a;
    public final UIShape b;
    public final ChaloPadding c;

    public DotUIState(float f, UIShape shape, ChaloPadding chaloPadding) {
        Intrinsics.i(shape, "shape");
        this.f9992a = f;
        this.b = shape;
        this.c = chaloPadding;
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
        if (!(obj instanceof DotUIState)) {
            return false;
        }
        DotUIState dotUIState = (DotUIState) obj;
        if (!Dp.m7283equalsimpl0(this.f9992a, dotUIState.f9992a)) {
            return false;
        }
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        return orangePrimary.equals(orangePrimary) && Intrinsics.d(this.b, dotUIState.b) && this.c.equals(dotUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.b(this.b, ((Dp.m7284hashCodeimpl(this.f9992a) * 31) - 770270357) * 31, 31);
    }

    public final String toString() {
        return "DotUIState(size=" + Dp.m7289toStringimpl(this.f9992a) + ", color=" + ChaloColorToken.OrangePrimary.f9835a + ", shape=" + this.b + ", bottomPadding=" + this.c + ")";
    }
}
