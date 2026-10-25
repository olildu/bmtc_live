package app.chalo.receipt;

import defpackage.hz0;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/receipt/ReceiptFareDataApiResponseModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ReceiptFareDataApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8921a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/receipt/ReceiptFareDataApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/receipt/ReceiptFareDataApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ReceiptFareDataApiResponseModel> serializer() {
            return ReceiptFareDataApiResponseModel$$serializer.f8922a;
        }
    }

    public /* synthetic */ ReceiptFareDataApiResponseModel(int i, String str, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ReceiptFareDataApiResponseModel$$serializer.f8922a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8921a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptFareDataApiResponseModel)) {
            return false;
        }
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = (ReceiptFareDataApiResponseModel) obj;
        return Intrinsics.d(this.f8921a, receiptFareDataApiResponseModel.f8921a) && Intrinsics.d(this.b, receiptFareDataApiResponseModel.b);
    }

    public final int hashCode() {
        String str = this.f8921a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return nf1.m("ReceiptFareDataApiResponseModel(paymentMode=", this.f8921a, ", fareBreakup=", ")", this.b);
    }
}
