package app.chalo.validationsdk.blevalidation.config;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/config/ProductValidationUIManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationCommonUIManager;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductValidationUIManager extends ProductValidationCommonUIManager {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    StringEnum a();

    Object b(ProductValidationData productValidationData, Continuation continuation);

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    StringEnum g();

    StringEnum h();

    boolean i();
}
