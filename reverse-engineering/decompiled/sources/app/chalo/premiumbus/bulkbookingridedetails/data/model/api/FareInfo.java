package app.chalo.premiumbus.bulkbookingridedetails.data.model.api;

import defpackage.a30;
import defpackage.uf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/FareInfo;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6876a;
    public final int b;
    public final boolean c;
    public final int d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/FareInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/FareInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareInfo> serializer() {
            return FareInfo$$serializer.f6877a;
        }
    }

    public /* synthetic */ FareInfo(int i, int i2, int i3, int i4, List list, boolean z) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(FareInfo$$serializer.f6877a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6876a = i2;
        this.b = i3;
        this.c = z;
        this.d = i4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareInfo)) {
            return false;
        }
        FareInfo fareInfo = (FareInfo) obj;
        return this.f6876a == fareInfo.f6876a && this.b == fareInfo.b && this.c == fareInfo.c && this.d == fareInfo.d && Intrinsics.d(this.e, fareInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (((((((this.f6876a * 31) + this.b) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f6876a, this.b, "FareInfo(payableAmount=", ", actualFare=", ", isDiscountApplicable=");
        sbS.append(this.c);
        sbS.append(", discountedFare=");
        sbS.append(this.d);
        sbS.append(", fareBreakup=");
        return xs.l(sbS, this.e, ")");
    }
}
