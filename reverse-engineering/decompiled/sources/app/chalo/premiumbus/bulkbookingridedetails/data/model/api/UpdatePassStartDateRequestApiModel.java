package app.chalo.premiumbus.bulkbookingridedetails.data.model.api;

import defpackage.hq0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/UpdatePassStartDateRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UpdatePassStartDateRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6886a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/UpdatePassStartDateRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/UpdatePassStartDateRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UpdatePassStartDateRequestApiModel> serializer() {
            return UpdatePassStartDateRequestApiModel$$serializer.f6887a;
        }
    }

    public /* synthetic */ UpdatePassStartDateRequestApiModel(int i, long j) {
        if (1 == (i & 1)) {
            this.f6886a = j;
        } else {
            PluginExceptionsKt.b(UpdatePassStartDateRequestApiModel$$serializer.f6887a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdatePassStartDateRequestApiModel) && this.f6886a == ((UpdatePassStartDateRequestApiModel) obj).f6886a;
    }

    public final int hashCode() {
        long j = this.f6886a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return hq0.e(this.f6886a, "UpdatePassStartDateRequestApiModel(startTime=", ")");
    }

    public UpdatePassStartDateRequestApiModel(long j) {
        this.f6886a = j;
    }
}
