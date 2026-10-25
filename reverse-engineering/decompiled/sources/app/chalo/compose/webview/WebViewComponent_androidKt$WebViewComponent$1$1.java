package app.chalo.compose.webview;

import androidx.compose.runtime.MutableState;
import app.chalo.uistate.webview.WebViewUIState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.webview.WebViewComponent_androidKt$WebViewComponent$1$1", f = "WebViewComponent.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class WebViewComponent_androidKt$WebViewComponent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WebViewUIState $state;
    final /* synthetic */ WebViewState $webViewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewComponent_androidKt$WebViewComponent$1$1(WebViewUIState webViewUIState, WebViewState webViewState, Continuation continuation) {
        super(2, continuation);
        this.$state = webViewUIState;
        this.$webViewState = webViewState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewComponent_androidKt$WebViewComponent$1$1(this.$state, this.$webViewState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WebViewComponent_androidKt$WebViewComponent$1$1 webViewComponent_androidKt$WebViewComponent$1$1 = (WebViewComponent_androidKt$WebViewComponent$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        webViewComponent_androidKt$WebViewComponent$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        String str = this.$state.f10129a;
        if (str != null) {
            WebViewState webViewState = this.$webViewState;
            webViewState.getClass();
            MutableState mutableState = webViewState.b;
            WebViewInternalState webViewInternalState = (WebViewInternalState) mutableState.getValue();
            CWebChromeClient cWebChromeClient = webViewInternalState.b;
            CWebViewClient cWebViewClient = webViewInternalState.c;
            boolean z = webViewInternalState.d;
            boolean z2 = webViewInternalState.e;
            boolean z3 = webViewInternalState.f;
            int i = webViewInternalState.g;
            boolean z4 = webViewInternalState.h;
            List jsInterfaceSpecs = webViewInternalState.i;
            Intrinsics.i(jsInterfaceSpecs, "jsInterfaceSpecs");
            mutableState.setValue(new WebViewInternalState(str, cWebChromeClient, cWebViewClient, z, z2, z3, i, z4, jsInterfaceSpecs));
        }
        return Unit.f17538a;
    }
}
