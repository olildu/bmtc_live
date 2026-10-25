package app.chalo.uistate.passengercounter;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/passengercounter/PassengerCounterSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerCounterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10062a;
    public final float b;
    public final UIShape c;
    public final ChaloColorToken d;
    public final BorderUISpec e;

    public PassengerCounterSpec(ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().g;
            chaloPadding = new ChaloPadding(f, f, f, f);
        }
        float f2 = ChaloThemeHelper.a().j;
        UIShape.Rectangle backgroundShape = UIShape.c;
        ChaloColorToken chaloColorToken = (i & 8) != 0 ? ChaloColorToken.White.f9870a : ChaloColorToken.Transparent.f9864a;
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, backgroundShape);
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f10062a = chaloPadding;
        this.b = f2;
        this.c = backgroundShape;
        this.d = chaloColorToken;
        this.e = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerCounterSpec)) {
            return false;
        }
        PassengerCounterSpec passengerCounterSpec = (PassengerCounterSpec) obj;
        return Intrinsics.d(this.f10062a, passengerCounterSpec.f10062a) && Dp.m7283equalsimpl0(this.b, passengerCounterSpec.b) && Intrinsics.d(this.c, passengerCounterSpec.c) && Intrinsics.d(this.d, passengerCounterSpec.d) && Intrinsics.d(this.e, passengerCounterSpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z40.b(this.d, pk0.b(this.c, uf0.a(this.b, this.f10062a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("PassengerCounterSpec(contentPadding=", this.f10062a, ", buttonAndCounterSpacing=", Dp.m7289toStringimpl(this.b), ", backgroundShape=");
        sbN.append(this.c);
        sbN.append(", backgroundColor=");
        sbN.append(this.d);
        sbN.append(", borderUISpec=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
