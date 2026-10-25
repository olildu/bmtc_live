package app.chalo.checkout.ui.screen.checkout.razorpay.compose;

import androidx.compose.runtime.MutableState;
import app.chalo.checkout.paymentprovider.razorpay.CommonRazorpayWebviewClient;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutSideEffect;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewIntent;
import app.chalo.checkout.ui.screen.checkout.razorpay.RazorpayResultListener;
import app.chalo.uistate.webview.WebViewChromeClientUIEventHandler;
import app.chalo.uistate.webview.WebViewClientUIEventHandler;
import app.chalo.uistate.webview.WebViewUISpecs;
import app.chalo.uistate.webview.WebViewUIState;
import defpackage.ch;
import defpackage.on;
import defpackage.zn;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenKt$CheckoutScreen$1$1", f = "CheckoutScreen.kt", l = {47}, m = "invokeSuspend", v = 1)
final class CheckoutScreenKt$CheckoutScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CheckoutComponent $component;
    final /* synthetic */ RazorPaySdkProvider $razorPaySdkProvider;
    final /* synthetic */ MutableState<WebViewUIState> $webViewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutScreenKt$CheckoutScreen$1$1(CheckoutComponent checkoutComponent, RazorPaySdkProvider razorPaySdkProvider, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$component = checkoutComponent;
        this.$razorPaySdkProvider = razorPaySdkProvider;
        this.$webViewState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutScreenKt$CheckoutScreen$1$1(this.$component, this.$razorPaySdkProvider, this.$webViewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutScreenKt$CheckoutScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final RazorPaySdkProvider razorPaySdkProvider = this.$razorPaySdkProvider;
            final CheckoutComponent checkoutComponent = this.$component;
            final MutableState<WebViewUIState> mutableState = this.$webViewState$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenKt$CheckoutScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    CheckoutSideEffect checkoutSideEffect = (CheckoutSideEffect) obj2;
                    boolean zD = Intrinsics.d(checkoutSideEffect, CheckoutSideEffect.PaymentCancelled.f1485a);
                    RazorPaySdkProvider razorPaySdkProvider2 = razorPaySdkProvider;
                    if (zD) {
                        RazorpaySdk razorpaySdkC = razorPaySdkProvider2.c();
                        if (razorpaySdkC != null) {
                            razorpaySdkC.a().onBackPressed();
                        }
                    } else {
                        boolean z = checkoutSideEffect instanceof CheckoutSideEffect.RazorpayFlowInitiated;
                        CheckoutComponent checkoutComponent2 = checkoutComponent;
                        if (z) {
                            RazorpaySdk razorpaySdkC2 = razorPaySdkProvider2.c();
                            if (razorpaySdkC2 != null) {
                                CheckoutSideEffect.RazorpayFlowInitiated razorpayFlowInitiated = (CheckoutSideEffect.RazorpayFlowInitiated) checkoutSideEffect;
                                String newApiKey = razorpayFlowInitiated.f1486a;
                                Map data = razorpayFlowInitiated.b;
                                RazorpayResultListener listener = (RazorpayResultListener) checkoutComponent2.u.getValue();
                                razorpaySdkC2.a().setWebviewClient(new CommonRazorpayWebviewClient(razorpaySdkC2, new on(17), new ch(new ch(new zn(checkoutComponent2, 1), 21), 22)).f1425a);
                                Intrinsics.i(newApiKey, "newApiKey");
                                razorpaySdkC2.a().changeApiKey(newApiKey);
                                Intrinsics.i(data, "data");
                                Intrinsics.i(listener, "listener");
                                try {
                                    razorpaySdkC2.a().submit(new JSONObject(data), listener.f1493a);
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            if (!(checkoutSideEffect instanceof CheckoutSideEffect.LazyPayFlowInitiated)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            MutableState mutableState2 = mutableState;
                            WebViewUIState webViewUIState = (WebViewUIState) mutableState2.getValue();
                            String str = ((CheckoutSideEffect.LazyPayFlowInitiated) checkoutSideEffect).f1484a;
                            final zn znVar = new zn(checkoutComponent2, 2);
                            WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = new WebViewChromeClientUIEventHandler() { // from class: app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenKt$getWebViewChromeClient$1
                                @Override // app.chalo.uistate.webview.WebViewChromeClientUIEventHandler
                                public final void b(int i2) {
                                    if (i2 >= 80) {
                                        znVar.invoke(CheckoutViewIntent.LazyPayLoadingCompleted.f1489a);
                                    }
                                }

                                @Override // app.chalo.uistate.webview.WebViewChromeClientUIEventHandler
                                public final void a(String str2) {
                                }

                                @Override // app.chalo.uistate.webview.WebViewChromeClientUIEventHandler
                                public final void c(String str2, boolean z2) {
                                }
                            };
                            final zn znVar2 = new zn(checkoutComponent2, 3);
                            WebViewClientUIEventHandler webViewClientUIEventHandler = new WebViewClientUIEventHandler() { // from class: app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenKt$getWebViewClient$1
                                @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
                                public final boolean b(String str2) {
                                    znVar2.invoke(new CheckoutViewIntent.PaymentCompletedIntent.Unknown(""));
                                    return true;
                                }

                                @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
                                public final void d(String str2) {
                                    znVar2.invoke(CheckoutViewIntent.WebViewPageLoaded.f1491a);
                                }

                                @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
                                public final void a(String str2) {
                                }

                                @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
                                public final void c(Integer num, String str2) {
                                }
                            };
                            WebViewUISpecs specs = webViewUIState.d;
                            List jsInterface = webViewUIState.e;
                            Intrinsics.i(specs, "specs");
                            Intrinsics.i(jsInterface, "jsInterface");
                            mutableState2.setValue(new WebViewUIState(str, webViewChromeClientUIEventHandler, webViewClientUIEventHandler, specs, jsInterface));
                        }
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
