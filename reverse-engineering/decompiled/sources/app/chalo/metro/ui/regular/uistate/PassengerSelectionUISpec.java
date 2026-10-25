package app.chalo.metro.ui.regular.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/PassengerSelectionUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerSelectionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5550a;
    public final float b;
    public final float c;
    public final float d;

    public PassengerSelectionUISpec(ChaloPadding chaloPadding) {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().m;
        this.f5550a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerSelectionUISpec)) {
            return false;
        }
        PassengerSelectionUISpec passengerSelectionUISpec = (PassengerSelectionUISpec) obj;
        return Intrinsics.d(this.f5550a, passengerSelectionUISpec.f5550a) && Dp.m7283equalsimpl0(this.b, passengerSelectionUISpec.b) && Dp.m7283equalsimpl0(this.c, passengerSelectionUISpec.c) && Dp.m7283equalsimpl0(this.d, passengerSelectionUISpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, this.f5550a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return r30.i(t10.n("PassengerSelectionUISpec(contentPadding=", this.f5550a, ", titleAndPassengerSelectionSpacing=", strM7289toStringimpl, ", passengerSelectionSpacing="), Dp.m7289toStringimpl(this.c), ", passengerSelectionAndCtaSpacing=", Dp.m7289toStringimpl(this.d), ")");
    }
}
