package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bd {
    static {
        BringIntoViewSpec.Companion companion = BringIntoViewSpec.INSTANCE;
    }

    public static float a(BringIntoViewSpec bringIntoViewSpec, float f, float f2, float f3) {
        return BringIntoViewSpec.INSTANCE.defaultCalculateScrollDistance$foundation(f, f2, f3);
    }

    public static AnimationSpec b(BringIntoViewSpec bringIntoViewSpec) {
        return BringIntoViewSpec.INSTANCE.getDefaultScrollAnimationSpec$foundation();
    }

    public static /* synthetic */ void c() {
    }
}
