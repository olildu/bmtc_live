package app.chalo.validationsdk.blevalidation.domain.qrvalidation;

import app.chalo.scenes.args.QRValidationType;
import app.chalo.ticketvalidation.QRValidationStatus;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QrInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10520a;
    public final String b;
    public final QRValidationStatus c;
    public final QRValidationType d;

    public QrInfo(String str, String str2, QRValidationStatus validationStatus, QRValidationType qrValidationType) {
        Intrinsics.i(validationStatus, "validationStatus");
        Intrinsics.i(qrValidationType, "qrValidationType");
        this.f10520a = str;
        this.b = str2;
        this.c = validationStatus;
        this.d = qrValidationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrInfo)) {
            return false;
        }
        QrInfo qrInfo = (QrInfo) obj;
        return Intrinsics.d(this.f10520a, qrInfo.f10520a) && Intrinsics.d(this.b, qrInfo.b) && this.c == qrInfo.c && this.d == qrInfo.d;
    }

    public final int hashCode() {
        int iHashCode = this.f10520a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("QrInfo(qrCode=", this.f10520a, ", ticketNumber=", this.b, ", validationStatus=");
        sbE.append(this.c);
        sbE.append(", qrValidationType=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
