package defpackage;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nx implements NetworkTypeObserver.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18550a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nx(Object obj, int i) {
        this.f18550a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void onNetworkTypeChanged(int i) throws Throwable {
        switch (this.f18550a) {
            case 0:
                ((DefaultBandwidthMeter) this.b).onNetworkTypeChanged(i);
                break;
            default:
                ((ExperimentalBandwidthMeter) this.b).onNetworkTypeChanged(i);
                break;
        }
    }
}
