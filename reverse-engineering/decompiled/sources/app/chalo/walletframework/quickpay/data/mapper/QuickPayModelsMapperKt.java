package app.chalo.walletframework.quickpay.data.mapper;

import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.wallet.data.model.appmodel.QuickPayResponseAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickPayModelsMapperKt {
    public static final QuickPayAppModel a(QuickPayEntity quickPayEntity) {
        Intrinsics.i(quickPayEntity, "<this>");
        return new QuickPayAppModel(quickPayEntity.f10931a, quickPayEntity.b, quickPayEntity.c, quickPayEntity.d, quickPayEntity.e, quickPayEntity.f, quickPayEntity.g, quickPayEntity.h, quickPayEntity.i, quickPayEntity.j, quickPayEntity.k);
    }

    public static final QuickPayEntity b(QuickPayAppModel quickPayAppModel) {
        Intrinsics.i(quickPayAppModel, "<this>");
        return new QuickPayEntity(quickPayAppModel.f10918a, quickPayAppModel.b, quickPayAppModel.c, quickPayAppModel.d, quickPayAppModel.e, quickPayAppModel.f, quickPayAppModel.g, quickPayAppModel.h, quickPayAppModel.i, quickPayAppModel.j, quickPayAppModel.k);
    }

    public static final QuickPayAppModel c(QuickPayResponseAppModel quickPayResponseAppModel, String walletId) {
        Intrinsics.i(quickPayResponseAppModel, "<this>");
        Intrinsics.i(walletId, "walletId");
        QuickPayOrderStatus quickPayOrderStatus = quickPayResponseAppModel.g;
        String str = quickPayResponseAppModel.e;
        if (str == null) {
            str = "";
        }
        return new QuickPayAppModel(quickPayOrderStatus, str, "wallet", null, null, quickPayResponseAppModel.h, quickPayResponseAppModel.c, quickPayResponseAppModel.b, quickPayResponseAppModel.f11006a, quickPayResponseAppModel.f, walletId);
    }
}
