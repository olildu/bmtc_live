package app.chalo.utils;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FocusRequester_androidKt {
    public static final void a(FocusRequester focusRequester, CoroutineScope coroutineScope) {
        Intrinsics.i(focusRequester, "<this>");
        Intrinsics.i(coroutineScope, "coroutineScope");
        FocusRequester.m4269requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
    }
}
