package app.chalo.quickpay.ui.tripamount;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickPatTripAmountUISpec;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickPatTripAmountUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8892a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final ChaloPadding h;
    public final ChaloPadding i;
    public final ChaloPadding j;

    public QuickPatTripAmountUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 0.0f, 0.0f, 13);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().m, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().W, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding5 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding6 = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding7 = new ChaloPadding(ChaloThemeHelper.a().k, 0.0f, 0.0f, 0.0f, 14);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().j;
        ChaloPadding chaloPadding8 = new ChaloPadding(f2, f, f, f2);
        ChaloPadding chaloPadding9 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        this.f8892a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
        this.e = chaloPadding4;
        this.f = chaloPadding5;
        this.g = chaloPadding6;
        this.h = chaloPadding7;
        this.i = chaloPadding8;
        this.j = chaloPadding9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPatTripAmountUISpec)) {
            return false;
        }
        QuickPatTripAmountUISpec quickPatTripAmountUISpec = (QuickPatTripAmountUISpec) obj;
        return Intrinsics.d(this.f8892a, quickPatTripAmountUISpec.f8892a) && Intrinsics.d(this.b, quickPatTripAmountUISpec.b) && Intrinsics.d(this.c, quickPatTripAmountUISpec.c) && Intrinsics.d(this.d, quickPatTripAmountUISpec.d) && Intrinsics.d(this.e, quickPatTripAmountUISpec.e) && Intrinsics.d(this.f, quickPatTripAmountUISpec.f) && Intrinsics.d(this.g, quickPatTripAmountUISpec.g) && Intrinsics.d(this.h, quickPatTripAmountUISpec.h) && Intrinsics.d(this.i, quickPatTripAmountUISpec.i) && Intrinsics.d(this.j, quickPatTripAmountUISpec.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + r30.c(this.i, r30.c(this.h, r30.c(this.g, r30.c(this.f, r30.c(this.e, r30.c(this.d, r30.c(this.c, z40.b(this.b, this.f8892a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f8892a, this.b, "QuickPatTripAmountUISpec(padding=", ", backgroundColor=", ", paddingAroundHeading=");
        r30.o(sbL, this.c, ", paddingAroundTitle=", this.d, ", paddingAroundDisclaimer=");
        r30.o(sbL, this.e, ", paddingAroundTextField=", this.f, ", paddingAroundErrorText=");
        r30.o(sbL, this.g, ", paddingAroundNextBtn=", this.h, ", paddingAroundQuickPayHistory=");
        sbL.append(this.i);
        sbL.append(", paddingAroundDivider=");
        sbL.append(this.j);
        sbL.append(")");
        return sbL.toString();
    }
}
