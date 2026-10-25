package app.chalo.compose.utils;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import com.google.firebase.messaging.ServiceStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContentAnimationTransitionSpecKt {
    public static final ContentTransform a(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.i(animatedContentTransitionScope, "<this>");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(ServiceStarter.ERROR_UNKNOWN, 0, null, 6, null), 0.0f, 2, null), AnimatedContentTransitionScope.CC.d(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m56getRightDKzdypw(), AnimationSpecKt.tween$default(ServiceStarter.ERROR_UNKNOWN, 0, null, 6, null), null, 4, null));
    }

    public static final ContentTransform b(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.i(animatedContentTransitionScope, "<this>");
        return AnimatedContentKt.togetherWith(AnimatedContentTransitionScope.CC.c(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m55getLeftDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null), ExitTransition.INSTANCE.getNone());
    }

    public static final ContentTransform c(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.i(animatedContentTransitionScope, "<this>");
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        return AnimatedContentKt.togetherWith(AnimatedContentTransitionScope.CC.c(animatedContentTransitionScope, companion.m55getLeftDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null), AnimatedContentTransitionScope.CC.d(animatedContentTransitionScope, companion.m55getLeftDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null));
    }

    public static final ContentTransform d(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.i(animatedContentTransitionScope, "<this>");
        return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), AnimatedContentTransitionScope.CC.d(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m56getRightDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null));
    }
}
