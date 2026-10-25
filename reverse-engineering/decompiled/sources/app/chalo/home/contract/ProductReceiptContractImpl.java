package app.chalo.home.contract;

import app.chalo.contract.ProductReceiptContract;
import app.chalo.data.BookingsRequestType;
import app.chalo.instantticket.validation.InstantTicketReceiptManager;
import app.chalo.metro.validation.MetroTicketReceiptFetchFailed;
import app.chalo.metro.validation.MetroTicketReceiptManager;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptData;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptManager;
import app.chalo.ncmc.cardreceipt.NoChaloCardReceiptAvailable;
import app.chalo.ondc.validation.OndcTicketReceiptManager;
import app.chalo.ondc.validation.metro.OndcMetroTicketReceiptManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketReceiptManager;
import app.chalo.quickpay.validation.manager.QuickPayReceiptManager;
import app.chalo.quickpay.validation.manager.QuickPayTransactionIdUnavailable;
import app.chalo.receipt.ProductReceiptManager;
import app.chalo.receipt.ProductUnsupportedForReceipt;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/contract/ProductReceiptContractImpl;", "Lapp/chalo/contract/ProductReceiptContract;", "MockReceiptManager", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductReceiptContractImpl implements ProductReceiptContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketReceiptManager f2867a;
    public final QuickPayReceiptManager b;
    public final ChaloCardReceiptManager c;
    public final PremiumReserveTicketReceiptManager d;
    public final OndcTicketReceiptManager e;
    public final OndcMetroTicketReceiptManager f;
    public final MetroTicketReceiptManager g;
    public final MockReceiptManager h = new MockReceiptManager();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/contract/ProductReceiptContractImpl$MockReceiptManager;", "Lapp/chalo/receipt/ProductReceiptManager;", "Lapp/chalo/data/BookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MockReceiptManager implements ProductReceiptManager<BookingsRequestType> {
    }

    public ProductReceiptContractImpl(InstantTicketReceiptManager instantTicketReceiptManager, QuickPayReceiptManager quickPayReceiptManager, ChaloCardReceiptManager chaloCardReceiptManager, PremiumReserveTicketReceiptManager premiumReserveTicketReceiptManager, OndcTicketReceiptManager ondcTicketReceiptManager, OndcMetroTicketReceiptManager ondcMetroTicketReceiptManager, MetroTicketReceiptManager metroTicketReceiptManager) {
        this.f2867a = instantTicketReceiptManager;
        this.b = quickPayReceiptManager;
        this.c = chaloCardReceiptManager;
        this.d = premiumReserveTicketReceiptManager;
        this.e = ondcTicketReceiptManager;
        this.f = ondcMetroTicketReceiptManager;
        this.g = metroTicketReceiptManager;
    }

    @Override // app.chalo.contract.ProductReceiptContract
    public final boolean a(BookingsRequestType bookingRequestType) {
        Intrinsics.i(bookingRequestType, "bookingRequestType");
        if ((bookingRequestType instanceof BookingsRequestType.RideBasedPassType) || (bookingRequestType instanceof BookingsRequestType.ApplicationPassType) || (bookingRequestType instanceof BookingsRequestType.MagicPassType) || (bookingRequestType instanceof BookingsRequestType.PendingSuperPassType)) {
            return false;
        }
        if ((bookingRequestType instanceof BookingsRequestType.MobileTicketType) || (bookingRequestType instanceof BookingsRequestType.SuperPassRideType) || (bookingRequestType instanceof BookingsRequestType.InstantTicketType) || (bookingRequestType instanceof BookingsRequestType.OndcTicketType) || (bookingRequestType instanceof BookingsRequestType.OndcMetroTicketType) || (bookingRequestType instanceof BookingsRequestType.PremiumBusTicketType) || (bookingRequestType instanceof BookingsRequestType.QuickPayType) || (bookingRequestType instanceof BookingsRequestType.CardRechargeType) || (bookingRequestType instanceof BookingsRequestType.CardTransactionReceiptType) || (bookingRequestType instanceof BookingsRequestType.MetroTicketType) || (bookingRequestType instanceof BookingsRequestType.MultiModalGroupTicketType)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // app.chalo.contract.ProductReceiptContract
    public final Object b(BookingsRequestType bookingsRequestType, Continuation continuation) {
        boolean zA = a(bookingsRequestType);
        ProductUnsupportedForReceipt productUnsupportedForReceipt = ProductUnsupportedForReceipt.f8916a;
        if (!zA) {
            return new ChaloUseCaseResult.Failure(productUnsupportedForReceipt);
        }
        if ((bookingsRequestType instanceof BookingsRequestType.MobileTicketType) || (bookingsRequestType instanceof BookingsRequestType.MultiModalGroupTicketType) || (bookingsRequestType instanceof BookingsRequestType.SuperPassRideType)) {
            return new ChaloUseCaseResult.Failure(new ProductReceiptContractImpl$MockReceiptManager$getReceipt$2());
        }
        if (bookingsRequestType instanceof BookingsRequestType.InstantTicketType) {
            return this.f2867a.f3974a.a(((BookingsRequestType.InstantTicketType) bookingsRequestType).f2317a, (ContinuationImpl) continuation);
        }
        if (bookingsRequestType instanceof BookingsRequestType.OndcTicketType) {
            return this.e.f6801a.a(((BookingsRequestType.OndcTicketType) bookingsRequestType).f2317a, (ContinuationImpl) continuation);
        }
        if (bookingsRequestType instanceof BookingsRequestType.OndcMetroTicketType) {
            return this.f.a((BookingsRequestType.OndcMetroTicketType) bookingsRequestType, (ContinuationImpl) continuation);
        }
        if (bookingsRequestType instanceof BookingsRequestType.PremiumBusTicketType) {
            return this.d.f7481a.b(((BookingsRequestType.PremiumBusTicketType) bookingsRequestType).f2317a, (ContinuationImpl) continuation);
        }
        if (bookingsRequestType instanceof BookingsRequestType.QuickPayType) {
            String str = ((BookingsRequestType.QuickPayType) bookingsRequestType).d;
            if (str != null) {
                if (StringsKt.F(str)) {
                    str = null;
                }
                if (str != null) {
                    return this.b.f8909a.a(str, (ContinuationImpl) continuation);
                }
            }
            return new ChaloUseCaseResult.Failure(new QuickPayTransactionIdUnavailable());
        }
        if ((bookingsRequestType instanceof BookingsRequestType.CardRechargeType) || (bookingsRequestType instanceof BookingsRequestType.CardTransactionReceiptType)) {
            ChaloCardReceiptData chaloCardReceiptData = (ChaloCardReceiptData) this.c.b.get(bookingsRequestType.f2317a);
            return chaloCardReceiptData != null ? new ChaloUseCaseResult.Success(chaloCardReceiptData) : new ChaloUseCaseResult.Failure(NoChaloCardReceiptAvailable.f6022a);
        }
        if (bookingsRequestType instanceof BookingsRequestType.MetroTicketType) {
            return new ChaloUseCaseResult.Failure(new MetroTicketReceiptFetchFailed());
        }
        if ((bookingsRequestType instanceof BookingsRequestType.RideBasedPassType) || (bookingsRequestType instanceof BookingsRequestType.ApplicationPassType) || (bookingsRequestType instanceof BookingsRequestType.MagicPassType) || (bookingsRequestType instanceof BookingsRequestType.PendingSuperPassType)) {
            return new ChaloUseCaseResult.Failure(productUnsupportedForReceipt);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // app.chalo.contract.ProductReceiptContract
    public final UserDetailsForProducts c(BookingsRequestType bookingsRequestType) {
        Intrinsics.i(bookingsRequestType, "bookingsRequestType");
        if (!a(bookingsRequestType)) {
            return null;
        }
        if ((bookingsRequestType instanceof BookingsRequestType.MobileTicketType) || (bookingsRequestType instanceof BookingsRequestType.MultiModalGroupTicketType) || (bookingsRequestType instanceof BookingsRequestType.SuperPassRideType)) {
            this.h.getClass();
            return new ProductReceiptContractImpl$MockReceiptManager$getUserDetails$1();
        }
        if (bookingsRequestType instanceof BookingsRequestType.InstantTicketType) {
            return this.f2867a.b;
        }
        if (bookingsRequestType instanceof BookingsRequestType.OndcTicketType) {
            return this.e.b;
        }
        if (bookingsRequestType instanceof BookingsRequestType.OndcMetroTicketType) {
            return this.f.b;
        }
        if (bookingsRequestType instanceof BookingsRequestType.PremiumBusTicketType) {
            this.d.getClass();
            return null;
        }
        if (bookingsRequestType instanceof BookingsRequestType.QuickPayType) {
            return this.b.b;
        }
        if ((bookingsRequestType instanceof BookingsRequestType.CardRechargeType) || (bookingsRequestType instanceof BookingsRequestType.CardTransactionReceiptType)) {
            return this.c.f6021a;
        }
        if (bookingsRequestType instanceof BookingsRequestType.MetroTicketType) {
            return this.g.f5560a;
        }
        if ((bookingsRequestType instanceof BookingsRequestType.RideBasedPassType) || (bookingsRequestType instanceof BookingsRequestType.ApplicationPassType) || (bookingsRequestType instanceof BookingsRequestType.MagicPassType) || (bookingsRequestType instanceof BookingsRequestType.PendingSuperPassType)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
