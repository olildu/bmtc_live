package app.chalo.models.validation;

import defpackage.ll1;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/TwoWayBLECommPilotConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TwoWayBLECommPilotConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5706a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/TwoWayBLECommPilotConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/TwoWayBLECommPilotConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TwoWayBLECommPilotConfig> serializer() {
            return TwoWayBLECommPilotConfig$$serializer.f5707a;
        }
    }

    public TwoWayBLECommPilotConfig() {
        EmptyList eventsToLog = EmptyList.f17557a;
        Intrinsics.i(eventsToLog, "eventsToLog");
        this.f5706a = false;
        this.b = 5000L;
        this.c = 3;
        this.d = 3;
        this.e = 0;
        this.f = 1000L;
        this.g = 1000L;
        this.h = eventsToLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwoWayBLECommPilotConfig)) {
            return false;
        }
        TwoWayBLECommPilotConfig twoWayBLECommPilotConfig = (TwoWayBLECommPilotConfig) obj;
        return this.f5706a == twoWayBLECommPilotConfig.f5706a && this.b == twoWayBLECommPilotConfig.b && this.c == twoWayBLECommPilotConfig.c && this.d == twoWayBLECommPilotConfig.d && this.e == twoWayBLECommPilotConfig.e && this.f == twoWayBLECommPilotConfig.f && this.g == twoWayBLECommPilotConfig.g && Intrinsics.d(this.h, twoWayBLECommPilotConfig.h);
    }

    public final int hashCode() {
        int i2 = this.f5706a ? 1231 : 1237;
        long j = this.b;
        int i3 = ((((((((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        long j2 = this.f;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        return this.h.hashCode() + ((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoWayBLECommPilotConfig(isEnabled=");
        sb.append(this.f5706a);
        sb.append(", stopOperationsDelay=");
        sb.append(this.b);
        z40.o(this.c, this.d, ", connectionReqMaxRetryCount=", ", oneWayBroadcastMaxRetryCount=", sb);
        sb.append(", duplexConnDataTransferMaxRetryCount=");
        sb.append(this.e);
        sb.append(", retryActiveModeBroadcastDelay=");
        sb.append(this.f);
        xs.r(this.g, ", retryConnectionRequestDelay=", ", eventsToLog=", sb);
        return xs.l(sb, this.h, ")");
    }

    public TwoWayBLECommPilotConfig(int i2, boolean z, long j, int i3, int i4, int i5, long j2, long j3, List list) {
        if ((i2 & 1) == 0) {
            this.f5706a = false;
        } else {
            this.f5706a = z;
        }
        if ((i2 & 2) == 0) {
            this.b = 5000L;
        } else {
            this.b = j;
        }
        if ((i2 & 4) == 0) {
            this.c = 3;
        } else {
            this.c = i3;
        }
        if ((i2 & 8) == 0) {
            this.d = 3;
        } else {
            this.d = i4;
        }
        if ((i2 & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i5;
        }
        if ((i2 & 32) == 0) {
            this.f = 1000L;
        } else {
            this.f = j2;
        }
        if ((i2 & 64) == 0) {
            this.g = 1000L;
        } else {
            this.g = j3;
        }
        if ((i2 & 128) == 0) {
            this.h = EmptyList.f17557a;
        } else {
            this.h = list;
        }
    }
}
