package app.chalo.productbooking.common.data.models.api.response;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.data.RefundStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GenericMobileTicketProductApiResponseModelKt {
    public static final RefundInfoEntityModel a(RefundInfoAppModel refundInfoAppModel) {
        Intrinsics.i(refundInfoAppModel, "<this>");
        RefundStatus refundStatus = refundInfoAppModel.f2396a;
        if (refundStatus == null) {
            return null;
        }
        return new RefundInfoEntityModel(refundStatus, refundInfoAppModel.b, refundInfoAppModel.c, refundInfoAppModel.d);
    }

    public static final RefundInfoAppModel b(RefundInfoApiModel refundInfoApiModel) {
        Intrinsics.i(refundInfoApiModel, "<this>");
        RefundStatus.Companion companion = RefundStatus.INSTANCE;
        String str = refundInfoApiModel.f8181a;
        companion.getClass();
        RefundStatus refundStatusA = RefundStatus.Companion.a(str);
        String str2 = refundInfoApiModel.b;
        if (str2 == null) {
            return null;
        }
        return new RefundInfoAppModel(refundStatusA, str2, refundInfoApiModel.c, refundInfoApiModel.d);
    }
}
