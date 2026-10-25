package app.chalo.productbooking.common.data.models.app;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.a30;
import defpackage.cb0;
import defpackage.r30;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/FareDetailsData;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareDetailsData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FareDetailsRouteData f8185a;
    public final ProductBookingStopDetails b;
    public final ProductBookingStopDetails c;
    public final List d;
    public final Long e;
    public final List f;
    public final String g;
    public final RouteNamingSchemeType h;
    public final List i;
    public final String j;
    public final String k;
    public final Integer l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/FareDetailsData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/FareDetailsData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static FareDetailsData a(PBAvailableSlotsTripAppModel slot, PBOriginDestinationAppModel stopPoints, List list, List list2, Integer num) {
            Intrinsics.i(slot, "slot");
            Intrinsics.i(stopPoints, "stopPoints");
            FareDetailsRouteData fareDetailsRouteData = new FareDetailsRouteData(slot.c, slot.b, ChaloTransitMode.BUS);
            ProductBookingStopDetails productBookingStopDetails = new ProductBookingStopDetails(slot.d, stopPoints.d, null);
            ProductBookingStopDetails productBookingStopDetails2 = new ProductBookingStopDetails(slot.e, stopPoints.i, null);
            long j = slot.g;
            return new FareDetailsData(fareDetailsRouteData, productBookingStopDetails, productBookingStopDetails2, EmptyList.f17557a, Long.valueOf(j), list, RouteNamingSchemeType.DEFAULT, list2, num, 1536);
        }

        public static /* synthetic */ FareDetailsData b(Companion companion, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PBOriginDestinationAppModel pBOriginDestinationAppModel, List list, int i) {
            if ((i & 4) != 0) {
                list = null;
            }
            companion.getClass();
            return a(pBAvailableSlotsTripAppModel, pBOriginDestinationAppModel, list, null, null);
        }

        public final KSerializer<FareDetailsData> serializer() {
            return FareDetailsData$$serializer.f8186a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new a30(0)), null, LazyKt.a(lazyThreadSafetyMode, new a30(1)), null, LazyKt.a(lazyThreadSafetyMode, new a30(2)), LazyKt.a(lazyThreadSafetyMode, new a30(3)), null, null, null};
    }

    public /* synthetic */ FareDetailsData(int i, FareDetailsRouteData fareDetailsRouteData, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, List list, Long l, List list2, String str, RouteNamingSchemeType routeNamingSchemeType, List list3, String str2, String str3, Integer num) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(FareDetailsData$$serializer.f8186a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8185a = fareDetailsRouteData;
        this.b = productBookingStopDetails;
        this.c = productBookingStopDetails2;
        this.d = list;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = RouteNamingSchemeType.DEFAULT;
        } else {
            this.h = routeNamingSchemeType;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num;
        }
    }

    public static FareDetailsData a(FareDetailsData fareDetailsData, List list, Integer num, int i) {
        FareDetailsRouteData routeData = fareDetailsData.f8185a;
        ProductBookingStopDetails startStop = fareDetailsData.b;
        ProductBookingStopDetails endStop = fareDetailsData.c;
        List specialFeatures = fareDetailsData.d;
        Long l = fareDetailsData.e;
        List list2 = fareDetailsData.f;
        String str = fareDetailsData.g;
        RouteNamingSchemeType routeNamingSchemeType = fareDetailsData.h;
        if ((i & 256) != 0) {
            list = fareDetailsData.i;
        }
        List list3 = list;
        String str2 = fareDetailsData.j;
        String str3 = fareDetailsData.k;
        Integer num2 = (i & 2048) != 0 ? fareDetailsData.l : num;
        fareDetailsData.getClass();
        Intrinsics.i(routeData, "routeData");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        return new FareDetailsData(routeData, startStop, endStop, specialFeatures, l, list2, str, routeNamingSchemeType, list3, str2, str3, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareDetailsData)) {
            return false;
        }
        FareDetailsData fareDetailsData = (FareDetailsData) obj;
        return Intrinsics.d(this.f8185a, fareDetailsData.f8185a) && Intrinsics.d(this.b, fareDetailsData.b) && Intrinsics.d(this.c, fareDetailsData.c) && Intrinsics.d(this.d, fareDetailsData.d) && Intrinsics.d(this.e, fareDetailsData.e) && Intrinsics.d(this.f, fareDetailsData.f) && Intrinsics.d(this.g, fareDetailsData.g) && this.h == fareDetailsData.h && Intrinsics.d(this.i, fareDetailsData.i) && Intrinsics.d(this.j, fareDetailsData.j) && Intrinsics.d(this.k, fareDetailsData.k) && Intrinsics.d(this.l, fareDetailsData.l);
    }

    public final int hashCode() {
        int iB = r30.b((this.c.hashCode() + ((this.b.hashCode() + (this.f8185a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Long l = this.e;
        int iHashCode = (iB + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.g;
        int iHashCode3 = (this.h.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list2 = this.i;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.l;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FareDetailsData(routeData=");
        sb.append(this.f8185a);
        sb.append(", startStop=");
        sb.append(this.b);
        sb.append(", endStop=");
        sb.append(this.c);
        sb.append(", specialFeatures=");
        sb.append(this.d);
        sb.append(", timeInMillis=");
        sb.append(this.e);
        sb.append(", tncList=");
        sb.append(this.f);
        sb.append(", via=");
        sb.append(this.g);
        sb.append(", routeNamingSchemeType=");
        sb.append(this.h);
        sb.append(", seats=");
        cb0.s(", userAcquisitionChannel=", this.j, ", userCampaign=", sb, this.i);
        sb.append(this.k);
        sb.append(", seatCount=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    public FareDetailsData(FareDetailsRouteData fareDetailsRouteData, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, List specialFeatures, Long l, List list, String str, RouteNamingSchemeType routeNamingSchemeType, List list2, String str2, String str3, Integer num) {
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f8185a = fareDetailsRouteData;
        this.b = productBookingStopDetails;
        this.c = productBookingStopDetails2;
        this.d = specialFeatures;
        this.e = l;
        this.f = list;
        this.g = str;
        this.h = routeNamingSchemeType;
        this.i = list2;
        this.j = str2;
        this.k = str3;
        this.l = num;
    }

    public /* synthetic */ FareDetailsData(FareDetailsRouteData fareDetailsRouteData, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, List list, Long l, List list2, RouteNamingSchemeType routeNamingSchemeType, List list3, Integer num, int i) {
        this(fareDetailsRouteData, productBookingStopDetails, productBookingStopDetails2, list, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : list2, null, (i & 128) != 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType, (i & 256) != 0 ? null : list3, null, null, (i & 2048) != 0 ? null : num);
    }
}
