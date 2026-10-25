package app.chalo.premiumbus.data.models.entity;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pw0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumPassengerCategoryDetailsInfo;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumPassengerCategoryDetailsInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7132a;
    public final String b;
    public final int c;
    public final long d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumPassengerCategoryDetailsInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/entity/PremiumPassengerCategoryDetailsInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumPassengerCategoryDetailsInfo> serializer() {
            return PremiumPassengerCategoryDetailsInfo$$serializer.f7133a;
        }
    }

    public /* synthetic */ PremiumPassengerCategoryDetailsInfo(int i, String str, String str2, int i2, long j, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PremiumPassengerCategoryDetailsInfo$$serializer.f7133a.getDescriptor(), i, 31);
            throw null;
        }
        this.f7132a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumPassengerCategoryDetailsInfo)) {
            return false;
        }
        PremiumPassengerCategoryDetailsInfo premiumPassengerCategoryDetailsInfo = (PremiumPassengerCategoryDetailsInfo) obj;
        return Intrinsics.d(this.f7132a, premiumPassengerCategoryDetailsInfo.f7132a) && Intrinsics.d(this.b, premiumPassengerCategoryDetailsInfo.b) && this.c == premiumPassengerCategoryDetailsInfo.c && this.d == premiumPassengerCategoryDetailsInfo.d && Intrinsics.d(this.e, premiumPassengerCategoryDetailsInfo.e);
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f7132a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        return this.e.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumPassengerCategoryDetailsInfo(id=", this.f7132a, ", name=", this.b, ", count=");
        sbE.append(this.c);
        sbE.append(", actualFare=");
        sbE.append(this.d);
        sbE.append(", fareBreakup=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }

    public PremiumPassengerCategoryDetailsInfo(String id, String name, int i, long j, List fareBreakup) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        Intrinsics.i(fareBreakup, "fareBreakup");
        this.f7132a = id;
        this.b = name;
        this.c = i;
        this.d = j;
        this.e = fareBreakup;
    }
}
