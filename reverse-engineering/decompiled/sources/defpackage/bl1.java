package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11209a;
    public final /* synthetic */ Transition b;

    public /* synthetic */ bl1(Transition transition, int i) {
        this.f11209a = i;
        this.b = transition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11209a) {
            case 0:
                return TransitionKt.rememberTransition$lambda$2$0(this.b, (DisposableEffectScope) obj);
            default:
                return TransitionKt.updateTransition$lambda$1$0(this.b, (DisposableEffectScope) obj);
        }
    }
}
