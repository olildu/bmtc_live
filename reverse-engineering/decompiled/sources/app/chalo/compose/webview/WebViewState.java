package app.chalo.compose.webview;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/webview/WebViewState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f1936a;
    public final MutableState b;
    public WebView c;

    public WebViewState(WebViewInternalState initialState, Function1 function1) {
        Intrinsics.i(initialState, "initialState");
        this.f1936a = function1;
        this.b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialState, null, 2, null);
    }
}
