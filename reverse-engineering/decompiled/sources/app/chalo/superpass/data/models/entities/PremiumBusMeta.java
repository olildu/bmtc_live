package app.chalo.superpass.data.models.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusMeta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9549a;
    public final Long b;
    public final Long c;
    public final RideRollOverMeta d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/PremiumBusMeta$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusMeta> serializer() {
            return PremiumBusMeta$$serializer.f9550a;
        }
    }

    public /* synthetic */ PremiumBusMeta(int i, boolean z, Long l, Long l2, RideRollOverMeta rideRollOverMeta) {
        this.f9549a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rideRollOverMeta;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusMeta)) {
            return false;
        }
        PremiumBusMeta premiumBusMeta = (PremiumBusMeta) obj;
        return this.f9549a == premiumBusMeta.f9549a && Intrinsics.d(this.b, premiumBusMeta.b) && Intrinsics.d(this.c, premiumBusMeta.c) && Intrinsics.d(this.d, premiumBusMeta.d);
    }

    public final int hashCode() {
        int i = (this.f9549a ? 1231 : 1237) * 31;
        Long l = this.b;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        RideRollOverMeta rideRollOverMeta = this.d;
        return iHashCode2 + (rideRollOverMeta != null ? rideRollOverMeta.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusMeta(startDateChangeAllowed=" + this.f9549a + ", dateChangeEnableStartTime=" + this.b + ", dateChangeEnableEndTime=" + this.c + ", rideRollOverMeta=" + this.d + ")";
    }

    public PremiumBusMeta(boolean z, Long l, Long l2, RideRollOverMeta rideRollOverMeta) {
        this.f9549a = z;
        this.b = l;
        this.c = l2;
        this.d = rideRollOverMeta;
    }
}
