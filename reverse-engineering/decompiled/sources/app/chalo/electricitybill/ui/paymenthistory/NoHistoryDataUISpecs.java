package app.chalo.electricitybill.ui.paymenthistory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/NoHistoryDataUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoHistoryDataUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f2605a;
    public final UiAlignment.Horizontal b;
    public final UiArrangement.HorizontalOrVertical c;
    public final float d;

    public NoHistoryDataUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().k, 0.0f, 2);
        float f = ChaloThemeHelper.a().i;
        this.f2605a = chaloPadding;
        this.b = UiAlignment.Horizontal.Center.f9884a;
        this.c = UiArrangement.HorizontalOrVertical.Center.f9890a;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoHistoryDataUISpecs)) {
            return false;
        }
        NoHistoryDataUISpecs noHistoryDataUISpecs = (NoHistoryDataUISpecs) obj;
        return Intrinsics.d(this.f2605a, noHistoryDataUISpecs.f2605a) && Intrinsics.d(this.b, noHistoryDataUISpecs.b) && Intrinsics.d(this.c, noHistoryDataUISpecs.c) && Dp.m7283equalsimpl0(this.d, noHistoryDataUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + ((this.c.hashCode() + uf0.d(this.b, this.f2605a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "NoHistoryDataUISpecs(screenPadding=" + this.f2605a + ", horizontalAlignment=" + this.b + ", verticalArrangement=" + this.c + ", imageAndMessageSpacing=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
