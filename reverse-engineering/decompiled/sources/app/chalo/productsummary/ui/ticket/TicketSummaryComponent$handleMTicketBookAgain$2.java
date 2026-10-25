package app.chalo.productsummary.ui.ticket;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.citydata.domain.GetRouteDataFromLocalOrRemoteUseCase;
import app.chalo.constants.Source;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.instantticket.data.model.RouteInfoToProductBookingDetailsHelperKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.MTicketSelectionArgs;
import app.chalo.usecase.GetProductConfigListFromAgencyUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hi1;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$handleMTicketBookAgain$2", f = "TicketSummaryComponent.kt", l = {723, 731, 738}, m = "invokeSuspend", v = 1)
final class TicketSummaryComponent$handleMTicketBookAgain$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloUserBookingType.TicketBooking.MobileTicketBooking $bookingType;
    Object L$0;
    int label;
    final /* synthetic */ TicketSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent$handleMTicketBookAgain$2(ChaloUserBookingType.TicketBooking.MobileTicketBooking mobileTicketBooking, TicketSummaryComponent ticketSummaryComponent, Continuation continuation) {
        super(2, continuation);
        this.$bookingType = mobileTicketBooking;
        this.this$0 = ticketSummaryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketSummaryComponent$handleMTicketBookAgain$2(this.$bookingType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketSummaryComponent$handleMTicketBookAgain$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0152  */
    /* JADX WARN: Code duplicated, block: B:38:0x0156  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        Object objB2;
        KotlinToastManager kotlinToastManager;
        Iterator it;
        Object next;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            List listR = CollectionsKt.R(this.$bookingType.d.f.f1717a);
            GetRouteDataFromLocalOrRemoteUseCase getRouteDataFromLocalOrRemoteUseCase = this.this$0.E;
            this.label = 1;
            objB = getRouteDataFromLocalOrRemoteUseCase.b(listR, this);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB2, ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
            objA = obj;
            it = ((List) objA).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(((ProductConfigCompleteDetailsAppModel) next).o, "singleJourneyTicket", true));
            productConfigCompleteDetailsAppModel = (ProductConfigCompleteDetailsAppModel) next;
            RouteStopsInfo routeStopsInfo = this.$bookingType.d.f;
            ProductBookingStopDetails productBookingStopDetails = new ProductBookingStopDetails(routeStopsInfo.c, routeStopsInfo.d, null);
            RouteStopsInfo routeStopsInfo2 = this.$bookingType.d.f;
            ProductBookingStopDetails productBookingStopDetails2 = new ProductBookingStopDetails(routeStopsInfo2.e, routeStopsInfo2.f, null);
            this.this$0.E0(new hi1(28));
            ChaloNavigationManager chaloNavigationManager = this.this$0.w;
            Json json = ChaloJson.b;
            TicketSummaryComponent ticketSummaryComponent = this.this$0;
            RouteAppModel routeAppModel = (RouteAppModel) CollectionsKt.F((List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            ticketSummaryComponent.getClass();
            ProductBookingRouteDetails productBookingRouteDetails = new ProductBookingRouteDetails(routeAppModel.b, routeAppModel.c, routeAppModel.j, RouteInfoToProductBookingDetailsHelperKt.b(routeAppModel.n), RouteInfoToProductBookingDetailsHelperKt.a(routeAppModel.e), routeAppModel.k);
            json.getClass();
            String strA = json.a(ProductBookingRouteDetails.INSTANCE.serializer(), productBookingRouteDetails);
            ProductBookingStopDetails.Companion companion = ProductBookingStopDetails.INSTANCE;
            String strA2 = json.a(companion.serializer(), productBookingStopDetails);
            String strA3 = json.a(companion.serializer(), productBookingStopDetails2);
            if (productConfigCompleteDetailsAppModel != null) {
                str = productConfigCompleteDetailsAppModel.f8203a;
            } else {
                str = null;
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new MTicketSelectionArgs(strA, strA2, strA3, str, Source.TICKET_SUMMARY_SCREEN, this.$bookingType.d.f5615a), null, null, 6));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        objB = obj;
        ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
            this.this$0.E0(new hi1(27));
            TicketSummaryComponent ticketSummaryComponent2 = this.this$0;
            KotlinToastManager kotlinToastManager2 = ticketSummaryComponent2.v;
            this.L$0 = kotlinToastManager2;
            this.label = 2;
            objB2 = ticketSummaryComponent2.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB2 != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB2, ToastLength.LONG);
                return Unit.f17538a;
            }
        } else {
            if (!(chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            GetProductConfigListFromAgencyUseCase getProductConfigListFromAgencyUseCase = this.this$0.F;
            String lowerCase = this.$bookingType.d.e.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            this.L$0 = chaloUseCaseResult2;
            this.label = 3;
            objA = getProductConfigListFromAgencyUseCase.a(lowerCase, this);
            if (objA != coroutineSingletons) {
                chaloUseCaseResult = chaloUseCaseResult2;
                it = ((List) objA).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!StringsKt.x(((ProductConfigCompleteDetailsAppModel) next).o, "singleJourneyTicket", true));
                productConfigCompleteDetailsAppModel = (ProductConfigCompleteDetailsAppModel) next;
                RouteStopsInfo routeStopsInfo3 = this.$bookingType.d.f;
                ProductBookingStopDetails productBookingStopDetails3 = new ProductBookingStopDetails(routeStopsInfo3.c, routeStopsInfo3.d, null);
                RouteStopsInfo routeStopsInfo4 = this.$bookingType.d.f;
                ProductBookingStopDetails productBookingStopDetails4 = new ProductBookingStopDetails(routeStopsInfo4.e, routeStopsInfo4.f, null);
                this.this$0.E0(new hi1(28));
                ChaloNavigationManager chaloNavigationManager2 = this.this$0.w;
                Json json2 = ChaloJson.b;
                TicketSummaryComponent ticketSummaryComponent3 = this.this$0;
                RouteAppModel routeAppModel2 = (RouteAppModel) CollectionsKt.F((List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
                ticketSummaryComponent3.getClass();
                ProductBookingRouteDetails productBookingRouteDetails2 = new ProductBookingRouteDetails(routeAppModel2.b, routeAppModel2.c, routeAppModel2.j, RouteInfoToProductBookingDetailsHelperKt.b(routeAppModel2.n), RouteInfoToProductBookingDetailsHelperKt.a(routeAppModel2.e), routeAppModel2.k);
                json2.getClass();
                String strA4 = json2.a(ProductBookingRouteDetails.INSTANCE.serializer(), productBookingRouteDetails2);
                ProductBookingStopDetails.Companion companion2 = ProductBookingStopDetails.INSTANCE;
                String strA5 = json2.a(companion2.serializer(), productBookingStopDetails3);
                String strA6 = json2.a(companion2.serializer(), productBookingStopDetails4);
                if (productConfigCompleteDetailsAppModel != null) {
                    str = productConfigCompleteDetailsAppModel.f8203a;
                } else {
                    str = null;
                }
                chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new MTicketSelectionArgs(strA4, strA5, strA6, str, Source.TICKET_SUMMARY_SCREEN, this.$bookingType.d.f5615a), null, null, 6));
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}
