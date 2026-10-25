package app.chalo.permissions.handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.AppPermission_androidKt;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PlatformPermissionName;
import app.chalo.providers.CoroutineContextProvider;
import defpackage.eh0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/permissions/handler/PermissionHandlerAndroid;", "Lapp/chalo/permissions/handler/PermissionHandler;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionHandlerAndroid implements PermissionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatActivity f6823a;
    public final CoroutineContextProvider b;
    public final eh0 c;
    public final MutableStateFlow d = StateFlowKt.a(EmptyList.f17557a);

    public PermissionHandlerAndroid(AppCompatActivity appCompatActivity, CoroutineContextProvider coroutineContextProvider, eh0 eh0Var) {
        this.f6823a = appCompatActivity;
        this.b = coroutineContextProvider;
        this.c = eh0Var;
    }

    @Override // app.chalo.permissions.handler.PermissionHandler
    public final Flow a(List permissions) {
        Intrinsics.i(permissions, "permissions");
        Set setG0 = CollectionsKt.G0(permissions);
        return FlowKt.m(FlowKt.H(FlowKt.y(new PermissionHandlerAndroid$requestMultiplePermission$1(setG0, this, null)), new PermissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1(null, setG0, this, System.currentTimeMillis())));
    }

    @Override // app.chalo.permissions.handler.PermissionHandler
    public final Object b(AppPermission appPermission, ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.b.a(), new PermissionHandlerAndroid$checkPermission$2(this, appPermission, null), continuationImpl);
    }

    @Override // app.chalo.permissions.handler.PermissionHandler
    public final ChannelFlowTransformLatest c(AppPermission permission) {
        Intrinsics.i(permission, "permission");
        return FlowKt.H(FlowKt.y(new PermissionHandlerAndroid$requestPermission$1(this, permission, null)), new PermissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1(this, permission, null));
    }

    public final PermissionState d(AppPermission appPermission) {
        Intrinsics.i(appPermission, "<this>");
        String str = AppPermission_androidKt.a(appPermission).f6834a;
        AppCompatActivity appCompatActivity = this.f6823a;
        if (ContextCompat.checkSelfPermission(appCompatActivity, str) == 0) {
            return PermissionState.GRANTED;
        }
        return ActivityCompat.shouldShowRequestPermissionRationale(appCompatActivity, str) ? PermissionState.REQUIRES_EXPLANATION : PermissionState.DENIED;
    }

    public final void e(Map permissionStateMap) {
        MutableStateFlow mutableStateFlow;
        Object value;
        LinkedHashMap linkedHashMapU;
        AppPermission next;
        Intrinsics.i(permissionStateMap, "permissionStateMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : permissionStateMap.entrySet()) {
            Lazy lazy = PlatformPermissionName.b;
            String name = (String) entry.getKey();
            Intrinsics.i(name, "name");
            Iterator<AppPermission> it = AppPermission.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AppPermission_androidKt.a(next).f6834a.equals(name));
            AppPermission appPermission = next;
            if (appPermission != null) {
                linkedHashMap.put(appPermission, ((Boolean) entry.getValue()).booleanValue() ? PermissionState.GRANTED : ActivityCompat.shouldShowRequestPermissionRationale(this.f6823a, AppPermission_androidKt.a(appPermission).f6834a) ? PermissionState.REQUIRES_EXPLANATION : PermissionState.DENIED);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            mutableStateFlow = this.d;
            value = mutableStateFlow.getValue();
            List list = (List) value;
            int iG = MapsKt.g(CollectionsKt.v(list, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG);
            for (Object obj : list) {
                linkedHashMap2.put(((PermissionUpdateInfo) obj).f6832a, obj);
            }
            linkedHashMapU = MapsKt.u(linkedHashMap2);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMapU.put(entry2.getKey(), new PermissionUpdateInfo((AppPermission) entry2.getKey(), (PermissionState) entry2.getValue(), jCurrentTimeMillis));
            }
        } while (!mutableStateFlow.c(value, CollectionsKt.D0(linkedHashMapU.values())));
    }
}
