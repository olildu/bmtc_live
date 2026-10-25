package app.chalo.premiumbus.data.models.app;

import defpackage.b3;
import defpackage.cb0;
import defpackage.eo0;
import defpackage.hq0;
import defpackage.nf1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBOriginDestinationAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBOriginDestinationAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7091a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final PBModeToReachStopType g;
    public final String h;
    public final String i;
    public final Long j;
    public final Long k;
    public final PBModeToReachStopType l;
    public final int m;
    public final int n;
    public final boolean o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBOriginDestinationAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/PBOriginDestinationAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static PBOriginDestinationAppModel a(PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel) {
            List listR = CollectionsKt.R(premiumReserveTicketTripPropertiesAppModel.e);
            PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketTripPropertiesAppModel.g;
            String str = premiumStopDetailsAppModel.f7121a;
            String str2 = premiumStopDetailsAppModel.b;
            PBModeToReachStopType pBModeToReachStopType = PBModeToReachStopType.NOT_APPLICABLE;
            PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = premiumReserveTicketTripPropertiesAppModel.h;
            return new PBOriginDestinationAppModel(listR, null, str, str2, null, null, pBModeToReachStopType, premiumStopDetailsAppModel2.f7121a, premiumStopDetailsAppModel2.b, null, null, pBModeToReachStopType, 29728);
        }

        public final KSerializer<PBOriginDestinationAppModel> serializer() {
            return PBOriginDestinationAppModel$$serializer.f7092a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new eo0(25)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(26)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(27)), null, null, null};
    }

    public /* synthetic */ PBOriginDestinationAppModel(int i, List list, String str, String str2, String str3, Long l, Long l2, PBModeToReachStopType pBModeToReachStopType, String str4, String str5, Long l3, Long l4, PBModeToReachStopType pBModeToReachStopType2, int i2, int i3, boolean z) {
        if (397 != (i & 397)) {
            PluginExceptionsKt.b(PBOriginDestinationAppModel$$serializer.f7092a.getDescriptor(), i, 397);
            throw null;
        }
        this.f7091a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = PBModeToReachStopType.NOT_APPLICABLE;
        } else {
            this.g = pBModeToReachStopType;
        }
        this.h = str4;
        this.i = str5;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l4;
        }
        this.l = (i & 2048) == 0 ? PBModeToReachStopType.NOT_APPLICABLE : pBModeToReachStopType2;
        if ((i & 4096) == 0) {
            this.m = 0;
        } else {
            this.m = i2;
        }
        this.n = (i & 8192) == 0 ? 1 : i3;
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z;
        }
    }

    public final Pair a() {
        PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
        return new Pair(new PBStopPlaceSelectedAppModel(this.c, "searchPartnerChaloStop", this.d, null, null, premiumBusSelectedLocationType), new PBStopPlaceSelectedAppModel(this.h, "searchPartnerChaloStop", this.i, null, null, premiumBusSelectedLocationType));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBOriginDestinationAppModel)) {
            return false;
        }
        PBOriginDestinationAppModel pBOriginDestinationAppModel = (PBOriginDestinationAppModel) obj;
        return Intrinsics.d(this.f7091a, pBOriginDestinationAppModel.f7091a) && Intrinsics.d(this.b, pBOriginDestinationAppModel.b) && Intrinsics.d(this.c, pBOriginDestinationAppModel.c) && Intrinsics.d(this.d, pBOriginDestinationAppModel.d) && Intrinsics.d(this.e, pBOriginDestinationAppModel.e) && Intrinsics.d(this.f, pBOriginDestinationAppModel.f) && this.g == pBOriginDestinationAppModel.g && Intrinsics.d(this.h, pBOriginDestinationAppModel.h) && Intrinsics.d(this.i, pBOriginDestinationAppModel.i) && Intrinsics.d(this.j, pBOriginDestinationAppModel.j) && Intrinsics.d(this.k, pBOriginDestinationAppModel.k) && this.l == pBOriginDestinationAppModel.l && this.m == pBOriginDestinationAppModel.m && this.n == pBOriginDestinationAppModel.n && this.o == pBOriginDestinationAppModel.o;
    }

    public final int hashCode() {
        int iHashCode = this.f7091a.hashCode() * 31;
        String str = this.b;
        int iE = nf1.e(nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        int iHashCode2 = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iE2 = nf1.e(nf1.e((this.g.hashCode() + ((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31, 31, this.h), 31, this.i);
        Long l3 = this.j;
        int iHashCode3 = (iE2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.k;
        return ((((((this.l.hashCode() + ((iHashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31)) * 31) + this.m) * 31) + this.n) * 31) + (this.o ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBOriginDestinationAppModel(routeIdsWithODPair=");
        sb.append(this.f7091a);
        sb.append(", stopPairTag=");
        sb.append(this.b);
        sb.append(", fromStopId=");
        cb0.t(sb, this.c, ", fromStopName=", this.d, ", timeToReachFromStop=");
        nf1.w(sb, this.e, ", distanceToReachFromStop=", this.f, ", modeToReachFromStop=");
        sb.append(this.g);
        sb.append(", toStopId=");
        sb.append(this.h);
        sb.append(", toStopName=");
        cb0.r(this.j, this.i, ", timeToReachToStop=", ", distanceToReachToStop=", sb);
        sb.append(this.k);
        sb.append(", modeToReachToStop=");
        sb.append(this.l);
        sb.append(", currentPage=");
        hq0.p(this.m, this.n, ", totalPages=", ", isLastPage=", sb);
        return b3.g(")", sb, this.o);
    }

    public PBOriginDestinationAppModel(List routeIdsWithODPair, String str, String fromStopId, String fromStopName, Long l, Long l2, PBModeToReachStopType modeToReachFromStop, String toStopId, String toStopName, Long l3, Long l4, PBModeToReachStopType modeToReachToStop, int i, int i2, boolean z) {
        Intrinsics.i(routeIdsWithODPair, "routeIdsWithODPair");
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(modeToReachFromStop, "modeToReachFromStop");
        Intrinsics.i(toStopId, "toStopId");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(modeToReachToStop, "modeToReachToStop");
        this.f7091a = routeIdsWithODPair;
        this.b = str;
        this.c = fromStopId;
        this.d = fromStopName;
        this.e = l;
        this.f = l2;
        this.g = modeToReachFromStop;
        this.h = toStopId;
        this.i = toStopName;
        this.j = l3;
        this.k = l4;
        this.l = modeToReachToStop;
        this.m = i;
        this.n = i2;
        this.o = z;
    }

    public /* synthetic */ PBOriginDestinationAppModel(List list, String str, String str2, String str3, Long l, Long l2, PBModeToReachStopType pBModeToReachStopType, String str4, String str5, Long l3, Long l4, PBModeToReachStopType pBModeToReachStopType2, int i) {
        this(list, (i & 2) != 0 ? null : str, str2, str3, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? PBModeToReachStopType.NOT_APPLICABLE : pBModeToReachStopType, str4, str5, (i & 512) != 0 ? null : l3, (i & 1024) != 0 ? null : l4, (i & 2048) != 0 ? PBModeToReachStopType.NOT_APPLICABLE : pBModeToReachStopType2, 0, 1, false);
    }
}
