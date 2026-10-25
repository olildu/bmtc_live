package defpackage;

import android.content.Context;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkFetcher;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jg0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17403a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ jg0(Context context, int i, String str, String str2) {
        this.f17403a = i;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieComposition lottieComposition;
        switch (this.f17403a) {
            case 0:
                Context context = this.b;
                String str = this.c;
                String str2 = this.d;
                HashMap map = LottieCompositionFactory.f12125a;
                NetworkFetcher networkFetcher = L.b;
                if (networkFetcher == null) {
                    synchronized (NetworkFetcher.class) {
                        try {
                            networkFetcher = L.b;
                            if (networkFetcher == null) {
                                networkFetcher = new NetworkFetcher(L.a(context), new DefaultLottieNetworkFetcher());
                                L.b = networkFetcher;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                LottieResult lottieResultA = networkFetcher.a(context, str, str2);
                if (str2 != null && (lottieComposition = lottieResultA.f12130a) != null) {
                    LottieCompositionCache.b.f12178a.put(str2, lottieComposition);
                }
                return lottieResultA;
            default:
                return LottieCompositionFactory.b(this.b, this.c, this.d);
        }
    }
}
