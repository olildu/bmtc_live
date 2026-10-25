package app.chalo.permissions.handler;

import app.chalo.permissions.models.AppPermission;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001* \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "Lapp/chalo/permissions/models/AppPermission;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$requestMultiplePermission$1", f = "PermissionHandler.android.kt", l = {142, 145}, m = "invokeSuspend", v = 1)
final class PermissionHandlerAndroid$requestMultiplePermission$1 extends SuspendLambda implements Function2<FlowCollector<? super Pair<? extends Set<? extends AppPermission>, ? extends Set<? extends AppPermission>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<AppPermission> $permissionsSet;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ PermissionHandlerAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionHandlerAndroid$requestMultiplePermission$1(Set set, PermissionHandlerAndroid permissionHandlerAndroid, Continuation continuation) {
        super(2, continuation);
        this.$permissionsSet = set;
        this.this$0 = permissionHandlerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PermissionHandlerAndroid$requestMultiplePermission$1 permissionHandlerAndroid$requestMultiplePermission$1 = new PermissionHandlerAndroid$requestMultiplePermission$1(this.$permissionsSet, this.this$0, continuation);
        permissionHandlerAndroid$requestMultiplePermission$1.L$0 = obj;
        return permissionHandlerAndroid$requestMultiplePermission$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PermissionHandlerAndroid$requestMultiplePermission$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r7.emit(r3, r8) == r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0065 -> B:16:0x0068). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r9)
            goto L9e
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            java.lang.Object r1 = r8.L$4
            java.lang.Object r4 = r8.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r8.L$2
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r8.L$1
            app.chalo.permissions.handler.PermissionHandlerAndroid r6 = (app.chalo.permissions.handler.PermissionHandlerAndroid) r6
            java.lang.Object r7 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            kotlin.ResultKt.b(r9)
            goto L68
        L2f:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            java.util.Set<app.chalo.permissions.models.AppPermission> r1 = r8.$permissionsSet
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            app.chalo.permissions.handler.PermissionHandlerAndroid r4 = r8.this$0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
            r7 = r9
            r6 = r4
            r4 = r1
        L48:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L74
            java.lang.Object r1 = r4.next()
            r9 = r1
            app.chalo.permissions.models.AppPermission r9 = (app.chalo.permissions.models.AppPermission) r9
            r8.L$0 = r7
            r8.L$1 = r6
            r8.L$2 = r5
            r8.L$3 = r4
            r8.L$4 = r1
            r8.label = r3
            java.lang.Object r9 = r6.b(r9, r8)
            if (r9 != r0) goto L68
            goto L9d
        L68:
            app.chalo.permissions.models.PermissionState r9 = (app.chalo.permissions.models.PermissionState) r9
            boolean r9 = app.chalo.permissions.models.PermissionStateKt.a(r9)
            if (r9 == 0) goto L48
            r5.add(r1)
            goto L48
        L74:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r9 = kotlin.collections.CollectionsKt.G0(r5)
            java.util.Set<app.chalo.permissions.models.AppPermission> r1 = r8.$permissionsSet
            r3 = r9
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r1 = kotlin.collections.SetsKt.c(r1, r3)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r9, r1)
            r9 = 0
            r8.L$0 = r9
            r8.L$1 = r9
            r8.L$2 = r9
            r8.L$3 = r9
            r8.L$4 = r9
            r8.label = r2
            java.lang.Object r9 = r7.emit(r3, r8)
            if (r9 != r0) goto L9e
        L9d:
            return r0
        L9e:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.permissions.handler.PermissionHandlerAndroid$requestMultiplePermission$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
