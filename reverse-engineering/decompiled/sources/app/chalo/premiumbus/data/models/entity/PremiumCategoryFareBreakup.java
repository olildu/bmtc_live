package app.chalo.premiumbus.data.models.entity;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumCategoryFareBreakup;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumCategoryFareBreakup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7130a;
    public final long b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumCategoryFareBreakup$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/entity/PremiumCategoryFareBreakup;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumCategoryFareBreakup> serializer() {
            return PremiumCategoryFareBreakup$$serializer.f7131a;
        }
    }

    public /* synthetic */ PremiumCategoryFareBreakup(int i, int i2, String str, long j) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PremiumCategoryFareBreakup$$serializer.f7131a.getDescriptor(), i, 7);
            throw null;
        }
        this.f7130a = str;
        this.b = j;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumCategoryFareBreakup)) {
            return false;
        }
        PremiumCategoryFareBreakup premiumCategoryFareBreakup = (PremiumCategoryFareBreakup) obj;
        return Intrinsics.d(this.f7130a, premiumCategoryFareBreakup.f7130a) && this.b == premiumCategoryFareBreakup.b && this.c == premiumCategoryFareBreakup.c;
    }

    public final int hashCode() {
        int iHashCode = this.f7130a.hashCode() * 31;
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        return t10.k(t10.m(this.b, "PremiumCategoryFareBreakup(name=", this.f7130a, ", value="), ", operation=", this.c, ")");
    }

    public PremiumCategoryFareBreakup(String name, long j, int i) {
        Intrinsics.i(name, "name");
        this.f7130a = name;
        this.b = j;
        this.c = i;
    }
}
