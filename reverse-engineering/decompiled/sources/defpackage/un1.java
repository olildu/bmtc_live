package defpackage;

import android.webkit.WebView;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.WideNavigationRailStateImpl;
import androidx.compose.material3.WideNavigationRailValue;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.compose.webview.WebViewState;
import app.chalo.core.User_commute_preference_saved_ride_table;
import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.vault.Wallet_table;
import app.chalo.vault.Wallet_transaction_table;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountIntent;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessComponent;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessIntent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceIntent;
import app.chalo.webview.WebViewScreenDataState;
import app.chalo.webview.WebViewScreenIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class un1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19763a;
    public final /* synthetic */ Object b;

    public /* synthetic */ un1(Object obj, int i) {
        this.f19763a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19763a;
        Unit unit = Unit.f17538a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                User_commute_preference_saved_ride_table user_commute_preference_saved_ride_table = (User_commute_preference_saved_ride_table) obj2;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, user_commute_preference_saved_ride_table.f2024a);
                execute.bindString(1, user_commute_preference_saved_ride_table.b);
                execute.bindString(2, user_commute_preference_saved_ride_table.c);
                execute.d(3, Long.valueOf(user_commute_preference_saved_ride_table.d));
                execute.bindString(4, user_commute_preference_saved_ride_table.e);
                execute.bindString(5, user_commute_preference_saved_ride_table.f);
                return unit;
            case 1:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                Long l = sqlCursor.getLong(3);
                String strN = uf0.n(l, sqlCursor, 4);
                String string2 = sqlCursor.getString(5);
                Intrinsics.f(string2);
                return ((Function6) obj2).invoke(strI, string, strJ, l, strN, string2);
            case 2:
                VerticalDashedLineUIState verticalDashedLineUIState = (VerticalDashedLineUIState) obj2;
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
                long jC = ChaloColorTokenKt.c(verticalDashedLineUIState.b);
                float f = 2;
                long jM4357constructorimpl = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / f;
                DrawScope.CC.E(Canvas, jC, jM4357constructorimpl, Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), verticalDashedLineUIState.f9751a, 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                return unit;
            case 3:
                WalletBalanceIntent it = (WalletBalanceIntent) obj;
                Intrinsics.i(it, "it");
                ((WalletBalanceComponent) obj2).N0(it);
                return unit;
            case 4:
                WalletLoadBalanceEnterAmountIntent it2 = (WalletLoadBalanceEnterAmountIntent) obj;
                Intrinsics.i(it2, "it");
                ((WalletLoadBalanceEnterAmountComponent) obj2).L0(it2);
                return unit;
            case 5:
                WalletLoadBalanceSuccessIntent it3 = (WalletLoadBalanceSuccessIntent) obj;
                Intrinsics.i(it3, "it");
                ((WalletLoadBalanceSuccessComponent) obj2).F0(it3);
                return unit;
            case 6:
                Wallet_table wallet_table = (Wallet_table) obj2;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, wallet_table.f10750a);
                execute2.bindString(1, wallet_table.b);
                execute2.bindString(2, wallet_table.c);
                execute2.bindString(3, wallet_table.d);
                execute2.bindString(4, wallet_table.e);
                execute2.d(5, Long.valueOf(wallet_table.f));
                execute2.d(6, Long.valueOf(wallet_table.g));
                execute2.d(7, wallet_table.h);
                return unit;
            case 7:
                Wallet_transaction_table wallet_transaction_table = (Wallet_transaction_table) obj2;
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, wallet_transaction_table.f10751a);
                execute3.bindString(1, wallet_transaction_table.b);
                execute3.bindString(2, wallet_transaction_table.c);
                execute3.bindString(3, wallet_transaction_table.d);
                execute3.bindString(4, wallet_transaction_table.e);
                execute3.d(5, Long.valueOf(wallet_transaction_table.f));
                execute3.bindString(6, wallet_transaction_table.g);
                execute3.d(7, Long.valueOf(wallet_transaction_table.h));
                return unit;
            case 8:
                WebViewState webViewState = (WebViewState) obj2;
                Intrinsics.i((WebView) obj, "it");
                WebView webView = webViewState.c;
                if (webView != null) {
                    webView.destroy();
                }
                webViewState.c = null;
                Function1 function1 = webViewState.f1936a;
                if (function1 != null) {
                    function1.invoke(null);
                }
                return unit;
            case 9:
                WebViewScreenDataState it4 = (WebViewScreenDataState) obj;
                Intrinsics.i(it4, "it");
                return WebViewScreenDataState.a(it4, (Float) obj2);
            case 10:
                WebViewScreenIntent.InitialisationIntent initialisationIntent = (WebViewScreenIntent.InitialisationIntent) obj2;
                Intrinsics.i((WebViewScreenDataState) obj, "it");
                return new WebViewScreenDataState(initialisationIntent.f11107a, initialisationIntent.b, initialisationIntent.c, Float.valueOf(0.0f));
            default:
                return WideNavigationRailStateImpl.Companion.Saver$lambda$1((AnimationSpec) obj2, (WideNavigationRailValue) obj);
        }
    }
}
