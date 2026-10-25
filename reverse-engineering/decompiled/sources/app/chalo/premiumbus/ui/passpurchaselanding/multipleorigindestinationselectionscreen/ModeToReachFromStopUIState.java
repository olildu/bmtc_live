package app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dd;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/multipleorigindestinationselectionscreen/ModeToReachFromStopUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ModeToReachFromStopUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7680a;
    public final float b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final TextUIState.ChaloTextUIState e;

    public ModeToReachFromStopUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().d;
        this.f7680a = f;
        this.b = f2;
        this.c = chaloTextUIState;
        this.d = imageUIState;
        this.e = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeToReachFromStopUIState)) {
            return false;
        }
        ModeToReachFromStopUIState modeToReachFromStopUIState = (ModeToReachFromStopUIState) obj;
        return Dp.m7283equalsimpl0(this.f7680a, modeToReachFromStopUIState.f7680a) && Dp.m7283equalsimpl0(this.b, modeToReachFromStopUIState.b) && Intrinsics.d(this.c, modeToReachFromStopUIState.c) && Intrinsics.d(this.d, modeToReachFromStopUIState.d) && Intrinsics.d(this.e, modeToReachFromStopUIState.e);
    }

    public final int hashCode() {
        int iA = uf0.a(this.b, Dp.m7284hashCodeimpl(this.f7680a) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.e.hashCode() + r30.e(this.d, (iA + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ModeToReachFromStopUIState(stopTypeAndModeIconSpacing=", Dp.m7289toStringimpl(this.f7680a), ", modeIconAndTimeToReachTextSpacing=", Dp.m7289toStringimpl(this.b), ", stopType=");
        sbE.append(this.c);
        sbE.append(", modeIcon=");
        sbE.append(this.d);
        sbE.append(", timeToReachWithStopName=");
        return py.f(sbE, this.e, ")");
    }
}
