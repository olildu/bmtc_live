package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRCodeUISpecs;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRCodeUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10630a = ChaloThemeHelper.a().w;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QRCodeUISpecs) && Dp.m7283equalsimpl0(this.f10630a, ((QRCodeUISpecs) obj).f10630a);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f10630a);
    }

    public final String toString() {
        return vo1.B("QRCodeUISpecs(qrSize=", Dp.m7289toStringimpl(this.f10630a), ")");
    }
}
