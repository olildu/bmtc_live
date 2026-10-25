package app.chalo.home.ui.common;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/common/ChangeEnvironmentDialogHelper;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ChangeEnvironmentDialogHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3375a;
    public static final Object b;

    static {
        final ChangeEnvironmentDialogHelper changeEnvironmentDialogHelper = new ChangeEnvironmentDialogHelper();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        f3375a = LazyKt.a(lazyThreadSafetyMode, new Function0<ChaloBuildConfig>() { // from class: app.chalo.home.ui.common.ChangeEnvironmentDialogHelper$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KoinComponent koinComponent = changeEnvironmentDialogHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(ChaloBuildConfig.class), null, null);
            }
        });
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<UpdateDebugBuildEnvironmentUseCase>() { // from class: app.chalo.home.ui.common.ChangeEnvironmentDialogHelper$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KoinComponent koinComponent = changeEnvironmentDialogHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(UpdateDebugBuildEnvironmentUseCase.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }
}
