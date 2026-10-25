package defpackage;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g8 {
    public static long a(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.INSTANCE.m4443getZeroNHjbRc();
    }

    public static Object b(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return u(awaitPointerEventScope, j, function2, continuation);
    }

    public static Object c(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return v(awaitPointerEventScope, j, function2, continuation);
    }

    public static /* synthetic */ Object t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
    }

    public static /* synthetic */ Object u(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    public static /* synthetic */ Object v(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }
}
