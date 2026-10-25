package app.chalo.superpass.data.models.pendingSuperPass;

import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPassRepurchaseProperties;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PendingSuperPassRepurchaseProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9584a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;

    public PendingSuperPassRepurchaseProperties(String configId, String categoryId, int i, long j, long j2, boolean z) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(categoryId, "categoryId");
        this.f9584a = configId;
        this.b = categoryId;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingSuperPassRepurchaseProperties)) {
            return false;
        }
        PendingSuperPassRepurchaseProperties pendingSuperPassRepurchaseProperties = (PendingSuperPassRepurchaseProperties) obj;
        return Intrinsics.d(this.f9584a, pendingSuperPassRepurchaseProperties.f9584a) && Intrinsics.d(this.b, pendingSuperPassRepurchaseProperties.b) && this.c == pendingSuperPassRepurchaseProperties.c && this.d == pendingSuperPassRepurchaseProperties.d && this.e == pendingSuperPassRepurchaseProperties.e && this.f == pendingSuperPassRepurchaseProperties.f;
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f9584a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PendingSuperPassRepurchaseProperties(configId=", this.f9584a, ", categoryId=", this.b, ", fareMappingId=");
        sbE.append(this.c);
        sbE.append(", startTime=");
        sbE.append(this.d);
        xs.r(this.e, ", verificationExpiryTime=", ", verificationFlag=", sbE);
        return b3.g(")", sbE, this.f);
    }
}
