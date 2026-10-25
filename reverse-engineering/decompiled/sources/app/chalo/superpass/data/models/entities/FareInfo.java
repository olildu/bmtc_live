package app.chalo.superpass.data.models.entities;

import defpackage.a30;
import defpackage.n21;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/FareInfo;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9545a;
    public final double b;
    public final boolean c;
    public final double d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/FareInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/FareInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareInfo> serializer() {
            return FareInfo$$serializer.f9546a;
        }
    }

    public FareInfo(double d, double d2, boolean z, double d3, List list) {
        this.f9545a = d;
        this.b = d2;
        this.c = z;
        this.d = d3;
        this.e = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getE() {
        return this.e;
    }

    public final String b() {
        double d = this.f9545a;
        int i = (int) d;
        return d - ((double) i) == 0.0d ? String.valueOf(i) : String.valueOf(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareInfo)) {
            return false;
        }
        FareInfo fareInfo = (FareInfo) obj;
        return Double.compare(this.f9545a, fareInfo.f9545a) == 0 && Double.compare(this.b, fareInfo.b) == 0 && this.c == fareInfo.c && Double.compare(this.d, fareInfo.d) == 0 && Intrinsics.d(this.e, fareInfo.e);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f9545a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        int i2 = this.c ? 1231 : 1237;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.d);
        return this.e.hashCode() + ((((i + i2) * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31);
    }

    public final String toString() {
        StringBuilder sbI = n21.i(this.f9545a, "FareInfo(payableAmount=", ", actualFare=");
        sbI.append(this.b);
        sbI.append(", isDiscountApplicable=");
        sbI.append(this.c);
        pk0.z(sbI, ", discountedFare=", this.d, ", fareBreakupComponentList=");
        return xs.l(sbI, this.e, ")");
    }

    public /* synthetic */ FareInfo(int i, double d, double d2, boolean z, double d3, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(FareInfo$$serializer.f9546a.getDescriptor(), i, 31);
            throw null;
        }
        this.f9545a = d;
        this.b = d2;
        this.c = z;
        this.d = d3;
        this.e = list;
    }
}
