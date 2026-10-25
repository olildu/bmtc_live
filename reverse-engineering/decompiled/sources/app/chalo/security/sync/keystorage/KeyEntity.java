package app.chalo.security.sync.keystorage;

import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/security/sync/keystorage/KeyEntity;", "", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9392a;
    public final long b;
    public final String c;
    public final String d;

    public KeyEntity(long j, long j2, String key, String agency) {
        Intrinsics.i(key, "key");
        Intrinsics.i(agency, "agency");
        this.f9392a = j;
        this.b = j2;
        this.c = key;
        this.d = agency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyEntity)) {
            return false;
        }
        KeyEntity keyEntity = (KeyEntity) obj;
        return this.f9392a == keyEntity.f9392a && this.b == keyEntity.b && Intrinsics.d(this.c, keyEntity.c) && Intrinsics.d(this.d, keyEntity.d);
    }

    public final int hashCode() {
        long j = this.f9392a;
        long j2 = this.b;
        return this.d.hashCode() + nf1.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f9392a, "KeyEntity(validFrom=", ", validTo=");
        dd.k(this.b, ", key=", this.c, sbG);
        return z40.h(sbG, ", agency=", this.d, ")");
    }
}
