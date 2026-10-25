package defpackage;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehaviorKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class mh1 {
    public static Object a(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f, Continuation continuation) {
        return b(targetedFlingBehavior, scrollScope, f, continuation);
    }

    public static /* synthetic */ Object b(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f, Continuation continuation) {
        return targetedFlingBehavior.performFling(scrollScope, f, TargetedFlingBehaviorKt.NoOnReport, continuation);
    }
}
