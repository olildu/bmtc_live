package app.chalo.ble_communication.model;

import defpackage.p7;
import defpackage.q7;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ble_communication/model/BLEOperationsToLogConfig;", "", "Companion", "$serializer", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BLEOperationsToLogConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(12)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1130a;
    public final List b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ble_communication/model/BLEOperationsToLogConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ble_communication/model/BLEOperationsToLogConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BLEOperationsToLogConfig> serializer() {
            return BLEOperationsToLogConfig$$serializer.f1131a;
        }
    }

    public /* synthetic */ BLEOperationsToLogConfig(int i, int i2, int i3, String str, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(BLEOperationsToLogConfig$$serializer.f1131a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1130a = str;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = -1;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = -1;
        } else {
            this.d = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BLEOperationsToLogConfig)) {
            return false;
        }
        BLEOperationsToLogConfig bLEOperationsToLogConfig = (BLEOperationsToLogConfig) obj;
        return Intrinsics.d(this.f1130a, bLEOperationsToLogConfig.f1130a) && Intrinsics.d(this.b, bLEOperationsToLogConfig.b) && this.c == bLEOperationsToLogConfig.c && this.d == bLEOperationsToLogConfig.d;
    }

    public final int hashCode() {
        return ((r30.b(this.f1130a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return xs.h(this.c, this.d, ", maxAppVer=", ")", q7.h("BLEOperationsToLogConfig(operationId=", this.f1130a, ", statusCodeList=", ", minAppVer=", this.b));
    }
}
