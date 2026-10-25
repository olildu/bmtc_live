package defpackage;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19656a;
    public final /* synthetic */ AnimationState b;

    public /* synthetic */ tg1(int i, AnimationState animationState) {
        this.f19656a = i;
        this.b = animationState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19656a) {
            case 0:
                return SuspendAnimationKt.animate$lambda$4(this.b);
            default:
                return SuspendAnimationKt.animate$lambda$3$0(this.b);
        }
    }
}
