package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassVerificationUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8519a;
    public final ChaloPadding b;
    public final CardUISpec c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final float g;
    public final ChaloPadding h;

    public SuperPassVerificationUISpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        CardUISpec cardUISpec = new CardUISpec(UIShape.e, 0.0f, 0.0f, 6);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f1916a, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        float f2 = ChaloThemeHelper.a().k;
        float f3 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding5 = new ChaloPadding(f3, f3, f3, f3);
        this.f8519a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = cardUISpec;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
        this.g = f2;
        this.h = chaloPadding5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassVerificationUISpec)) {
            return false;
        }
        SuperPassVerificationUISpec superPassVerificationUISpec = (SuperPassVerificationUISpec) obj;
        return Intrinsics.d(this.f8519a, superPassVerificationUISpec.f8519a) && Intrinsics.d(this.b, superPassVerificationUISpec.b) && Intrinsics.d(this.c, superPassVerificationUISpec.c) && Intrinsics.d(this.d, superPassVerificationUISpec.d) && Intrinsics.d(this.e, superPassVerificationUISpec.e) && Intrinsics.d(this.f, superPassVerificationUISpec.f) && Dp.m7283equalsimpl0(this.g, superPassVerificationUISpec.g) && Intrinsics.d(this.h, superPassVerificationUISpec.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uf0.a(this.g, r30.c(this.f, r30.c(this.e, r30.c(this.d, (this.c.hashCode() + r30.c(this.b, this.f8519a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
        StringBuilder sbI = py.i(this.b, this.f8519a, "SuperPassVerificationUISpec(backgroundColor=", ", externalPadding=", ", cardUISpec=");
        sbI.append(this.c);
        sbI.append(", paddingAroundSuccessImage=");
        sbI.append(this.d);
        sbI.append(", paddingAroundTitle=");
        r30.o(sbI, this.e, ", paddingAroundSubTitle=", this.f, ", spaceBetweenNextStepsAndCta=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", paddingAroundPositiveButton=");
        sbI.append(this.h);
        sbI.append(")");
        return sbI.toString();
    }
}
