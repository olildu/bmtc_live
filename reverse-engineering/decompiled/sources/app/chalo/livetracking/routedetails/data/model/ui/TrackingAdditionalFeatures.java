package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.hq0;
import defpackage.nf1;
import defpackage.xi1;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/TrackingAdditionalFeatures;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TrackingAdditionalFeatures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4423a;
    public final boolean b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final List n;
    public final List o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/TrackingAdditionalFeatures$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/routedetails/data/model/ui/TrackingAdditionalFeatures;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TrackingAdditionalFeatures> serializer() {
            return TrackingAdditionalFeatures$$serializer.f4424a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new xi1(23)), null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new xi1(24)), LazyKt.a(lazyThreadSafetyMode, new xi1(25))};
    }

    public /* synthetic */ TrackingAdditionalFeatures(int i, boolean z, boolean z2, Long l, Long l2, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f4423a = false;
        } else {
            this.f4423a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z4;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z5;
        }
        if ((i & 256) == 0) {
            this.i = true;
        } else {
            this.i = z6;
        }
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z7;
        }
        if ((i & 1024) == 0) {
            this.k = true;
        } else {
            this.k = z8;
        }
        if ((i & 2048) == 0) {
            this.l = true;
        } else {
            this.l = z9;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z10;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingAdditionalFeatures)) {
            return false;
        }
        TrackingAdditionalFeatures trackingAdditionalFeatures = (TrackingAdditionalFeatures) obj;
        return this.f4423a == trackingAdditionalFeatures.f4423a && this.b == trackingAdditionalFeatures.b && Intrinsics.d(this.c, trackingAdditionalFeatures.c) && Intrinsics.d(this.d, trackingAdditionalFeatures.d) && this.e == trackingAdditionalFeatures.e && Intrinsics.d(this.f, trackingAdditionalFeatures.f) && this.g == trackingAdditionalFeatures.g && this.h == trackingAdditionalFeatures.h && this.i == trackingAdditionalFeatures.i && this.j == trackingAdditionalFeatures.j && this.k == trackingAdditionalFeatures.k && this.l == trackingAdditionalFeatures.l && this.m == trackingAdditionalFeatures.m && Intrinsics.d(this.n, trackingAdditionalFeatures.n) && Intrinsics.d(this.o, trackingAdditionalFeatures.o);
    }

    public final int hashCode() {
        int i = (((this.f4423a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        Long l = this.c;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        List list = this.f;
        int iHashCode3 = (((((((((((((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31;
        List list2 = this.n;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.o;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("TrackingAdditionalFeatures(handleBusPassedStop=", ", handleLiveTrackingNotAvailable=", ", scheduledTimeForStartStop=", this.f4423a, this.b);
        nf1.w(sbR, this.c, ", scheduledTimeForTripStart=", this.d, ", showTimetableButton=");
        hq0.w(sbR, this.e, ", vehicleNumbersToTrack=", this.f, ", showRouteBookingType=");
        z40.r(sbR, this.g, ", preSelectStartStopForShowingEtaOnMap=", this.h, ", showMyLocationButtonOnMap=");
        z40.r(sbR, this.i, ", showNextBusHeadingForEta=", this.j, ", showBusIconForEta=");
        z40.r(sbR, this.k, ", showNearestStopTagForTriggerStop=", this.l, ", boundMapToStartAndEndStop=");
        hq0.w(sbR, this.m, ", customStopMarkerList=", this.n, ", customStopTagList=");
        return xs.l(sbR, this.o, ")");
    }

    public TrackingAdditionalFeatures(boolean z, boolean z2, Long l, Long l2, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List list2, List list3) {
        this.f4423a = z;
        this.b = z2;
        this.c = l;
        this.d = l2;
        this.e = z3;
        this.f = list;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
        this.n = list2;
        this.o = list3;
    }

    public /* synthetic */ TrackingAdditionalFeatures(int i, List list, List list2, List list3) {
        this(false, false, null, null, true, (i & 32) != 0 ? null : list, true, false, true, true, true, true, false, (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : list3);
    }
}
