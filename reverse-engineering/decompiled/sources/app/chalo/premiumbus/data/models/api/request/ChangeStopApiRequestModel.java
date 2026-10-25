package app.chalo.premiumbus.data.models.api.request;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/ChangeStopApiRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChangeStopApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6984a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/ChangeStopApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/ChangeStopApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChangeStopApiRequestModel> serializer() {
            return ChangeStopApiRequestModel$$serializer.f6985a;
        }
    }

    public /* synthetic */ ChangeStopApiRequestModel(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ChangeStopApiRequestModel$$serializer.f6985a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6984a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeStopApiRequestModel)) {
            return false;
        }
        ChangeStopApiRequestModel changeStopApiRequestModel = (ChangeStopApiRequestModel) obj;
        return Intrinsics.d(this.f6984a, changeStopApiRequestModel.f6984a) && Intrinsics.d(this.b, changeStopApiRequestModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6984a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("ChangeStopApiRequestModel(bookingId=", this.f6984a, ", newFromStopId=", this.b, ")");
    }

    public ChangeStopApiRequestModel(String bookingId, String newFromStopId) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(newFromStopId, "newFromStopId");
        this.f6984a = bookingId;
        this.b = newFromStopId;
    }
}
