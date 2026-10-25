package app.chalo.ncmc.cardreceipt;

import app.chalo.data.BookingsRequestType;
import app.chalo.receipt.ProductReceiptManager;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/cardreceipt/ChaloCardReceiptManager;", "Lapp/chalo/receipt/ProductReceiptManager;", "Lapp/chalo/data/BookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardReceiptManager implements ProductReceiptManager<BookingsRequestType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDetailsForChaloCard f6021a;
    public final LinkedHashMap b = new LinkedHashMap();

    public ChaloCardReceiptManager(UserDetailsForChaloCard userDetailsForChaloCard) {
        this.f6021a = userDetailsForChaloCard;
    }
}
