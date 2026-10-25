package app.chalo.network.mock;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/LocalOverrideMockApiRuntimeState;", "Lapp/chalo/network/mock/MockApiRuntimeState;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalOverrideMockApiRuntimeState implements MockApiRuntimeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiSource f6474a;
    public final Map b;
    public final StateFlow c;
    public final StateFlow d;

    public LocalOverrideMockApiRuntimeState(MockApiRuntimeOverride runtimeOverride) {
        Intrinsics.i(runtimeOverride, "runtimeOverride");
        ApiSource apiSource = runtimeOverride.f6489a;
        this.f6474a = apiSource;
        Map map = runtimeOverride.b;
        this.b = map;
        this.c = FlowKt.c(StateFlowKt.a(apiSource));
        this.d = FlowKt.c(StateFlowKt.a(map));
    }

    @Override // app.chalo.network.mock.ApiSourceState
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ApiSource getF6474a() {
        return this.f6474a;
    }

    @Override // app.chalo.network.mock.MockApiRouteVariantState
    public final Object b(String str) {
        return this.b.get(str);
    }
}
