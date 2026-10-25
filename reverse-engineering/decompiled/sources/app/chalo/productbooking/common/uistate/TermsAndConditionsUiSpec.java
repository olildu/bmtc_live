package app.chalo.productbooking.common.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/uistate/TermsAndConditionsUiSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TermsAndConditionsUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8271a;
    public final float b;
    public final float c;
    public final float d;

    public TermsAndConditionsUiSpec() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().i;
        float f4 = ChaloThemeHelper.a().d;
        float f5 = ChaloThemeHelper.a().k;
        this.f8271a = chaloPadding;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAndConditionsUiSpec)) {
            return false;
        }
        TermsAndConditionsUiSpec termsAndConditionsUiSpec = (TermsAndConditionsUiSpec) obj;
        return Intrinsics.d(this.f8271a, termsAndConditionsUiSpec.f8271a) && Dp.m7283equalsimpl0(this.b, termsAndConditionsUiSpec.b) && Dp.m7283equalsimpl0(this.c, termsAndConditionsUiSpec.c) && Dp.m7283equalsimpl0(this.d, termsAndConditionsUiSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, this.f8271a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return r30.i(t10.n("TermsAndConditionsUiSpec(sectionPadding=", this.f8271a, ", titleAndTermsSpacing=", strM7289toStringimpl, ", termsSpacing="), Dp.m7289toStringimpl(this.c), ", highlightedTextSpacing=", Dp.m7289toStringimpl(this.d), ")");
    }
}
