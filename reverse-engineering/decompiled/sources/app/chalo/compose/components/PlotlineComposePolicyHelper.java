package app.chalo.compose.components;

import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/PlotlineComposePolicyHelper;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlotlineComposePolicyHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1847a;

    static {
        final PlotlineComposePolicyHelper plotlineComposePolicyHelper = new PlotlineComposePolicyHelper();
        f1847a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<SdkIntegrationPolicyManager>() { // from class: app.chalo.compose.components.PlotlineComposePolicyHelper$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f1848a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(SdkIntegrationPolicyManager.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }
}
