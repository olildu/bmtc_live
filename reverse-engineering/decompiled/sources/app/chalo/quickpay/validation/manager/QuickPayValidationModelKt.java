package app.chalo.quickpay.validation.manager;

import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModelKt;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickPayValidationModelKt {
    public static final QuickPayValidationModel a(QuickPayAppModel quickPayAppModel, WalletTypeIdentifier walletTypeIdentifier, String productName) {
        Intrinsics.i(quickPayAppModel, "<this>");
        Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
        Intrinsics.i(productName, "productName");
        return new QuickPayValidationModel(quickPayAppModel.f10918a, quickPayAppModel.b, quickPayAppModel.c, quickPayAppModel.d, quickPayAppModel.e, quickPayAppModel.f, quickPayAppModel.g, quickPayAppModel.h, quickPayAppModel.i, productName, quickPayAppModel.j, quickPayAppModel.k, walletTypeIdentifier, QuickPayAppModelKt.a(quickPayAppModel));
    }
}
