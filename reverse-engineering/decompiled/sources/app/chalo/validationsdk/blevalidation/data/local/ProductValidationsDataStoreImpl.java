package app.chalo.validationsdk.blevalidation.data.local;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.extensions.DataStoreExtensionsKt;
import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/local/ProductValidationsDataStoreImpl;", "Lapp/chalo/validationsdk/blevalidation/data/local/ProductValidationsDataStore;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductValidationsDataStoreImpl implements ProductValidationsDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f10471a;

    public ProductValidationsDataStoreImpl(DataStore dataStore) {
        this.f10471a = dataStore;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore
    public final Object a(int i, String str, Continuation continuation) {
        Object objB = DataStoreExtensionsKt.b(this.f10471a, PreferencesKeys.intKey("ble_tut_shown_count_key_" + str), new Integer(i), (ContinuationImpl) continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ProductValidationsDataStoreImpl$getBleTutorialShownCount$1 productValidationsDataStoreImpl$getBleTutorialShownCount$1;
        if (continuationImpl instanceof ProductValidationsDataStoreImpl$getBleTutorialShownCount$1) {
            productValidationsDataStoreImpl$getBleTutorialShownCount$1 = (ProductValidationsDataStoreImpl$getBleTutorialShownCount$1) continuationImpl;
            int i = productValidationsDataStoreImpl$getBleTutorialShownCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productValidationsDataStoreImpl$getBleTutorialShownCount$1.label = i - Integer.MIN_VALUE;
            } else {
                productValidationsDataStoreImpl$getBleTutorialShownCount$1 = new ProductValidationsDataStoreImpl$getBleTutorialShownCount$1(this, continuationImpl);
            }
        } else {
            productValidationsDataStoreImpl$getBleTutorialShownCount$1 = new ProductValidationsDataStoreImpl$getBleTutorialShownCount$1(this, continuationImpl);
        }
        Object objV = productValidationsDataStoreImpl$getBleTutorialShownCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productValidationsDataStoreImpl$getBleTutorialShownCount$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A = DataStoreExtensionsKt.a(this.f10471a, PreferencesKeys.intKey("ble_tut_shown_count_key_" + str), new Integer(0));
            productValidationsDataStoreImpl$getBleTutorialShownCount$1.label = 1;
            objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A, productValidationsDataStoreImpl$getBleTutorialShownCount$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Integer num = (Integer) objV;
        return new Integer(num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ProductValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1 productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1;
        if (continuationImpl instanceof ProductValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1) {
            productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1 = (ProductValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1) continuationImpl;
            int i = productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1.label = i - Integer.MIN_VALUE;
            } else {
                productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1 = new ProductValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1(this, continuationImpl);
            }
        } else {
            productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1 = new ProductValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1(this, continuationImpl);
        }
        Object objV = productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A = DataStoreExtensionsKt.a(this.f10471a, PreferencesKeys.intKey("perm_attempts_count_key_" + str), new Integer(-1));
            productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1.label = 1;
            objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A, productValidationsDataStoreImpl$getBlePermissionDeniedAndAttemptedCount$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Integer num = (Integer) objV;
        return new Integer(num != null ? num.intValue() : -1);
    }
}
