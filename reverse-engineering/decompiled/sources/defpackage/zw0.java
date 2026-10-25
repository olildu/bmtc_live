package defpackage;

import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountDataState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zw0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20237a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ zw0(String str, boolean z, String str2, int i) {
        this.f20237a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20237a) {
            case 0:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.b(0, Boolean.valueOf(this.c));
                execute.bindString(1, this.b);
                execute.bindString(2, this.d);
                return Unit.f17538a;
            case 1:
                return SearchBarDefaults.InputField$lambda$40$lambda$39(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
            case 2:
                return SearchBarDefaults.InputField$lambda$27$lambda$26(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
            default:
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, this.c, this.b, this.d, null, 0L, null, null, null, null, null, null, 0, false, 31729);
        }
    }

    public /* synthetic */ zw0(boolean z, String str, String str2, int i) {
        this.f20237a = i;
        this.c = z;
        this.b = str;
        this.d = str2;
    }
}
