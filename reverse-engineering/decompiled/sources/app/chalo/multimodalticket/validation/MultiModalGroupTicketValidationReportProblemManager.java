package app.chalo.multimodalticket.validation;

import app.chalo.features.reportproblem.ReportProblemFeatureData;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.RegularBusValidationScreen;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationReportProblemManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationReportProblemManager;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationReportProblemManager implements ProductValidationReportProblemManager {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationReportProblemManager$Companion;", "", "", "GROUP_PROPERTY_PREFIX", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager
    public final ReportProblemFeatureData a(ProductValidationData productValidationData, RegularBusValidationScreen regularBusValidationScreen) {
        LinkedHashMap linkedHashMapK;
        Intrinsics.i(productValidationData, "productValidationData");
        Intrinsics.i(regularBusValidationScreen, "regularBusValidationScreen");
        if (productValidationData instanceof MultiProductValidationData) {
            ProductValidationData productValidationDataC = ((MultiProductValidationData) productValidationData).c();
            Map mapU = productValidationDataC != null ? productValidationDataC.u() : null;
            if (mapU == null) {
                mapU = MapsKt.d();
            }
            linkedHashMapK = MapsKt.u(mapU);
            for (Map.Entry entry : productValidationData.u().entrySet()) {
                String str = (String) entry.getKey();
                linkedHashMapK.put("group_" + str, (String) entry.getValue());
            }
        } else {
            linkedHashMapK = MapsKt.k(new Pair("userPropertyOrderId", productValidationData.getId()));
        }
        return new ReportProblemFeatureData("transactionRelatedScreen", regularBusValidationScreen.getSourceForReportProblemFeature(), linkedHashMapK, false, null);
    }
}
