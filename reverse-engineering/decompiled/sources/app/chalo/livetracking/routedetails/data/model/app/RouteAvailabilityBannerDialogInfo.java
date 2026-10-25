package app.chalo.livetracking.routedetails.data.model.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/app/RouteAvailabilityBannerDialogInfo;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteAvailabilityBannerDialogInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4392a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public RouteAvailabilityBannerDialogInfo(String str, String str2, String str3, String str4, String str5) {
        this.f4392a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAvailabilityBannerDialogInfo)) {
            return false;
        }
        RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo = (RouteAvailabilityBannerDialogInfo) obj;
        return Intrinsics.d(this.f4392a, routeAvailabilityBannerDialogInfo.f4392a) && Intrinsics.d(this.b, routeAvailabilityBannerDialogInfo.b) && Intrinsics.d(this.c, routeAvailabilityBannerDialogInfo.c) && Intrinsics.d(this.d, routeAvailabilityBannerDialogInfo.d) && Intrinsics.d(this.e, routeAvailabilityBannerDialogInfo.e);
    }

    public final int hashCode() {
        String str = this.f4392a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteAvailabilityBannerDialogInfo(title=", this.f4392a, ", subtitle=", this.b, ", ctaTitle=");
        cb0.t(sbE, this.c, ", ctaActionString=", this.d, ", imageUrl=");
        return vo1.p(sbE, this.e, ")");
    }
}
