package defpackage;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20030a;
    public final /* synthetic */ Transition b;

    public /* synthetic */ xk1(Transition transition, int i) {
        this.f20030a = i;
        this.b = transition;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20030a) {
            case 0:
                return Boolean.valueOf(Transition.animateTo$lambda$0$0(this.b));
            default:
                return Long.valueOf(this.b.calculateTotalDurationNanos());
        }
    }
}
