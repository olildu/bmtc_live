package app.chalo.onboarding.languageselection.ui;

import androidx.compose.ui.platform.UriHandler;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.languageselection.LanguageSelectionEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt$LanguageSelectionScreen$1$1", f = "LanguageSelectionScreen.kt", l = {65}, m = "invokeSuspend", v = 1)
final class LanguageSelectionScreenKt$LanguageSelectionScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LanguageSelectionComponent $component;
    final /* synthetic */ UriHandler $uriHandler;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionScreenKt$LanguageSelectionScreen$1$1(LanguageSelectionComponent languageSelectionComponent, UriHandler uriHandler, Continuation continuation) {
        super(2, continuation);
        this.$component = languageSelectionComponent;
        this.$uriHandler = uriHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageSelectionScreenKt$LanguageSelectionScreen$1$1(this.$component, this.$uriHandler, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageSelectionScreenKt$LanguageSelectionScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final UriHandler uriHandler = this.$uriHandler;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt$LanguageSelectionScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    LanguageSelectionEffect languageSelectionEffect = (LanguageSelectionEffect) obj2;
                    if (!(languageSelectionEffect instanceof LanguageSelectionEffect.OpenUrlInBrowser)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uriHandler.openUri(((LanguageSelectionEffect.OpenUrlInBrowser) languageSelectionEffect).f6651a);
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
