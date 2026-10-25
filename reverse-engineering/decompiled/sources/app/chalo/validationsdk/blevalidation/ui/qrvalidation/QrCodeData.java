package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.scenes.args.QRValidationType;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QrCodeData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrCodeData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10654a;
    public final String b;
    public final boolean c;
    public final QRValidationType d;

    public QrCodeData(String str, String str2, boolean z, QRValidationType qrValidationType) {
        Intrinsics.i(qrValidationType, "qrValidationType");
        this.f10654a = str;
        this.b = str2;
        this.c = z;
        this.d = qrValidationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrCodeData)) {
            return false;
        }
        QrCodeData qrCodeData = (QrCodeData) obj;
        return Intrinsics.d(this.f10654a, qrCodeData.f10654a) && Intrinsics.d(this.b, qrCodeData.b) && this.c == qrCodeData.c && this.d == qrCodeData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f10654a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("QrCodeData(qrCode=", this.f10654a, ", ticketNumber=", this.b, ", isSelected=");
        sbE.append(this.c);
        sbE.append(", qrValidationType=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
