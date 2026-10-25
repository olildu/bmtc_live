package app.chalo.validationsdk.blevalidation.ui;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$initializeBleValidationCompletionTrackingProcess$2", f = "BleValidationFragmentComponent.android.kt", l = {986}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$initializeBleValidationCompletionTrackingProcess$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$initializeBleValidationCompletionTrackingProcess$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BleValidationFragmentComponentAndroid f10574a;

        public AnonymousClass1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid) {
            this.f10574a = bleValidationFragmentComponentAndroid;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        
            if (r1.A(r2, r3, r14, r5, r6) == r0) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
        
            if (r1.A(r2, r14, r4, r5, r6) == r0) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
        
            if (r1.A(r2, r3, r4, r5, r6) == r0) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01ad, code lost:
        
            if (r14 == r0) goto L85;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(app.chalo.validationsdk.blevalidation.helper.BleValidationProcessStatus r13, kotlin.coroutines.Continuation r14) {
            /*
                Method dump skipped, instruction units count: 440
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$initializeBleValidationCompletionTrackingProcess$2.AnonymousClass1.emit(app.chalo.validationsdk.blevalidation.helper.BleValidationProcessStatus, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$initializeBleValidationCompletionTrackingProcess$2(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$initializeBleValidationCompletionTrackingProcess$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$initializeBleValidationCompletionTrackingProcess$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
            StateFlow stateFlow = bleValidationFragmentComponentAndroid.p.k;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bleValidationFragmentComponentAndroid);
            this.label = 1;
            if (stateFlow.collect(anonymousClass1, this) == coroutineSingletons) {
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
