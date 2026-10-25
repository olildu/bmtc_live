package app.chalo.features.network;

import defpackage.vo1;
import defpackage.ym0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/network/NetworkStateManagerImpl;", "Lapp/chalo/features/network/NetworkStateManager;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkStateManagerImpl implements NetworkStateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KConnectivityManager f2732a;
    public final MutableStateFlow b;

    public NetworkStateManagerImpl(KConnectivityManager kConnectivityManager) {
        this.f2732a = kConnectivityManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(kConnectivityManager.b());
        vo1.x("Network state initialized to ", ((NetworkConnectionType) mutableStateFlowA.getValue()).name(), "message");
        this.b = mutableStateFlowA;
        kConnectivityManager.c(new ym0(this, 1));
    }

    @Override // app.chalo.features.network.NetworkStateManager
    public final NetworkType a() {
        return this.f2732a.a();
    }

    @Override // app.chalo.features.network.NetworkStateManager
    public final StateFlow b() {
        return FlowKt.c(this.b);
    }
}
