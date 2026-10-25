package app.chalo.productbooking.common.data.models.entity;

import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import defpackage.uf0;
import defpackage.vz;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/entity/FareBreakupEntityModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareBreakupEntityModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vz(29)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8241a;
    public final FareBreakupOperationType b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/entity/FareBreakupEntityModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/entity/FareBreakupEntityModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareBreakupEntityModel> serializer() {
            return FareBreakupEntityModel$$serializer.f8242a;
        }
    }

    public /* synthetic */ FareBreakupEntityModel(int i, String str, FareBreakupOperationType fareBreakupOperationType, long j) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FareBreakupEntityModel$$serializer.f8242a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8241a = str;
        this.b = fareBreakupOperationType;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupEntityModel)) {
            return false;
        }
        FareBreakupEntityModel fareBreakupEntityModel = (FareBreakupEntityModel) obj;
        return Intrinsics.d(this.f8241a, fareBreakupEntityModel.f8241a) && this.b == fareBreakupEntityModel.b && this.c == fareBreakupEntityModel.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8241a.hashCode() * 31)) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FareBreakupEntityModel(fareBreakupCopy=");
        sb.append(this.f8241a);
        sb.append(", fareOperationType=");
        sb.append(this.b);
        sb.append(", fare=");
        return uf0.m(this.c, ")", sb);
    }

    public FareBreakupEntityModel(String fareBreakupCopy, FareBreakupOperationType fareOperationType, long j) {
        Intrinsics.i(fareBreakupCopy, "fareBreakupCopy");
        Intrinsics.i(fareOperationType, "fareOperationType");
        this.f8241a = fareBreakupCopy;
        this.b = fareOperationType;
        this.c = j;
    }
}
