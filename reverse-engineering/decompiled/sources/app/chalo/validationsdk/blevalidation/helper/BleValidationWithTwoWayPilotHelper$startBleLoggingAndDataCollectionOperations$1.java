package app.chalo.validationsdk.blevalidation.helper;

import androidx.compose.ui.spatial.RectListKt;
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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1", f = "BleValidationWithTwoWayPilotHelper.kt", l = {RectListKt.BitOffsetForGesturable}, m = "invokeSuspend", v = 1)
final class BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationWithTwoWayPilotHelper this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BleValidationWithTwoWayPilotHelper f10551a;

        public AnonymousClass1(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper) {
            this.f10551a = bleValidationWithTwoWayPilotHelper;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L21;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.util.List r7, kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r8
                app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1$emit$1 r0 = (app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1$emit$1 r0 = new app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1$emit$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper r3 = r6.f10551a
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3c
                if (r2 == r5) goto L34
                if (r2 != r4) goto L2c
                kotlin.ResultKt.b(r8)
                goto L6f
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$0
                java.util.List r7 = (java.util.List) r7
                kotlin.ResultKt.b(r8)
                goto L5d
            L3c:
                kotlin.ResultKt.b(r8)
                java.lang.String r8 = app.chalo.extensions.UtilityExtensionsKt.a(r7)
                java.lang.String r2 = "conn list updated "
                java.lang.String r8 = r2.concat(r8)
                java.lang.String r2 = "message"
                kotlin.jvm.internal.Intrinsics.i(r8, r2)
                app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger r8 = r3.b
                app.chalo.constants.Source r2 = r3.e
                r0.L$0 = r7
                r0.label = r5
                java.lang.Object r8 = r8.i(r7, r2, r0)
                if (r8 != r1) goto L5d
                goto L6e
            L5d:
                kotlinx.coroutines.flow.MutableStateFlow r8 = r3.l
                java.lang.String r7 = app.chalo.extensions.UtilityExtensionsKt.a(r7)
                r2 = 0
                r0.L$0 = r2
                r0.label = r4
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L6f
            L6e:
                return r1
            L6f:
                kotlin.Unit r7 = kotlin.Unit.f17538a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1.AnonymousClass1.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationWithTwoWayPilotHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowE = this.this$0.f10550a.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (stateFlowE.collect(anonymousClass1, this) == coroutineSingletons) {
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
