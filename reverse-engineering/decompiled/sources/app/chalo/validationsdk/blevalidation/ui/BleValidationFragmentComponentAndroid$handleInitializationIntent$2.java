package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.validationsdk.blevalidation.helper.BleActiveModeStatus;
import app.chalo.validationsdk.blevalidation.helper.BlePassiveModeStatus;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleInitializationIntent$2", f = "BleValidationFragmentComponent.android.kt", l = {385}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleInitializationIntent$2(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleInitializationIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
            StateFlow stateFlow = bleValidationFragmentComponentAndroid.o.o;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleInitializationIntent$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Pair pair = (Pair) obj2;
                    BleActiveModeStatus bleActiveModeStatus = (BleActiveModeStatus) pair.d();
                    boolean z = bleActiveModeStatus instanceof BleActiveModeStatus.Error;
                    BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid2 = bleValidationFragmentComponentAndroid;
                    if (z) {
                        Object objD = pair.d();
                        Intrinsics.g(objD, "null cannot be cast to non-null type app.chalo.validationsdk.blevalidation.helper.BleActiveModeStatus.Error");
                        bleValidationFragmentComponentAndroid2.M0("activeModeStatus: ERROR reason = " + ((BleActiveModeStatus.Error) objD).f10526a);
                    } else if (bleActiveModeStatus instanceof BleActiveModeStatus.Stopped) {
                        Object objD2 = pair.d();
                        Intrinsics.g(objD2, "null cannot be cast to non-null type app.chalo.validationsdk.blevalidation.helper.BleActiveModeStatus.Stopped");
                        bleValidationFragmentComponentAndroid2.M0("activeModeStatus: STOPPED reason = " + ((BleActiveModeStatus.Stopped) objD2).f10528a);
                    } else if (Intrinsics.d(bleActiveModeStatus, BleActiveModeStatus.Running.f10527a)) {
                        bleValidationFragmentComponentAndroid2.M0("activeModeStatus: RUNNING");
                    } else {
                        if (!Intrinsics.d(bleActiveModeStatus, BleActiveModeStatus.Uninitialized.f10529a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bleValidationFragmentComponentAndroid2.M0("activeModeStatus: UNINITIALIZED");
                    }
                    BlePassiveModeStatus blePassiveModeStatus = (BlePassiveModeStatus) pair.e();
                    if (blePassiveModeStatus instanceof BlePassiveModeStatus.Error) {
                        Object objE = pair.e();
                        Intrinsics.g(objE, "null cannot be cast to non-null type app.chalo.validationsdk.blevalidation.helper.BlePassiveModeStatus.Error");
                        bleValidationFragmentComponentAndroid2.M0("passiveModeStatus: ERROR reason = " + ((BlePassiveModeStatus.Error) objE).f10530a);
                    } else if (blePassiveModeStatus instanceof BlePassiveModeStatus.Stopped) {
                        Object objE2 = pair.e();
                        Intrinsics.g(objE2, "null cannot be cast to non-null type app.chalo.validationsdk.blevalidation.helper.BlePassiveModeStatus.Stopped");
                        bleValidationFragmentComponentAndroid2.M0("passiveModeStatus: STOPPED reason = " + ((BlePassiveModeStatus.Stopped) objE2).f10532a);
                    } else if (Intrinsics.d(blePassiveModeStatus, BlePassiveModeStatus.Running.f10531a)) {
                        bleValidationFragmentComponentAndroid2.M0("passiveModeStatus: RUNNING");
                    } else {
                        if (!Intrinsics.d(blePassiveModeStatus, BlePassiveModeStatus.Uninitialized.f10533a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bleValidationFragmentComponentAndroid2.M0("passiveModeStatus: UNINITIALIZED");
                    }
                    bleValidationFragmentComponentAndroid2.M0("");
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
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
