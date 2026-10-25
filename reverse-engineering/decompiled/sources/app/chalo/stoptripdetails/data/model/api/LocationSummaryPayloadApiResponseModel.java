package app.chalo.stoptripdetails.data.model.api;

import app.chalo.citydata.data.model.api.response.StopApiModel;
import defpackage.cb0;
import defpackage.hf0;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryPayloadApiResponseModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LocationSummaryPayloadApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(16)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9477a;
    public final String b;
    public final Double c;
    public final StopApiModel d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryPayloadApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryPayloadApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LocationSummaryPayloadApiResponseModel> serializer() {
            return LocationSummaryPayloadApiResponseModel$$serializer.f9478a;
        }
    }

    public /* synthetic */ LocationSummaryPayloadApiResponseModel(int i, List list, String str, Double d, StopApiModel stopApiModel, String str2, String str3, String str4) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(LocationSummaryPayloadApiResponseModel$$serializer.f9478a.getDescriptor(), i, 127);
            throw null;
        }
        this.f9477a = list;
        this.b = str;
        this.c = d;
        this.d = stopApiModel;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSummaryPayloadApiResponseModel)) {
            return false;
        }
        LocationSummaryPayloadApiResponseModel locationSummaryPayloadApiResponseModel = (LocationSummaryPayloadApiResponseModel) obj;
        return Intrinsics.d(this.f9477a, locationSummaryPayloadApiResponseModel.f9477a) && Intrinsics.d(this.b, locationSummaryPayloadApiResponseModel.b) && Intrinsics.d(this.c, locationSummaryPayloadApiResponseModel.c) && Intrinsics.d(this.d, locationSummaryPayloadApiResponseModel.d) && Intrinsics.d(this.e, locationSummaryPayloadApiResponseModel.e) && Intrinsics.d(this.f, locationSummaryPayloadApiResponseModel.f) && Intrinsics.d(this.g, locationSummaryPayloadApiResponseModel.g);
    }

    public final int hashCode() {
        List list = this.f9477a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        StopApiModel stopApiModel = this.d;
        int iHashCode4 = (iHashCode3 + (stopApiModel == null ? 0 : stopApiModel.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return this.g.hashCode() + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationSummaryPayloadApiResponseModel(summary=");
        sb.append(this.f9477a);
        sb.append(", agencyName=");
        sb.append(this.b);
        sb.append(", distance=");
        sb.append(this.c);
        sb.append(", stop=");
        sb.append(this.d);
        sb.append(", stopId=");
        cb0.t(sb, this.e, ", transportType=", this.f, ", stationType=");
        return vo1.p(sb, this.g, ")");
    }
}
