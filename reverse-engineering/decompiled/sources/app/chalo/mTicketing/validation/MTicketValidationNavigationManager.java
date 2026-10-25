package app.chalo.mTicketing.validation;

import app.chalo.constants.Source;
import app.chalo.constants.SourceKt;
import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductTypeForReceipt;
import app.chalo.data.BookingsRequestType;
import app.chalo.models.mticketing.MTicket;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.tito.domain.GetMTicketForTicketIdUseCase;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketValidationNavigationManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationNavigationManager;", "Lapp/chalo/contract/NavigationContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketValidationNavigationManager implements ProductValidationNavigationManager, NavigationContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationContract f5398a;
    public final GetMTicketForTicketIdUseCase b;
    public final CoroutineContextProvider c;
    public final ChaloNavigationManager d;

    public MTicketValidationNavigationManager(NavigationContract navigationContract, GetMTicketForTicketIdUseCase getMTicketForTicketIdUseCase, CoroutineContextProvider coroutineContextProvider, ChaloNavigationManager chaloNavigationManager) {
        this.f5398a = navigationContract;
        this.b = getMTicketForTicketIdUseCase;
        this.c = coroutineContextProvider;
        this.d = chaloNavigationManager;
    }

    @Override // app.chalo.contract.NavigationContract
    public final SceneArgs a(String source, String productId, String str, ProductTypeForReceipt productTypeForReceipt) {
        Intrinsics.i(source, "source");
        Intrinsics.i(productId, "productId");
        Intrinsics.i(productTypeForReceipt, "productTypeForReceipt");
        return this.f5398a.a(source, productId, str, productTypeForReceipt);
    }

    @Override // app.chalo.contract.NavigationContract
    public final void b(String source, String bookingId, String str, String str2, String str3, PopUpToConfig popUpToConfig) {
        Intrinsics.i(source, "source");
        Intrinsics.i(bookingId, "bookingId");
        this.f5398a.b(source, bookingId, str, str2, str3, popUpToConfig);
    }

    @Override // app.chalo.contract.NavigationContract
    public final void c(SceneArgs sceneArgs) {
        this.f5398a.c(sceneArgs);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager
    public final Object d(ProductValidationData productValidationData, String str, String str2, Long l, boolean z, Continuation continuation) {
        MTicketValidationNavigationManager$onViewTripReceipt$1 mTicketValidationNavigationManager$onViewTripReceipt$1;
        if (continuation instanceof MTicketValidationNavigationManager$onViewTripReceipt$1) {
            mTicketValidationNavigationManager$onViewTripReceipt$1 = (MTicketValidationNavigationManager$onViewTripReceipt$1) continuation;
            int i = mTicketValidationNavigationManager$onViewTripReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationNavigationManager$onViewTripReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationNavigationManager$onViewTripReceipt$1 = new MTicketValidationNavigationManager$onViewTripReceipt$1(this, (ContinuationImpl) continuation);
            }
        } else {
            mTicketValidationNavigationManager$onViewTripReceipt$1 = new MTicketValidationNavigationManager$onViewTripReceipt$1(this, (ContinuationImpl) continuation);
        }
        Object objC = mTicketValidationNavigationManager$onViewTripReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationNavigationManager$onViewTripReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String id = productValidationData.getId();
            mTicketValidationNavigationManager$onViewTripReceipt$1.L$0 = str;
            mTicketValidationNavigationManager$onViewTripReceipt$1.Z$0 = z;
            mTicketValidationNavigationManager$onViewTripReceipt$1.label = 1;
            objC = this.b.f9661a.c(id, mTicketValidationNavigationManager$onViewTripReceipt$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = mTicketValidationNavigationManager$onViewTripReceipt$1.Z$0;
            str = (String) mTicketValidationNavigationManager$onViewTripReceipt$1.L$0;
            ResultKt.b(objC);
        }
        MTicket mTicket = (MTicket) objC;
        if (mTicket != null) {
            BookingsRequestType.MobileTicketType mobileTicketType = new BookingsRequestType.MobileTicketType(mTicket.f5615a);
            Source sourceA = SourceKt.a(str);
            if (sourceA == null) {
                sourceA = Source.BLE_VALIDATION_ACTIVITY;
            }
            TripSummaryArgs.TicketSummaryScreen ticketSummaryScreen = new TripSummaryArgs.TicketSummaryScreen(sourceA, mobileTicketType);
            if (z) {
                this.f5398a.c(ticketSummaryScreen);
            } else {
                ChaloNavigationManagerKt.e(this.d, ticketSummaryScreen, null, 6);
            }
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager
    public final Object e(Product product, String str, PopUpToConfig.Finish finish, Continuation continuation) {
        MTicketValidationNavigationManager$onExpiredDialogPositiveClick$1 mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1;
        PopUpToConfig popUpToConfig;
        if (continuation instanceof MTicketValidationNavigationManager$onExpiredDialogPositiveClick$1) {
            mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1 = (MTicketValidationNavigationManager$onExpiredDialogPositiveClick$1) continuation;
            int i = mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1 = new MTicketValidationNavigationManager$onExpiredDialogPositiveClick$1(this, (ContinuationImpl) continuation);
            }
        } else {
            mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1 = new MTicketValidationNavigationManager$onExpiredDialogPositiveClick$1(this, (ContinuationImpl) continuation);
        }
        Object objC = mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String str2 = product.f10666a;
            mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.L$0 = str;
            mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.L$1 = finish;
            mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.label = 1;
            objC = this.b.f9661a.c(str2, mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1);
            if (objC == coroutineSingletons) {
                popUpToConfig = finish;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PopUpToConfig popUpToConfig2 = (PopUpToConfig) mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.L$1;
            str = (String) mTicketValidationNavigationManager$onExpiredDialogPositiveClick$1.L$0;
            ResultKt.b(objC);
            popUpToConfig = popUpToConfig2;
        }
        popUpToConfig = finish;
        MTicket mTicket = (MTicket) objC;
        if (mTicket != null) {
            BookingsRequestType.MobileTicketType mobileTicketType = new BookingsRequestType.MobileTicketType(mTicket.f5615a);
            Source sourceA = SourceKt.a(str);
            if (sourceA == null) {
                sourceA = Source.BLE_VALIDATION_ACTIVITY;
            }
            this.d.b(new ChaloNavigationRequest.Navigate(new TripSummaryArgs.TicketSummaryScreen(sourceA, mobileTicketType), popUpToConfig != null ? new ChaloNavOptions(popUpToConfig, 3) : null, null, 4));
        }
        return Unit.f17538a;
    }
}
