package app.chalo.productsummary.ui.pass;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState;
import app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase;
import app.chalo.productsummary.ui.pass.PassSummaryDataState;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import defpackage.do0;
import defpackage.hq0;
import defpackage.rp0;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.pass.PassSummaryComponent$createProductBookingTypeAndProceed$1", f = "PassSummaryComponent.kt", l = {217, 217, 228, 248, 262}, m = "invokeSuspend", v = 1)
final class PassSummaryComponent$createProductBookingTypeAndProceed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BookingsRequestType $requestType;
    Object L$0;
    int label;
    final /* synthetic */ PassSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSummaryComponent$createProductBookingTypeAndProceed$1(BookingsRequestType bookingsRequestType, PassSummaryComponent passSummaryComponent, Continuation continuation) {
        super(2, continuation);
        this.$requestType = bookingsRequestType;
        this.this$0 = passSummaryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSummaryComponent$createProductBookingTypeAndProceed$1(this.$requestType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSummaryComponent$createProductBookingTypeAndProceed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0147  */
    /* JADX WARN: Code duplicated, block: B:43:0x014b  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:49:0x016b  */
    /* JADX WARN: Code duplicated, block: B:51:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0181  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0193  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objV;
        final ChaloUserBookingType chaloUserBookingType;
        PassSummaryComponent passSummaryComponent;
        BookingsRequestType bookingsRequestType;
        Object objB2;
        final ChaloUserBookingType chaloUserBookingType2;
        Object objB3;
        final ChaloUserBookingType chaloUserBookingType3;
        KotlinToastManager kotlinToastManager;
        Object objB4;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 0;
        Unit unit = Unit.f17538a;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        if (i == 0) {
            ResultKt.b(obj);
            BookingsRequestType bookingsRequestType2 = this.$requestType;
            if (bookingsRequestType2 == null) {
                this.this$0.E0(new do0(19));
                return unit;
            }
            this.this$0.E0(new rp0(bookingsRequestType2, 0));
            GetRequestedBookedProductDataUseCase getRequestedBookedProductDataUseCase = this.this$0.l;
            BookingsRequestType bookingsRequestType3 = this.$requestType;
            this.label = 1;
            objB = getRequestedBookedProductDataUseCase.b(bookingsRequestType3, UserBookingsStatusType.ALL, this);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlinToastManager2 = (KotlinToastManager) this.L$0;
                    ResultKt.b(obj);
                    objB4 = obj;
                    hq0.s(kotlinToastManager2, (String) objB4);
                    this.this$0.t.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                    return unit;
                }
                if (i == 4) {
                    chaloUserBookingType3 = (ChaloUserBookingType) this.L$0;
                    ResultKt.b(obj);
                    objB3 = obj;
                    final DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState = (DownloadInvoiceOptionVisibilityState) objB3;
                    this.this$0.E0(new Function1() { // from class: sp0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    break;
                            }
                            return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType3, null, downloadInvoiceOptionVisibilityState, null, 174);
                        }
                    });
                    return unit;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloUserBookingType2 = (ChaloUserBookingType) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                final DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState2 = (DownloadInvoiceOptionVisibilityState) objB2;
                this.this$0.E0(new Function1() { // from class: sp0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i5) {
                            case 0:
                                break;
                        }
                        return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType2, null, downloadInvoiceOptionVisibilityState2, null, 174);
                    }
                });
                return unit;
            }
            ResultKt.b(obj);
            objV = obj;
            chaloUserBookingType = (ChaloUserBookingType) objV;
            passSummaryComponent = this.this$0;
            bookingsRequestType = this.$requestType;
            if (chaloUserBookingType == null) {
                AnalyticsContractImplKt.b(passSummaryComponent.p, "product data fetch failure", Source.PASS_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", bookingsRequestType.toString()), new Pair("bookingId", bookingsRequestType.f2317a)), false, 24);
            } else {
                AnalyticsContractImplKt.b(passSummaryComponent.p, "product data fetch success", Source.PASS_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", bookingsRequestType.toString()), new Pair("bookingId", bookingsRequestType.f2317a)), false, 24);
            }
            if (chaloUserBookingType == null) {
                if (((PassSummaryDataState) this.this$0.f.getValue()).h == Source.DEEPLINK_PRODUCT) {
                    this.this$0.E0(new do0(20));
                    return unit;
                }
                PassSummaryComponent passSummaryComponent2 = this.this$0;
                kotlinToastManager = passSummaryComponent2.s;
                StringProvider stringProvider = passSummaryComponent2.m;
                StringEnum stringEnum = StringEnum.PASS_DATA_NOT_AVAILABLE_X;
                Object[] objArr = {this.$requestType.f2317a};
                this.L$0 = kotlinToastManager;
                this.label = 3;
                objB4 = stringProvider.b(stringEnum, objArr, this);
                if (objB4 != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    hq0.s(kotlinToastManager2, (String) objB4);
                    this.this$0.t.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                    return unit;
                }
            } else if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
                this.L$0 = chaloUserBookingType;
                this.label = 4;
                objB3 = this.this$0.w.b((ChaloUserBookingType.SuperPassBooking) chaloUserBookingType, this);
                if (objB3 != coroutineSingletons) {
                    chaloUserBookingType3 = chaloUserBookingType;
                    final DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState3 = (DownloadInvoiceOptionVisibilityState) objB3;
                    this.this$0.E0(new Function1() { // from class: sp0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    break;
                            }
                            return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType3, null, downloadInvoiceOptionVisibilityState3, null, 174);
                        }
                    });
                    return unit;
                }
            } else {
                if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
                    if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) {
                        this.this$0.E0(new Function1() { // from class: tp0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i2) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                }
                                return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                            }
                        });
                        return unit;
                    }
                    if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) {
                        this.this$0.E0(new Function1() { // from class: tp0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i5) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                }
                                return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                            }
                        });
                        return unit;
                    }
                    if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking) {
                        this.this$0.E0(new Function1() { // from class: tp0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i4) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                }
                                return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                            }
                        });
                        return unit;
                    }
                    if ((chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.E0(new Function1() { // from class: tp0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i3) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    break;
                            }
                            return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                        }
                    });
                    return unit;
                }
                this.L$0 = chaloUserBookingType;
                this.label = 5;
                objB2 = this.this$0.w.b((ChaloUserBookingType.SuperPassBooking) chaloUserBookingType, this);
                if (objB2 != coroutineSingletons) {
                    chaloUserBookingType2 = chaloUserBookingType;
                    final DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState4 = (DownloadInvoiceOptionVisibilityState) objB2;
                    this.this$0.E0(new Function1() { // from class: sp0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i5) {
                                case 0:
                                    break;
                            }
                            return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType2, null, downloadInvoiceOptionVisibilityState4, null, 174);
                        }
                    });
                    return unit;
                }
            }
            return coroutineSingletons;
        }
        ResultKt.b(obj);
        objB = obj;
        this.label = 2;
        objV = FlowKt.v((Flow) objB, this);
        if (objV != coroutineSingletons) {
            chaloUserBookingType = (ChaloUserBookingType) objV;
            passSummaryComponent = this.this$0;
            bookingsRequestType = this.$requestType;
            if (chaloUserBookingType == null) {
                AnalyticsContractImplKt.b(passSummaryComponent.p, "product data fetch failure", Source.PASS_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", bookingsRequestType.toString()), new Pair("bookingId", bookingsRequestType.f2317a)), false, 24);
            } else {
                AnalyticsContractImplKt.b(passSummaryComponent.p, "product data fetch success", Source.PASS_SUMMARY_SCREEN, MapsKt.i(new Pair("ticketRequestType", bookingsRequestType.toString()), new Pair("bookingId", bookingsRequestType.f2317a)), false, 24);
            }
            if (chaloUserBookingType == null) {
                if (((PassSummaryDataState) this.this$0.f.getValue()).h == Source.DEEPLINK_PRODUCT) {
                    this.this$0.E0(new do0(20));
                    return unit;
                }
                PassSummaryComponent passSummaryComponent3 = this.this$0;
                kotlinToastManager = passSummaryComponent3.s;
                StringProvider stringProvider2 = passSummaryComponent3.m;
                StringEnum stringEnum2 = StringEnum.PASS_DATA_NOT_AVAILABLE_X;
                Object[] objArr2 = {this.$requestType.f2317a};
                this.L$0 = kotlinToastManager;
                this.label = 3;
                objB4 = stringProvider2.b(stringEnum2, objArr2, this);
                if (objB4 != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    hq0.s(kotlinToastManager2, (String) objB4);
                    this.this$0.t.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                    return unit;
                }
            } else if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
                this.L$0 = chaloUserBookingType;
                this.label = 4;
                objB3 = this.this$0.w.b((ChaloUserBookingType.SuperPassBooking) chaloUserBookingType, this);
                if (objB3 != coroutineSingletons) {
                    chaloUserBookingType3 = chaloUserBookingType;
                    final DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState5 = (DownloadInvoiceOptionVisibilityState) objB3;
                    this.this$0.E0(new Function1() { // from class: sp0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    break;
                            }
                            return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType3, null, downloadInvoiceOptionVisibilityState5, null, 174);
                        }
                    });
                    return unit;
                }
            } else {
                if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
                    if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) {
                        this.this$0.E0(new Function1() { // from class: tp0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i2) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                }
                                return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                            }
                        });
                        return unit;
                    }
                    if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) {
                        this.this$0.E0(new Function1() { // from class: tp0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i5) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                }
                                return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                            }
                        });
                        return unit;
                    }
                    if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking) {
                        this.this$0.E0(new Function1() { // from class: tp0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i4) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                }
                                return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                            }
                        });
                        return unit;
                    }
                    if (chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) {
                    }
                    this.this$0.E0(new Function1() { // from class: tp0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i3) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    break;
                            }
                            return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType, null, null, null, 238);
                        }
                    });
                    return unit;
                }
                this.L$0 = chaloUserBookingType;
                this.label = 5;
                objB2 = this.this$0.w.b((ChaloUserBookingType.SuperPassBooking) chaloUserBookingType, this);
                if (objB2 != coroutineSingletons) {
                    chaloUserBookingType2 = chaloUserBookingType;
                    final DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState6 = (DownloadInvoiceOptionVisibilityState) objB2;
                    this.this$0.E0(new Function1() { // from class: sp0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i5) {
                                case 0:
                                    break;
                            }
                            return PassSummaryDataState.a((PassSummaryDataState) obj2, false, false, null, chaloUserBookingType2, null, downloadInvoiceOptionVisibilityState6, null, 174);
                        }
                    });
                    return unit;
                }
            }
        }
        return coroutineSingletons;
    }
}
