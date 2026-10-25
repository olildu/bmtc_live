package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.gf;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerToolbarUISpecs;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRScannerToolbarUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10721a;
    public final ChaloColorToken b;
    public final UiAlignment.Vertical c;
    public final BorderUISpec d;
    public final ChaloPadding e;
    public final float f;
    public final float g;

    public QRScannerToolbarUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.d);
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().h;
        this.f10721a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = borderUISpec;
        this.e = chaloPadding2;
        this.f = f3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRScannerToolbarUISpecs)) {
            return false;
        }
        QRScannerToolbarUISpecs qRScannerToolbarUISpecs = (QRScannerToolbarUISpecs) obj;
        return Intrinsics.d(this.f10721a, qRScannerToolbarUISpecs.f10721a) && Intrinsics.d(this.b, qRScannerToolbarUISpecs.b) && Intrinsics.d(this.c, qRScannerToolbarUISpecs.c) && Intrinsics.d(this.d, qRScannerToolbarUISpecs.d) && Intrinsics.d(this.e, qRScannerToolbarUISpecs.e) && Dp.m7283equalsimpl0(this.f, qRScannerToolbarUISpecs.f) && Dp.m7283equalsimpl0(this.g, qRScannerToolbarUISpecs.g);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.g) + uf0.a(this.f, r30.c(this.e, (this.d.hashCode() + uf0.e(this.c, z40.b(this.b, this.f10721a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbL = gf.l(this.f10721a, this.b, "QRScannerToolbarUISpecs(contentPadding=", ", backgroundColor=", ", verticalAlignment=");
        sbL.append(this.c);
        sbL.append(", rightItemBorderUISpec=");
        sbL.append(this.d);
        sbL.append(", rightItemPadding=");
        py.u(sbL, this.e, ", spaceBtwIconAndTitle=", strM7289toStringimpl, ", spaceBtwTitleAndRightItem=");
        return vo1.p(sbL, strM7289toStringimpl2, ")");
    }
}
