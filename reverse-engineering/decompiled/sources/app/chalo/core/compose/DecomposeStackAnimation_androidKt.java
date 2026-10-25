package app.chalo.core.compose;

import com.arkivanov.decompose.extensions.compose.stack.animation.FadeKt;
import com.arkivanov.decompose.extensions.compose.stack.animation.SimpleStackAnimation;
import com.arkivanov.essenty.backhandler.BackHandler;
import defpackage.l91;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DecomposeStackAnimation_androidKt {
    public static final SimpleStackAnimation a(BackHandler backHandler, Function0 onBack) {
        Intrinsics.i(backHandler, "backHandler");
        Intrinsics.i(onBack, "onBack");
        return new SimpleStackAnimation(new l91(FadeKt.a(), 10));
    }
}
