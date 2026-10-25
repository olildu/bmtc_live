package defpackage;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.ui.layout.Placeable;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.exceptions.ClosedLoopWalletRegisterException;
import app.chalo.walletframework.wallet.data.exceptions.SyncWalletException;
import app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException;
import app.chalo.walletframework.wallet.data.exceptions.WalletRemoteDataException;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import app.chalo.webview.WebViewScreenDataState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hp1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15850a;

    public /* synthetic */ hp1(int i) {
        this.f15850a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        WalletAndAllTransactions walletAndAllTransactions;
        WalletAppModel walletAppModel;
        String f11008a;
        switch (this.f15850a) {
            case 0:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = "";
                }
                return new ClosedLoopWalletRegisterException(genericChaloErrorResponse, genericChaloErrorResponse != null ? Integer.valueOf(genericChaloErrorResponse.f6497a) : null, str);
            case 1:
                return new WalletMigrationException((GenericChaloErrorResponse) obj);
            case 2:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = "";
                }
                return new SyncWalletException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? Integer.valueOf(genericChaloErrorResponse2.f6497a) : null, str2);
            case 3:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse3 == null || (str3 = genericChaloErrorResponse3.b) == null) {
                    str3 = "Something went wrong";
                }
                return new WalletRemoteDataException(genericChaloErrorResponse3, str3);
            case 4:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse4 == null || (str4 = genericChaloErrorResponse4.b) == null) {
                    str4 = "";
                }
                return new SyncWalletException(genericChaloErrorResponse4, genericChaloErrorResponse4 != null ? Integer.valueOf(genericChaloErrorResponse4.f6497a) : null, str4);
            case 5:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse5 == null || (str5 = genericChaloErrorResponse5.b) == null) {
                    str5 = "";
                }
                return new SyncWalletException(genericChaloErrorResponse5, genericChaloErrorResponse5 != null ? Integer.valueOf(genericChaloErrorResponse5.f6497a) : null, str5);
            case 6:
                WalletTypeIdentifier it = (WalletTypeIdentifier) obj;
                Intrinsics.i(it, "it");
                return it.f10959a + "_" + it.b;
            case 7:
                ChaloUseCaseResult it2 = (ChaloUseCaseResult) obj;
                Intrinsics.i(it2, "it");
                ChaloUseCaseResult.Success success = it2 instanceof ChaloUseCaseResult.Success ? (ChaloUseCaseResult.Success) it2 : null;
                return (success == null || (walletAndAllTransactions = (WalletAndAllTransactions) success.f10419a) == null || (walletAppModel = walletAndAllTransactions.f11093a) == null || (f11008a = walletAppModel.getF11008a()) == null) ? "" : f11008a;
            case 8:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("wallet_table");
                return Unit.f17538a;
            case 9:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("wallet_table");
                return Unit.f17538a;
            case 10:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("wallet_table");
                return Unit.f17538a;
            case 11:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("wallet_table");
                return Unit.f17538a;
            case 12:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("wallet_table");
                return Unit.f17538a;
            case 13:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("wallet_transaction_table");
                return Unit.f17538a;
            case 14:
                return cb0.i((SqlCursor) obj, "cursor", 0);
            case 15:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("wallet_transaction_table");
                return Unit.f17538a;
            case 16:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("wallet_transaction_table");
                return Unit.f17538a;
            case 17:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("wallet_transaction_table");
                return Unit.f17538a;
            case 18:
                Function1 emit10 = (Function1) obj;
                Intrinsics.i(emit10, "emit");
                emit10.invoke("wallet_transaction_table");
                return Unit.f17538a;
            case 19:
                Function1 emit11 = (Function1) obj;
                Intrinsics.i(emit11, "emit");
                emit11.invoke("wallet_transaction_table");
                return Unit.f17538a;
            case 20:
                WebViewScreenDataState it3 = (WebViewScreenDataState) obj;
                Intrinsics.i(it3, "it");
                return WebViewScreenDataState.a(it3, null);
            case 21:
                return WideNavigationRailKt.AnonymousClass1.AnonymousClass2.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
            case 22:
                return ((WindowInsetsHolder) obj).getSafeGestures();
            case 23:
                return ((WindowInsetsHolder) obj).getSystemGestures();
            case 24:
                return ((WindowInsetsHolder) obj).getDisplayCutout();
            case 25:
                return ((WindowInsetsHolder) obj).getSafeContent();
            case 26:
                return ((WindowInsetsHolder) obj).getMandatorySystemGestures();
            case 27:
                return ((WindowInsetsHolder) obj).getIme();
            case 28:
                return ((WindowInsetsHolder) obj).getSystemBars();
            default:
                return ((WindowInsetsHolder) obj).getNavigationBars();
        }
    }
}
