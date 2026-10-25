package app.chalo.premiumbus.ui.passpurchaselanding;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/FromAndToStopCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromAndToStopCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7640a;
    public final float b;
    public final float c;
    public final UIShape d;
    public final float e;
    public final float f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public FromAndToStopCardUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        UIShape.Rectangle cardShape = UIShape.d;
        float f4 = ChaloThemeHelper.b().c;
        float f5 = ChaloThemeHelper.a().n;
        Intrinsics.i(cardShape, "cardShape");
        this.f7640a = chaloPadding;
        this.b = f2;
        this.c = f3;
        this.d = cardShape;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromAndToStopCardUISpecs)) {
            return false;
        }
        FromAndToStopCardUISpecs fromAndToStopCardUISpecs = (FromAndToStopCardUISpecs) obj;
        return Intrinsics.d(this.f7640a, fromAndToStopCardUISpecs.f7640a) && Dp.m7283equalsimpl0(this.b, fromAndToStopCardUISpecs.b) && Dp.m7283equalsimpl0(this.c, fromAndToStopCardUISpecs.c) && Intrinsics.d(this.d, fromAndToStopCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, fromAndToStopCardUISpecs.e) && Dp.m7283equalsimpl0(this.f, fromAndToStopCardUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, pk0.b(this.d, uf0.a(this.c, uf0.a(this.b, this.f7640a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = t10.n("FromAndToStopCardUISpecs(contentPadding=", this.f7640a, ", searchItemAndProceedBtnSpacing=", strM7289toStringimpl, ", itemsSpacing=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", cardShape=");
        sbN.append(this.d);
        sbN.append(", cardElevation=");
        return r30.i(sbN, strM7289toStringimpl3, ", proceedBtnHeight=", strM7289toStringimpl4, ")");
    }
}
