package app.chalo.usecase;

import app.chalo.location.AppPermissionRequest;
import app.chalo.permissions.models.AppPermission;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/IsNotificationPermissionGrantedUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsNotificationPermissionGrantedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArePermissionsGrantedUseCase f10208a;

    public IsNotificationPermissionGrantedUseCase(ArePermissionsGrantedUseCase arePermissionsGrantedUseCase) {
        this.f10208a = arePermissionsGrantedUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        IsNotificationPermissionGrantedUseCase$invoke$1 isNotificationPermissionGrantedUseCase$invoke$1;
        if (continuationImpl instanceof IsNotificationPermissionGrantedUseCase$invoke$1) {
            isNotificationPermissionGrantedUseCase$invoke$1 = (IsNotificationPermissionGrantedUseCase$invoke$1) continuationImpl;
            int i = isNotificationPermissionGrantedUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                isNotificationPermissionGrantedUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                isNotificationPermissionGrantedUseCase$invoke$1 = new IsNotificationPermissionGrantedUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            isNotificationPermissionGrantedUseCase$invoke$1 = new IsNotificationPermissionGrantedUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = isNotificationPermissionGrantedUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = isNotificationPermissionGrantedUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            AppPermission[] appPermissionArr = {AppPermission.POST_NOTIFICATIONS};
            isNotificationPermissionGrantedUseCase$invoke$1.label = 1;
            objA = this.f10208a.a(ArraysKt.h0(appPermissionArr), isNotificationPermissionGrantedUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((AppPermissionRequest) objA).f5114a.contains(AppPermission.POST_NOTIFICATIONS));
    }
}
