package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.compose.webview.CWebChromeClient;
import app.chalo.compose.webview.CWebViewClient;
import app.chalo.compose.webview.WebViewInternalState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18440a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ n(MutableState mutableState, MutableState mutableState2, int i) {
        this.f18440a = i;
        this.b = mutableState;
        this.c = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        CWebChromeClient cWebChromeClient;
        CWebViewClient cWebViewClient;
        switch (this.f18440a) {
            case 0:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                final MutableState mutableState = this.b;
                final MutableState mutableState2 = this.c;
                return new DisposableEffectResult() { // from class: com.arkivanov.decompose.extensions.compose.stack.animation.AbstractStackAnimation$invoke$lambda$16$lambda$15$lambda$14$lambda$13$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        MutableState mutableState3 = mutableState;
                        Map map = (Map) mutableState3.getValue();
                        if (map != null) {
                            mutableState2.setValue(map);
                        }
                        mutableState3.setValue(null);
                    }
                };
            case 1:
                TextFieldValue it = (TextFieldValue) obj;
                Intrinsics.i(it, "it");
                this.b.setValue(it);
                this.c.setValue(Boolean.FALSE);
                return Unit.f17538a;
            default:
                WebView it2 = (WebView) obj;
                Intrinsics.i(it2, "it");
                MutableState mutableState3 = this.b;
                WebViewInternalState webViewInternalState = (WebViewInternalState) mutableState3.getValue();
                MutableState mutableState4 = this.c;
                if (!Intrinsics.d(webViewInternalState, (WebViewInternalState) mutableState4.getValue())) {
                    if (!Intrinsics.d(((WebViewInternalState) mutableState3.getValue()).c, ((WebViewInternalState) mutableState4.getValue()).c) && (cWebViewClient = ((WebViewInternalState) mutableState3.getValue()).c) != null) {
                        it2.setWebViewClient((WebViewClient) cWebViewClient.f1932a.getValue());
                    }
                    if (!Intrinsics.d(((WebViewInternalState) mutableState3.getValue()).b, ((WebViewInternalState) mutableState4.getValue()).b) && (cWebChromeClient = ((WebViewInternalState) mutableState3.getValue()).b) != null) {
                        it2.setWebChromeClient((WebChromeClient) cWebChromeClient.f1930a.getValue());
                    }
                    if (!Intrinsics.d(((WebViewInternalState) mutableState3.getValue()).f1935a, ((WebViewInternalState) mutableState4.getValue()).f1935a) && (str = ((WebViewInternalState) mutableState3.getValue()).f1935a) != null) {
                        it2.loadUrl(str);
                    }
                    WebSettings settings = it2.getSettings();
                    settings.setJavaScriptEnabled(((WebViewInternalState) mutableState3.getValue()).h);
                    settings.setBuiltInZoomControls(((WebViewInternalState) mutableState3.getValue()).d);
                    settings.setDisplayZoomControls(((WebViewInternalState) mutableState3.getValue()).e);
                    settings.setUseWideViewPort(((WebViewInternalState) mutableState3.getValue()).f);
                    it2.setInitialScale(((WebViewInternalState) mutableState3.getValue()).g);
                    mutableState4.setValue((WebViewInternalState) mutableState3.getValue());
                }
                return Unit.f17538a;
        }
    }
}
