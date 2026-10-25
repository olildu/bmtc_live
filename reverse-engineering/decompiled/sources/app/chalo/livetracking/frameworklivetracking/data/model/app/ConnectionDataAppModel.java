package app.chalo.livetracking.frameworklivetracking.data.model.app;

import defpackage.hq0;
import defpackage.nf1;
import defpackage.sr;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ConnectionDataAppModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ConnectionDataAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sr(11)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4300a;
    public final boolean b;
    public final String c;
    public final double d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ConnectionDataAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ConnectionDataAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ConnectionDataAppModel> serializer() {
            return ConnectionDataAppModel$$serializer.f4301a;
        }
    }

    public /* synthetic */ ConnectionDataAppModel(int i, String str, boolean z, String str2, double d, long j2, long j3, long j4, List list, boolean z2) {
        if (271 != (i & 271)) {
            PluginExceptionsKt.b(ConnectionDataAppModel$$serializer.f4301a.getDescriptor(), i, 271);
            throw null;
        }
        this.f4300a = str;
        this.b = z;
        this.c = str2;
        this.d = d;
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j3;
        }
        if ((i & 64) == 0) {
            this.g = -1L;
        } else {
            this.g = j4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionDataAppModel)) {
            return false;
        }
        ConnectionDataAppModel connectionDataAppModel = (ConnectionDataAppModel) obj;
        return Intrinsics.d(this.f4300a, connectionDataAppModel.f4300a) && this.b == connectionDataAppModel.b && Intrinsics.d(this.c, connectionDataAppModel.c) && Double.compare(this.d, connectionDataAppModel.d) == 0 && this.e == connectionDataAppModel.e && this.f == connectionDataAppModel.f && this.g == connectionDataAppModel.g && Intrinsics.d(this.h, connectionDataAppModel.h) && this.i == connectionDataAppModel.i;
    }

    public final int hashCode() {
        int iE = nf1.e(((this.f4300a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c);
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        int i = (iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.g;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        List list = this.h;
        return ((i4 + (list == null ? 0 : list.hashCode())) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("ConnectionDataAppModel(baseUrl=", this.f4300a, ", forceReconnection=", ", socketPath=", this.b);
        sbM.append(this.c);
        sbM.append(", socketReconnectionRandomizationFactor=");
        sbM.append(this.d);
        xs.r(this.e, ", socketReconnectionDelay=", ", maxReconnectionDelay=", sbM);
        sbM.append(this.f);
        xs.r(this.g, ", connectionTimeout=", ", transportValues=", sbM);
        sbM.append(this.h);
        sbM.append(", enableCookie=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }

    public ConnectionDataAppModel(String baseUrl, boolean z, String socketPath, double d, long j2, long j3, long j4, List list, boolean z2) {
        Intrinsics.i(baseUrl, "baseUrl");
        Intrinsics.i(socketPath, "socketPath");
        this.f4300a = baseUrl;
        this.b = z;
        this.c = socketPath;
        this.d = d;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
        this.i = z2;
    }
}
