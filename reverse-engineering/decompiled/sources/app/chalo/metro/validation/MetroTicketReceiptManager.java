package app.chalo.metro.validation;

import app.chalo.data.BookingsRequestType;
import app.chalo.receipt.ProductReceiptManager;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/metro/validation/MetroTicketReceiptManager;", "Lapp/chalo/receipt/ProductReceiptManager;", "Lapp/chalo/data/BookingsRequestType$MetroTicketType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketReceiptManager implements ProductReceiptManager<BookingsRequestType.MetroTicketType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroTicketUserDetailsForProducts f5560a;

    public MetroTicketReceiptManager(MetroTicketUserDetailsForProducts metroTicketUserDetailsForProducts) {
        this.f5560a = metroTicketUserDetailsForProducts;
    }
}
