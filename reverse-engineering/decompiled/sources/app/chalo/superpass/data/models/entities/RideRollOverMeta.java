package app.chalo.superpass.data.models.entities;

import app.chalo.home.data.mappers.BannerStatus;
import defpackage.y21;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideRollOverMeta;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideRollOverMeta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new y21(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9558a;
    public final RideRollOverBannerCta b;
    public final BannerStatus c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideRollOverMeta$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/RideRollOverMeta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideRollOverMeta> serializer() {
            return RideRollOverMeta$$serializer.f9559a;
        }
    }

    public /* synthetic */ RideRollOverMeta(int i, String str, RideRollOverBannerCta rideRollOverBannerCta, BannerStatus bannerStatus) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.b(RideRollOverMeta$$serializer.f9559a.getDescriptor(), i, 4);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f9558a = null;
        } else {
            this.f9558a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = rideRollOverBannerCta;
        }
        this.c = bannerStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideRollOverMeta)) {
            return false;
        }
        RideRollOverMeta rideRollOverMeta = (RideRollOverMeta) obj;
        return Intrinsics.d(this.f9558a, rideRollOverMeta.f9558a) && Intrinsics.d(this.b, rideRollOverMeta.b) && this.c == rideRollOverMeta.c;
    }

    public final int hashCode() {
        String str = this.f9558a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RideRollOverBannerCta rideRollOverBannerCta = this.b;
        return this.c.hashCode() + ((iHashCode + (rideRollOverBannerCta != null ? rideRollOverBannerCta.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RideRollOverMeta(bannerText=" + this.f9558a + ", cta=" + this.b + ", bannerStatus=" + this.c + ")";
    }

    public RideRollOverMeta(String str, RideRollOverBannerCta rideRollOverBannerCta, BannerStatus bannerStatus) {
        Intrinsics.i(bannerStatus, "bannerStatus");
        this.f9558a = str;
        this.b = rideRollOverBannerCta;
        this.c = bannerStatus;
    }
}
