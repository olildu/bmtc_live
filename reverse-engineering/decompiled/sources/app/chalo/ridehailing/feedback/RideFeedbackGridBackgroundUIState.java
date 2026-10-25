package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.color.ColorGradiantUiState;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackGridBackgroundUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackGridBackgroundUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorGradiantUiState.Linear f9142a;
    public final float b;

    public RideFeedbackGridBackgroundUIState(ColorGradiantUiState.Linear linear, float f) {
        this.f9142a = linear;
        this.b = f;
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
        if (!(obj instanceof RideFeedbackGridBackgroundUIState)) {
            return false;
        }
        RideFeedbackGridBackgroundUIState rideFeedbackGridBackgroundUIState = (RideFeedbackGridBackgroundUIState) obj;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        return white.equals(white) && this.f9142a.equals(rideFeedbackGridBackgroundUIState.f9142a) && Dp.m7283equalsimpl0(this.b, rideFeedbackGridBackgroundUIState.b);
    }

    public final int hashCode() {
        return ((Dp.m7284hashCodeimpl(this.b) + ((this.f9142a.hashCode() + 1218434400) * 31)) * 31) + 10;
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        StringBuilder sb = new StringBuilder("RideFeedbackGridBackgroundUIState(lineColor=");
        sb.append(ChaloColorToken.White.f9870a);
        sb.append(", backgroundGradient=");
        sb.append(this.f9142a);
        sb.append(", lineWidth=");
        return vo1.p(sb, strM7289toStringimpl, ", cellCount=10)");
    }
}
