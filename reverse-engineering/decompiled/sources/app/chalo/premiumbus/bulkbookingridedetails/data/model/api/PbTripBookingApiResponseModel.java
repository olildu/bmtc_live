package app.chalo.premiumbus.bulkbookingridedetails.data.model.api;

import defpackage.xp0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/PbTripBookingApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PbTripBookingApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassApiResponseModel f6878a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/PbTripBookingApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/PbTripBookingApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PbTripBookingApiResponseModel> serializer() {
            return PbTripBookingApiResponseModel$$serializer.f6879a;
        }
    }

    public /* synthetic */ PbTripBookingApiResponseModel(int i, SuperPassApiResponseModel superPassApiResponseModel, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(PbTripBookingApiResponseModel$$serializer.f6879a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6878a = superPassApiResponseModel;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbTripBookingApiResponseModel)) {
            return false;
        }
        PbTripBookingApiResponseModel pbTripBookingApiResponseModel = (PbTripBookingApiResponseModel) obj;
        return Intrinsics.d(this.f6878a, pbTripBookingApiResponseModel.f6878a) && Intrinsics.d(this.b, pbTripBookingApiResponseModel.b);
    }

    public final int hashCode() {
        SuperPassApiResponseModel superPassApiResponseModel = this.f6878a;
        int iHashCode = (superPassApiResponseModel == null ? 0 : superPassApiResponseModel.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PbTripBookingApiResponseModel(passDetails=" + this.f6878a + ", linkedBookings=" + this.b + ")";
    }
}
