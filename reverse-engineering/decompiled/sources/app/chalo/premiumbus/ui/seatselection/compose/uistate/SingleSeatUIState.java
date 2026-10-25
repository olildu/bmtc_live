package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SingleSeatUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SingleSeatUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7791a;
    public final TextUIState.ChaloTextUIState b;
    public final int c;
    public final int d;
    public final UiEventHandler$Companion$fromLambda$1 e;
    public final float f;

    public SingleSeatUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, int i, int i2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        float f = ChaloThemeHelper.a().n;
        this.f7791a = imageUIState;
        this.b = chaloTextUIState;
        this.c = i;
        this.d = i2;
        this.e = uiEventHandler$Companion$fromLambda$1;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleSeatUIState)) {
            return false;
        }
        SingleSeatUIState singleSeatUIState = (SingleSeatUIState) obj;
        return Intrinsics.d(this.f7791a, singleSeatUIState.f7791a) && Intrinsics.d(this.b, singleSeatUIState.b) && this.c == singleSeatUIState.c && this.d == singleSeatUIState.d && Intrinsics.d(this.e, singleSeatUIState.e) && Dp.m7283equalsimpl0(this.f, singleSeatUIState.f);
    }

    public final int hashCode() {
        ImageUIState imageUIState = this.f7791a;
        int iHashCode = (imageUIState == null ? 0 : imageUIState.hashCode()) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (((((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31) + this.c) * 31) + this.d) * 31;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.e;
        return Dp.m7284hashCodeimpl(this.f) + ((iHashCode2 + (uiEventHandler$Companion$fromLambda$1 != null ? uiEventHandler$Companion$fromLambda$1.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = pk0.n("SingleSeatUIState(imageUIState=", this.f7791a, ", seatNumber=", this.b, ", x=");
        hq0.p(this.c, this.d, ", y=", ", uiEventHandler=", sbN);
        sbN.append(this.e);
        sbN.append(", imageSize=");
        sbN.append(strM7289toStringimpl);
        sbN.append(")");
        return sbN.toString();
    }
}
