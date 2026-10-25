package app.chalo.ondc.model.api.response;

import app.chalo.productbooking.common.data.models.api.response.OriginDestinationAdditionalRouteInfoApiModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationProviderConfigApiModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationStopApiModel;
import defpackage.cb0;
import defpackage.dd;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcMetroRouteSearchApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcMetroRouteSearchApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn0(2)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6752a;
    public final String b;
    public final OriginDestinationStopApiModel c;
    public final OriginDestinationStopApiModel d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final OriginDestinationAdditionalRouteInfoApiModel i;
    public final OriginDestinationProviderConfigApiModel j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcMetroRouteSearchApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/response/OndcMetroRouteSearchApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcMetroRouteSearchApiModel> serializer() {
            return OndcMetroRouteSearchApiModel$$serializer.f6753a;
        }
    }

    public /* synthetic */ OndcMetroRouteSearchApiModel(int i, String str, String str2, OriginDestinationStopApiModel originDestinationStopApiModel, OriginDestinationStopApiModel originDestinationStopApiModel2, List list, String str3, String str4, String str5, OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel, OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(OndcMetroRouteSearchApiModel$$serializer.f6753a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f6752a = str;
        this.b = str2;
        this.c = originDestinationStopApiModel;
        this.d = originDestinationStopApiModel2;
        this.e = list;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = originDestinationAdditionalRouteInfoApiModel;
        this.j = originDestinationProviderConfigApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcMetroRouteSearchApiModel)) {
            return false;
        }
        OndcMetroRouteSearchApiModel ondcMetroRouteSearchApiModel = (OndcMetroRouteSearchApiModel) obj;
        return Intrinsics.d(this.f6752a, ondcMetroRouteSearchApiModel.f6752a) && Intrinsics.d(this.b, ondcMetroRouteSearchApiModel.b) && Intrinsics.d(this.c, ondcMetroRouteSearchApiModel.c) && Intrinsics.d(this.d, ondcMetroRouteSearchApiModel.d) && Intrinsics.d(this.e, ondcMetroRouteSearchApiModel.e) && Intrinsics.d(this.f, ondcMetroRouteSearchApiModel.f) && Intrinsics.d(this.g, ondcMetroRouteSearchApiModel.g) && Intrinsics.d(this.h, ondcMetroRouteSearchApiModel.h) && Intrinsics.d(this.i, ondcMetroRouteSearchApiModel.i) && Intrinsics.d(this.j, ondcMetroRouteSearchApiModel.j);
    }

    public final int hashCode() {
        String str = this.f6752a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        OriginDestinationStopApiModel originDestinationStopApiModel = this.c;
        int iHashCode3 = (iHashCode2 + (originDestinationStopApiModel == null ? 0 : originDestinationStopApiModel.hashCode())) * 31;
        OriginDestinationStopApiModel originDestinationStopApiModel2 = this.d;
        int iHashCode4 = (iHashCode3 + (originDestinationStopApiModel2 == null ? 0 : originDestinationStopApiModel2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel = this.i;
        int iHashCode9 = (iHashCode8 + (originDestinationAdditionalRouteInfoApiModel == null ? 0 : originDestinationAdditionalRouteInfoApiModel.f8134a.hashCode())) * 31;
        OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel = this.j;
        return iHashCode9 + (originDestinationProviderConfigApiModel != null ? originDestinationProviderConfigApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcMetroRouteSearchApiModel(routeId=", this.f6752a, ", routeName=", this.b, ", lastStop=");
        sbE.append(this.c);
        sbE.append(", firstStop=");
        sbE.append(this.d);
        sbE.append(", specialFeature=");
        cb0.s(", via=", this.f, ", routeNamingScheme=", sbE, this.e);
        cb0.t(sbE, this.g, ", transitMode=", this.h, ", additionalRouteInfo=");
        sbE.append(this.i);
        sbE.append(", provider=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }
}
