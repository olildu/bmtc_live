package app.chalo.validationsdk.blevalidation.config;

import app.chalo.scenes.PopUpToConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/config/ProductValidationNavigationManager;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductValidationNavigationManager {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(ProductValidationNavigationManager productValidationNavigationManager, ProductValidationData productValidationData, String str, String str2, Long l, SuspendLambda suspendLambda, int i) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                l = null;
            }
            return productValidationNavigationManager.d(productValidationData, str, str2, l, false, suspendLambda);
        }
    }

    Object d(ProductValidationData productValidationData, String str, String str2, Long l, boolean z, Continuation continuation);

    Object e(Product product, String str, PopUpToConfig.Finish finish, Continuation continuation);
}
