package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.features.reportproblem.ReportProblemFeatureData;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.RegularBusValidationScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationReportProblemManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationReportProblemManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketValidationReportProblemManager implements ProductValidationReportProblemManager {
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager
    public final ReportProblemFeatureData a(ProductValidationData productValidationData, RegularBusValidationScreen regularBusValidationScreen) {
        Intrinsics.i(productValidationData, "productValidationData");
        Intrinsics.i(regularBusValidationScreen, "regularBusValidationScreen");
        return new ReportProblemFeatureData("transactionRelatedScreen", regularBusValidationScreen.getSourceForReportProblemFeature(), productValidationData.u(), false, null);
    }
}
