package defpackage;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.extensions.StringExtsKt;
import app.chalo.wallet.ui.access.WalletAccessManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19011a;
    public final /* synthetic */ Scope b;

    public /* synthetic */ p71(Scope scope, int i) {
        this.f19011a = i;
        this.b = scope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19011a;
        Scope scope = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                Object obj2 = map != null ? map.get("customAction") : null;
                AnalyticsContractImplKt.b((AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), "Plotline Redirect Received", Source.PLOTLINE, vo1.s("Plotline Redirect Custom Action Value", StringExtsKt.b(obj2 instanceof String ? (String) obj2 : null, "")), false, 8);
                return Unit.f17538a;
            case 1:
                CoroutineScope scope2 = (CoroutineScope) obj;
                Intrinsics.i(scope2, "scope");
                ClassReference classReferenceA = Reflection.a(WalletAccessManager.class);
                scope.getClass();
                return (WalletAccessManager) scope.d(classReferenceA, ParametersHolderKt.a(scope2), null);
            case 2:
                CoroutineScope scope3 = (CoroutineScope) obj;
                Intrinsics.i(scope3, "scope");
                ClassReference classReferenceA2 = Reflection.a(WalletAccessManager.class);
                scope.getClass();
                return (WalletAccessManager) scope.d(classReferenceA2, ParametersHolderKt.a(scope3), null);
            default:
                CoroutineScope scope4 = (CoroutineScope) obj;
                Intrinsics.i(scope4, "scope");
                ClassReference classReferenceA3 = Reflection.a(WalletAccessManager.class);
                scope.getClass();
                return (WalletAccessManager) scope.d(classReferenceA3, ParametersHolderKt.a(scope4), null);
        }
    }
}
