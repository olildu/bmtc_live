package app.chalo.productbooking.common.data.models.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.eo0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OriginDestinationAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8190a;
    public final String b;
    public final StopAppModel c;
    public final StopAppModel d;
    public final StopAppModel e;
    public final StopAppModel f;
    public final List g;
    public final List h;
    public final String i;
    public final RouteNamingSchemeType j;
    public final RouteProviderConfigAppModel k;
    public final String l;
    public final ChaloTransitMode m;
    public final OriginDestinationAdditionalRouteInfoAppModel n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OriginDestinationAppModel> serializer() {
            return OriginDestinationAppModel$$serializer.f8191a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new Lazy[]{null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(4)), LazyKt.a(lazyThreadSafetyMode, new eo0(5)), null, LazyKt.a(lazyThreadSafetyMode, new eo0(6)), null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(7)), LazyKt.a(lazyThreadSafetyMode, new eo0(8))};
    }

    public /* synthetic */ OriginDestinationAppModel(int i, String str, String str2, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopAppModel stopAppModel3, StopAppModel stopAppModel4, List list, List list2, String str3, RouteNamingSchemeType routeNamingSchemeType, RouteProviderConfigAppModel routeProviderConfigAppModel, String str4, ChaloTransitMode chaloTransitMode, OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel) {
        if (13311 != (i & 13311)) {
            PluginExceptionsKt.b(OriginDestinationAppModel$$serializer.f8191a.getDescriptor(), i, 13311);
            throw null;
        }
        this.f8190a = str;
        this.b = str2;
        this.c = stopAppModel;
        this.d = stopAppModel2;
        this.e = stopAppModel3;
        this.f = stopAppModel4;
        this.g = list;
        this.h = list2;
        this.i = str3;
        this.j = routeNamingSchemeType;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = routeProviderConfigAppModel;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str4;
        }
        this.m = chaloTransitMode;
        this.n = originDestinationAdditionalRouteInfoAppModel;
    }

    public static FareDetailsData a(OriginDestinationAppModel originDestinationAppModel) {
        ChaloTransitMode transitMode = ChaloTransitMode.BUS;
        originDestinationAppModel.getClass();
        Intrinsics.i(transitMode, "transitMode");
        FareDetailsRouteData fareDetailsRouteData = new FareDetailsRouteData(originDestinationAppModel.b, originDestinationAppModel.f8190a, transitMode);
        StopAppModel stopAppModel = originDestinationAppModel.d;
        ProductBookingStopDetails productBookingStopDetails = new ProductBookingStopDetails(stopAppModel.f1727a, stopAppModel.b, stopAppModel.e);
        StopAppModel stopAppModel2 = originDestinationAppModel.c;
        ProductBookingStopDetails productBookingStopDetails2 = new ProductBookingStopDetails(stopAppModel2.f1727a, stopAppModel2.b, stopAppModel2.e);
        List list = originDestinationAppModel.h;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductBookingSpecialFeature((String) it.next(), ProductBookingRouteSpecialFeatureTagType.NEW));
        }
        return new FareDetailsData(fareDetailsRouteData, productBookingStopDetails2, productBookingStopDetails, arrayList, null, null, null, null, null, 4080);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationAppModel)) {
            return false;
        }
        OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) obj;
        return Intrinsics.d(this.f8190a, originDestinationAppModel.f8190a) && Intrinsics.d(this.b, originDestinationAppModel.b) && Intrinsics.d(this.c, originDestinationAppModel.c) && Intrinsics.d(this.d, originDestinationAppModel.d) && Intrinsics.d(this.e, originDestinationAppModel.e) && Intrinsics.d(this.f, originDestinationAppModel.f) && Intrinsics.d(this.g, originDestinationAppModel.g) && Intrinsics.d(this.h, originDestinationAppModel.h) && Intrinsics.d(this.i, originDestinationAppModel.i) && this.j == originDestinationAppModel.j && Intrinsics.d(this.k, originDestinationAppModel.k) && Intrinsics.d(this.l, originDestinationAppModel.l) && this.m == originDestinationAppModel.m && Intrinsics.d(this.n, originDestinationAppModel.n);
    }

    public final int hashCode() {
        int iB = n21.b(this.d, n21.b(this.c, nf1.e(this.f8190a.hashCode() * 31, 31, this.b), 31), 31);
        StopAppModel stopAppModel = this.e;
        int iHashCode = (iB + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
        StopAppModel stopAppModel2 = this.f;
        int iB2 = r30.b(r30.b((iHashCode + (stopAppModel2 == null ? 0 : stopAppModel2.hashCode())) * 31, 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode2 = (this.j.hashCode() + ((iB2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        RouteProviderConfigAppModel routeProviderConfigAppModel = this.k;
        int iHashCode3 = (iHashCode2 + (routeProviderConfigAppModel == null ? 0 : routeProviderConfigAppModel.f8227a.hashCode())) * 31;
        String str2 = this.l;
        int iC = n21.c(this.m, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel = this.n;
        return iC + (originDestinationAdditionalRouteInfoAppModel != null ? originDestinationAdditionalRouteInfoAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OriginDestinationAppModel(routeId=", this.f8190a, ", routeName=", this.b, ", fromStop=");
        sbE.append(this.c);
        sbE.append(", toStop=");
        sbE.append(this.d);
        sbE.append(", firstStop=");
        sbE.append(this.e);
        sbE.append(", lastStop=");
        sbE.append(this.f);
        sbE.append(", spf=");
        dd.o(sbE, this.g, ", specialFeature=", this.h, ", via=");
        sbE.append(this.i);
        sbE.append(", routeNamingScheme=");
        sbE.append(this.j);
        sbE.append(", routeProviderConfig=");
        sbE.append(this.k);
        sbE.append(", tripFulfillmentId=");
        sbE.append(this.l);
        sbE.append(", transitMode=");
        sbE.append(this.m);
        sbE.append(", additionalRouteInfo=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }

    public OriginDestinationAppModel(String str, String str2, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopAppModel stopAppModel3, StopAppModel stopAppModel4, List spf, List specialFeature, String str3, RouteNamingSchemeType routeNamingScheme, RouteProviderConfigAppModel routeProviderConfigAppModel, String str4, ChaloTransitMode chaloTransitMode, OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel) {
        Intrinsics.i(spf, "spf");
        Intrinsics.i(specialFeature, "specialFeature");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f8190a = str;
        this.b = str2;
        this.c = stopAppModel;
        this.d = stopAppModel2;
        this.e = stopAppModel3;
        this.f = stopAppModel4;
        this.g = spf;
        this.h = specialFeature;
        this.i = str3;
        this.j = routeNamingScheme;
        this.k = routeProviderConfigAppModel;
        this.l = str4;
        this.m = chaloTransitMode;
        this.n = originDestinationAdditionalRouteInfoAppModel;
    }
}
