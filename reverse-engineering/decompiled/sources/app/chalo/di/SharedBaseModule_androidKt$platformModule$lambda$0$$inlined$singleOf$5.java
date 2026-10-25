package app.chalo.di;

import android.content.Context;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.plotline.PlotlineNotificationManagerAndroid;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$5 implements Function2<Scope, ParametersHolder, PlotlineNotificationManagerAndroid> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", Context.class), null, null);
        return new PlotlineNotificationManagerAndroid((Context) objD, (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (SdkIntegrationPolicyManager) scope.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null));
    }
}
