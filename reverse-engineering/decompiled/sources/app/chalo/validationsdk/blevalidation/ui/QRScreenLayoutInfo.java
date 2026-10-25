package app.chalo.validationsdk.blevalidation.ui;

import defpackage.b3;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/QRScreenLayoutInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRScreenLayoutInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10619a;
    public final String b;
    public final boolean c;

    public QRScreenLayoutInfo(boolean z, String str, boolean z2) {
        this.f10619a = z;
        this.b = str;
        this.c = z2;
    }

    public static QRScreenLayoutInfo a(QRScreenLayoutInfo qRScreenLayoutInfo, boolean z, String currentQrCodeToShow, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = qRScreenLayoutInfo.f10619a;
        }
        if ((i & 2) != 0) {
            currentQrCodeToShow = qRScreenLayoutInfo.b;
        }
        if ((i & 4) != 0) {
            z2 = qRScreenLayoutInfo.c;
        }
        qRScreenLayoutInfo.getClass();
        Intrinsics.i(currentQrCodeToShow, "currentQrCodeToShow");
        return new QRScreenLayoutInfo(z, currentQrCodeToShow, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRScreenLayoutInfo)) {
            return false;
        }
        QRScreenLayoutInfo qRScreenLayoutInfo = (QRScreenLayoutInfo) obj;
        return this.f10619a == qRScreenLayoutInfo.f10619a && Intrinsics.d(this.b, qRScreenLayoutInfo.b) && this.c == qRScreenLayoutInfo.c;
    }

    public final int hashCode() {
        return nf1.e((this.f10619a ? 1231 : 1237) * 31, 31, this.b) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QRScreenLayoutInfo(shouldShouldBleTransmissionIconInQRScreen=");
        sb.append(this.f10619a);
        sb.append(", currentQrCodeToShow=");
        sb.append(this.b);
        sb.append(", shouldShowOptionToSwitchToQRNearbyDevicesFullExplainer=");
        return b3.g(")", sb, this.c);
    }
}
