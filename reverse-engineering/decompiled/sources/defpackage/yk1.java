package defpackage;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class yk1 {
    public static boolean a(Transition.Segment segment, Object obj, Object obj2) {
        return Intrinsics.d(obj, segment.getInitialState()) && Intrinsics.d(obj2, segment.getTargetState());
    }
}
