package app.chalo.home.ui.common;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ScrollRestorationExtensionsKt {
    public static final Object a(LazyListState lazyListState, int i, int i2, Continuation continuation) {
        Object objInvoke;
        ScrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4 scrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4 = new ScrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4(lazyListState, null);
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex();
        Unit unit = Unit.f17538a;
        if ((firstVisibleItemIndex == i && lazyListState.getFirstVisibleItemScrollOffset() == i2) || (objInvoke = scrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4.invoke(new Integer(i), new Integer(i2), continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objInvoke = unit;
        }
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : unit;
    }

    public static final Object b(ScrollState scrollState, int i, SuspendLambda suspendLambda) {
        Object objInvoke;
        ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3 scrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3 = new ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3(scrollState, null);
        if (i < 0) {
            i = 0;
        }
        int value = scrollState.getValue();
        Unit unit = Unit.f17538a;
        if (value == i || (objInvoke = scrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3.invoke(new Integer(i), suspendLambda)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objInvoke = unit;
        }
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : unit;
    }
}
