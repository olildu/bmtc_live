package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
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
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$requestNotificationPermissionIfRequired$2", f = "MultiProductValidationComponent.kt", l = {162}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$requestNotificationPermissionIfRequired$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$requestNotificationPermissionIfRequired$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f10690a = new AnonymousClass1();

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$requestNotificationPermissionIfRequired$2(MultiProductValidationComponent multiProductValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$requestNotificationPermissionIfRequired$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$requestNotificationPermissionIfRequired$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PermissionHandler permissionHandlerC = this.this$0.s.c();
            if (permissionHandlerC != null) {
                ChannelFlowTransformLatest channelFlowTransformLatestC = permissionHandlerC.c(AppPermission.POST_NOTIFICATIONS);
                this.label = 1;
                if (channelFlowTransformLatestC.collect(AnonymousClass1.f10690a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
