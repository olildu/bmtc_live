package app.chalo.premiumbus.ui.changestop;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.slotselection.ODPairTagsUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PbStopInfoCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbStopInfoCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7524a;
    public final TextUIState.ChaloTextUIState b;
    public final RadioButtonUIState c;
    public final ODPairTagsUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final UIShape f;
    public final ChaloPadding g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PbStopInfoCardUIState(TextUIState.ChaloTextUIState stopName, TextUIState.ChaloTextUIState scheduledTime, RadioButtonUIState radioButtonUIState, ODPairTagsUIState oDPairTagsUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        UIShape.Rectangle cardShape = UIShape.e;
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(scheduledTime, "scheduledTime");
        Intrinsics.i(radioButtonUIState, "radioButtonUIState");
        Intrinsics.i(cardShape, "cardShape");
        this.f7524a = stopName;
        this.b = scheduledTime;
        this.c = radioButtonUIState;
        this.d = oDPairTagsUIState;
        this.e = chaloTextUIState;
        this.f = cardShape;
        this.g = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbStopInfoCardUIState)) {
            return false;
        }
        PbStopInfoCardUIState pbStopInfoCardUIState = (PbStopInfoCardUIState) obj;
        return Intrinsics.d(this.f7524a, pbStopInfoCardUIState.f7524a) && Intrinsics.d(this.b, pbStopInfoCardUIState.b) && Intrinsics.d(this.c, pbStopInfoCardUIState.c) && Intrinsics.d(this.d, pbStopInfoCardUIState.d) && Intrinsics.d(this.e, pbStopInfoCardUIState.e) && Intrinsics.d(this.f, pbStopInfoCardUIState.f) && Intrinsics.d(this.g, pbStopInfoCardUIState.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + r30.f(this.b, this.f7524a.hashCode() * 31, 31)) * 31;
        ODPairTagsUIState oDPairTagsUIState = this.d;
        int iHashCode2 = (iHashCode + (oDPairTagsUIState == null ? 0 : oDPairTagsUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        return this.g.hashCode() + pk0.b(this.f, (iHashCode2 + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("PbStopInfoCardUIState(stopName=", this.f7524a, ", scheduledTime=", this.b, ", radioButtonUIState=");
        sbJ.append(this.c);
        sbJ.append(", currentPickupTagUIState=");
        sbJ.append(this.d);
        sbJ.append(", liveEtaTextUIState=");
        sbJ.append(this.e);
        sbJ.append(", cardShape=");
        sbJ.append(this.f);
        sbJ.append(", contentPadding=");
        return py.e(sbJ, this.g, ")");
    }
}
