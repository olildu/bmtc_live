package app.chalo.quickpay.validation.manager;

import app.chalo.data.BookingsRequestType;
import app.chalo.receipt.ProductReceiptManager;
import app.chalo.walletframework.quickpay.data.model.appmodel.QPUserDetailsForProducts;
import app.chalo.walletframework.quickpay.domain.FetchQuickPayReceiptForTransactionIdUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/quickpay/validation/manager/QuickPayReceiptManager;", "Lapp/chalo/receipt/ProductReceiptManager;", "Lapp/chalo/data/BookingsRequestType$QuickPayType;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayReceiptManager implements ProductReceiptManager<BookingsRequestType.QuickPayType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchQuickPayReceiptForTransactionIdUseCase f8909a;
    public final QPUserDetailsForProducts b;

    public QuickPayReceiptManager(FetchQuickPayReceiptForTransactionIdUseCase fetchQuickPayReceiptForTransactionIdUseCase, QPUserDetailsForProducts qPUserDetailsForProducts) {
        this.f8909a = fetchQuickPayReceiptForTransactionIdUseCase;
        this.b = qPUserDetailsForProducts;
    }
}
