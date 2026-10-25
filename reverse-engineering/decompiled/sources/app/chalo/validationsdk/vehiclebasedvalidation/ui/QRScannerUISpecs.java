package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerUISpecs;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRScannerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10723a;
    public final float b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public QRScannerUISpecs() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().i;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        ChaloPadding chaloPadding2 = new ChaloPadding(Dp.m7278constructorimpl(ChaloThemeHelper.a().l + ChaloThemeHelper.a().d), ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().f);
        this.f10723a = f;
        this.b = f2;
        this.c = chaloPadding;
        this.d = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRScannerUISpecs)) {
            return false;
        }
        QRScannerUISpecs qRScannerUISpecs = (QRScannerUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f10723a, qRScannerUISpecs.f10723a) && Dp.m7283equalsimpl0(this.b, qRScannerUISpecs.b) && Intrinsics.d(this.c, qRScannerUISpecs.c) && Intrinsics.d(this.d, qRScannerUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f10723a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("QRScannerUISpecs(qrAndTicketDetailsContainerSpacing=", Dp.m7289toStringimpl(this.f10723a), ", ticketDetailsAndBottomCtaContainerSpacing=", Dp.m7289toStringimpl(this.b), ", qrContainerHorizontalPadding=");
        sbE.append(this.c);
        sbE.append(", productBrandingPadding=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
