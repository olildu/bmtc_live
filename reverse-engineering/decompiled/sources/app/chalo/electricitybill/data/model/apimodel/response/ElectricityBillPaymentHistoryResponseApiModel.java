package app.chalo.electricitybill.data.model.apimodel.response;

import defpackage.r1;
import defpackage.vz;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ElectricityBillPaymentHistoryResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vz(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2534a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ElectricityBillPaymentHistoryResponseApiModel> serializer() {
            return ElectricityBillPaymentHistoryResponseApiModel$$serializer.f2535a;
        }
    }

    public /* synthetic */ ElectricityBillPaymentHistoryResponseApiModel(int i, List list) {
        if ((i & 1) == 0) {
            this.f2534a = null;
        } else {
            this.f2534a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ElectricityBillPaymentHistoryResponseApiModel) && Intrinsics.d(this.f2534a, ((ElectricityBillPaymentHistoryResponseApiModel) obj).f2534a);
    }

    public final int hashCode() {
        List list = this.f2534a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return r1.d("ElectricityBillPaymentHistoryResponseApiModel(payments=", ")", this.f2534a);
    }
}
