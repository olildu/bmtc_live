package app.chalo.instantticket.config.models;

import defpackage.i71;
import defpackage.uf0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/config/models/FareInfo;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3829a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/config/models/FareInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/config/models/FareInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareInfo> serializer() {
            return FareInfo$$serializer.f3830a;
        }
    }

    public /* synthetic */ FareInfo(int i, long j, long j2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(FareInfo$$serializer.f3830a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3829a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareInfo)) {
            return false;
        }
        FareInfo fareInfo = (FareInfo) obj;
        return this.f3829a == fareInfo.f3829a && this.b == fareInfo.b;
    }

    public final int hashCode() {
        long j = this.f3829a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return uf0.m(this.b, ")", i71.g(this.f3829a, "FareInfo(minAmount=", ", maxAmount="));
    }

    public FareInfo(long j, long j2) {
        this.f3829a = j;
        this.b = j2;
    }
}
