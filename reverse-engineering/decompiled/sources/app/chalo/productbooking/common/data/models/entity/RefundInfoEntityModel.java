package app.chalo.productbooking.common.data.models.entity;

import app.chalo.data.RefundStatus;
import defpackage.nf1;
import defpackage.r30;
import defpackage.u01;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RefundInfoEntityModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new u01(7)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RefundStatus f8245a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RefundInfoEntityModel> serializer() {
            return RefundInfoEntityModel$$serializer.f8246a;
        }
    }

    public /* synthetic */ RefundInfoEntityModel(int i, RefundStatus refundStatus, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(RefundInfoEntityModel$$serializer.f8246a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8245a = refundStatus;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefundInfoEntityModel)) {
            return false;
        }
        RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) obj;
        return this.f8245a == refundInfoEntityModel.f8245a && Intrinsics.d(this.b, refundInfoEntityModel.b) && Intrinsics.d(this.c, refundInfoEntityModel.c) && Intrinsics.d(this.d, refundInfoEntityModel.d);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8245a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefundInfoEntityModel(status=");
        sb.append(this.f8245a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", refundDescription=");
        return r30.i(sb, this.c, ", utrNumber=", this.d, ")");
    }

    public RefundInfoEntityModel(RefundStatus status, String message, String str, String str2) {
        Intrinsics.i(status, "status");
        Intrinsics.i(message, "message");
        this.f8245a = status;
        this.b = message;
        this.c = str;
        this.d = str2;
    }
}
