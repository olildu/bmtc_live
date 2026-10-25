package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.cb0;
import defpackage.dd;
import defpackage.py;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicUserInfoSectionUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBasicUserInfoSectionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8410a;
    public final float b;
    public final float c;
    public final float d;
    public final ChaloPadding e;

    public SuperPassBasicUserInfoSectionUISpec() {
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().i;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().i;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 0.0f, Dp.m7278constructorimpl(ChaloThemeHelper.a().f + ChaloThemeHelper.a().d), 7);
        this.f8410a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBasicUserInfoSectionUISpec)) {
            return false;
        }
        SuperPassBasicUserInfoSectionUISpec superPassBasicUserInfoSectionUISpec = (SuperPassBasicUserInfoSectionUISpec) obj;
        return Dp.m7283equalsimpl0(this.f8410a, superPassBasicUserInfoSectionUISpec.f8410a) && Dp.m7283equalsimpl0(this.b, superPassBasicUserInfoSectionUISpec.b) && Dp.m7283equalsimpl0(this.c, superPassBasicUserInfoSectionUISpec.c) && Dp.m7283equalsimpl0(this.d, superPassBasicUserInfoSectionUISpec.d) && Intrinsics.d(this.e, superPassBasicUserInfoSectionUISpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f8410a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f8410a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbE = dd.e("SuperPassBasicUserInfoSectionUISpec(spaceAboveDesc=", strM7289toStringimpl, ", spaceAboveNote=", strM7289toStringimpl2, ", spaceAfterFields=");
        cb0.t(sbE, strM7289toStringimpl3, ", spaceBeforeFields=", strM7289toStringimpl4, ", paddingAroundField=");
        return py.e(sbE, this.e, ")");
    }
}
