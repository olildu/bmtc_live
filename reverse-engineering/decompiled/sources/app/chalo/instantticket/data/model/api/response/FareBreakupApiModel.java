package app.chalo.instantticket.data.model.api.response;

import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/FareBreakupApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareBreakupApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3861a;
    public final int b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/FareBreakupApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/response/FareBreakupApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareBreakupApiModel> serializer() {
            return FareBreakupApiModel$$serializer.f3862a;
        }
    }

    public /* synthetic */ FareBreakupApiModel(int i, int i2, String str, long j) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FareBreakupApiModel$$serializer.f3862a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3861a = str;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupApiModel)) {
            return false;
        }
        FareBreakupApiModel fareBreakupApiModel = (FareBreakupApiModel) obj;
        return Intrinsics.d(this.f3861a, fareBreakupApiModel.f3861a) && this.b == fareBreakupApiModel.b && this.c == fareBreakupApiModel.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f3861a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return uf0.m(this.c, ")", xs.m(this.b, "FareBreakupApiModel(name=", this.f3861a, ", operation=", ", value="));
    }
}
