package app.chalo.productsummary.ui.ticket;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.TicketReceiptFormatConfig;
import app.chalo.citydata.domain.GetRouteDataFromLocalOrRemoteUseCase;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductReceiptContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.data.BookingsRequestType;
import app.chalo.features.productsync.model.app.RideType;
import app.chalo.helper.BookingHelpConfigHelper;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.models.bookinghelp.BookingHelpAvailabilityAppModel;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetProductConfigInfoForPremiumBusProductIfActiveUseCase;
import app.chalo.productsummary.domain.FetchProductInvoiceUseCase;
import app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.resultstatemanager.booking.BookingHelpResultStateManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.BookingCancellationTarget;
import app.chalo.scenes.args.BookingHelpArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetProductConfigListFromAgencyUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import com.arkivanov.decompose.ComponentContext;
import defpackage.hi1;
import defpackage.sh1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryDataState;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryViewState;", "Lapp/chalo/productsummary/ui/ticket/TicketSummarySideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketSummaryComponent extends ChaloBaseStateMviComponent<TicketSummaryIntent, TicketSummaryDataState, TicketSummaryViewState, TicketSummarySideEffect> {
    public final ValidationSceneResolverUseCase A;
    public final FetchProductInvoiceUseCase B;
    public final SystemHelper C;
    public final GetProductConfigFromProductIdUseCase D;
    public final GetRouteDataFromLocalOrRemoteUseCase E;
    public final GetProductConfigListFromAgencyUseCase F;
    public final ChaloAppFeatureHelper G;
    public Job H;
    public Job I;
    public Job J;
    public final ComponentContext k;
    public final GetRequestedBookedProductDataUseCase l;
    public final StringProvider m;
    public final ActivateProductIfRequiredUseCase n;
    public final GetValidationProcessFlowDetailsForValidationProductUseCase o;
    public final BasicInfoContract p;
    public final GetProductConfigInfoForPremiumBusProductIfActiveUseCase q;
    public final GetPremiumReserveTicketByIdUseCase r;
    public final ProductReceiptContract s;
    public final AnalyticsContract t;
    public final TripSummaryUIStateFactory u;
    public final KotlinToastManager v;
    public final ChaloNavigationManager w;
    public final BookingHelpResultStateManager x;
    public final BookingHelpConfigHelper y;
    public final ProductsSyncContract z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent(TripSummaryArgs.TicketSummaryScreen args, ComponentContext componentContext, GetRequestedBookedProductDataUseCase getRequestedBookedProductDataUseCase, StringProvider stringProvider, ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase, GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase, BasicInfoContract basicInfoContract, GetProductConfigInfoForPremiumBusProductIfActiveUseCase getProductConfigInfoForPremiumBusProductIfActiveUseCase, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, ProductReceiptContract productReceiptContract, AnalyticsContract analyticsContract, TripSummaryUIStateFactory tripSummaryUIStateFactory, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, BookingHelpResultStateManager bookingHelpResultStateManager, BookingHelpConfigHelper bookingHelpConfigHelper, ProductsSyncContract productsSyncContract, ValidationSceneResolverUseCase validationSceneResolverUseCase, FetchProductInvoiceUseCase fetchProductInvoiceUseCase, SystemHelper systemHelper, GetProductConfigFromProductIdUseCase getProductConfigFromProductIdUseCase, GetRouteDataFromLocalOrRemoteUseCase getRouteDataFromLocalOrRemoteUseCase, GetProductConfigListFromAgencyUseCase getProductConfigListFromAgencyUseCase, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = componentContext;
        this.l = getRequestedBookedProductDataUseCase;
        this.m = stringProvider;
        this.n = activateProductIfRequiredUseCase;
        this.o = getValidationProcessFlowDetailsForValidationProductUseCase;
        this.p = basicInfoContract;
        this.q = getProductConfigInfoForPremiumBusProductIfActiveUseCase;
        this.r = getPremiumReserveTicketByIdUseCase;
        this.s = productReceiptContract;
        this.t = analyticsContract;
        this.u = tripSummaryUIStateFactory;
        this.v = kotlinToastManager;
        this.w = chaloNavigationManager;
        this.x = bookingHelpResultStateManager;
        this.y = bookingHelpConfigHelper;
        this.z = productsSyncContract;
        this.A = validationSceneResolverUseCase;
        this.B = fetchProductInvoiceUseCase;
        this.C = systemHelper;
        this.D = getProductConfigFromProductIdUseCase;
        this.E = getRouteDataFromLocalOrRemoteUseCase;
        this.F = getProductConfigListFromAgencyUseCase;
        this.G = chaloAppFeatureHelper;
        L0(new TicketSummaryIntent.InitializationIntent(args.d, args.c));
    }

    public static final ChaloUserBookingType.TicketBooking.PassRideBooking F0(TicketSummaryComponent ticketSummaryComponent, BookingsRequestType.SuperPassRideType superPassRideType) {
        ticketSummaryComponent.getClass();
        return new ChaloUserBookingType.TicketBooking.PassRideBooking(new SuperPassRideBookingAppModel(superPassRideType.c, RideType.SUPER_PASS_RIDE, superPassRideType.d, superPassRideType.e, null, null, null, null, null, EmptyList.f17557a, null, RouteNamingSchemeType.DEFAULT, null, null, null, null, null, null, null, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(TicketSummaryComponent ticketSummaryComponent, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        TicketSummaryComponent$handleSupportClickedIntent$1 ticketSummaryComponent$handleSupportClickedIntent$1;
        KotlinToastManager kotlinToastManager;
        ticketSummaryComponent.getClass();
        if (continuationImpl instanceof TicketSummaryComponent$handleSupportClickedIntent$1) {
            ticketSummaryComponent$handleSupportClickedIntent$1 = (TicketSummaryComponent$handleSupportClickedIntent$1) continuationImpl;
            int i = ticketSummaryComponent$handleSupportClickedIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketSummaryComponent$handleSupportClickedIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketSummaryComponent$handleSupportClickedIntent$1 = new TicketSummaryComponent$handleSupportClickedIntent$1(ticketSummaryComponent, continuationImpl);
            }
        } else {
            ticketSummaryComponent$handleSupportClickedIntent$1 = new TicketSummaryComponent$handleSupportClickedIntent$1(ticketSummaryComponent, continuationImpl);
        }
        Object objB = ticketSummaryComponent$handleSupportClickedIntent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketSummaryComponent$handleSupportClickedIntent$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            AnalyticsContract analyticsContract = ticketSummaryComponent.t;
            Source source = Source.TICKET_SUMMARY_SCREEN;
            String str = chaloUserBookingType.b;
            String str2 = chaloUserBookingType.f2987a;
            String str3 = chaloUserBookingType.c;
            boolean z = false;
            AnalyticsContractImplKt.b(analyticsContract, "ticket summary screen help button clicked", source, MapsKt.i(new Pair("productType", str), new Pair("productSubType", str3)), false, 24);
            List list = ((TicketSummaryDataState) ticketSummaryComponent.f.getValue()).n;
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    BookingHelpConfigHelper bookingHelpConfigHelper = ticketSummaryComponent.y;
                    String str4 = chaloUserBookingType.b;
                    if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) ? !(!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) || ((ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) chaloUserBookingType).e == null) : ((ChaloUserBookingType.TicketBooking.InstantTicketBooking) chaloUserBookingType).e != null) {
                        z = true;
                    }
                    bookingHelpConfigHelper.getClass();
                    BookingCancellationTarget bookingCancellationTargetB = BookingHelpConfigHelper.b(str4, str3, str2, z);
                    if (bookingCancellationTargetB != null) {
                        Job job = ticketSummaryComponent.I;
                        if (job == null || !((AbstractCoroutine) job).isActive()) {
                            ticketSummaryComponent.I = BuildersKt.d(ticketSummaryComponent.j, null, null, new TicketSummaryComponent$listenForBookingCancellation$1(ticketSummaryComponent, str2, null), 3);
                        }
                        ticketSummaryComponent.w.b(new ChaloNavigationRequest.Navigate(new BookingHelpArgs(list, bookingCancellationTargetB), null, null, 6));
                    }
                    return unit;
                }
            }
            KotlinToastManager kotlinToastManager2 = ticketSummaryComponent.v;
            ticketSummaryComponent$handleSupportClickedIntent$1.L$0 = kotlinToastManager2;
            ticketSummaryComponent$handleSupportClickedIntent$1.label = 1;
            objB = ticketSummaryComponent.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], ticketSummaryComponent$handleSupportClickedIntent$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) ticketSummaryComponent$handleSupportClickedIntent$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(TicketSummaryComponent ticketSummaryComponent, ContinuationImpl continuationImpl) {
        TicketSummaryComponent$processInvalidState$1 ticketSummaryComponent$processInvalidState$1;
        KotlinToastManager kotlinToastManager;
        ticketSummaryComponent.getClass();
        if (continuationImpl instanceof TicketSummaryComponent$processInvalidState$1) {
            ticketSummaryComponent$processInvalidState$1 = (TicketSummaryComponent$processInvalidState$1) continuationImpl;
            int i = ticketSummaryComponent$processInvalidState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketSummaryComponent$processInvalidState$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketSummaryComponent$processInvalidState$1 = new TicketSummaryComponent$processInvalidState$1(ticketSummaryComponent, continuationImpl);
            }
        } else {
            ticketSummaryComponent$processInvalidState$1 = new TicketSummaryComponent$processInvalidState$1(ticketSummaryComponent, continuationImpl);
        }
        Object obj = ticketSummaryComponent$processInvalidState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketSummaryComponent$processInvalidState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ticketSummaryComponent.E0(new hi1(19));
            KotlinToastManager kotlinToastManager2 = ticketSummaryComponent.v;
            ticketSummaryComponent$processInvalidState$1.L$0 = kotlinToastManager2;
            ticketSummaryComponent$processInvalidState$1.label = 1;
            Object objB = ticketSummaryComponent.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], ticketSummaryComponent$processInvalidState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) ticketSummaryComponent$processInvalidState$1.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        ticketSummaryComponent.w.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object I0(TicketSummaryComponent ticketSummaryComponent, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        TicketSummaryComponent$setBookingHelpFaqsIfApplicable$1 ticketSummaryComponent$setBookingHelpFaqsIfApplicable$1;
        String str;
        ticketSummaryComponent.getClass();
        if (continuationImpl instanceof TicketSummaryComponent$setBookingHelpFaqsIfApplicable$1) {
            ticketSummaryComponent$setBookingHelpFaqsIfApplicable$1 = (TicketSummaryComponent$setBookingHelpFaqsIfApplicable$1) continuationImpl;
            int i = ticketSummaryComponent$setBookingHelpFaqsIfApplicable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketSummaryComponent$setBookingHelpFaqsIfApplicable$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketSummaryComponent$setBookingHelpFaqsIfApplicable$1 = new TicketSummaryComponent$setBookingHelpFaqsIfApplicable$1(ticketSummaryComponent, continuationImpl);
            }
        } else {
            ticketSummaryComponent$setBookingHelpFaqsIfApplicable$1 = new TicketSummaryComponent$setBookingHelpFaqsIfApplicable$1(ticketSummaryComponent, continuationImpl);
        }
        TicketSummaryComponent$setBookingHelpFaqsIfApplicable$1 ticketSummaryComponent$setBookingHelpFaqsIfApplicable$2 = ticketSummaryComponent$setBookingHelpFaqsIfApplicable$1;
        Object objA = ticketSummaryComponent$setBookingHelpFaqsIfApplicable$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketSummaryComponent$setBookingHelpFaqsIfApplicable$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            List list = ((TicketSummaryDataState) ticketSummaryComponent.f.getValue()).n;
            if ((list == null || list.isEmpty()) && chaloUserBookingType != null && (str = chaloUserBookingType.b) != null) {
                BookingHelpConfigHelper bookingHelpConfigHelper = ticketSummaryComponent.y;
                String str2 = chaloUserBookingType.c;
                boolean z = !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) ? !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) || ((ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) chaloUserBookingType).e == null : ((ChaloUserBookingType.TicketBooking.InstantTicketBooking) chaloUserBookingType).e == null;
                ticketSummaryComponent$setBookingHelpFaqsIfApplicable$2.label = 1;
                objA = bookingHelpConfigHelper.a(str, str2, "", ticketSummaryComponent$setBookingHelpFaqsIfApplicable$2, z);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA);
        BookingHelpAvailabilityAppModel bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) objA;
        if (bookingHelpAvailabilityAppModel != null) {
            ticketSummaryComponent.E0(new sh1(bookingHelpAvailabilityAppModel, 3));
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r1 == r5) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J0(app.chalo.productsummary.ui.ticket.TicketSummaryComponent r16, app.chalo.home.domain.ChaloUserBookingType r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.ticket.TicketSummaryComponent.J0(app.chalo.productsummary.ui.ticket.TicketSummaryComponent, app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object K0(TicketSummaryComponent ticketSummaryComponent, ChaloUserBookingType.TicketBooking.PremiumBusBooking premiumBusBooking, ContinuationImpl continuationImpl) {
        TicketSummaryComponent$startPremiumBusActivationFlow$1 ticketSummaryComponent$startPremiumBusActivationFlow$1;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        long j;
        ticketSummaryComponent.getClass();
        if (continuationImpl instanceof TicketSummaryComponent$startPremiumBusActivationFlow$1) {
            ticketSummaryComponent$startPremiumBusActivationFlow$1 = (TicketSummaryComponent$startPremiumBusActivationFlow$1) continuationImpl;
            int i = ticketSummaryComponent$startPremiumBusActivationFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketSummaryComponent$startPremiumBusActivationFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketSummaryComponent$startPremiumBusActivationFlow$1 = new TicketSummaryComponent$startPremiumBusActivationFlow$1(ticketSummaryComponent, continuationImpl);
            }
        } else {
            ticketSummaryComponent$startPremiumBusActivationFlow$1 = new TicketSummaryComponent$startPremiumBusActivationFlow$1(ticketSummaryComponent, continuationImpl);
        }
        Object objC = ticketSummaryComponent$startPremiumBusActivationFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketSummaryComponent$startPremiumBusActivationFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            AnalyticsContractImplKt.b(ticketSummaryComponent.t, "start premium product validation", Source.TICKET_SUMMARY_SCREEN, MapsKt.i(new Pair("bookingId", premiumBusBooking.f2987a), new Pair("productType", premiumBusBooking.b), new Pair("productSubType", premiumBusBooking.c)), false, 24);
            ticketSummaryComponent.E0(new hi1(15));
            premiumReserveTicketAppModel = premiumBusBooking.d;
            if (premiumReserveTicketAppModel.f7113a.h == PremiumReserveTicketStatus.ACTIVE) {
                long j2 = premiumReserveTicketAppModel.c.c;
                BasicInfoContract basicInfoContract = ticketSummaryComponent.p;
                ticketSummaryComponent$startPremiumBusActivationFlow$1.L$0 = premiumReserveTicketAppModel;
                ticketSummaryComponent$startPremiumBusActivationFlow$1.L$1 = premiumReserveTicketAppModel;
                ticketSummaryComponent$startPremiumBusActivationFlow$1.J$0 = j2;
                ticketSummaryComponent$startPremiumBusActivationFlow$1.label = 1;
                objC = basicInfoContract.c(ticketSummaryComponent$startPremiumBusActivationFlow$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j = j2;
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = ticketSummaryComponent$startPremiumBusActivationFlow$1.J$0;
        premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) ticketSummaryComponent$startPremiumBusActivationFlow$1.L$1;
        ResultKt.b(objC);
        if (j > ((Number) objC).longValue()) {
            ChaloNavigationManager chaloNavigationManager = ticketSummaryComponent.w;
            PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusActivationArgs(Source.TICKET_SUMMARY_SCREEN, premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e, false), null, null, 6));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (((app.chalo.productsummary.ui.ticket.TicketSummaryScreenType.Success.CommonReceipt) r12).b != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (((app.chalo.productsummary.ui.ticket.TicketSummaryScreenType.Success.BMTCReceipt) r12).f8824a.d != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        L0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(app.chalo.productsummary.ui.ticket.TicketSummaryIntent r12) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.ticket.TicketSummaryComponent.L0(app.chalo.productsummary.ui.ticket.TicketSummaryIntent):void");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        TicketSummaryComponent$convertToUiState$2 ticketSummaryComponent$convertToUiState$2 = new TicketSummaryComponent$convertToUiState$2(1, this, TicketSummaryComponent.class, "processIntent", "processIntent(Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;)V", 0);
        return this.u.b((TicketSummaryDataState) obj, ticketSummaryComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new TicketSummaryDataState(Source.UNKNOWN, false, false, false, null, null, null, null, null, null, null, false, EmptySet.f17559a, null, TicketReceiptFormatConfig.COMMON);
    }
}
