package app.chalo.productpurchase.productselection.data.remote;

import app.chalo.productpurchase.passpurchase.data.models.api.request.CreateSuperPassOrderRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationSubmissionRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassCashPaymentInfoRequestApiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/remote/ProductPurchaseRemoteDataSource;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductPurchaseRemoteDataSource {
    Object a(MTicketOrderCreationRequestApiModel mTicketOrderCreationRequestApiModel, ContinuationImpl continuationImpl);

    Object b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, ContinuationImpl continuationImpl);

    Object c(CreateSuperPassOrderRequestApiModel createSuperPassOrderRequestApiModel, String str, ContinuationImpl continuationImpl);

    Object d(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object e(String str, PassApplicationSubmissionRequestApiModel passApplicationSubmissionRequestApiModel, ContinuationImpl continuationImpl);

    Object f(int i, String str, ContinuationImpl continuationImpl, boolean z);

    Object g(PassCashPaymentInfoRequestApiModel passCashPaymentInfoRequestApiModel, ContinuationImpl continuationImpl);
}
