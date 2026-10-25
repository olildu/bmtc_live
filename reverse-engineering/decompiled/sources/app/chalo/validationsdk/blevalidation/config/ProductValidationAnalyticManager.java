package app.chalo.validationsdk.blevalidation.config;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.notification.models.AppNotification;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium;
import app.chalo.validationsdk.legacy.Product;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductValidationAnalyticManager extends AnalyticsContract {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(ProductValidationAnalyticManager productValidationAnalyticManager, String str, ProductValidationData productValidationData, String str2, Map map, Continuation continuation, int i) {
            if ((i & 8) != 0) {
                map = MapsKt.d();
            }
            return productValidationAnalyticManager.l(str, productValidationData, str2, map, AnalyticsFrequency.Always.b, continuation);
        }

        public static String b(BleValidationAckData receiver) {
            Intrinsics.i(receiver, "$receiver");
            if (receiver instanceof BleValidationAckData.ConductorValidationReceiptData) {
                return "conductorValidationAckData";
            }
            if (receiver instanceof BleValidationAckData.InvalidData) {
                return "invalidData";
            }
            if (receiver instanceof BleValidationAckData.TITOTapInData) {
                return "titoTapInAckData";
            }
            if (receiver instanceof BleValidationAckData.TITOTapOutData) {
                return "titoTapOutAckData";
            }
            throw new NoWhenBranchMatchedException();
        }

        public static String c(ValidationProcessFlowDetails receiver) {
            Intrinsics.i(receiver, "$receiver");
            if (receiver.equals(ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.INSTANCE)) {
                return "conductorOrUnifiedTapIn";
            }
            if (receiver.equals(ValidationProcessFlowDetails.ConductorValidation.INSTANCE)) {
                return "conductorValidation";
            }
            if (receiver instanceof ValidationProcessFlowDetails.TapOutValidation) {
                return "titoTapOut";
            }
            if (receiver.equals(ValidationProcessFlowDetails.VehicleBasedValidation.INSTANCE)) {
                return "vehicleBasedValidation";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation);

    void B(Product product, String str);

    void C(Product product, String str);

    void D(AppNotification.PunchNotification punchNotification, String str);

    Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl);

    Object G(ProductValidationData productValidationData, Continuation continuation);

    Object H(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation);

    Object I(boolean z, ProductValidationData productValidationData, String str, Continuation continuation);

    void c(Product product, String str);

    void f(Product product, String str);

    Object h(ProductValidationData productValidationData, Continuation continuation);

    void i(boolean z, Product product, String str);

    void j(Product product, String str);

    void k(Product product, String str);

    Object l(String str, ProductValidationData productValidationData, String str2, Map map, AnalyticsFrequency analyticsFrequency, Continuation continuation);

    Object m(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation);

    Object n(ProductValidationData productValidationData, String str, Source source, ContinuationImpl continuationImpl);

    void p(Source source, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct);

    void r(ProductReceiptData productReceiptData, String str);

    void s(Product product, String str);

    void t(Product product, String str);

    Object u(ProductReceiptData productReceiptData, String str, Continuation continuation);

    Object w(ProductValidationData productValidationData, String str, Continuation continuation);

    void x(Product product, String str);

    void z(Product product, String str);
}
