package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRWithProductAndUserDetailsUISpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRWithProductAndUserDetailsUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10653a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final CardUISpec d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final float h;
    public final ChaloPadding i;
    public final float j;
    public final ChaloPadding k;
    public final CardUISpec l;
    public final ChaloPadding m;

    public QRWithProductAndUserDetailsUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, Dp.m7278constructorimpl(ChaloThemeHelper.a().r + ChaloThemeHelper.a().h), 6);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 2);
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().d;
        CardUISpec cardUISpec = new CardUISpec(new UIShape.Rectangle(f2, f2, f2, f2), f, 0.0f, 4);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 0.0f, 0.0f, 14);
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding5 = new ChaloPadding(f4, f3, f3, f4);
        float f5 = ChaloThemeHelper.a().L;
        ChaloPadding chaloPadding6 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().r + ChaloThemeHelper.a().h);
        ChaloPadding chaloPadding7 = new ChaloPadding(ChaloThemeHelper.a().W, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        CardUISpec cardUISpec2 = new CardUISpec(UIShape.e, 0.0f, 0.0f, 6);
        ChaloPadding chaloPadding8 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        this.f10653a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = cardUISpec;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
        this.g = chaloPadding5;
        this.h = f5;
        this.i = chaloPadding6;
        this.j = fM7278constructorimpl;
        this.k = chaloPadding7;
        this.l = cardUISpec2;
        this.m = chaloPadding8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRWithProductAndUserDetailsUISpec)) {
            return false;
        }
        QRWithProductAndUserDetailsUISpec qRWithProductAndUserDetailsUISpec = (QRWithProductAndUserDetailsUISpec) obj;
        return Intrinsics.d(this.f10653a, qRWithProductAndUserDetailsUISpec.f10653a) && Intrinsics.d(this.b, qRWithProductAndUserDetailsUISpec.b) && Intrinsics.d(this.c, qRWithProductAndUserDetailsUISpec.c) && Intrinsics.d(this.d, qRWithProductAndUserDetailsUISpec.d) && Intrinsics.d(this.e, qRWithProductAndUserDetailsUISpec.e) && Intrinsics.d(this.f, qRWithProductAndUserDetailsUISpec.f) && Intrinsics.d(this.g, qRWithProductAndUserDetailsUISpec.g) && Dp.m7283equalsimpl0(this.h, qRWithProductAndUserDetailsUISpec.h) && Intrinsics.d(this.i, qRWithProductAndUserDetailsUISpec.i) && Dp.m7283equalsimpl0(this.j, qRWithProductAndUserDetailsUISpec.j) && Intrinsics.d(this.k, qRWithProductAndUserDetailsUISpec.k) && Intrinsics.d(this.l, qRWithProductAndUserDetailsUISpec.l) && Intrinsics.d(this.m, qRWithProductAndUserDetailsUISpec.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + r30.c(this.k, uf0.a(this.j, r30.c(this.i, uf0.a(this.h, r30.c(this.g, r30.c(this.f, r30.c(this.e, (this.d.hashCode() + r30.c(this.c, r30.c(this.b, this.f10653a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.j);
        StringBuilder sbI = py.i(this.b, this.f10653a, "QRWithProductAndUserDetailsUISpec(background=", ", internalPadding=", ", paddingAroundCards=");
        sbI.append(this.c);
        sbI.append(", cardSpec=");
        sbI.append(this.d);
        sbI.append(", paddingAroundBranding=");
        r30.o(sbI, this.e, ", paddingAroundQrUpdateTs=", this.f, ", paddingAroundQr=");
        py.u(sbI, this.g, ", qrMinWidth=", strM7289toStringimpl, ", paddingAroundDottedDivider=");
        py.u(sbI, this.i, ", busAnimationAreaHeight=", strM7289toStringimpl2, ", switchToBleCalloutPadding=");
        sbI.append(this.k);
        sbI.append(", viewDetailsCardSpec=");
        sbI.append(this.l);
        sbI.append(", viewDetailsDividerPadding=");
        return py.e(sbI, this.m, ")");
    }
}
