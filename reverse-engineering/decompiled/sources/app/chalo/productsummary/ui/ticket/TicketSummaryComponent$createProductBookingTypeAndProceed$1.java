package app.chalo.productsummary.ui.ticket;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.contract.ProductReceiptContract;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.receipt.ReceiptFetchError;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.android.gms.wallet.WalletConstants;
import defpackage.hi1;
import defpackage.hq0;
import defpackage.pg1;
import defpackage.rp0;
import defpackage.vi1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$createProductBookingTypeAndProceed$1", f = "TicketSummaryComponent.kt", l = {375, 379, 381}, m = "invokeSuspend", v = 1)
final class TicketSummaryComponent$createProductBookingTypeAndProceed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BookingsRequestType $bookingsRequestType;
    int label;
    final /* synthetic */ TicketSummaryComponent this$0;

    /* JADX INFO: renamed from: app.chalo.productsummary.ui.ticket.TicketSummaryComponent$createProductBookingTypeAndProceed$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "bookingType", "Lapp/chalo/home/domain/ChaloUserBookingType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$createProductBookingTypeAndProceed$1$3", f = "TicketSummaryComponent.kt", l = {388, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, 408}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<ChaloUserBookingType, Continuation<? super Unit>, Object> {
        final /* synthetic */ BookingsRequestType $bookingsRequestType;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TicketSummaryComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BookingsRequestType bookingsRequestType, TicketSummaryComponent ticketSummaryComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = ticketSummaryComponent;
            this.$bookingsRequestType = bookingsRequestType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$bookingsRequestType, this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((ChaloUserBookingType) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x010e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0126 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x0128  */
        /* JADX WARN: Code duplicated, block: B:73:0x0188  */
        /* JADX WARN: Code duplicated, block: B:75:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:77:0x01dd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x01df  */
        /* JADX WARN: Code duplicated, block: B:80:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:84:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:86:0x0237  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChaloUserBookingType chaloUserBookingType;
            Object objB;
            KotlinToastManager kotlinToastManager;
            Object objB2;
            ChaloUserBookingType chaloUserBookingType2;
            ChaloUseCaseResult chaloUseCaseResult;
            UserDetailsForProducts userDetailsForProductsC;
            BookingsRequestType bookingsRequestType;
            BookingsRequestType bookingsRequestType2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 0;
            int i3 = 1;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                chaloUserBookingType = (ChaloUserBookingType) this.L$0;
                TicketSummaryComponent ticketSummaryComponent = this.this$0;
                BookingsRequestType bookingsRequestType3 = this.$bookingsRequestType;
                if (chaloUserBookingType == null) {
                    AnalyticsContractImplKt.b(ticketSummaryComponent.t, "product data fetch failure", Source.TICKET_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", bookingsRequestType3.toString()), new Pair("bookingId", bookingsRequestType3.f2317a)), false, 24);
                } else {
                    AnalyticsContractImplKt.b(ticketSummaryComponent.t, "product data fetch success", Source.TICKET_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", bookingsRequestType3.toString()), new Pair("bookingId", bookingsRequestType3.f2317a)), false, 24);
                }
                if (chaloUserBookingType == null && ((TicketSummaryDataState) this.this$0.f.getValue()).f8804a == Source.DEEPLINK_PRODUCT) {
                    TicketSummaryComponent ticketSummaryComponent2 = this.this$0;
                    KotlinToastManager kotlinToastManager2 = ticketSummaryComponent2.v;
                    StringProvider stringProvider = ticketSummaryComponent2.m;
                    StringEnum stringEnum = StringEnum.TICKET_DATA_NOT_AVAILABLE_X;
                    Object[] objArr = {this.$bookingsRequestType.f2317a};
                    this.L$0 = kotlinToastManager2;
                    this.label = 1;
                    objB = stringProvider.b(stringEnum, objArr, this);
                    if (objB != coroutineSingletons) {
                        kotlinToastManager = kotlinToastManager2;
                        hq0.s(kotlinToastManager, (String) objB);
                        this.this$0.w.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                        return unit;
                    }
                } else {
                    TicketSummaryComponent ticketSummaryComponent3 = this.this$0;
                    this.L$0 = chaloUserBookingType;
                    this.label = 2;
                    if (TicketSummaryComponent.I0(ticketSummaryComponent3, chaloUserBookingType, this) != coroutineSingletons) {
                        ProductReceiptContract productReceiptContract = this.this$0.s;
                        BookingsRequestType bookingsRequestType4 = this.$bookingsRequestType;
                        this.L$0 = chaloUserBookingType;
                        this.label = 3;
                        objB2 = productReceiptContract.b(bookingsRequestType4, this);
                        if (objB2 != coroutineSingletons) {
                            chaloUserBookingType2 = chaloUserBookingType;
                            chaloUseCaseResult = (ChaloUseCaseResult) objB2;
                            userDetailsForProductsC = this.this$0.s.c(this.$bookingsRequestType);
                            JobKt.e(getContext());
                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                if (chaloUserBookingType2 == null) {
                                    this.this$0.E0(new pg1(15, chaloUserBookingType2, userDetailsForProductsC));
                                    AnalyticsContractImplKt.b(this.this$0.t, "receipt data fetch failure", Source.TICKET_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", this.$bookingsRequestType.toString()), new Pair("bookingId", this.$bookingsRequestType.f2317a), new Pair("errorMessage", String.valueOf(((ReceiptFetchError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).getF6810a()))), false, 24);
                                    return unit;
                                }
                                bookingsRequestType2 = this.$bookingsRequestType;
                                if (bookingsRequestType2 instanceof BookingsRequestType.MagicPassType) {
                                }
                                this.this$0.E0(new hi1(23));
                                return unit;
                            }
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (chaloUserBookingType2 == null) {
                                AnalyticsContractImplKt.b(this.this$0.t, "receipt data fetch success", Source.TICKET_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", this.$bookingsRequestType.toString()), new Pair("bookingId", this.$bookingsRequestType.f2317a)), false, 24);
                                this.this$0.E0(new vi1(i3, chaloUserBookingType2, (ChaloUseCaseResult.Success) chaloUseCaseResult, userDetailsForProductsC));
                                return unit;
                            }
                            bookingsRequestType = this.$bookingsRequestType;
                            if (bookingsRequestType instanceof BookingsRequestType.SuperPassRideType) {
                                this.this$0.E0(new hi1(24));
                                return unit;
                            }
                            TicketSummaryComponent ticketSummaryComponent4 = this.this$0;
                            ticketSummaryComponent4.E0(new vi1(i2, ticketSummaryComponent4, bookingsRequestType, userDetailsForProductsC));
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                hq0.s(kotlinToastManager, (String) objB);
                this.this$0.w.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                return unit;
            }
            if (i == 2) {
                chaloUserBookingType = (ChaloUserBookingType) this.L$0;
                ResultKt.b(obj);
                ProductReceiptContract productReceiptContract2 = this.this$0.s;
                BookingsRequestType bookingsRequestType5 = this.$bookingsRequestType;
                this.L$0 = chaloUserBookingType;
                this.label = 3;
                objB2 = productReceiptContract2.b(bookingsRequestType5, this);
                if (objB2 != coroutineSingletons) {
                    chaloUserBookingType2 = chaloUserBookingType;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUserBookingType2 = (ChaloUserBookingType) this.L$0;
            ResultKt.b(obj);
            objB2 = obj;
            chaloUseCaseResult = (ChaloUseCaseResult) objB2;
            userDetailsForProductsC = this.this$0.s.c(this.$bookingsRequestType);
            JobKt.e(getContext());
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                if (chaloUserBookingType2 == null) {
                    AnalyticsContractImplKt.b(this.this$0.t, "receipt data fetch success", Source.TICKET_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", this.$bookingsRequestType.toString()), new Pair("bookingId", this.$bookingsRequestType.f2317a)), false, 24);
                    this.this$0.E0(new vi1(i3, chaloUserBookingType2, (ChaloUseCaseResult.Success) chaloUseCaseResult, userDetailsForProductsC));
                    return unit;
                }
                bookingsRequestType = this.$bookingsRequestType;
                if (bookingsRequestType instanceof BookingsRequestType.SuperPassRideType) {
                    this.this$0.E0(new hi1(24));
                    return unit;
                }
                TicketSummaryComponent ticketSummaryComponent5 = this.this$0;
                ticketSummaryComponent5.E0(new vi1(i2, ticketSummaryComponent5, bookingsRequestType, userDetailsForProductsC));
                return unit;
            }
            if (chaloUserBookingType2 == null) {
                this.this$0.E0(new pg1(15, chaloUserBookingType2, userDetailsForProductsC));
                AnalyticsContractImplKt.b(this.this$0.t, "receipt data fetch failure", Source.TICKET_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", this.$bookingsRequestType.toString()), new Pair("bookingId", this.$bookingsRequestType.f2317a), new Pair("errorMessage", String.valueOf(((ReceiptFetchError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).getF6810a()))), false, 24);
                return unit;
            }
            bookingsRequestType2 = this.$bookingsRequestType;
            if (!(bookingsRequestType2 instanceof BookingsRequestType.MagicPassType) || (bookingsRequestType2 instanceof BookingsRequestType.RideBasedPassType) || (bookingsRequestType2 instanceof BookingsRequestType.ApplicationPassType) || (bookingsRequestType2 instanceof BookingsRequestType.PendingSuperPassType) || (bookingsRequestType2 instanceof BookingsRequestType.InstantTicketType) || (bookingsRequestType2 instanceof BookingsRequestType.MobileTicketType) || (bookingsRequestType2 instanceof BookingsRequestType.OndcTicketType) || (bookingsRequestType2 instanceof BookingsRequestType.OndcMetroTicketType) || (bookingsRequestType2 instanceof BookingsRequestType.PremiumBusTicketType) || (bookingsRequestType2 instanceof BookingsRequestType.QuickPayType) || (bookingsRequestType2 instanceof BookingsRequestType.MetroTicketType) || (bookingsRequestType2 instanceof BookingsRequestType.MultiModalGroupTicketType) || (bookingsRequestType2 instanceof BookingsRequestType.CardRechargeType)) {
                this.this$0.E0(new hi1(23));
                return unit;
            }
            if (bookingsRequestType2 instanceof BookingsRequestType.SuperPassRideType) {
                TicketSummaryComponent ticketSummaryComponent6 = this.this$0;
                ticketSummaryComponent6.E0(new pg1(14, ticketSummaryComponent6, bookingsRequestType2));
                return unit;
            }
            if (bookingsRequestType2 instanceof BookingsRequestType.CardTransactionReceiptType) {
                return unit;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent$createProductBookingTypeAndProceed$1(BookingsRequestType bookingsRequestType, TicketSummaryComponent ticketSummaryComponent, Continuation continuation) {
        super(2, continuation);
        this.$bookingsRequestType = bookingsRequestType;
        this.this$0 = ticketSummaryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketSummaryComponent$createProductBookingTypeAndProceed$1(this.$bookingsRequestType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketSummaryComponent$createProductBookingTypeAndProceed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            BookingsRequestType bookingsRequestType = this.$bookingsRequestType;
            if (bookingsRequestType == null) {
                this.this$0.E0(new hi1(22));
                return unit;
            }
            TicketSummaryComponent ticketSummaryComponent = this.this$0;
            BuildersKt.d(ticketSummaryComponent.j, null, null, new TicketSummaryComponent$fetchProductConfigForBranding$1(ticketSummaryComponent, bookingsRequestType.f2317a, null), 3);
            this.this$0.E0(new rp0(this.$bookingsRequestType, 1));
            if (this.this$0.s.a(this.$bookingsRequestType)) {
                GetRequestedBookedProductDataUseCase getRequestedBookedProductDataUseCase = this.this$0.l;
                BookingsRequestType bookingsRequestType2 = this.$bookingsRequestType;
                this.label = 2;
                obj = getRequestedBookedProductDataUseCase.b(bookingsRequestType2, UserBookingsStatusType.ALL, this);
                if (obj != coroutineSingletons) {
                }
            } else {
                TicketSummaryComponent ticketSummaryComponent2 = this.this$0;
                this.label = 1;
                if (TicketSummaryComponent.H0(ticketSummaryComponent2, this) != coroutineSingletons) {
                    return unit;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            return unit;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Flow flowM = FlowKt.m((Flow) obj);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$bookingsRequestType, this.this$0, null);
        this.label = 3;
        if (FlowKt.j(flowM, anonymousClass3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }
}
