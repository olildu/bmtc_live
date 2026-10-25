package app.chalo.superpass.data.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f9535a;
    public final Boolean b;
    public final PassTripHistoryApiResponseModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel> serializer() {
            return SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer.f9536a;
        }
    }

    public /* synthetic */ SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel(int i, Boolean bool, Boolean bool2, PassTripHistoryApiResponseModel passTripHistoryApiResponseModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer.f9536a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9535a = bool;
        this.b = bool2;
        this.c = passTripHistoryApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel)) {
            return false;
        }
        SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel = (SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel) obj;
        return Intrinsics.d(this.f9535a, syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.f9535a) && Intrinsics.d(this.b, syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.b) && Intrinsics.d(this.c, syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.c);
    }

    public final int hashCode() {
        Boolean bool = this.f9535a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PassTripHistoryApiResponseModel passTripHistoryApiResponseModel = this.c;
        return iHashCode2 + (passTripHistoryApiResponseModel != null ? passTripHistoryApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        return "SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel(passSyncStatus=" + this.f9535a + ", ticketSyncStatus=" + this.b + ", passTripHistory=" + this.c + ")";
    }
}
