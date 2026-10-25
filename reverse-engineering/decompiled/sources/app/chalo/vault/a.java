package app.chalo.vault;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10752a;
    public final /* synthetic */ Query b;

    public /* synthetic */ a(Query query, int i) {
        this.f10752a = i;
        this.b = query;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10752a) {
            case 0:
                Chalo_pay_tableQueries.GetChaloPayDataQuery getChaloPayDataQuery = (Chalo_pay_tableQueries.GetChaloPayDataQuery) this.b;
                SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery, "$this$executeQuery");
                executeQuery.bindString(0, getChaloPayDataQuery.b);
                executeQuery.bindString(1, getChaloPayDataQuery.c);
                break;
            case 1:
                ConfigQueries.GetConfigQuery getConfigQuery = (ConfigQueries.GetConfigQuery) this.b;
                SqlPreparedStatement executeQuery2 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery2, "$this$executeQuery");
                executeQuery2.bindString(0, getConfigQuery.b);
                break;
            case 2:
                KeystorageQueries.GetAllKeyBetweenTSQuery getAllKeyBetweenTSQuery = (KeystorageQueries.GetAllKeyBetweenTSQuery) this.b;
                SqlPreparedStatement executeQuery3 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery3, "$this$executeQuery");
                long j = getAllKeyBetweenTSQuery.b;
                executeQuery3.d(0, Long.valueOf(j));
                executeQuery3.d(1, Long.valueOf(j));
                executeQuery3.bindString(2, getAllKeyBetweenTSQuery.c);
                break;
            case 3:
                Load_money_tableQueries.GetListOfLastXNumberOfDistinctLoadMoneyAmountsQuery getListOfLastXNumberOfDistinctLoadMoneyAmountsQuery = (Load_money_tableQueries.GetListOfLastXNumberOfDistinctLoadMoneyAmountsQuery) this.b;
                SqlPreparedStatement executeQuery4 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery4, "$this$executeQuery");
                executeQuery4.d(0, Long.valueOf(getListOfLastXNumberOfDistinctLoadMoneyAmountsQuery.b));
                break;
            case 4:
                Load_money_tableQueries.GetLoadMoneyDataQuery getLoadMoneyDataQuery = (Load_money_tableQueries.GetLoadMoneyDataQuery) this.b;
                SqlPreparedStatement executeQuery5 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery5, "$this$executeQuery");
                executeQuery5.bindString(0, getLoadMoneyDataQuery.b);
                executeQuery5.bindString(1, getLoadMoneyDataQuery.c);
                break;
            case 5:
                Quick_pay_receipt_tableQueries.GetQuickPayReceiptQuery getQuickPayReceiptQuery = (Quick_pay_receipt_tableQueries.GetQuickPayReceiptQuery) this.b;
                SqlPreparedStatement executeQuery6 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery6, "$this$executeQuery");
                executeQuery6.bindString(0, getQuickPayReceiptQuery.b);
                break;
            case 6:
                Quick_pay_tableQueries.GetActiveQuickPaysQuery getActiveQuickPaysQuery = (Quick_pay_tableQueries.GetActiveQuickPaysQuery) this.b;
                SqlPreparedStatement executeQuery7 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery7, "$this$executeQuery");
                executeQuery7.d(0, Long.valueOf(getActiveQuickPaysQuery.b));
                break;
            case 7:
                Quick_pay_tableQueries.GetQuickPayForOrderIdAndTransactionIdQuery getQuickPayForOrderIdAndTransactionIdQuery = (Quick_pay_tableQueries.GetQuickPayForOrderIdAndTransactionIdQuery) this.b;
                SqlPreparedStatement executeQuery8 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery8, "$this$executeQuery");
                executeQuery8.bindString(0, getQuickPayForOrderIdAndTransactionIdQuery.b);
                executeQuery8.bindString(1, getQuickPayForOrderIdAndTransactionIdQuery.c);
                break;
            case 8:
                Quick_pay_tableQueries.GetQuickPayForTransactionIdQuery getQuickPayForTransactionIdQuery = (Quick_pay_tableQueries.GetQuickPayForTransactionIdQuery) this.b;
                SqlPreparedStatement executeQuery9 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery9, "$this$executeQuery");
                executeQuery9.bindString(0, getQuickPayForTransactionIdQuery.b);
                break;
            case 9:
                Quick_pay_tableQueries.GetQuickPaysForOrderIdQuery getQuickPaysForOrderIdQuery = (Quick_pay_tableQueries.GetQuickPaysForOrderIdQuery) this.b;
                SqlPreparedStatement executeQuery10 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery10, "$this$executeQuery");
                executeQuery10.bindString(0, getQuickPaysForOrderIdQuery.b);
                break;
            case 10:
                Quick_pay_tableQueries.GetQuickPaysForOrderIdsQuery getQuickPaysForOrderIdsQuery = (Quick_pay_tableQueries.GetQuickPaysForOrderIdsQuery) this.b;
                SqlPreparedStatement executeQuery11 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery11, "$this$executeQuery");
                int i = 0;
                for (Object obj2 : getQuickPaysForOrderIdsQuery.b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery11.bindString(i, (String) obj2);
                    i = i2;
                }
                return Unit.f17538a;
            case 11:
                Wallet_tableQueries.GetAllWalletsForUserQuery getAllWalletsForUserQuery = (Wallet_tableQueries.GetAllWalletsForUserQuery) this.b;
                SqlPreparedStatement executeQuery12 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery12, "$this$executeQuery");
                executeQuery12.bindString(0, getAllWalletsForUserQuery.b);
                break;
            case 12:
                Wallet_tableQueries.GetWalletForUserAndTypeAndAgencyQuery getWalletForUserAndTypeAndAgencyQuery = (Wallet_tableQueries.GetWalletForUserAndTypeAndAgencyQuery) this.b;
                SqlPreparedStatement executeQuery13 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery13, "$this$executeQuery");
                executeQuery13.bindString(0, getWalletForUserAndTypeAndAgencyQuery.b);
                executeQuery13.bindString(1, getWalletForUserAndTypeAndAgencyQuery.c);
                executeQuery13.bindString(2, getWalletForUserAndTypeAndAgencyQuery.d);
                break;
            case 13:
                Wallet_tableQueries.GetWalletForUserAndWalletIdQuery getWalletForUserAndWalletIdQuery = (Wallet_tableQueries.GetWalletForUserAndWalletIdQuery) this.b;
                SqlPreparedStatement executeQuery14 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery14, "$this$executeQuery");
                executeQuery14.bindString(0, getWalletForUserAndWalletIdQuery.b);
                executeQuery14.bindString(1, getWalletForUserAndWalletIdQuery.c);
                break;
            case 14:
                Wallet_transaction_tableQueries.GetAllWalletTransactionsForWalletIdQuery getAllWalletTransactionsForWalletIdQuery = (Wallet_transaction_tableQueries.GetAllWalletTransactionsForWalletIdQuery) this.b;
                SqlPreparedStatement executeQuery15 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery15, "$this$executeQuery");
                executeQuery15.bindString(0, getAllWalletTransactionsForWalletIdQuery.b);
                executeQuery15.bindString(1, getAllWalletTransactionsForWalletIdQuery.c);
                break;
            case 15:
                Wallet_transaction_tableQueries.GetAllWalletTransactionsQuery getAllWalletTransactionsQuery = (Wallet_transaction_tableQueries.GetAllWalletTransactionsQuery) this.b;
                SqlPreparedStatement executeQuery16 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery16, "$this$executeQuery");
                executeQuery16.bindString(0, getAllWalletTransactionsQuery.b);
                break;
            case 16:
                Wallet_transaction_tableQueries.GetOrderIdsForUserAndTypeForWalletQuery getOrderIdsForUserAndTypeForWalletQuery = (Wallet_transaction_tableQueries.GetOrderIdsForUserAndTypeForWalletQuery) this.b;
                SqlPreparedStatement executeQuery17 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery17, "$this$executeQuery");
                executeQuery17.bindString(0, getOrderIdsForUserAndTypeForWalletQuery.b);
                executeQuery17.bindString(1, getOrderIdsForUserAndTypeForWalletQuery.c);
                executeQuery17.bindString(2, getOrderIdsForUserAndTypeForWalletQuery.d);
                break;
            default:
                Wallet_transaction_tableQueries.GetWalletTransactionQuery getWalletTransactionQuery = (Wallet_transaction_tableQueries.GetWalletTransactionQuery) this.b;
                SqlPreparedStatement executeQuery18 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery18, "$this$executeQuery");
                executeQuery18.bindString(0, getWalletTransactionQuery.b);
                executeQuery18.bindString(1, getWalletTransactionQuery.c);
                break;
        }
        return Unit.f17538a;
    }
}
