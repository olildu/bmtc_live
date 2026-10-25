package app.chalo.electricitybill.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/uistate/CustomerInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomerInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2610a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;

    public CustomerInfoUIState(ChaloPadding sectionPadding, TextUIState.ChaloTextUIState customerName, TextUIState.ChaloTextUIState chaloTextUIState, int i) {
        float f = ChaloThemeHelper.a().d;
        sectionPadding = (i & 4) != 0 ? new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2) : sectionPadding;
        Intrinsics.i(sectionPadding, "sectionPadding");
        Intrinsics.i(customerName, "customerName");
        this.f2610a = f;
        this.b = ChaloColorToken.White.f9870a;
        this.c = sectionPadding;
        this.d = customerName;
        this.e = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerInfoUIState)) {
            return false;
        }
        CustomerInfoUIState customerInfoUIState = (CustomerInfoUIState) obj;
        return Dp.m7283equalsimpl0(this.f2610a, customerInfoUIState.f2610a) && Intrinsics.d(this.b, customerInfoUIState.b) && Intrinsics.d(this.c, customerInfoUIState.c) && Intrinsics.d(this.d, customerInfoUIState.d) && Intrinsics.d(this.e, customerInfoUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.f(this.d, r30.c(this.c, z40.b(this.b, Dp.m7284hashCodeimpl(this.f2610a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f2610a);
        StringBuilder sb = new StringBuilder("CustomerInfoUIState(spacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", componentColor=");
        sb.append(this.b);
        sb.append(", sectionPadding=");
        sb.append(this.c);
        sb.append(", customerName=");
        sb.append(this.d);
        sb.append(", customerNo=");
        return py.f(sb, this.e, ")");
    }
}
