package app.chalo.stoptripdetails.data.model.api;

import defpackage.hf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryApiResponseModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LocationSummaryApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9475a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LocationSummaryApiResponseModel> serializer() {
            return LocationSummaryApiResponseModel$$serializer.f9476a;
        }
    }

    public /* synthetic */ LocationSummaryApiResponseModel(int i, String str, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(LocationSummaryApiResponseModel$$serializer.f9476a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9475a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSummaryApiResponseModel)) {
            return false;
        }
        LocationSummaryApiResponseModel locationSummaryApiResponseModel = (LocationSummaryApiResponseModel) obj;
        return Intrinsics.d(this.f9475a, locationSummaryApiResponseModel.f9475a) && Intrinsics.d(this.b, locationSummaryApiResponseModel.b);
    }

    public final int hashCode() {
        List list = this.f9475a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LocationSummaryApiResponseModel(payload=" + this.f9475a + ", status=" + this.b + ")";
    }
}
