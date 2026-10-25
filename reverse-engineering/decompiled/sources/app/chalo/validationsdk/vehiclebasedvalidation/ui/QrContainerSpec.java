package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QrContainerSpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10732a;
    public final List b;
    public final float c;
    public final float d;
    public final float e;

    public QrContainerSpec(ChaloPadding chaloPadding, List backgroundGradientList, float f, float f2, float f3) {
        Intrinsics.i(backgroundGradientList, "backgroundGradientList");
        this.f10732a = chaloPadding;
        this.b = backgroundGradientList;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrContainerSpec)) {
            return false;
        }
        QrContainerSpec qrContainerSpec = (QrContainerSpec) obj;
        return Intrinsics.d(this.f10732a, qrContainerSpec.f10732a) && Intrinsics.d(this.b, qrContainerSpec.b) && Dp.m7283equalsimpl0(this.c, qrContainerSpec.c) && Dp.m7283equalsimpl0(this.d, qrContainerSpec.d) && Dp.m7283equalsimpl0(this.e, qrContainerSpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, uf0.a(this.c, r30.b(this.f10732a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("QrContainerSpec(contentPadding=");
        sb.append(this.f10732a);
        sb.append(", backgroundGradientList=");
        sb.append(this.b);
        sb.append(", titleAndDescriptionSpacing=");
        cb0.t(sb, strM7289toStringimpl, ", descriptionAndQrSpacing=", strM7289toStringimpl2, ", qrAndExpirySpacing=");
        return vo1.p(sb, strM7289toStringimpl3, ")");
    }
}
