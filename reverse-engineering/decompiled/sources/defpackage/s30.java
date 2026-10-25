package defpackage;

import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFloatAnimationSpec;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s30 {
    public static float a(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f, f2, f3), f, f2, f3);
    }

    public static VectorizedFloatAnimationSpec c(FloatAnimationSpec floatAnimationSpec, TwoWayConverter twoWayConverter) {
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
