package app.chalo.permissions.handler;

import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/permissions/models/PermissionState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$1", f = "PermissionHandler.android.kt", l = {112, 112}, m = "invokeSuspend", v = 1)
final class PermissionHandlerAndroid$requestPermission$1 extends SuspendLambda implements Function2<FlowCollector<? super PermissionState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppPermission $permission;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PermissionHandlerAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionHandlerAndroid$requestPermission$1(PermissionHandlerAndroid permissionHandlerAndroid, AppPermission appPermission, Continuation continuation) {
        super(2, continuation);
        this.this$0 = permissionHandlerAndroid;
        this.$permission = appPermission;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PermissionHandlerAndroid$requestPermission$1 permissionHandlerAndroid$requestPermission$1 = new PermissionHandlerAndroid$requestPermission$1(this.this$0, this.$permission, continuation);
        permissionHandlerAndroid$requestPermission$1.L$0 = obj;
        return permissionHandlerAndroid$requestPermission$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PermissionHandlerAndroid$requestPermission$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L43
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r6)
            goto L37
        L20:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            app.chalo.permissions.handler.PermissionHandlerAndroid r6 = r5.this$0
            app.chalo.permissions.models.AppPermission r4 = r5.$permission
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.b(r4, r5)
            if (r6 != r0) goto L37
            goto L42
        L37:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
