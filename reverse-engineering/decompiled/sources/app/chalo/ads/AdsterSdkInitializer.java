package app.chalo.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import defpackage.i0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/AdsterSdkInitializer;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdsterSdkInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIntegrationPolicyManager f727a;
    public final Context b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicLong d = new AtomicLong(0);
    public final MutableStateFlow e;
    public final StateFlow f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ads/AdsterSdkInitializer$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "RETRY_COOLDOWN_MS", "J", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AdsterSdkInitializer(Context context, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        this.f727a = sdkIntegrationPolicyManager;
        this.b = context.getApplicationContext();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(AdsterSdkInitState.NotInitialized.f726a);
        this.e = mutableStateFlowA;
        this.f = FlowKt.c(mutableStateFlowA);
    }

    public final void a() {
        if (this.f727a.f1078a.e) {
            MutableStateFlow mutableStateFlow = this.e;
            if (mutableStateFlow.getValue() instanceof AdsterSdkInitState.Initialized) {
                return;
            }
            boolean z = mutableStateFlow.getValue() instanceof AdsterSdkInitState.Failed;
            AtomicBoolean atomicBoolean = this.c;
            AtomicLong atomicLong = this.d;
            if (z) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = atomicLong.get();
                if (j != 0 && jElapsedRealtime - j < 10000) {
                    return;
                } else {
                    atomicBoolean.set(false);
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                mutableStateFlow.setValue(AdsterSdkInitState.Initializing.f725a);
                atomicLong.set(SystemClock.elapsedRealtime());
                new Handler(Looper.getMainLooper()).post(new i0(this, 3));
            }
        }
    }
}
