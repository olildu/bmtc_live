package app.chalo.productpurchase.passpurchase.ui.passbookingsuccess;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBookingSuccessUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f8441a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;

    public SuperPassBookingSuccessUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(Dp.m7278constructorimpl(ChaloThemeHelper.a().p + ChaloThemeHelper.a().h), 0.0f, 0.0f, ChaloThemeHelper.a().h, 6);
        ChaloPadding chaloPadding2 = new ChaloPadding(Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d), 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(Dp.m7278constructorimpl(ChaloThemeHelper.a().g + ChaloThemeHelper.a().h), ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g);
        this.f8441a = UiAlignment.Horizontal.Center.f9884a;
        this.b = ChaloColorToken.GreyColor.f9806a;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessUISpec)) {
            return false;
        }
        SuperPassBookingSuccessUISpec superPassBookingSuccessUISpec = (SuperPassBookingSuccessUISpec) obj;
        return Intrinsics.d(this.f8441a, superPassBookingSuccessUISpec.f8441a) && Intrinsics.d(this.b, superPassBookingSuccessUISpec.b) && Intrinsics.d(this.c, superPassBookingSuccessUISpec.c) && Intrinsics.d(this.d, superPassBookingSuccessUISpec.d) && Intrinsics.d(this.e, superPassBookingSuccessUISpec.e) && Intrinsics.d(this.f, superPassBookingSuccessUISpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.c(this.e, r30.c(this.d, r30.c(this.c, z40.b(this.b, this.f8441a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassBookingSuccessUISpec(horizontalAlignment=");
        sb.append(this.f8441a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", internalPadding=");
        r30.o(sb, this.c, ", paddingAroundSuccessTitle=", this.d, ", paddingAroundSeeDetails=");
        sb.append(this.e);
        sb.append(", paddingAroundDetails=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
