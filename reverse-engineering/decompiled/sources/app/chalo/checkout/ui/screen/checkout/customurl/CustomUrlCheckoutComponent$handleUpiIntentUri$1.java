package app.chalo.checkout.ui.screen.checkout.customurl;

import androidx.compose.runtime.ComposerKt;
import app.chalo.checkout.utility.InstalledUpiAppsHelper;
import app.chalo.checkout.utility.UpiAppResult;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.xs;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent$handleUpiIntentUri$1", f = "CustomUrlCheckoutComponent.kt", l = {197, ComposerKt.providerMapsKey}, m = "invokeSuspend", v = 1)
final class CustomUrlCheckoutComponent$handleUpiIntentUri$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $intentUri;
    Object L$0;
    int label;
    final /* synthetic */ CustomUrlCheckoutComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomUrlCheckoutComponent$handleUpiIntentUri$1(CustomUrlCheckoutComponent customUrlCheckoutComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = customUrlCheckoutComponent;
        this.$intentUri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CustomUrlCheckoutComponent$handleUpiIntentUri$1(this.this$0, this.$intentUri, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CustomUrlCheckoutComponent$handleUpiIntentUri$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            InstalledUpiAppsHelper installedUpiAppsHelperB = this.this$0.o.b();
            ChaloUseCaseResult.Success successC = installedUpiAppsHelperB != null ? installedUpiAppsHelperB.c(this.$intentUri) : null;
            if (xs.z(successC)) {
                Flow flow = (Flow) successC.f10419a;
                final CustomUrlCheckoutComponent customUrlCheckoutComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent$handleUpiIntentUri$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        CustomUrlCheckoutViewIntent.HandleNativeUpiAppResultIntent handleNativeUpiAppResultIntent = new CustomUrlCheckoutViewIntent.HandleNativeUpiAppResultIntent((UpiAppResult) obj2);
                        CustomUrlCheckoutComponent customUrlCheckoutComponent2 = customUrlCheckoutComponent;
                        customUrlCheckoutComponent2.I0(handleNativeUpiAppResultIntent);
                        Job job = customUrlCheckoutComponent2.t;
                        if (job != null) {
                            ((JobSupport) job).cancel(null);
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (successC != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            KotlinToastManager kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
            Job job = this.this$0.t;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
        }
        return Unit.f17538a;
    }
}
