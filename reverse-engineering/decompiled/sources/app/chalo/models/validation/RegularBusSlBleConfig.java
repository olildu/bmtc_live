package app.chalo.models.validation;

import defpackage.b3;
import defpackage.hq0;
import defpackage.r30;
import defpackage.x11;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/RegularBusSlBleConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RegularBusSlBleConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(6)), null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5702a;
    public final QrFirstBleEntryPolicy b;
    public final int c;
    public final int d;
    public final List e;
    public final float f;
    public final long g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final TwoWayBLECommPilotConfig l;
    public final long m;
    public final boolean n;
    public final int o;
    public final int p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/RegularBusSlBleConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/RegularBusSlBleConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RegularBusSlBleConfig> serializer() {
            return RegularBusSlBleConfig$$serializer.f5703a;
        }
    }

    public RegularBusSlBleConfig() {
        this.f5702a = false;
        this.b = null;
        this.c = Integer.MAX_VALUE;
        this.d = -1;
        this.e = null;
        this.f = 1.0f;
        this.g = -1L;
        this.h = 0;
        this.i = 1;
        this.j = false;
        this.k = true;
        this.l = null;
        this.m = 10000L;
        this.n = false;
        this.o = Integer.MAX_VALUE;
        this.p = -1;
    }

    public final boolean a(int i) {
        if (!this.f5702a) {
            return false;
        }
        List list = this.e;
        if (list != null && list.contains(Integer.valueOf(i))) {
            return false;
        }
        int i2 = this.c;
        int i3 = this.d;
        if (i3 == -1) {
            return i >= i2;
        }
        return i <= i3 && i2 <= i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusSlBleConfig)) {
            return false;
        }
        RegularBusSlBleConfig regularBusSlBleConfig = (RegularBusSlBleConfig) obj;
        return this.f5702a == regularBusSlBleConfig.f5702a && Intrinsics.d(this.b, regularBusSlBleConfig.b) && this.c == regularBusSlBleConfig.c && this.d == regularBusSlBleConfig.d && Intrinsics.d(this.e, regularBusSlBleConfig.e) && Float.compare(this.f, regularBusSlBleConfig.f) == 0 && this.g == regularBusSlBleConfig.g && this.h == regularBusSlBleConfig.h && this.i == regularBusSlBleConfig.i && this.j == regularBusSlBleConfig.j && this.k == regularBusSlBleConfig.k && Intrinsics.d(this.l, regularBusSlBleConfig.l) && this.m == regularBusSlBleConfig.m && this.n == regularBusSlBleConfig.n && this.o == regularBusSlBleConfig.o && this.p == regularBusSlBleConfig.p;
    }

    public final int hashCode() {
        int i = (this.f5702a ? 1231 : 1237) * 31;
        QrFirstBleEntryPolicy qrFirstBleEntryPolicy = this.b;
        int iHashCode = (((((i + (qrFirstBleEntryPolicy == null ? 0 : qrFirstBleEntryPolicy.hashCode())) * 31) + this.c) * 31) + this.d) * 31;
        List list = this.e;
        int iA = r30.a(this.f, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        long j = this.g;
        int i2 = (((((((((iA + ((int) (j ^ (j >>> 32)))) * 31) + this.h) * 31) + this.i) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31;
        TwoWayBLECommPilotConfig twoWayBLECommPilotConfig = this.l;
        int iHashCode2 = (i2 + (twoWayBLECommPilotConfig != null ? twoWayBLECommPilotConfig.hashCode() : 0)) * 31;
        long j2 = this.m;
        return ((((((iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.n ? 1231 : 1237)) * 31) + this.o) * 31) + this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularBusSlBleConfig(isEnabled=");
        sb.append(this.f5702a);
        sb.append(", qrFirstBleEntryPolicy=");
        sb.append(this.b);
        sb.append(", minAppVer=");
        hq0.p(this.c, this.d, ", maxAppVer=", ", blacklistedAppVer=", sb);
        sb.append(this.e);
        sb.append(", showFeedbackPercentage=");
        sb.append(this.f);
        sb.append(", timeoutToShowQrValidationOption=");
        sb.append(this.g);
        sb.append(", showQrOptionAfterNoBlePermAttemptsThreshold=");
        sb.append(this.h);
        sb.append(", bleTutorialCountThreshold=");
        sb.append(this.i);
        sb.append(", isNewPayloadSchemeEnabled=");
        sb.append(this.j);
        sb.append(", isQRAsBackupMethodEnabled=");
        sb.append(this.k);
        sb.append(", twoWayBLECommPilotConfig=");
        sb.append(this.l);
        xs.r(this.m, ", titoTapinPollingDelay=", ", isTitoTapinPollingEnabled=", sb);
        sb.append(this.n);
        sb.append(", minAppVerForRefacBleVal=");
        sb.append(this.o);
        sb.append(", maxAppVerForRefacBleVal=");
        return b3.f(")", this.p, sb);
    }

    public /* synthetic */ RegularBusSlBleConfig(int i, boolean z, QrFirstBleEntryPolicy qrFirstBleEntryPolicy, int i2, int i3, List list, float f, long j, int i4, int i5, boolean z2, boolean z3, TwoWayBLECommPilotConfig twoWayBLECommPilotConfig, long j2, boolean z4, int i6, int i7) {
        if ((i & 1) == 0) {
            this.f5702a = false;
        } else {
            this.f5702a = z;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qrFirstBleEntryPolicy;
        }
        if ((i & 4) == 0) {
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = -1;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = 1.0f;
        } else {
            this.f = f;
        }
        if ((i & 64) == 0) {
            this.g = -1L;
        } else {
            this.g = j;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i4;
        }
        if ((i & 256) == 0) {
            this.i = 1;
        } else {
            this.i = i5;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z2;
        }
        if ((i & 1024) == 0) {
            this.k = true;
        } else {
            this.k = z3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = twoWayBLECommPilotConfig;
        }
        this.m = (i & 4096) == 0 ? 10000L : j2;
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z4;
        }
        if ((i & 16384) == 0) {
            this.o = Integer.MAX_VALUE;
        } else {
            this.o = i6;
        }
        if ((i & 32768) == 0) {
            this.p = -1;
        } else {
            this.p = i7;
        }
    }
}
