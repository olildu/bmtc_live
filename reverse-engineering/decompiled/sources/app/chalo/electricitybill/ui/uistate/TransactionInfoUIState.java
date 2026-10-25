package app.chalo.electricitybill.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/uistate/TransactionInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TransactionInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f2612a;
    public final float b;
    public final ChaloPadding c;
    public final List d;

    public TransactionInfoUIState(float f, ChaloPadding sectionPadding, List content, int i) {
        f = (i & 2) != 0 ? ChaloThemeHelper.a().f : f;
        sectionPadding = (i & 4) != 0 ? new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2) : sectionPadding;
        Intrinsics.i(sectionPadding, "sectionPadding");
        Intrinsics.i(content, "content");
        this.f2612a = ChaloColorToken.White.f9870a;
        this.b = f;
        this.c = sectionPadding;
        this.d = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionInfoUIState)) {
            return false;
        }
        TransactionInfoUIState transactionInfoUIState = (TransactionInfoUIState) obj;
        return Intrinsics.d(this.f2612a, transactionInfoUIState.f2612a) && Dp.m7283equalsimpl0(this.b, transactionInfoUIState.b) && Intrinsics.d(this.c, transactionInfoUIState.c) && Intrinsics.d(this.d, transactionInfoUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, uf0.a(this.b, this.f2612a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TransactionInfoUIState(componentColor=" + this.f2612a + ", spacing=" + Dp.m7289toStringimpl(this.b) + ", sectionPadding=" + this.c + ", content=" + this.d + ")";
    }
}
