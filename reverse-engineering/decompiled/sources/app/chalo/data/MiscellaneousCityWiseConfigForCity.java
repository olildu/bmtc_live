package app.chalo.data;

import defpackage.d;
import defpackage.r30;
import defpackage.ti0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/MiscellaneousCityWiseConfigForCity;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MiscellaneousCityWiseConfigForCity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] u;
    public static final MiscellaneousCityWiseConfigForCity v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2360a;
    public final BonnetNumberToggleConfig b;
    public final LocationManagerToggleConfig c;
    public final boolean d;
    public final List e;
    public final double f;
    public final List g;
    public final String h;
    public final int i;
    public final List j;
    public final Map k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final PassRollOverRidesConfig q;
    public final String r;
    public final UserConsentConfig s;
    public final boolean t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/MiscellaneousCityWiseConfigForCity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/MiscellaneousCityWiseConfigForCity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MiscellaneousCityWiseConfigForCity> serializer() {
            return MiscellaneousCityWiseConfigForCity$$serializer.f2361a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(13)), null, LazyKt.a(lazyThreadSafetyMode, new ti0(14)), null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(15)), LazyKt.a(lazyThreadSafetyMode, new ti0(16)), null, null, null, null, null, null, null, null, null};
        BonnetNumberToggleConfig.INSTANCE.getClass();
        LocationManagerToggleConfig.INSTANCE.getClass();
        EmptyList emptyList = EmptyList.f17557a;
        v = new MiscellaneousCityWiseConfigForCity("", BonnetNumberToggleConfig.d, LocationManagerToggleConfig.d, false, emptyList, 0.8d, emptyList, null, 7, emptyList, MapsKt.d(), 1, false, false, false, 200, new PassRollOverRidesConfig(), null, new UserConsentConfig(), false);
    }

    public MiscellaneousCityWiseConfigForCity(int i, String str, BonnetNumberToggleConfig bonnetNumberToggleConfig, LocationManagerToggleConfig locationManagerToggleConfig, boolean z, List list, double d, List list2, String str2, int i2, List list3, Map map, int i3, boolean z2, boolean z3, boolean z4, int i4, PassRollOverRidesConfig passRollOverRidesConfig, String str3, UserConsentConfig userConsentConfig, boolean z5) {
        this.f2360a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            BonnetNumberToggleConfig.INSTANCE.getClass();
            this.b = BonnetNumberToggleConfig.d;
        } else {
            this.b = bonnetNumberToggleConfig;
        }
        if ((i & 4) == 0) {
            LocationManagerToggleConfig.INSTANCE.getClass();
            this.c = LocationManagerToggleConfig.d;
        } else {
            this.c = locationManagerToggleConfig;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.f17557a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = 0.8d;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = EmptyList.f17557a;
        } else {
            this.g = list2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = 7;
        } else {
            this.i = i2;
        }
        if ((i & 512) == 0) {
            this.j = EmptyList.f17557a;
        } else {
            this.j = list3;
        }
        if ((i & 1024) == 0) {
            this.k = MapsKt.d();
        } else {
            this.k = map;
        }
        if ((i & 2048) == 0) {
            this.l = 1;
        } else {
            this.l = i3;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z2;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z3;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z4;
        }
        this.p = (32768 & i) == 0 ? 200 : i4;
        this.q = (65536 & i) == 0 ? new PassRollOverRidesConfig() : passRollOverRidesConfig;
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str3;
        }
        this.s = (262144 & i) == 0 ? new UserConsentConfig() : userConsentConfig;
        if ((i & 524288) == 0) {
            this.t = false;
        } else {
            this.t = z5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiscellaneousCityWiseConfigForCity)) {
            return false;
        }
        MiscellaneousCityWiseConfigForCity miscellaneousCityWiseConfigForCity = (MiscellaneousCityWiseConfigForCity) obj;
        return Intrinsics.d(this.f2360a, miscellaneousCityWiseConfigForCity.f2360a) && Intrinsics.d(this.b, miscellaneousCityWiseConfigForCity.b) && Intrinsics.d(this.c, miscellaneousCityWiseConfigForCity.c) && this.d == miscellaneousCityWiseConfigForCity.d && Intrinsics.d(this.e, miscellaneousCityWiseConfigForCity.e) && Double.compare(this.f, miscellaneousCityWiseConfigForCity.f) == 0 && Intrinsics.d(this.g, miscellaneousCityWiseConfigForCity.g) && Intrinsics.d(this.h, miscellaneousCityWiseConfigForCity.h) && this.i == miscellaneousCityWiseConfigForCity.i && Intrinsics.d(this.j, miscellaneousCityWiseConfigForCity.j) && Intrinsics.d(this.k, miscellaneousCityWiseConfigForCity.k) && this.l == miscellaneousCityWiseConfigForCity.l && this.m == miscellaneousCityWiseConfigForCity.m && this.n == miscellaneousCityWiseConfigForCity.n && this.o == miscellaneousCityWiseConfigForCity.o && this.p == miscellaneousCityWiseConfigForCity.p && Intrinsics.d(this.q, miscellaneousCityWiseConfigForCity.q) && Intrinsics.d(this.r, miscellaneousCityWiseConfigForCity.r) && Intrinsics.d(this.s, miscellaneousCityWiseConfigForCity.s) && this.t == miscellaneousCityWiseConfigForCity.t;
    }

    public final int hashCode() {
        int iB = r30.b((((this.c.hashCode() + ((this.b.hashCode() + (this.f2360a.hashCode() * 31)) * 31)) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e);
        long jDoubleToLongBits = Double.doubleToLongBits(this.f);
        int iB2 = r30.b((iB + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.g);
        String str = this.h;
        int iHashCode = (this.q.hashCode() + ((((((((((d.f(this.k, r30.b((((iB2 + (str == null ? 0 : str.hashCode())) * 31) + this.i) * 31, 31, this.j), 31) + this.l) * 31) + (this.m ? 1231 : 1237)) * 31) + (this.n ? 1231 : 1237)) * 31) + (this.o ? 1231 : 1237)) * 31) + this.p) * 31)) * 31;
        String str2 = this.r;
        return ((this.s.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31) + (this.t ? 1231 : 1237);
    }

    public final String toString() {
        return "MiscellaneousCityWiseConfigForCity(cityName=" + this.f2360a + ", bonnetNumberToggle=" + this.b + ", locationManagerToggle=" + this.c + ", enableNativeInlineAdPrefetch=" + this.d + ", passConfigIdsForAdjustEvent=" + this.e + ", swipeToProceedButtonSuccessPercentage=" + this.f + ", adjustCampaignIdsForUniversalSearch=" + this.g + ", premiumBusFirstRideOffer=" + this.h + ", pbDaysAllowedToBookTicket=" + this.i + ", passConfigIdsForBulkBookingFlowV2=" + this.j + ", adjustCampaignsForPB=" + this.k + ", askNotificationPermissionAfterSessionCount=" + this.l + ", shouldShowOtherCardOptions=" + this.m + ", shouldDisablePBBoardingLastCrossStop=" + this.n + ", shouldDisablePBDistToBoardingStop=" + this.o + ", pbShowTrafficSignalThresholdDist=" + this.p + ", passRollOverRidesConfig=" + this.q + ", userAccountDeletionUrl=" + this.r + ", userConsentConfig=" + this.s + ", shouldLaunchInAppReview=" + this.t + ")";
    }

    public MiscellaneousCityWiseConfigForCity(String cityName, BonnetNumberToggleConfig bonnetNumberToggle, LocationManagerToggleConfig locationManagerToggle, boolean z, List passConfigIdsForAdjustEvent, double d, List adjustCampaignIdsForUniversalSearch, String str, int i, List passConfigIdsForBulkBookingFlowV2, Map adjustCampaignsForPB, int i2, boolean z2, boolean z3, boolean z4, int i3, PassRollOverRidesConfig passRollOverRidesConfig, String str2, UserConsentConfig userConsentConfig, boolean z5) {
        Intrinsics.i(cityName, "cityName");
        Intrinsics.i(bonnetNumberToggle, "bonnetNumberToggle");
        Intrinsics.i(locationManagerToggle, "locationManagerToggle");
        Intrinsics.i(passConfigIdsForAdjustEvent, "passConfigIdsForAdjustEvent");
        Intrinsics.i(adjustCampaignIdsForUniversalSearch, "adjustCampaignIdsForUniversalSearch");
        Intrinsics.i(passConfigIdsForBulkBookingFlowV2, "passConfigIdsForBulkBookingFlowV2");
        Intrinsics.i(adjustCampaignsForPB, "adjustCampaignsForPB");
        Intrinsics.i(passRollOverRidesConfig, "passRollOverRidesConfig");
        Intrinsics.i(userConsentConfig, "userConsentConfig");
        this.f2360a = cityName;
        this.b = bonnetNumberToggle;
        this.c = locationManagerToggle;
        this.d = z;
        this.e = passConfigIdsForAdjustEvent;
        this.f = d;
        this.g = adjustCampaignIdsForUniversalSearch;
        this.h = str;
        this.i = i;
        this.j = passConfigIdsForBulkBookingFlowV2;
        this.k = adjustCampaignsForPB;
        this.l = i2;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = i3;
        this.q = passRollOverRidesConfig;
        this.r = str2;
        this.s = userConsentConfig;
        this.t = z5;
    }
}
