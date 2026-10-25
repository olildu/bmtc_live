package app.chalo.data;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/RefundInfoAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RefundInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new u01(4)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RefundStatus f2396a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/RefundInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/RefundInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RefundInfoAppModel> serializer() {
            return RefundInfoAppModel$$serializer.f2397a;
        }
    }

    public /* synthetic */ RefundInfoAppModel(int i, RefundStatus refundStatus, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(RefundInfoAppModel$$serializer.f2397a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2396a = refundStatus;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefundInfoAppModel)) {
            return false;
        }
        RefundInfoAppModel refundInfoAppModel = (RefundInfoAppModel) obj;
        return this.f2396a == refundInfoAppModel.f2396a && Intrinsics.d(this.b, refundInfoAppModel.b) && Intrinsics.d(this.c, refundInfoAppModel.c) && Intrinsics.d(this.d, refundInfoAppModel.d);
    }

    public final int hashCode() {
        RefundStatus refundStatus = this.f2396a;
        int iE = nf1.e((refundStatus == null ? 0 : refundStatus.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefundInfoAppModel(status=");
        sb.append(this.f2396a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", refundDescription=");
        return r30.i(sb, this.c, ", utrNumber=", this.d, ")");
    }

    public RefundInfoAppModel(RefundStatus refundStatus, String message, String str, String str2) {
        Intrinsics.i(message, "message");
        this.f2396a = refundStatus;
        this.b = message;
        this.c = str;
        this.d = str2;
    }
}
