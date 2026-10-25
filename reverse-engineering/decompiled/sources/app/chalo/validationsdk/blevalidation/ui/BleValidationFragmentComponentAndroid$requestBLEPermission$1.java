package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PermissionStateKt;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$requestBLEPermission$1", f = "BleValidationFragmentComponent.android.kt", l = {1672}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$requestBLEPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ PermissionHandler $permissionHandler;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$requestBLEPermission$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, PermissionHandler permissionHandler, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
        this.$permissionHandler = permissionHandler;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$requestBLEPermission$1(this.this$0, this.$permissionHandler, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$requestBLEPermission$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BleValidationPrerequisitesStateHelper bleValidationPrerequisitesStateHelper = this.this$0.m;
            Flow flowA = this.$permissionHandler.a(bleValidationPrerequisitesStateHelper.b.e(bleValidationPrerequisitesStateHelper.b()));
            final Function1<Boolean, Unit> function1 = this.$callback;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$requestBLEPermission$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    List list = (List) obj2;
                    boolean z = false;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (!PermissionStateKt.a((PermissionState) ((Pair) it.next()).e())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    function1.invoke(Boolean.valueOf(z));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowA.collect(flowCollector, this) == coroutineSingletons) {
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
