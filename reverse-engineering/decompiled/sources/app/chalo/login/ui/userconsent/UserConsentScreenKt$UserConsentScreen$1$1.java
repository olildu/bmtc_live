package app.chalo.login.ui.userconsent;

import androidx.compose.runtime.MutableState;
import app.chalo.compose.webview.KWebView;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.ui.userconsent.UserConsentScreenKt$UserConsentScreen$1$1", f = "UserConsentScreen.kt", l = {46}, m = "invokeSuspend", v = 1)
final class UserConsentScreenKt$UserConsentScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserConsentComponent $component;
    final /* synthetic */ MutableState<KWebView> $webViewReference$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserConsentScreenKt$UserConsentScreen$1$1(UserConsentComponent userConsentComponent, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$component = userConsentComponent;
        this.$webViewReference$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserConsentScreenKt$UserConsentScreen$1$1(this.$component, this.$webViewReference$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserConsentScreenKt$UserConsentScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final MutableState<KWebView> mutableState = this.$webViewReference$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.login.ui.userconsent.UserConsentScreenKt$UserConsentScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    UserConsentSideEffect userConsentSideEffect = (UserConsentSideEffect) obj2;
                    boolean z = userConsentSideEffect instanceof UserConsentSideEffect.UpdateWebPageForSkipButton;
                    MutableState mutableState2 = mutableState;
                    if (z) {
                        KWebView kWebView = (KWebView) mutableState2.getValue();
                        if (kWebView != null) {
                            String jsCommand = "configureConsentUI(" + ((UserConsentSideEffect.UpdateWebPageForSkipButton) userConsentSideEffect).f5363a + ")";
                            Intrinsics.i(jsCommand, "jsCommand");
                            kWebView.f1934a.evaluateJavascript("javascript:".concat(jsCommand), null);
                        }
                    } else {
                        if (!Intrinsics.d(userConsentSideEffect, UserConsentSideEffect.UpdateWebPageToStopLoading.f5364a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        KWebView kWebView2 = (KWebView) mutableState2.getValue();
                        if (kWebView2 != null) {
                            kWebView2.f1934a.evaluateJavascript("javascript:".concat("hideConsentLoader()"), null);
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
