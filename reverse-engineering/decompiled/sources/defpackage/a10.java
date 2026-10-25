package defpackage;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a10 implements Easing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151a;

    public /* synthetic */ a10(int i) {
        this.f151a = i;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        switch (this.f151a) {
            case 0:
                return EasingFunctionsKt.EaseInElastic$lambda$0(f);
            case 1:
                return EasingFunctionsKt.EaseOutElastic$lambda$0(f);
            case 2:
                return EasingFunctionsKt.EaseInOutElastic$lambda$0(f);
            case 3:
                return EasingFunctionsKt.EaseOutBounce$lambda$0(f);
            case 4:
                return EasingFunctionsKt.EaseInBounce$lambda$0(f);
            case 5:
                return EasingFunctionsKt.EaseInOutBounce$lambda$0(f);
            default:
                return EasingKt.LinearEasing$lambda$0(f);
        }
    }
}
