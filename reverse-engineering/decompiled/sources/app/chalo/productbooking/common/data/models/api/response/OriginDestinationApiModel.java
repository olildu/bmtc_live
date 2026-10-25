package app.chalo.productbooking.common.data.models.api.response;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.productbooking.common.data.models.app.RouteProviderConfigAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.dd;
import defpackage.eo0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/OriginDestinationApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OriginDestinationApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8136a;
    public final String b;
    public final OriginDestinationStopApiModel c;
    public final OriginDestinationStopApiModel d;
    public final OriginDestinationStopApiModel e;
    public final OriginDestinationStopApiModel f;
    public final List g;
    public final List h;
    public final String i;
    public final String j;
    public final OriginDestinationProviderConfigApiModel k;
    public final String l;
    public final String m;
    public final OriginDestinationAdditionalRouteInfoApiModel n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/OriginDestinationApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/OriginDestinationApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OriginDestinationApiModel> serializer() {
            return OriginDestinationApiModel$$serializer.f8137a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new Lazy[]{null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(2)), LazyKt.a(lazyThreadSafetyMode, new eo0(3)), null, null, null, null, null, null};
    }

    public /* synthetic */ OriginDestinationApiModel(int i, String str, String str2, OriginDestinationStopApiModel originDestinationStopApiModel, OriginDestinationStopApiModel originDestinationStopApiModel2, OriginDestinationStopApiModel originDestinationStopApiModel3, OriginDestinationStopApiModel originDestinationStopApiModel4, List list, List list2, String str3, String str4, OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel, String str5, String str6, OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel) {
        if (16383 != (i & 16383)) {
            PluginExceptionsKt.b(OriginDestinationApiModel$$serializer.f8137a.getDescriptor(), i, 16383);
            throw null;
        }
        this.f8136a = str;
        this.b = str2;
        this.c = originDestinationStopApiModel;
        this.d = originDestinationStopApiModel2;
        this.e = originDestinationStopApiModel3;
        this.f = originDestinationStopApiModel4;
        this.g = list;
        this.h = list2;
        this.i = str3;
        this.j = str4;
        this.k = originDestinationProviderConfigApiModel;
        this.l = str5;
        this.m = str6;
        this.n = originDestinationAdditionalRouteInfoApiModel;
    }

    public final OriginDestinationAppModel a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str;
        String str2;
        ChaloTransitMode chaloTransitMode;
        StopAppModel stopAppModelA;
        OriginDestinationStopApiModel originDestinationStopApiModel;
        StopAppModel stopAppModelA2;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel;
        String str3;
        StopAppModel stopAppModelA3;
        StopAppModel stopAppModelA4;
        ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
        String str4 = this.m;
        if (str4 == null) {
            str4 = "";
        }
        ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str4);
        RouteProviderConfigAppModel routeProviderConfigAppModel = null;
        OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel = this.n;
        OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModelA = originDestinationAdditionalRouteInfoApiModel != null ? OriginDestinationApiModelKt.a(chaloTransitModeB, originDestinationAdditionalRouteInfoApiModel) : null;
        String str5 = this.f8136a;
        if (str5 == null) {
            if (!z) {
                str = "";
            }
            return null;
        }
        str = str5;
        String str6 = this.b;
        if (str6 == null) {
            if (!z2) {
                str2 = "";
            }
            return null;
        }
        str2 = str6;
        OriginDestinationStopApiModel originDestinationStopApiModel2 = this.c;
        if (originDestinationStopApiModel2 != null && (stopAppModelA = originDestinationStopApiModel2.a((chaloTransitMode = ChaloTransitMode.BUS))) != null && (originDestinationStopApiModel = this.d) != null && (stopAppModelA2 = originDestinationStopApiModel.a(chaloTransitMode)) != null) {
            OriginDestinationStopApiModel originDestinationStopApiModel3 = this.f;
            if (originDestinationStopApiModel3 != null && (stopAppModelA4 = originDestinationStopApiModel3.a(chaloTransitMode)) != null) {
                stopAppModel = stopAppModelA4;
            } else if (!z3) {
                stopAppModel = null;
            }
            OriginDestinationStopApiModel originDestinationStopApiModel4 = this.e;
            if (originDestinationStopApiModel4 != null && (stopAppModelA3 = originDestinationStopApiModel4.a(chaloTransitMode)) != null) {
                stopAppModel2 = stopAppModelA3;
            } else if (!z4) {
                stopAppModel2 = null;
            }
            List list = this.g;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            List list2 = list;
            List list3 = this.h;
            if (list3 == null) {
                list3 = EmptyList.f17557a;
            }
            List list4 = list3;
            RouteNamingSchemeType.INSTANCE.getClass();
            RouteNamingSchemeType routeNamingSchemeTypeA = RouteNamingSchemeType.Companion.a(this.j);
            if (z5 && (originDestinationProviderConfigApiModel = this.k) != null && (str3 = originDestinationProviderConfigApiModel.f8139a) != null) {
                routeProviderConfigAppModel = new RouteProviderConfigAppModel(str3);
            }
            return new OriginDestinationAppModel(str, str2, stopAppModelA, stopAppModelA2, stopAppModel, stopAppModel2, list2, list4, this.i, routeNamingSchemeTypeA, routeProviderConfigAppModel, this.l, chaloTransitModeB, originDestinationAdditionalRouteInfoAppModelA);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationApiModel)) {
            return false;
        }
        OriginDestinationApiModel originDestinationApiModel = (OriginDestinationApiModel) obj;
        return Intrinsics.d(this.f8136a, originDestinationApiModel.f8136a) && Intrinsics.d(this.b, originDestinationApiModel.b) && Intrinsics.d(this.c, originDestinationApiModel.c) && Intrinsics.d(this.d, originDestinationApiModel.d) && Intrinsics.d(this.e, originDestinationApiModel.e) && Intrinsics.d(this.f, originDestinationApiModel.f) && Intrinsics.d(this.g, originDestinationApiModel.g) && Intrinsics.d(this.h, originDestinationApiModel.h) && Intrinsics.d(this.i, originDestinationApiModel.i) && Intrinsics.d(this.j, originDestinationApiModel.j) && Intrinsics.d(this.k, originDestinationApiModel.k) && Intrinsics.d(this.l, originDestinationApiModel.l) && Intrinsics.d(this.m, originDestinationApiModel.m) && Intrinsics.d(this.n, originDestinationApiModel.n);
    }

    public final int hashCode() {
        String str = this.f8136a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        OriginDestinationStopApiModel originDestinationStopApiModel = this.c;
        int iHashCode3 = (iHashCode2 + (originDestinationStopApiModel == null ? 0 : originDestinationStopApiModel.hashCode())) * 31;
        OriginDestinationStopApiModel originDestinationStopApiModel2 = this.d;
        int iHashCode4 = (iHashCode3 + (originDestinationStopApiModel2 == null ? 0 : originDestinationStopApiModel2.hashCode())) * 31;
        OriginDestinationStopApiModel originDestinationStopApiModel3 = this.e;
        int iHashCode5 = (iHashCode4 + (originDestinationStopApiModel3 == null ? 0 : originDestinationStopApiModel3.hashCode())) * 31;
        OriginDestinationStopApiModel originDestinationStopApiModel4 = this.f;
        int iHashCode6 = (iHashCode5 + (originDestinationStopApiModel4 == null ? 0 : originDestinationStopApiModel4.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel = this.k;
        int iHashCode11 = (iHashCode10 + (originDestinationProviderConfigApiModel == null ? 0 : originDestinationProviderConfigApiModel.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel = this.n;
        return iHashCode13 + (originDestinationAdditionalRouteInfoApiModel != null ? originDestinationAdditionalRouteInfoApiModel.f8134a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OriginDestinationApiModel(routeId=", this.f8136a, ", routeName=", this.b, ", fromStop=");
        sbE.append(this.c);
        sbE.append(", toStop=");
        sbE.append(this.d);
        sbE.append(", lastStop=");
        sbE.append(this.e);
        sbE.append(", firstStop=");
        sbE.append(this.f);
        sbE.append(", spf=");
        dd.o(sbE, this.g, ", specialFeature=", this.h, ", via=");
        cb0.t(sbE, this.i, ", routeNamingScheme=", this.j, ", provider=");
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
}
