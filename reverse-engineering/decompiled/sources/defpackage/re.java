package defpackage;

import com.airbnb.lottie.LottieCompositionFactory;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class re implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19201a;

    public /* synthetic */ re(int i) {
        this.f19201a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19201a) {
            case 0:
                return null;
            case 1:
                HashMap map = LottieCompositionFactory.f12125a;
                throw null;
            default:
                return Unit.f17538a;
        }
    }
}
