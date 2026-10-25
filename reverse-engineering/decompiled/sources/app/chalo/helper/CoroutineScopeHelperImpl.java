package app.chalo.helper;

import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/CoroutineScopeHelperImpl;", "Lapp/chalo/helper/CoroutineScopeHelper;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoroutineScopeHelperImpl implements CoroutineScopeHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f2831a;
    public ContextScope c;
    public final SharedFlowImpl b = SharedFlowKt.b(0, 0, null, 7);
    public final MutexImpl d = MutexKt.a();

    public CoroutineScopeHelperImpl(CoroutineContextProvider coroutineContextProvider) {
        this.f2831a = coroutineContextProvider;
    }

    @Override // app.chalo.helper.CoroutineScopeHelper
    public final CoroutineScope a() {
        return (CoroutineScope) BuildersKt.e(EmptyCoroutineContext.f17583a, new CoroutineScopeHelperImpl$coroutineScope$1(this, null));
    }

    @Override // app.chalo.helper.CoroutineScopeHelper
    public final void b(CoroutineScope parentScope) {
        Intrinsics.i(parentScope, "parentScope");
        FlowKt.A(this.b, parentScope);
    }
}
