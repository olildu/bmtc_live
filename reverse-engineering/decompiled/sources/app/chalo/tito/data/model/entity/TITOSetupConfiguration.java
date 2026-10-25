package app.chalo.tito.data.model.entity;

import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/tito/data/model/entity/TITOSetupConfiguration;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TITOSetupConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9648a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/tito/data/model/entity/TITOSetupConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/tito/data/model/entity/TITOSetupConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TITOSetupConfiguration> serializer() {
            return TITOSetupConfiguration$$serializer.f9649a;
        }
    }

    public /* synthetic */ TITOSetupConfiguration(int i, boolean z, boolean z2, long j, long j2, long j3, String str, String str2, int i2, int i3) {
        if ((i & 1) == 0) {
            this.f9648a = false;
        } else {
            this.f9648a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = 43200000L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = 8000L;
        } else {
            this.d = j2;
        }
        if ((i & 16) == 0) {
            this.e = 43200000L;
        } else {
            this.e = j3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = -1;
        } else {
            this.h = i2;
        }
        if ((i & 256) == 0) {
            this.i = -1;
        } else {
            this.i = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOSetupConfiguration)) {
            return false;
        }
        TITOSetupConfiguration tITOSetupConfiguration = (TITOSetupConfiguration) obj;
        return this.f9648a == tITOSetupConfiguration.f9648a && this.b == tITOSetupConfiguration.b && this.c == tITOSetupConfiguration.c && this.d == tITOSetupConfiguration.d && this.e == tITOSetupConfiguration.e && Intrinsics.d(this.f, tITOSetupConfiguration.f) && Intrinsics.d(this.g, tITOSetupConfiguration.g) && this.h == tITOSetupConfiguration.h && this.i == tITOSetupConfiguration.i;
    }

    public final int hashCode() {
        int i = (((this.f9648a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        long j = this.c;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return ((nf1.e(nf1.e((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f), 31, this.g) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("TITOSetupConfiguration(isTITOEnabled=", ", isUnifiedTitoFlowEnabled=", ", periodicSyncInterval=", this.f9648a, this.b);
        sbR.append(this.c);
        xs.r(this.d, ", tapInScanToneRetryTimeout=", ", titoValidationTimeout=", sbR);
        dd.k(this.e, ", tapInDisclaimer=", this.f, sbR);
        sbR.append(", tapOutDisclaimer=");
        sbR.append(this.g);
        sbR.append(", minAppVer=");
        sbR.append(this.h);
        return t10.k(sbR, ", maxAppVer=", this.i, ")");
    }

    public TITOSetupConfiguration(boolean z, boolean z2, long j, long j2, long j3, String tapInDisclaimer, String tapOutDisclaimer, int i, int i2) {
        Intrinsics.i(tapInDisclaimer, "tapInDisclaimer");
        Intrinsics.i(tapOutDisclaimer, "tapOutDisclaimer");
        this.f9648a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = tapInDisclaimer;
        this.g = tapOutDisclaimer;
        this.h = i;
        this.i = i2;
    }
}
