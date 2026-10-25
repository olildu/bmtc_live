package app.chalo.home.ui.chalobus;

import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/RidePreferenceCheckResult;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RidePreferenceCheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RidePreferenceBannerState f3304a;
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final String e;
    public final String f;

    public RidePreferenceCheckResult(RidePreferenceBannerState ridePreferenceBannerState, Integer num, Integer num2, Long l, String str, String str2) {
        this.f3304a = ridePreferenceBannerState;
        this.b = num;
        this.c = num2;
        this.d = l;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RidePreferenceCheckResult)) {
            return false;
        }
        RidePreferenceCheckResult ridePreferenceCheckResult = (RidePreferenceCheckResult) obj;
        return Intrinsics.d(this.f3304a, ridePreferenceCheckResult.f3304a) && Intrinsics.d(this.b, ridePreferenceCheckResult.b) && Intrinsics.d(this.c, ridePreferenceCheckResult.c) && Intrinsics.d(this.d, ridePreferenceCheckResult.d) && Intrinsics.d(this.e, ridePreferenceCheckResult.e) && Intrinsics.d(this.f, ridePreferenceCheckResult.f);
    }

    public final int hashCode() {
        int iHashCode = this.f3304a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RidePreferenceCheckResult(bannerState=");
        sb.append(this.f3304a);
        sb.append(", autoSelectedHour24=");
        sb.append(this.b);
        sb.append(", autoSelectedMinute=");
        sb.append(this.c);
        sb.append(", autoSelectedRideTime=");
        sb.append(this.d);
        sb.append(", autoSelectedRideId=");
        return r30.i(sb, this.e, ", savedPreferredRideId=", this.f, ")");
    }
}
