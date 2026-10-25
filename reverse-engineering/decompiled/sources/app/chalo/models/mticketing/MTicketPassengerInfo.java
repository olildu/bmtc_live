package app.chalo.models.mticketing;

import defpackage.pk0;
import defpackage.sg0;
import java.util.LinkedHashMap;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/mticketing/MTicketPassengerInfo;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketPassengerInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5621a;
    public final Double b;
    public final double c;
    public final int d;
    public final Map e;
    public final Map f;
    public final int g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/mticketing/MTicketPassengerInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/mticketing/MTicketPassengerInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketPassengerInfo> serializer() {
            return MTicketPassengerInfo$$serializer.f5622a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new sg0(1)), LazyKt.a(lazyThreadSafetyMode, new sg0(2)), null};
    }

    public MTicketPassengerInfo(double d, Double d2, double d3, int i, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i2) {
        this.f5621a = d;
        this.b = d2;
        this.c = d3;
        this.d = i;
        this.e = linkedHashMap;
        this.f = linkedHashMap2;
        this.g = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerInfo)) {
            return false;
        }
        MTicketPassengerInfo mTicketPassengerInfo = (MTicketPassengerInfo) obj;
        return Double.compare(this.f5621a, mTicketPassengerInfo.f5621a) == 0 && Intrinsics.d(this.b, mTicketPassengerInfo.b) && Double.compare(this.c, mTicketPassengerInfo.c) == 0 && this.d == mTicketPassengerInfo.d && Intrinsics.d(this.e, mTicketPassengerInfo.e) && Intrinsics.d(this.f, mTicketPassengerInfo.f) && this.g == mTicketPassengerInfo.g;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f5621a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        Double d = this.b;
        int iHashCode = (i + (d == null ? 0 : d.hashCode())) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
        int i2 = (((iHashCode + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.d) * 31;
        Map map = this.e;
        int iHashCode2 = (i2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f;
        return ((iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTicketPassengerInfo(fare=");
        sb.append(this.f5621a);
        sb.append(", totalFare=");
        sb.append(this.b);
        pk0.z(sb, ", discountPercentage=", this.c, ", passengerCount=");
        sb.append(this.d);
        sb.append(", addMap=");
        sb.append(this.e);
        sb.append(", subMap=");
        sb.append(this.f);
        sb.append(", roundingLogic=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MTicketPassengerInfo(int i, double d, Double d2, double d3, int i2, Map map, Map map2, int i3) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.b(MTicketPassengerInfo$$serializer.f5622a.getDescriptor(), i, 13);
            throw null;
        }
        this.f5621a = d;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        this.c = d3;
        this.d = i2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map2;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i3;
        }
    }
}
