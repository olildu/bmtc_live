package app.chalo.superpass.data.models.entities;

import defpackage.vo1;
import defpackage.x11;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideRollOverBannerCta;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideRollOverBannerCta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(29)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9556a;
    public final RideRollOverBannerCtaActionType b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideRollOverBannerCta$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/RideRollOverBannerCta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideRollOverBannerCta> serializer() {
            return RideRollOverBannerCta$$serializer.f9557a;
        }
    }

    public /* synthetic */ RideRollOverBannerCta(int i, String str, RideRollOverBannerCtaActionType rideRollOverBannerCtaActionType, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(RideRollOverBannerCta$$serializer.f9557a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9556a = str;
        this.b = rideRollOverBannerCtaActionType;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideRollOverBannerCta)) {
            return false;
        }
        RideRollOverBannerCta rideRollOverBannerCta = (RideRollOverBannerCta) obj;
        return Intrinsics.d(this.f9556a, rideRollOverBannerCta.f9556a) && this.b == rideRollOverBannerCta.b && Intrinsics.d(this.c, rideRollOverBannerCta.c);
    }

    public final int hashCode() {
        String str = this.f9556a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RideRollOverBannerCtaActionType rideRollOverBannerCtaActionType = this.b;
        int iHashCode2 = (iHashCode + (rideRollOverBannerCtaActionType == null ? 0 : rideRollOverBannerCtaActionType.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideRollOverBannerCta(ctaText=");
        sb.append(this.f9556a);
        sb.append(", ctaActionType=");
        sb.append(this.b);
        sb.append(", contactNumber=");
        return vo1.p(sb, this.c, ")");
    }

    public RideRollOverBannerCta(String str, RideRollOverBannerCtaActionType rideRollOverBannerCtaActionType, String str2) {
        this.f9556a = str;
        this.b = rideRollOverBannerCtaActionType;
        this.c = str2;
    }
}
