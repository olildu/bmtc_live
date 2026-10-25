package app.chalo.validationsdk.blevalidation.data.models;

import app.chalo.notification.models.AppNotification;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductPunchDataFromPolling;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductValidationConfig {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    String a(int i, String str);

    Object c(Continuation continuation);

    Object d(ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData, ProductValidationData productValidationData, ContinuationImpl continuationImpl);

    ProductValidationUIManager e();

    Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl);

    boolean g();

    ProductValidationAnalyticManager h();

    Object i(ProductPunchDataFromPolling productPunchDataFromPolling, ProductValidationData productValidationData, String str, ContinuationImpl continuationImpl);

    ProductValidationNavigationManager j();

    Object k(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, String str, Continuation continuation);

    Object l(Product product, ContinuationImpl continuationImpl);

    ProductValidationReportProblemManager m();

    Object n(ProductReceiptData productReceiptData, ProductValidationData productValidationData, String str, Continuation continuation);
}
