package app.chalo.walletframework.wallet.data.mapper;

import app.chalo.utils.WalletUtilsExtensionsKt;
import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.ChaloPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import app.chalo.walletframework.wallet.data.model.apimodel.response.AllWalletTransactionsResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.ChaloPayApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.LoadMoneyResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.QuickPayResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletLoadBalanceConfigurationApiResponseModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletSyncHistoryResponseApiModel;
import app.chalo.walletframework.wallet.data.model.appmodel.ChaloPayResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.LoadMoneyResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.QuickPayResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletLoadBalanceConfigurationAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletStatusResponse;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionResponseAppModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletApiModelToAppModelMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    public static final WalletHistorySyncResponseAppModel a(WalletSyncHistoryResponseApiModel walletSyncHistoryResponseApiModel) {
        WalletStatusResponse walletStatusResponse;
        String lowerCase;
        boolean z;
        WalletResponseAppModel walletResponseAppModel;
        WalletTransactionResponseAppModel walletTransactionResponseAppModel;
        List list;
        ?? arrayList;
        List list2;
        boolean z2;
        char c;
        char c2;
        ChaloPayOrderStatus chaloPayOrderStatus;
        LoadMoneyOrderStatus loadMoneyOrderStatus;
        QuickPayOrderStatus quickPayOrderStatus;
        Intrinsics.i(walletSyncHistoryResponseApiModel, "<this>");
        AllWalletTransactionsResponseApiModel allWalletTransactionsResponseApiModel = walletSyncHistoryResponseApiModel.b;
        WalletResponseApiModel walletResponseApiModel = walletSyncHistoryResponseApiModel.f10999a;
        Intrinsics.i(walletResponseApiModel, "<this>");
        int i = walletResponseApiModel.c;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            walletStatusResponse = WalletStatusResponse.FULL_KYC_REQUIRED;
        } else if (i == 1) {
            walletStatusResponse = WalletStatusResponse.ACTIVE;
        } else if (i != 2) {
            walletStatusResponse = i != 3 ? WalletStatusResponse.BLOCKED : WalletStatusResponse.BLOCKED;
        } else {
            walletStatusResponse = WalletStatusResponse.RECLAIM;
        }
        WalletStatusResponse walletStatusResponse2 = walletStatusResponse;
        String str = walletResponseApiModel.f10997a;
        String str2 = walletResponseApiModel.b;
        int i4 = walletResponseApiModel.d;
        long j = walletResponseApiModel.e;
        Long l = walletResponseApiModel.f;
        String str3 = walletResponseApiModel.g;
        if (str3 != null) {
            lowerCase = str3.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        WalletResponseAppModel walletResponseAppModel2 = new WalletResponseAppModel(str, str2, walletStatusResponse2, i4, j, l, lowerCase);
        if (allWalletTransactionsResponseApiModel != null) {
            String walletId = walletResponseApiModel.f10997a;
            Intrinsics.i(walletId, "walletId");
            List list3 = allWalletTransactionsResponseApiModel.f10975a;
            if (list3 != null) {
                List<QuickPayResponseApiModel> list4 = list3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
                for (QuickPayResponseApiModel quickPayResponseApiModel : list4) {
                    Intrinsics.i(quickPayResponseApiModel, "<this>");
                    long jLongValue = quickPayResponseApiModel.f;
                    int i5 = quickPayResponseApiModel.e;
                    if (i5 == 0) {
                        quickPayOrderStatus = QuickPayOrderStatus.PENDING;
                    } else if (i5 != i3) {
                        quickPayOrderStatus = i5 != i2 ? QuickPayOrderStatus.PENDING : QuickPayOrderStatus.REFUNDED;
                    } else {
                        quickPayOrderStatus = QuickPayOrderStatus.SUCCESS;
                    }
                    QuickPayOrderStatus quickPayOrderStatus2 = quickPayOrderStatus;
                    String strA = WalletUtilsExtensionsKt.a(jLongValue, walletId);
                    int i6 = quickPayResponseApiModel.f10987a;
                    Long l2 = quickPayResponseApiModel.b;
                    if (l2 != null) {
                        jLongValue -= l2.longValue();
                    } else {
                        Long l3 = quickPayResponseApiModel.d;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                        }
                    }
                    arrayList2.add(new QuickPayResponseAppModel(strA, i6, l2, jLongValue, quickPayResponseApiModel.c, quickPayResponseApiModel.d, quickPayOrderStatus2, quickPayResponseApiModel.f));
                    walletResponseAppModel2 = walletResponseAppModel2;
                    i2 = 2;
                    i3 = 1;
                }
                walletResponseAppModel = walletResponseAppModel2;
                list = arrayList2;
            } else {
                walletResponseAppModel = walletResponseAppModel2;
                list = EmptyList.f17557a;
            }
            List list5 = list;
            List list6 = allWalletTransactionsResponseApiModel.b;
            if (list6 != null) {
                List<LoadMoneyResponseApiModel> list7 = list6;
                arrayList = new ArrayList(CollectionsKt.v(list7, 10));
                for (LoadMoneyResponseApiModel loadMoneyResponseApiModel : list7) {
                    Intrinsics.i(loadMoneyResponseApiModel, "<this>");
                    int i7 = loadMoneyResponseApiModel.e;
                    if (i7 == 0) {
                        loadMoneyOrderStatus = LoadMoneyOrderStatus.PROCESSING;
                    } else if (i7 == 1) {
                        loadMoneyOrderStatus = LoadMoneyOrderStatus.SUCCESS;
                    } else if (i7 != 2) {
                        loadMoneyOrderStatus = i7 != 4 ? LoadMoneyOrderStatus.PROCESSING : LoadMoneyOrderStatus.REFUNDED;
                    } else {
                        loadMoneyOrderStatus = LoadMoneyOrderStatus.FAILED;
                    }
                    arrayList.add(new LoadMoneyResponseAppModel(loadMoneyResponseApiModel.f10985a, loadMoneyResponseApiModel.b, loadMoneyResponseApiModel.c, loadMoneyResponseApiModel.d, loadMoneyOrderStatus, loadMoneyResponseApiModel.f));
                }
            } else {
                arrayList = EmptyList.f17557a;
            }
            List list8 = allWalletTransactionsResponseApiModel.c;
            if (list8 != null) {
                List<ChaloPayApiModel> list9 = list8;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list9, 10));
                for (ChaloPayApiModel chaloPayApiModel : list9) {
                    Intrinsics.i(chaloPayApiModel, "<this>");
                    int i8 = chaloPayApiModel.e;
                    if (i8 != 0) {
                        z2 = true;
                        if (i8 != 1) {
                            c = 2;
                            if (i8 != 2) {
                                c2 = 3;
                                chaloPayOrderStatus = i8 != 3 ? ChaloPayOrderStatus.PENDING : ChaloPayOrderStatus.FAILED;
                            } else {
                                c2 = 3;
                                chaloPayOrderStatus = ChaloPayOrderStatus.REFUNDED;
                            }
                        } else {
                            c = 2;
                            c2 = 3;
                            chaloPayOrderStatus = ChaloPayOrderStatus.SUCCESS;
                        }
                    } else {
                        z2 = true;
                        c = 2;
                        c2 = 3;
                        chaloPayOrderStatus = ChaloPayOrderStatus.PENDING;
                    }
                    String str4 = walletId;
                    arrayList3.add(new ChaloPayResponseAppModel(chaloPayApiModel.f10979a, chaloPayApiModel.b, chaloPayApiModel.c, chaloPayApiModel.d, chaloPayOrderStatus, chaloPayApiModel.f, chaloPayApiModel.g, str4));
                    walletId = str4;
                }
                z = true;
                list2 = arrayList3;
            } else {
                z = true;
                list2 = EmptyList.f17557a;
            }
            walletTransactionResponseAppModel = new WalletTransactionResponseAppModel(list5, arrayList, list2);
        } else {
            z = true;
            walletResponseAppModel = walletResponseAppModel2;
            EmptyList emptyList = EmptyList.f17557a;
            walletTransactionResponseAppModel = new WalletTransactionResponseAppModel(emptyList, emptyList, emptyList);
        }
        return new WalletHistorySyncResponseAppModel(walletResponseAppModel, walletTransactionResponseAppModel, allWalletTransactionsResponseApiModel != null ? z : false);
    }

    public static final WalletLoadBalanceConfigurationAppModel b(WalletLoadBalanceConfigurationApiResponseModel walletLoadBalanceConfigurationApiResponseModel) {
        Intrinsics.i(walletLoadBalanceConfigurationApiResponseModel, "<this>");
        String str = walletLoadBalanceConfigurationApiResponseModel.f10991a;
        String str2 = walletLoadBalanceConfigurationApiResponseModel.e;
        List list = walletLoadBalanceConfigurationApiResponseModel.d;
        Boolean bool = walletLoadBalanceConfigurationApiResponseModel.f;
        Integer num = walletLoadBalanceConfigurationApiResponseModel.g;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = walletLoadBalanceConfigurationApiResponseModel.h;
        return new WalletLoadBalanceConfigurationAppModel(str, str2, list, bool, iIntValue, num2 != null ? num2.intValue() : -1);
    }
}
