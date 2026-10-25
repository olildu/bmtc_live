package app.chalo.base;

import app.chalo.constants.Source;
import app.chalo.constants.SourceKt;
import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductTypeForReceipt;
import app.chalo.data.BookingsRequestType;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/base/NavigationContractImpl;", "Lapp/chalo/contract/NavigationContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationContractImpl implements NavigationContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloNavigationManager f996a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f997a;

        static {
            int[] iArr = new int[ProductTypeForReceipt.values().length];
            try {
                iArr[ProductTypeForReceipt.QUICK_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductTypeForReceipt.INSTANT_TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductTypeForReceipt.PREMIUM_RESERVE_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductTypeForReceipt.ONDC_TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductTypeForReceipt.ONDC_METRO_TICKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductTypeForReceipt.METRO_TICKET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProductTypeForReceipt.CHALO_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProductTypeForReceipt.SUPER_PASS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProductTypeForReceipt.M_TICKET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProductTypeForReceipt.MULTIMODAL_GROUP_TICKET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f997a = iArr;
        }
    }

    public NavigationContractImpl(ChaloNavigationManager chaloNavigationManager) {
        this.f996a = chaloNavigationManager;
    }

    @Override // app.chalo.contract.NavigationContract
    public final SceneArgs a(String source, String productId, String str, ProductTypeForReceipt productTypeForReceipt) {
        BookingsRequestType quickPayType;
        Intrinsics.i(source, "source");
        Intrinsics.i(productId, "productId");
        Intrinsics.i(productTypeForReceipt, "productTypeForReceipt");
        switch (WhenMappings.f997a[productTypeForReceipt.ordinal()]) {
            case 1:
                if (str == null) {
                    str = "";
                }
                quickPayType = new BookingsRequestType.QuickPayType(productId, str);
                break;
            case 2:
                quickPayType = new BookingsRequestType.InstantTicketType(productId);
                break;
            case 3:
                quickPayType = new BookingsRequestType.PremiumBusTicketType(productId);
                break;
            case 4:
                quickPayType = new BookingsRequestType.OndcTicketType(productId);
                break;
            case 5:
                quickPayType = new BookingsRequestType.OndcMetroTicketType(productId);
                break;
            case 6:
            case 7:
            case 8:
                quickPayType = null;
                break;
            case 9:
                quickPayType = new BookingsRequestType.MobileTicketType(productId);
                break;
            case 10:
                quickPayType = new BookingsRequestType.MultiModalGroupTicketType(productId);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (quickPayType == null) {
            return null;
        }
        Source sourceA = SourceKt.a(source);
        if (sourceA == null) {
            sourceA = Source.HOME_SCREEN;
        }
        return new TripSummaryArgs.TicketSummaryScreen(sourceA, quickPayType);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // app.chalo.contract.NavigationContract
    public final void b(String source, String bookingId, String str, String str2, String str3, PopUpToConfig popUpToConfig) {
        BookingsRequestType premiumBusTicketType;
        Intrinsics.i(source, "source");
        Intrinsics.i(bookingId, "bookingId");
        switch (str3.hashCode()) {
            case -1555788335:
                premiumBusTicketType = !str3.equals("premiumReserveTicket") ? null : new BookingsRequestType.PremiumBusTicketType(bookingId);
                break;
            case -1066391653:
                if (!str3.equals("quickpay")) {
                    premiumBusTicketType = null;
                } else {
                    if (str == null) {
                        str = "";
                    }
                    premiumBusTicketType = new BookingsRequestType.QuickPayType(bookingId, str);
                }
                break;
            case 342216781:
                premiumBusTicketType = !str3.equals("instantTicket") ? null : new BookingsRequestType.InstantTicketType(bookingId);
                break;
            case 1066108746:
                premiumBusTicketType = !str3.equals("ondcTicket") ? null : new BookingsRequestType.OndcTicketType(bookingId);
                break;
            case 1216210951:
                premiumBusTicketType = !str3.equals("ondcMetroTicket") ? null : new BookingsRequestType.OndcMetroTicketType(bookingId);
                break;
            default:
                premiumBusTicketType = null;
                break;
        }
        if (premiumBusTicketType != null) {
            Source sourceA = SourceKt.a(source);
            if (sourceA == null) {
                sourceA = Source.HOME_SCREEN;
            }
            ChaloNavigationManagerKt.e(this.f996a, new TripSummaryArgs.TicketSummaryScreen(sourceA, premiumBusTicketType), popUpToConfig != null ? new ChaloNavOptions(popUpToConfig, 3) : null, 4);
        }
    }

    @Override // app.chalo.contract.NavigationContract
    public final void c(SceneArgs sceneArgs) {
        ChaloNavigationManagerKt.b(this.f996a, new HomeArgs((String) null, (String) null, 7), sceneArgs);
    }
}
