package app.chalo.livetracking.routedetails.data.model.app;

import defpackage.cb0;
import defpackage.gf;
import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/app/RouteAvailabilityBannerDetails;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteAvailabilityBannerDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f4391a;
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final RouteAvailabilityBannerDialogInfo i;

    public RouteAvailabilityBannerDetails(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, Boolean bool4, String str3, String str4, RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo) {
        this.f4391a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = str;
        this.e = str2;
        this.f = bool4;
        this.g = str3;
        this.h = str4;
        this.i = routeAvailabilityBannerDialogInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAvailabilityBannerDetails)) {
            return false;
        }
        RouteAvailabilityBannerDetails routeAvailabilityBannerDetails = (RouteAvailabilityBannerDetails) obj;
        return Intrinsics.d(this.f4391a, routeAvailabilityBannerDetails.f4391a) && Intrinsics.d(this.b, routeAvailabilityBannerDetails.b) && Intrinsics.d(this.c, routeAvailabilityBannerDetails.c) && Intrinsics.d(this.d, routeAvailabilityBannerDetails.d) && Intrinsics.d(this.e, routeAvailabilityBannerDetails.e) && Intrinsics.d(this.f, routeAvailabilityBannerDetails.f) && Intrinsics.d(this.g, routeAvailabilityBannerDetails.g) && Intrinsics.d(this.h, routeAvailabilityBannerDetails.h) && Intrinsics.d(this.i, routeAvailabilityBannerDetails.i);
    }

    public final int hashCode() {
        Boolean bool = this.f4391a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iE = nf1.e((iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode3 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.f;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo = this.i;
        return iHashCode6 + (routeAvailabilityBannerDialogInfo != null ? routeAvailabilityBannerDialogInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteAvailabilityBannerDetails(isVisible=");
        sb.append(this.f4391a);
        sb.append(", isSticky=");
        sb.append(this.b);
        sb.append(", isImageVisible=");
        hq0.t(this.c, ", title=", this.d, ", ctaCopy=", sb);
        gf.v(this.f, this.e, ", isCtaVisible=", ", imageUrl=", sb);
        cb0.t(sb, this.g, ", ctaAction=", this.h, ", routeDialogInfo=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
