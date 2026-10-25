package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kg0 implements LottieListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17496a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kg0(int i, Object obj, Object obj2) {
        this.f17496a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        switch (this.f17496a) {
            case 0:
                String str = (String) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                HashMap map = LottieCompositionFactory.f12125a;
                map.remove(str);
                atomicBoolean.set(true);
                if (map.size() == 0) {
                    LottieCompositionFactory.l(true);
                }
                break;
            case 1:
                String str2 = (String) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                HashMap map2 = LottieCompositionFactory.f12125a;
                map2.remove(str2);
                atomicBoolean2.set(true);
                if (map2.size() == 0) {
                    LottieCompositionFactory.l(true);
                }
                break;
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b;
                Runnable runnable = (Runnable) this.c;
                lottieAnimationView.setComposition((LottieComposition) obj);
                lottieAnimationView.d();
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
