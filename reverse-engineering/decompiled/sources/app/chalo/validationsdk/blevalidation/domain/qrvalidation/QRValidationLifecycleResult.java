package app.chalo.validationsdk.blevalidation.domain.qrvalidation;

import defpackage.b3;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QRValidationLifecycleResult;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRValidationLifecycleResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10519a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final boolean f;

    public QRValidationLifecycleResult(List qrInfo, boolean z, boolean z2, long j, long j2, boolean z3) {
        Intrinsics.i(qrInfo, "qrInfo");
        this.f10519a = qrInfo;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.f = z3;
    }

    public static QRValidationLifecycleResult a(QRValidationLifecycleResult qRValidationLifecycleResult, ArrayList arrayList, boolean z, long j, long j2, boolean z2, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = qRValidationLifecycleResult.f10519a;
        }
        List qrInfo = list;
        if ((i & 2) != 0) {
            z = qRValidationLifecycleResult.b;
        }
        boolean z3 = z;
        boolean z4 = qRValidationLifecycleResult.c;
        if ((i & 8) != 0) {
            j = qRValidationLifecycleResult.d;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = qRValidationLifecycleResult.e;
        }
        long j4 = j2;
        boolean z5 = (i & 32) != 0 ? qRValidationLifecycleResult.f : z2;
        qRValidationLifecycleResult.getClass();
        Intrinsics.i(qrInfo, "qrInfo");
        return new QRValidationLifecycleResult(qrInfo, z3, z4, j3, j4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRValidationLifecycleResult)) {
            return false;
        }
        QRValidationLifecycleResult qRValidationLifecycleResult = (QRValidationLifecycleResult) obj;
        return Intrinsics.d(this.f10519a, qRValidationLifecycleResult.f10519a) && this.b == qRValidationLifecycleResult.b && this.c == qRValidationLifecycleResult.c && this.d == qRValidationLifecycleResult.d && this.e == qRValidationLifecycleResult.e && this.f == qRValidationLifecycleResult.f;
    }

    public final int hashCode() {
        int iHashCode = ((this.f10519a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        int i = this.c ? 1231 : 1237;
        long j = this.d;
        int i2 = (((iHashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QRValidationLifecycleResult(qrInfo=");
        sb.append(this.f10519a);
        sb.append(", isExpiredProduct=");
        sb.append(this.b);
        sb.append(", isUsedProduct=");
        sb.append(this.c);
        sb.append(", lastValidityCheckTime=");
        sb.append(this.d);
        xs.r(this.e, ", lastQRUpdateTime=", ", qrRefreshRequired=", sb);
        return b3.g(")", sb, this.f);
    }
}
