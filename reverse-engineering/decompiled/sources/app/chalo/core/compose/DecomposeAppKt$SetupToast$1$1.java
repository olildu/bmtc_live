package app.chalo.core.compose;

import android.content.Context;
import android.widget.Toast;
import app.chalo.providers.toast.KotlinToastData;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.compose.DecomposeAppKt$SetupToast$1$1", f = "DecomposeApp.kt", l = {120}, m = "invokeSuspend", v = 1)
final class DecomposeAppKt$SetupToast$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SharedFlow<KotlinToastData> $stream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecomposeAppKt$SetupToast$1$1(SharedFlow sharedFlow, Context context, Continuation continuation) {
        super(2, continuation);
        this.$stream = sharedFlow;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DecomposeAppKt$SetupToast$1$1(this.$stream, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DecomposeAppKt$SetupToast$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<KotlinToastData> sharedFlow = this.$stream;
            final Context context = this.$context;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.core.compose.DecomposeAppKt$SetupToast$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    KotlinToastData kotlinToastData = (KotlinToastData) obj2;
                    String msg = kotlinToastData.f8869a;
                    ToastLength toastLength = kotlinToastData.b;
                    Intrinsics.i(toastLength, "<this>");
                    int i2 = KotlinToastManagerKt.WhenMappings.f8871a[toastLength.ordinal()];
                    int i3 = 1;
                    if (i2 == 1) {
                        i3 = 0;
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context2 = context;
                    Intrinsics.i(context2, "<this>");
                    Intrinsics.i(msg, "msg");
                    Toast.makeText(context2, msg, i3).show();
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (sharedFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
