package app.chalo.juspay;

import app.chalo.providers.CoroutineContextProvider;
import defpackage.dh0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerProviderImpl;", "Lapp/chalo/juspay/JuspayControllerSetter;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JuspayControllerProviderImpl implements JuspayControllerSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuspayControllerFactory f4043a;
    public Lazy b;
    public final ContextScope c;
    public final MutexImpl d = MutexKt.a();

    public JuspayControllerProviderImpl(JuspayControllerFactory juspayControllerFactory, CoroutineContextProvider coroutineContextProvider) {
        this.f4043a = juspayControllerFactory;
        this.c = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.a()));
    }

    @Override // app.chalo.juspay.JuspayControllerSetter
    public final void a() {
        BuildersKt.d(this.c, null, CoroutineStart.UNDISPATCHED, new JuspayControllerProviderImpl$removeJuspayController$1(this, null), 1);
    }

    @Override // app.chalo.juspay.JuspayControllerSetter
    public final void b(dh0 dh0Var) {
        BuildersKt.d(this.c, null, CoroutineStart.UNDISPATCHED, new JuspayControllerProviderImpl$setJuspayController$1(this, dh0Var, null), 1);
    }

    @Override // app.chalo.juspay.JuspayControllerSetter
    public final JuspayControllerHost c() {
        Lazy lazy = this.b;
        if (lazy != null) {
            if (!lazy.isInitialized()) {
                lazy = null;
            }
            if (lazy != null) {
                return (JuspayControllerHost) lazy.getValue();
            }
        }
        return null;
    }

    @Override // app.chalo.juspay.JuspayControllerProvider
    public final JuspayController d() {
        JuspayControllerHost juspayControllerHost;
        Lazy lazy = this.b;
        if (lazy == null || (juspayControllerHost = (JuspayControllerHost) lazy.getValue()) == null) {
            return null;
        }
        return juspayControllerHost.b();
    }

    @Override // app.chalo.juspay.JuspayControllerProvider
    public final boolean e() {
        return this.b != null;
    }
}
