package app.chalo.quickpay.ui.tripamount;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayConfirmationBottomSheetUISpecs;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickpayConfirmationBottomSheetUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8898a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;

    public QuickpayConfirmationBottomSheetUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().i, 1);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding5 = new ChaloPadding(ChaloThemeHelper.a().k, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding6 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding7 = new ChaloPadding(ChaloThemeHelper.a().W, 0.0f, 0.0f, 0.0f, 14);
        this.f8898a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = chaloPadding4;
        this.e = chaloPadding5;
        this.f = chaloPadding6;
        this.g = chaloPadding7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickpayConfirmationBottomSheetUISpecs)) {
            return false;
        }
        QuickpayConfirmationBottomSheetUISpecs quickpayConfirmationBottomSheetUISpecs = (QuickpayConfirmationBottomSheetUISpecs) obj;
        return Intrinsics.d(this.f8898a, quickpayConfirmationBottomSheetUISpecs.f8898a) && Intrinsics.d(this.b, quickpayConfirmationBottomSheetUISpecs.b) && Intrinsics.d(this.c, quickpayConfirmationBottomSheetUISpecs.c) && Intrinsics.d(this.d, quickpayConfirmationBottomSheetUISpecs.d) && Intrinsics.d(this.e, quickpayConfirmationBottomSheetUISpecs.e) && Intrinsics.d(this.f, quickpayConfirmationBottomSheetUISpecs.f) && Intrinsics.d(this.g, quickpayConfirmationBottomSheetUISpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + r30.c(this.f, r30.c(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f8898a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("QuickpayConfirmationBottomSheetUISpecs(internalPadding=", this.f8898a, ", paddingAroundTitle=", this.b, ", paddingAroundAmount=");
        r30.o(sbM, this.c, ", paddingAroundErrorText=", this.d, ", paddingAroundTnc=");
        r30.o(sbM, this.e, ", paddingAroundNextBtn=", this.f, ", paddingAroundYesBankBranding=");
        return py.e(sbM, this.g, ")");
    }
}
