package app.chalo.userprofile.ui.minprofileupdate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateScreenSpecs;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinProfileUpdateScreenSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10406a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloColorToken e;
    public final float f;
    public final ChaloPadding g;
    public final float h;
    public final ChaloColorToken i;

    public MinProfileUpdateScreenSpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        float f = ChaloThemeHelper.a().e;
        float f2 = ChaloThemeHelper.a().k;
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f4, f4, f4, f4);
        float f5 = ChaloThemeHelper.a().h;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        this.f10406a = white;
        this.b = chaloPadding;
        this.c = f;
        this.d = f2;
        this.e = white;
        this.f = f3;
        this.g = chaloPadding2;
        this.h = f5;
        this.i = ChaloColorToken.Black_03.f9760a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinProfileUpdateScreenSpecs)) {
            return false;
        }
        MinProfileUpdateScreenSpecs minProfileUpdateScreenSpecs = (MinProfileUpdateScreenSpecs) obj;
        return Intrinsics.d(this.f10406a, minProfileUpdateScreenSpecs.f10406a) && Intrinsics.d(this.b, minProfileUpdateScreenSpecs.b) && Dp.m7283equalsimpl0(this.c, minProfileUpdateScreenSpecs.c) && Dp.m7283equalsimpl0(this.d, minProfileUpdateScreenSpecs.d) && Intrinsics.d(this.e, minProfileUpdateScreenSpecs.e) && Dp.m7283equalsimpl0(this.f, minProfileUpdateScreenSpecs.f) && Intrinsics.d(this.g, minProfileUpdateScreenSpecs.g) && Dp.m7283equalsimpl0(this.h, minProfileUpdateScreenSpecs.h) && Intrinsics.d(this.i, minProfileUpdateScreenSpecs.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + uf0.a(this.h, r30.c(this.g, uf0.a(this.f, z40.b(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f10406a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.h);
        StringBuilder sbI = py.i(this.b, this.f10406a, "MinProfileUpdateScreenSpecs(containerBackgroundColor=", ", contentPadding=", ", titleToSubtitleSpacing=");
        cb0.t(sbI, strM7289toStringimpl, ", subtitleToStepSpacing=", strM7289toStringimpl2, ", footerBackgroundColor=");
        sbI.append(this.e);
        sbI.append(", footerButtonSpacing=");
        sbI.append(strM7289toStringimpl3);
        sbI.append(", footerPadding=");
        py.u(sbI, this.g, ", buttonsSectionElevation=", strM7289toStringimpl4, ", buttonsSectionShadowColor=");
        return pk0.j(sbI, this.i, ")");
    }
}
