package app.chalo.providers.toast;

import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/toast/KotlinToastManagerImpl;", "Lapp/chalo/providers/toast/KotlinToastManager;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KotlinToastManagerImpl implements KotlinToastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFlowImpl f8870a;
    public final SharedFlow b;
    public final ContextScope c;

    public KotlinToastManagerImpl(CoroutineContextProvider coroutineContextProvider) {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        this.f8870a = sharedFlowImplB;
        this.b = FlowKt.b(sharedFlowImplB);
        this.c = CoroutineScopeKt.a(coroutineContextProvider.a());
    }

    @Override // app.chalo.providers.toast.KotlinToastManager
    public final void a(KotlinToastData kotlinToastData) {
        BuildersKt.d(this.c, null, null, new KotlinToastManagerImpl$postToastRequest$1(this, kotlinToastData, null), 3);
    }

    @Override // app.chalo.providers.toast.KotlinToastManager
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SharedFlow getB() {
        return this.b;
    }
}
