package app.chalo.mticket.domain;

import app.chalo.productpurchase.productselection.data.exceptions.MTicketFareFetchFailedException;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/FetchMTicketFareBetweenStopsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchMTicketFareBetweenStopsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f5724a;

    public FetchMTicketFareBetweenStopsUseCase(ProductPurchaseRepository productPurchaseRepository) {
        this.f5724a = productPurchaseRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, ContinuationImpl continuationImpl) {
        FetchMTicketFareBetweenStopsUseCase$invoke$1 fetchMTicketFareBetweenStopsUseCase$invoke$1;
        if (continuationImpl instanceof FetchMTicketFareBetweenStopsUseCase$invoke$1) {
            fetchMTicketFareBetweenStopsUseCase$invoke$1 = (FetchMTicketFareBetweenStopsUseCase$invoke$1) continuationImpl;
            int i = fetchMTicketFareBetweenStopsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMTicketFareBetweenStopsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMTicketFareBetweenStopsUseCase$invoke$1 = new FetchMTicketFareBetweenStopsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchMTicketFareBetweenStopsUseCase$invoke$1 = new FetchMTicketFareBetweenStopsUseCase$invoke$1(this, continuationImpl);
        }
        FetchMTicketFareBetweenStopsUseCase$invoke$1 fetchMTicketFareBetweenStopsUseCase$invoke$2 = fetchMTicketFareBetweenStopsUseCase$invoke$1;
        Object objB = fetchMTicketFareBetweenStopsUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchMTicketFareBetweenStopsUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                ProductPurchaseRepository productPurchaseRepository = this.f5724a;
                fetchMTicketFareBetweenStopsUseCase$invoke$2.label = 1;
                objB = productPurchaseRepository.b(str, str2, str3, str4, str5, str6, str7, str8, arrayList, fetchMTicketFareBetweenStopsUseCase$invoke$2);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            return new MTicketFareFetchResult.Success((MTicketFareResponseAppModel) objB);
        } catch (MTicketFareFetchFailedException e) {
            return new MTicketFareFetchResult.ServerError(e.getMessage());
        } catch (Exception e2) {
            return new MTicketFareFetchResult.GeneralError(e2.getMessage());
        }
    }
}
