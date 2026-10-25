package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.CompositionLayer;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ng0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18510a;
    public final /* synthetic */ LottieDrawable b;

    public /* synthetic */ ng0(LottieDrawable lottieDrawable, int i) {
        this.f18510a = i;
        this.b = lottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18510a;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                boolean z = LottieDrawable.V;
                Drawable.Callback callback = lottieDrawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(lottieDrawable);
                    return;
                }
                return;
            default:
                Semaphore semaphore = lottieDrawable.Q;
                CompositionLayer compositionLayer = lottieDrawable.s;
                if (compositionLayer == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    compositionLayer.s(lottieDrawable.b.d());
                    if (LottieDrawable.V && lottieDrawable.O) {
                        if (lottieDrawable.R == null) {
                            lottieDrawable.R = new Handler(Looper.getMainLooper());
                            lottieDrawable.S = new ng0(lottieDrawable, 0);
                        }
                        lottieDrawable.R.post(lottieDrawable.S);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
        }
    }
}
