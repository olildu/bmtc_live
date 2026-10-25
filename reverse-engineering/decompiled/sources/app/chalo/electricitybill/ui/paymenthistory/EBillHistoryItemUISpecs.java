package app.chalo.electricitybill.ui.paymenthistory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.card.CardUISpec;
import defpackage.py;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/EBillHistoryItemUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillHistoryItemUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f2595a;
    public final float b;
    public final ChaloPadding c;

    public EBillHistoryItemUISpecs() {
        CardUISpec cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        this.f2595a = cardUISpec;
        this.b = f;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillHistoryItemUISpecs)) {
            return false;
        }
        EBillHistoryItemUISpecs eBillHistoryItemUISpecs = (EBillHistoryItemUISpecs) obj;
        return Intrinsics.d(this.f2595a, eBillHistoryItemUISpecs.f2595a) && Dp.m7283equalsimpl0(this.b, eBillHistoryItemUISpecs.b) && Intrinsics.d(this.c, eBillHistoryItemUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.a(this.b, this.f2595a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        StringBuilder sb = new StringBuilder("EBillHistoryItemUISpecs(cardUISpec=");
        sb.append(this.f2595a);
        sb.append(", horizontalSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", cardPadding=");
        return py.e(sb, this.c, ")");
    }
}
