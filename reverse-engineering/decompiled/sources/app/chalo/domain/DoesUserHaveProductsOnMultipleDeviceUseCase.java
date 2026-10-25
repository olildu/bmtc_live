package app.chalo.domain;

import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.features.productsync.localDataStore.ReclaimDataStoreWrapper;
import app.chalo.providers.UserProfileDetailsProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/DoesUserHaveProductsOnMultipleDeviceUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DoesUserHaveProductsOnMultipleDeviceUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReclaimDataStoreWrapper f2486a;
    public final UserProfileDetailsProvider b;

    public DoesUserHaveProductsOnMultipleDeviceUseCase(ReclaimDataStoreWrapper reclaimDataStoreWrapper, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f2486a = reclaimDataStoreWrapper;
        this.b = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        DoesUserHaveProductsOnMultipleDeviceUseCase$invoke$1 doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1;
        if (continuationImpl instanceof DoesUserHaveProductsOnMultipleDeviceUseCase$invoke$1) {
            doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1 = (DoesUserHaveProductsOnMultipleDeviceUseCase$invoke$1) continuationImpl;
            int i = doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1 = new DoesUserHaveProductsOnMultipleDeviceUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1 = new DoesUserHaveProductsOnMultipleDeviceUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            String strM = this.b.m();
            if (strM == null) {
                return Boolean.FALSE;
            }
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1B = this.f2486a.b(str, strM);
            doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1B, doesUserHaveProductsOnMultipleDeviceUseCase$invoke$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Boolean bool = (Boolean) objV;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
