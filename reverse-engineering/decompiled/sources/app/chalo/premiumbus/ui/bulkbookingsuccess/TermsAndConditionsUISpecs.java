package app.chalo.premiumbus.ui.bulkbookingsuccess;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/TermsAndConditionsUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TermsAndConditionsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7509a;
    public final float b;
    public final float c;

    public TermsAndConditionsUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().d;
        this.f7509a = chaloPadding;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAndConditionsUISpecs)) {
            return false;
        }
        TermsAndConditionsUISpecs termsAndConditionsUISpecs = (TermsAndConditionsUISpecs) obj;
        return Intrinsics.d(this.f7509a, termsAndConditionsUISpecs.f7509a) && Dp.m7283equalsimpl0(this.b, termsAndConditionsUISpecs.b) && Dp.m7283equalsimpl0(this.c, termsAndConditionsUISpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, this.f7509a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return vo1.p(t10.n("TermsAndConditionsUISpecs(contentPadding=", this.f7509a, ", spaceBtwTitleAndList=", strM7289toStringimpl, ", spaceBtwListItems="), Dp.m7289toStringimpl(this.c), ")");
    }
}
