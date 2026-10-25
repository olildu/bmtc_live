package app.chalo.ondc.model.app;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.productbooking.common.data.models.app.RouteProviderConfigAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.yn0;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/app/OndcMetroRouteSearchAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcMetroRouteSearchAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6766a;
    public final String b;
    public final StopAppModel c;
    public final StopAppModel d;
    public final List e;
    public final String f;
    public final RouteNamingSchemeType g;
    public final ChaloTransitMode h;
    public final OriginDestinationAdditionalRouteInfoAppModel i;
    public final RouteProviderConfigAppModel j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/app/OndcMetroRouteSearchAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/app/OndcMetroRouteSearchAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcMetroRouteSearchAppModel> serializer() {
            return OndcMetroRouteSearchAppModel$$serializer.f6767a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new yn0(3)), null, LazyKt.a(lazyThreadSafetyMode, new yn0(4)), LazyKt.a(lazyThreadSafetyMode, new yn0(5)), LazyKt.a(lazyThreadSafetyMode, new yn0(6)), null};
    }

    public OndcMetroRouteSearchAppModel(String routeId, String routeName, StopAppModel stopAppModel, StopAppModel stopAppModel2, List specialFeature, String str, RouteNamingSchemeType routeNamingScheme, ChaloTransitMode transitMode, OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(specialFeature, "specialFeature");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        Intrinsics.i(transitMode, "transitMode");
        this.f6766a = routeId;
        this.b = routeName;
        this.c = stopAppModel;
        this.d = stopAppModel2;
        this.e = specialFeature;
        this.f = str;
        this.g = routeNamingScheme;
        this.h = transitMode;
        this.i = originDestinationAdditionalRouteInfoAppModel;
        this.j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcMetroRouteSearchAppModel)) {
            return false;
        }
        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel = (OndcMetroRouteSearchAppModel) obj;
        return Intrinsics.d(this.f6766a, ondcMetroRouteSearchAppModel.f6766a) && Intrinsics.d(this.b, ondcMetroRouteSearchAppModel.b) && Intrinsics.d(this.c, ondcMetroRouteSearchAppModel.c) && Intrinsics.d(this.d, ondcMetroRouteSearchAppModel.d) && Intrinsics.d(this.e, ondcMetroRouteSearchAppModel.e) && Intrinsics.d(this.f, ondcMetroRouteSearchAppModel.f) && this.g == ondcMetroRouteSearchAppModel.g && this.h == ondcMetroRouteSearchAppModel.h && Intrinsics.d(this.i, ondcMetroRouteSearchAppModel.i) && Intrinsics.d(this.j, ondcMetroRouteSearchAppModel.j);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6766a.hashCode() * 31, 31, this.b);
        StopAppModel stopAppModel = this.c;
        int iHashCode = (iE + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
        StopAppModel stopAppModel2 = this.d;
        int iB = r30.b((iHashCode + (stopAppModel2 == null ? 0 : stopAppModel2.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iC = n21.c(this.h, (this.g.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel = this.i;
        int iHashCode2 = (iC + (originDestinationAdditionalRouteInfoAppModel == null ? 0 : originDestinationAdditionalRouteInfoAppModel.hashCode())) * 31;
        RouteProviderConfigAppModel routeProviderConfigAppModel = this.j;
        return iHashCode2 + (routeProviderConfigAppModel != null ? routeProviderConfigAppModel.f8227a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcMetroRouteSearchAppModel(routeId=", this.f6766a, ", routeName=", this.b, ", firstStop=");
        sbE.append(this.c);
        sbE.append(", lastStop=");
        sbE.append(this.d);
        sbE.append(", specialFeature=");
        cb0.s(", via=", this.f, ", routeNamingScheme=", sbE, this.e);
        sbE.append(this.g);
        sbE.append(", transitMode=");
        sbE.append(this.h);
        sbE.append(", additionalRouteInfo=");
        sbE.append(this.i);
        sbE.append(", routeProviderConfig=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public /* synthetic */ OndcMetroRouteSearchAppModel(int i, String str, String str2, StopAppModel stopAppModel, StopAppModel stopAppModel2, List list, String str3, RouteNamingSchemeType routeNamingSchemeType, ChaloTransitMode chaloTransitMode, OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel, RouteProviderConfigAppModel routeProviderConfigAppModel) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(OndcMetroRouteSearchAppModel$$serializer.f6767a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f6766a = str;
        this.b = str2;
        this.c = stopAppModel;
        this.d = stopAppModel2;
        this.e = list;
        this.f = str3;
        this.g = routeNamingSchemeType;
        this.h = chaloTransitMode;
        this.i = originDestinationAdditionalRouteInfoAppModel;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = routeProviderConfigAppModel;
        }
    }
}
