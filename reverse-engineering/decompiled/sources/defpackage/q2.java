package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableIntState;
import androidx.lifecycle.LifecycleOwner;
import app.chalo.ads.AdsterUnifiedAd_androidKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19085a;
    public final /* synthetic */ int b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ MutableIntState d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ LifecycleOwner f;
    public final /* synthetic */ FrameLayout g;

    public /* synthetic */ q2(int i, AtomicBoolean atomicBoolean, MutableIntState mutableIntState, Activity activity, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, int i2) {
        this.f19085a = i2;
        this.b = i;
        this.c = atomicBoolean;
        this.d = mutableIntState;
        this.e = activity;
        this.f = lifecycleOwner;
        this.g = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zD;
        int i = this.f19085a;
        FrameLayout frameLayout = this.g;
        switch (i) {
            case 0:
                zD = AdsterUnifiedAd_androidKt.d(this.c, this.d, this.e, this.f, frameLayout, this.b, true);
                break;
            default:
                zD = AdsterUnifiedAd_androidKt.d(this.c, this.d, this.e, this.f, frameLayout, this.b, true);
                break;
        }
        return Boolean.valueOf(zD);
    }
}
