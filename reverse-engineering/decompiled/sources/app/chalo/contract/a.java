package app.chalo.contract;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemoteConfigFetcherContractAndroid f1954a;

    public /* synthetic */ a(RemoteConfigFetcherContractAndroid remoteConfigFetcherContractAndroid) {
        this.f1954a = remoteConfigFetcherContractAndroid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RemoteConfigFetcherContractAndroid remoteConfigFetcherContractAndroid = this.f1954a;
        BuildersKt.d(remoteConfigFetcherContractAndroid.d, null, null, new RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1(remoteConfigFetcherContractAndroid, null), 3);
        return Unit.f17538a;
    }
}
