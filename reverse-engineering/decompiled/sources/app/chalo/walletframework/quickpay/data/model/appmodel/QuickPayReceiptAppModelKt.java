package app.chalo.walletframework.quickpay.data.model.appmodel;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ProductReceiptDataKt;
import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import app.chalo.utils.WalletUtilsExtensionsKt;
import app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickPayReceiptAppModelKt {
    public static final QuickPayReceipt a(QuickPayReceiptAppModel quickPayReceiptAppModel, String walletId) {
        Intrinsics.i(quickPayReceiptAppModel, "<this>");
        Intrinsics.i(walletId, "walletId");
        return new QuickPayReceipt(quickPayReceiptAppModel.f10919a, WalletUtilsExtensionsKt.a(quickPayReceiptAppModel.d, walletId), quickPayReceiptAppModel.b, quickPayReceiptAppModel.e, quickPayReceiptAppModel.f, quickPayReceiptAppModel.g, quickPayReceiptAppModel.h, quickPayReceiptAppModel.i, quickPayReceiptAppModel.j, "", quickPayReceiptAppModel.k, quickPayReceiptAppModel.l, quickPayReceiptAppModel.m, quickPayReceiptAppModel.n, quickPayReceiptAppModel.o, quickPayReceiptAppModel.p, quickPayReceiptAppModel.q, quickPayReceiptAppModel.r, quickPayReceiptAppModel.s, quickPayReceiptAppModel.t, quickPayReceiptAppModel.u);
    }

    public static final QuickPayReceiptAppModel b(QuickPayReceiptResponseModel quickPayReceiptResponseModel) {
        Intrinsics.i(quickPayReceiptResponseModel, "<this>");
        String str = quickPayReceiptResponseModel.f10915a;
        long j = quickPayReceiptResponseModel.b;
        long j2 = quickPayReceiptResponseModel.c;
        long j3 = quickPayReceiptResponseModel.d;
        long j4 = quickPayReceiptResponseModel.e;
        String str2 = quickPayReceiptResponseModel.f;
        String str3 = quickPayReceiptResponseModel.g;
        String str4 = quickPayReceiptResponseModel.h;
        String str5 = quickPayReceiptResponseModel.i;
        String str6 = quickPayReceiptResponseModel.j;
        Map map = quickPayReceiptResponseModel.k;
        String str7 = quickPayReceiptResponseModel.l;
        RouteNamingSchemeType.Companion companion = RouteNamingSchemeType.INSTANCE;
        String str8 = quickPayReceiptResponseModel.m;
        companion.getClass();
        RouteNamingSchemeType routeNamingSchemeTypeA = RouteNamingSchemeType.Companion.a(str8);
        String str9 = quickPayReceiptResponseModel.n;
        String str10 = quickPayReceiptResponseModel.o;
        String str11 = quickPayReceiptResponseModel.p;
        String str12 = quickPayReceiptResponseModel.q;
        String str13 = quickPayReceiptResponseModel.r;
        String str14 = quickPayReceiptResponseModel.s;
        String str15 = quickPayReceiptResponseModel.t;
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = quickPayReceiptResponseModel.u;
        return new QuickPayReceiptAppModel(str, j, j2, j3, j4, str2, str3, str4, str5, str6, map, str7, routeNamingSchemeTypeA, str9, str10, str11, str12, str13, str14, str15, receiptFareDataApiResponseModel != null ? ProductReceiptDataKt.b(receiptFareDataApiResponseModel) : null);
    }
}
