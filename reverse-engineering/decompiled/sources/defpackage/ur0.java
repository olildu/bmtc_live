package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkAndroid;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkManager;
import java.util.Deque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ur0 implements ActivityResultCallback, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f19771a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur0(long j, Clock clock) {
        this.f19771a = j;
        this.b = clock;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        PhonepeSdkAndroid phonepeSdkAndroid = (PhonepeSdkAndroid) this.b;
        long j = this.f19771a;
        ActivityResult it = (ActivityResult) obj;
        String str = PhonepeSdkAndroid.j;
        Intrinsics.i(it, "it");
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) phonepeSdkAndroid.i.remove(Long.valueOf(j));
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        PhonepeSdkManager phonepeSdkManager = phonepeSdkAndroid.g;
        Long l = phonepeSdkManager.c;
        if (l != null && l.longValue() == j) {
            phonepeSdkManager.c = null;
            Function0 function0 = phonepeSdkManager.b;
            phonepeSdkManager.b = null;
            if (function0 != null) {
                function0.invoke();
            } else {
                phonepeSdkManager.d = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.f19771a, (Clock) this.b, deque);
    }

    public /* synthetic */ ur0(PhonepeSdkAndroid phonepeSdkAndroid, long j) {
        this.b = phonepeSdkAndroid;
        this.f19771a = j;
    }
}
