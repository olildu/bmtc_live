package app.chalo.permissions.handler;

import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Lapp/chalo/permissions/models/AppPermission;", "Lapp/chalo/permissions/models/PermissionState;", "stateForAlreadyGranted", "Lapp/chalo/permissions/handler/PermissionUpdateInfo;", "stateForRequestedAt"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$requestMultiplePermission$2$2", f = "PermissionHandler.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class PermissionHandlerAndroid$requestMultiplePermission$2$2 extends SuspendLambda implements Function3<List<? extends PermissionUpdateInfo>, List<? extends PermissionUpdateInfo>, Continuation<? super List<? extends Pair<? extends AppPermission, ? extends PermissionState>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PermissionHandlerAndroid$requestMultiplePermission$2$2 permissionHandlerAndroid$requestMultiplePermission$2$2 = new PermissionHandlerAndroid$requestMultiplePermission$2$2(3, (Continuation) obj3);
        permissionHandlerAndroid$requestMultiplePermission$2$2.L$0 = (List) obj;
        permissionHandlerAndroid$requestMultiplePermission$2$2.L$1 = (List) obj2;
        return permissionHandlerAndroid$requestMultiplePermission$2$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) this.L$0;
        ArrayList arrayListC0 = CollectionsKt.c0((List) this.L$1, list);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(arrayListC0, 10));
        int size = arrayListC0.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListC0.get(i);
            i++;
            PermissionUpdateInfo permissionUpdateInfo = (PermissionUpdateInfo) obj2;
            arrayList.add(new Pair(permissionUpdateInfo.f6832a, permissionUpdateInfo.b));
        }
        return arrayList;
    }
}
