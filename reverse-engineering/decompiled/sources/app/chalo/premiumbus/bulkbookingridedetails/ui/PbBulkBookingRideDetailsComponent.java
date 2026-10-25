package app.chalo.premiumbus.bulkbookingridedetails.ui;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.BookingsRequestType;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.ActivePremiumBusTicketsHelper;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.domain.FetchAllPremiumReserveTicketsBookedThroughPassUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.domain.FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateChangesUseCase;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetProductConfigInfoForPremiumBusProductIfActiveUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import app.chalo.superpass.data.models.entities.RideRollOverBannerCta;
import app.chalo.superpass.data.models.entities.RideRollOverBannerCtaActionType;
import app.chalo.superpass.data.models.entities.RideRollOverMeta;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.usecase.ChaloCustomDateFormat;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.GetTodayOrTomorrowOrDateUseCase;
import app.chalo.usecase.HandlePremiumPassRenewFlowUseCase;
import app.chalo.usecase.MillisAfterTimeFormatType;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.mq0;
import defpackage.vo1;
import defpackage.ym0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewState;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDataState;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PbBulkBookingRideDetailsComponent extends ChaloBaseStateMviComponent<PbBulkBookingRideDetailsViewIntent, PbBulkBookingRideDetailsViewState, PbBulkBookingRideDetailsViewState, PbBulkBookingRideDetailsSideEffect> {
    public final CheckIfContinueWithBulkBookingFlowUseCase A;
    public final ChaloTimeProvider B;
    public final UpdatePassStartDateChangesUseCase C;
    public final FetchCompleteProductConfigByIdUseCase D;
    public final GetPremiumBusCurrentCityConfigUseCase E;
    public final HandlePremiumPassRenewFlowUseCase F;
    public final MutexImpl G;
    public final MutexImpl H;
    public final MutexImpl I;
    public Job J;
    public Job K;
    public Job L;
    public Job M;
    public Job N;
    public final ArrayList O;
    public final int P;
    public boolean Q;
    public List R;
    public final ArrayList S;
    public final GetTimeInMillisAfterXTimeUseCase k;
    public final BasicInfoContract l;
    public final TimeUtilsContract m;
    public final GetTodayOrTomorrowOrDateUseCase n;
    public final FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase o;
    public final FormatTimeInMillisToGivenFormatUseCase p;
    public final SuperPassRepository q;
    public final StringProvider r;
    public final AnalyticsContract s;
    public final CoroutineContextProvider t;
    public final FetchAllPremiumReserveTicketsBookedThroughPassUseCase u;
    public final GetProductConfigInfoForPremiumBusProductIfActiveUseCase v;
    public final GetPremiumReserveTicketByIdUseCase w;
    public final KotlinToastManager x;
    public final SystemHelper y;
    public final ChaloNavigationManager z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6906a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[SuperPassSubTypes.values().length];
            try {
                iArr[SuperPassSubTypes.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassSubTypes.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassSubTypes.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6906a = iArr;
            int[] iArr2 = new int[BannerStatus.values().length];
            try {
                iArr2[BannerStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BannerStatus.IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BannerStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BannerStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[RideRollOverBannerCtaActionType.values().length];
            try {
                iArr3[RideRollOverBannerCtaActionType.CALL_CUSTOMER_CARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[RideRollOverBannerCtaActionType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
            int[] iArr4 = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr4[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.PAYMENT_PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.PAYMENT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.USER_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.SYSTEM_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.USER_RESCHEDULED.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.SYSTEM_RESCHEDULED.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.EXPIRED.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.BOOKING_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            d = iArr4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent(ComponentContext componentContext, PbBulkBookingRideDetailsArgs args, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, GetTodayOrTomorrowOrDateUseCase getTodayOrTomorrowOrDateUseCase, FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase, SuperPassRepository superPassRepository, StringProvider stringProvider, AnalyticsContract analyticsContract, CoroutineContextProvider coroutineContextProvider, FetchAllPremiumReserveTicketsBookedThroughPassUseCase fetchAllPremiumReserveTicketsBookedThroughPassUseCase, GetProductConfigInfoForPremiumBusProductIfActiveUseCase getProductConfigInfoForPremiumBusProductIfActiveUseCase, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, KotlinToastManager kotlinToastManager, SystemHelper systemHelper, ChaloNavigationManager chaloNavigationManager, CheckIfContinueWithBulkBookingFlowUseCase checkIfContinueWithBulkBookingFlowUseCase, ChaloTimeProvider chaloTimeProvider, UpdatePassStartDateChangesUseCase updatePassStartDateChangesUseCase, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, HandlePremiumPassRenewFlowUseCase handlePremiumPassRenewFlowUseCase) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = getTimeInMillisAfterXTimeUseCase;
        this.l = basicInfoContract;
        this.m = timeUtilsContract;
        this.n = getTodayOrTomorrowOrDateUseCase;
        this.o = fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase;
        this.p = formatTimeInMillisToGivenFormatUseCase;
        this.q = superPassRepository;
        this.r = stringProvider;
        this.s = analyticsContract;
        this.t = coroutineContextProvider;
        this.u = fetchAllPremiumReserveTicketsBookedThroughPassUseCase;
        this.v = getProductConfigInfoForPremiumBusProductIfActiveUseCase;
        this.w = getPremiumReserveTicketByIdUseCase;
        this.x = kotlinToastManager;
        this.y = systemHelper;
        this.z = chaloNavigationManager;
        this.A = checkIfContinueWithBulkBookingFlowUseCase;
        this.B = chaloTimeProvider;
        this.C = updatePassStartDateChangesUseCase;
        this.D = fetchCompleteProductConfigByIdUseCase;
        this.E = getPremiumBusCurrentCityConfigUseCase;
        this.F = handlePremiumPassRenewFlowUseCase;
        this.G = MutexKt.a();
        this.H = MutexKt.a();
        this.I = MutexKt.a();
        this.O = new ArrayList();
        this.P = 3;
        this.R = EmptyList.f17557a;
        this.S = new ArrayList();
        S0(new PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent(args.b, args.c, args.d, args.e, args.f));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02df  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:114:0x038e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0395  */
    /* JADX WARN: Code duplicated, block: B:119:0x0398  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:123:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x0417  */
    /* JADX WARN: Code duplicated, block: B:135:0x044b  */
    /* JADX WARN: Code duplicated, block: B:138:0x046e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0276  */
    /* JADX WARN: Code duplicated, block: B:70:0x0297  */
    /* JADX WARN: Code duplicated, block: B:72:0x029b  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x02be  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x02da  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x020c, code lost:
    
        if (r5 == r9) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x025d, code lost:
    
        if (r5 == r9) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028b, code lost:
    
        if (r4 == r9) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(final app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r35, java.lang.String r36, app.chalo.models.SuperPassSubTypes r37, boolean r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent.F0(app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent, java.lang.String, app.chalo.models.SuperPassSubTypes, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cc -> B:40:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(final app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r9, java.util.List r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent.G0(app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final long H0(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, PremiumReserveTicketAppModel premiumReserveTicketAppModel) {
        pbBulkBookingRideDetailsComponent.getClass();
        switch (WhenMappings.d[premiumReserveTicketAppModel.f7113a.h.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
                return premiumReserveTicketAppModel.b.b;
            case 6:
            case 7:
                return premiumReserveTicketAppModel.f7113a.b;
            case 10:
                return premiumReserveTicketAppModel.c.c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c5 -> B:36:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object I0(app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r8, java.util.List r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent.I0(app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:39:0x00eb, B:40:0x00f6, B:42:0x00fc, B:46:0x010d, B:49:0x0113, B:51:0x011c), top: B:57:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011c A[Catch: all -> 0x0111, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:39:0x00eb, B:40:0x00f6, B:42:0x00fc, B:46:0x010d, B:49:0x0113, B:51:0x011c), top: B:57:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object J0(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, List list, ContinuationImpl continuationImpl) {
        PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1 pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1;
        List list2;
        List list3;
        GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase;
        long jA;
        GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase2;
        long j;
        long jA2;
        MutexImpl mutexImpl;
        Mutex mutex;
        List list4;
        long j2;
        long j3;
        ArrayList arrayList;
        int size;
        int i;
        long j4;
        BasicInfoContract basicInfoContract = pbBulkBookingRideDetailsComponent.l;
        GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase3 = pbBulkBookingRideDetailsComponent.k;
        if (continuationImpl instanceof PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1) {
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1 = (PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1) continuationImpl;
            int i2 = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = i2 - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1 = new PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1(pbBulkBookingRideDetailsComponent, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1 = new PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1(pbBulkBookingRideDetailsComponent, continuationImpl);
        }
        Object objC = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label;
        Unit unit = Unit.f17538a;
        if (i3 == 0) {
            ResultKt.b(objC);
            if (list.isEmpty()) {
                return unit;
            }
            list2 = list;
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0 = list2;
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = 1;
            if (pbBulkBookingRideDetailsComponent.K0(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1) != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            List list5 = (List) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0;
            ResultKt.b(objC);
            list2 = list5;
        } else {
            if (i3 == 2) {
                GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase4 = (GetTimeInMillisAfterXTimeUseCase) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1;
                List list6 = (List) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0;
                ResultKt.b(objC);
                getTimeInMillisAfterXTimeUseCase = getTimeInMillisAfterXTimeUseCase4;
                list3 = list6;
                jA = getTimeInMillisAfterXTimeUseCase.a(((Number) objC).longValue(), 0L, MillisAfterTimeFormatType.START_OF_DAY);
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0 = list3;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1 = getTimeInMillisAfterXTimeUseCase3;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$0 = jA;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = 3;
                objC = basicInfoContract.c(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1);
                if (objC != obj) {
                    getTimeInMillisAfterXTimeUseCase2 = getTimeInMillisAfterXTimeUseCase3;
                    j = jA;
                    jA2 = getTimeInMillisAfterXTimeUseCase2.a(((Number) objC).longValue(), CalendarModelKt.MillisecondsIn24Hours, MillisAfterTimeFormatType.END_OF_DAY);
                    mutexImpl = pbBulkBookingRideDetailsComponent.H;
                    pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0 = list3;
                    pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1 = mutexImpl;
                    pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$0 = j;
                    pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$1 = jA2;
                    pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = 4;
                    if (mutexImpl.a(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1) != obj) {
                        mutex = mutexImpl;
                        list4 = list3;
                        j2 = j;
                        j3 = jA2;
                    }
                }
                return obj;
            }
            if (i3 == 3) {
                j = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$0;
                GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase5 = (GetTimeInMillisAfterXTimeUseCase) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1;
                List list7 = (List) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0;
                ResultKt.b(objC);
                getTimeInMillisAfterXTimeUseCase2 = getTimeInMillisAfterXTimeUseCase5;
                list3 = list7;
                jA2 = getTimeInMillisAfterXTimeUseCase2.a(((Number) objC).longValue(), CalendarModelKt.MillisecondsIn24Hours, MillisAfterTimeFormatType.END_OF_DAY);
                mutexImpl = pbBulkBookingRideDetailsComponent.H;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0 = list3;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1 = mutexImpl;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$0 = j;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$1 = jA2;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = 4;
                if (mutexImpl.a(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1) != obj) {
                    mutex = mutexImpl;
                    list4 = list3;
                    j2 = j;
                    j3 = jA2;
                }
                return obj;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$1;
            j2 = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$0;
            mutex = (Mutex) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1;
            list4 = (List) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0;
            ResultKt.b(objC);
        }
        try {
            arrayList = new ArrayList();
            for (Object obj2 : list4) {
                j4 = ((PremiumBusBulkBookingUpcomingRidesCardData) obj2).o;
                if (j2 > j4 && j4 <= j3) {
                    arrayList.add(obj2);
                }
            }
            pbBulkBookingRideDetailsComponent.R = arrayList;
            size = arrayList.size();
            i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                pbBulkBookingRideDetailsComponent.S.add(BuildersKt.d(pbBulkBookingRideDetailsComponent.j, pbBulkBookingRideDetailsComponent.t.getDefault(), null, new PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1(new ActivePremiumBusTicketsHelper(), (PremiumBusBulkBookingUpcomingRidesCardData) obj3, pbBulkBookingRideDetailsComponent, null), 2));
            }
            return unit;
        } finally {
            mutex.e(null);
        }
        pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0 = list2;
        pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1 = getTimeInMillisAfterXTimeUseCase3;
        pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = 2;
        Object objC2 = basicInfoContract.c(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1);
        if (objC2 != obj) {
            list3 = list2;
            objC = objC2;
            getTimeInMillisAfterXTimeUseCase = getTimeInMillisAfterXTimeUseCase3;
            jA = getTimeInMillisAfterXTimeUseCase.a(((Number) objC).longValue(), 0L, MillisAfterTimeFormatType.START_OF_DAY);
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0 = list3;
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1 = getTimeInMillisAfterXTimeUseCase3;
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$0 = jA;
            pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = 3;
            objC = basicInfoContract.c(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1);
            if (objC != obj) {
                getTimeInMillisAfterXTimeUseCase2 = getTimeInMillisAfterXTimeUseCase3;
                j = jA;
                jA2 = getTimeInMillisAfterXTimeUseCase2.a(((Number) objC).longValue(), CalendarModelKt.MillisecondsIn24Hours, MillisAfterTimeFormatType.END_OF_DAY);
                mutexImpl = pbBulkBookingRideDetailsComponent.H;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$0 = list3;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.L$1 = mutexImpl;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$0 = j;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.J$1 = jA2;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1.label = 4;
                if (mutexImpl.a(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$1) != obj) {
                    mutex = mutexImpl;
                    list4 = list3;
                    j2 = j;
                    j3 = jA2;
                    arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        j4 = ((PremiumBusBulkBookingUpcomingRidesCardData) obj2).o;
                        if (j2 > j4) {
                        }
                    }
                    pbBulkBookingRideDetailsComponent.R = arrayList;
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj4 = arrayList.get(i);
                        i++;
                        pbBulkBookingRideDetailsComponent.S.add(BuildersKt.d(pbBulkBookingRideDetailsComponent.j, pbBulkBookingRideDetailsComponent.t.getDefault(), null, new PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1(new ActivePremiumBusTicketsHelper(), (PremiumBusBulkBookingUpcomingRidesCardData) obj4, pbBulkBookingRideDetailsComponent, null), 2));
                    }
                    return unit;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(ContinuationImpl continuationImpl) {
        PbBulkBookingRideDetailsComponent$clearPollingResources$1 pbBulkBookingRideDetailsComponent$clearPollingResources$1;
        Mutex mutex;
        if (continuationImpl instanceof PbBulkBookingRideDetailsComponent$clearPollingResources$1) {
            pbBulkBookingRideDetailsComponent$clearPollingResources$1 = (PbBulkBookingRideDetailsComponent$clearPollingResources$1) continuationImpl;
            int i = pbBulkBookingRideDetailsComponent$clearPollingResources$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsComponent$clearPollingResources$1.label = i - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsComponent$clearPollingResources$1 = new PbBulkBookingRideDetailsComponent$clearPollingResources$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsComponent$clearPollingResources$1 = new PbBulkBookingRideDetailsComponent$clearPollingResources$1(this, continuationImpl);
        }
        Object obj = pbBulkBookingRideDetailsComponent$clearPollingResources$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbBulkBookingRideDetailsComponent$clearPollingResources$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.I;
            pbBulkBookingRideDetailsComponent$clearPollingResources$1.L$0 = mutexImpl;
            pbBulkBookingRideDetailsComponent$clearPollingResources$1.label = 1;
            if (mutexImpl.a(pbBulkBookingRideDetailsComponent$clearPollingResources$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) pbBulkBookingRideDetailsComponent$clearPollingResources$1.L$0;
            ResultKt.b(obj);
        }
        try {
            this.R = EmptyList.f17557a;
            Job job = this.L;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.L = null;
            ArrayList arrayList = this.S;
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                ((Job) obj2).cancel(null);
            }
            ArrayList arrayList2 = this.O;
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                ((PremiumReserveTicketPostBookingActionHandler) obj3).m();
            }
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object L0(PremiumBusMeta premiumBusMeta, ContinuationImpl continuationImpl) {
        PbBulkBookingRideDetailsComponent$createPassInfoBanners$1 pbBulkBookingRideDetailsComponent$createPassInfoBanners$1;
        List arrayList;
        IconType iconType;
        Object objB;
        List list;
        Object objB2;
        String str;
        List list2;
        RideRollOverMeta rideRollOverMeta;
        RideRollOverBannerCta rideRollOverBannerCta;
        String str2;
        int i;
        IconType iconType2;
        String str3;
        RideRollOverBannerCtaActionType rideRollOverBannerCtaActionType;
        int i2;
        String str4;
        PremiumBusMeta premiumBusMeta2 = premiumBusMeta;
        if (continuationImpl instanceof PbBulkBookingRideDetailsComponent$createPassInfoBanners$1) {
            pbBulkBookingRideDetailsComponent$createPassInfoBanners$1 = (PbBulkBookingRideDetailsComponent$createPassInfoBanners$1) continuationImpl;
            int i3 = pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.label = i3 - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsComponent$createPassInfoBanners$1 = new PbBulkBookingRideDetailsComponent$createPassInfoBanners$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsComponent$createPassInfoBanners$1 = new PbBulkBookingRideDetailsComponent$createPassInfoBanners$1(this, continuationImpl);
        }
        Object obj = pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.label;
        StringProvider stringProvider = this.r;
        PbPassInfoBannerCtaType.CustomerSupport customerSupport = null;
        if (i4 == 0) {
            ResultKt.b(obj);
            if (premiumBusMeta2 == null) {
                return null;
            }
            arrayList = new ArrayList();
            if (premiumBusMeta2.f9549a) {
                iconType = IconType.IC_EDIT_CALENDAR;
                pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$0 = premiumBusMeta2;
                pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$1 = arrayList;
                pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$2 = iconType;
                pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$3 = arrayList;
                pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.label = 1;
                objB = stringProvider.b(StringEnum.CHANGE_PASS_START_DATE_INFO_BANNER_TEXT, new Object[0], pbBulkBookingRideDetailsComponent$createPassInfoBanners$1);
                if (objB != coroutineSingletons) {
                    list = arrayList;
                }
                return coroutineSingletons;
            }
            rideRollOverMeta = premiumBusMeta2.d;
            if (rideRollOverMeta != null) {
                rideRollOverBannerCta = rideRollOverMeta.b;
                str2 = rideRollOverMeta.f9558a;
                if (str2 != null) {
                    i = WhenMappings.b[rideRollOverMeta.c.ordinal()];
                    if (i == 1) {
                        iconType2 = IconType.PARTY_EMOJI;
                    } else if (i == 2) {
                        iconType2 = IconType.IC_ROLLOVER;
                    } else if (i == 3) {
                        iconType2 = IconType.IC_ALERT_TRIANGLE;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iconType2 = IconType.IC_ROLLOVER;
                    }
                    IconType iconType3 = iconType2;
                    String str5 = rideRollOverMeta.f9558a;
                    if (rideRollOverBannerCta != null) {
                        str3 = rideRollOverBannerCta.f9556a;
                    } else {
                        str3 = null;
                    }
                    BannerStatus bannerStatus = rideRollOverMeta.c;
                    if (rideRollOverBannerCta != null) {
                        rideRollOverBannerCtaActionType = rideRollOverBannerCta.b;
                    } else {
                        rideRollOverBannerCtaActionType = null;
                    }
                    if (rideRollOverBannerCtaActionType == null) {
                        i2 = -1;
                    } else {
                        i2 = WhenMappings.c[rideRollOverBannerCtaActionType.ordinal()];
                    }
                    if (i2 != -1) {
                        if (i2 == 1) {
                            str4 = rideRollOverBannerCta.c;
                            if (str4 != null) {
                                customerSupport = new PbPassInfoBannerCtaType.CustomerSupport(str4);
                            }
                        } else if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    arrayList.add(new PbPassInfoBanner(iconType3, str5, bannerStatus, str3, customerSupport));
                }
            }
            return arrayList;
        }
        if (i4 == 1) {
            List list3 = (List) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$3;
            iconType = (IconType) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$2;
            List list4 = (List) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$1;
            PremiumBusMeta premiumBusMeta3 = (PremiumBusMeta) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$0;
            ResultKt.b(obj);
            arrayList = list3;
            premiumBusMeta2 = premiumBusMeta3;
            list = list4;
            objB = obj;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list5 = (List) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$4;
            String str6 = (String) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$3;
            iconType = (IconType) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$2;
            list2 = (List) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$1;
            PremiumBusMeta premiumBusMeta4 = (PremiumBusMeta) pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$0;
            ResultKt.b(obj);
            arrayList = list5;
            premiumBusMeta2 = premiumBusMeta4;
            objB2 = obj;
            str = str6;
        }
        arrayList.add(new PbPassInfoBanner(iconType, str, BannerStatus.SUCCESS, (String) objB2, PbPassInfoBannerCtaType.ChangeDate.f6936a));
        arrayList = list2;
        rideRollOverMeta = premiumBusMeta2.d;
        if (rideRollOverMeta != null) {
            rideRollOverBannerCta = rideRollOverMeta.b;
            str2 = rideRollOverMeta.f9558a;
            if (str2 != null && str2.length() > 0) {
                i = WhenMappings.b[rideRollOverMeta.c.ordinal()];
                if (i == 1) {
                    iconType2 = IconType.PARTY_EMOJI;
                } else if (i == 2) {
                    iconType2 = IconType.IC_ROLLOVER;
                } else if (i == 3) {
                    iconType2 = IconType.IC_ALERT_TRIANGLE;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iconType2 = IconType.IC_ROLLOVER;
                }
                IconType iconType4 = iconType2;
                String str7 = rideRollOverMeta.f9558a;
                if (rideRollOverBannerCta != null) {
                    str3 = rideRollOverBannerCta.f9556a;
                } else {
                    str3 = null;
                }
                BannerStatus bannerStatus2 = rideRollOverMeta.c;
                if (rideRollOverBannerCta != null) {
                    rideRollOverBannerCtaActionType = rideRollOverBannerCta.b;
                } else {
                    rideRollOverBannerCtaActionType = null;
                }
                if (rideRollOverBannerCtaActionType == null) {
                    i2 = -1;
                } else {
                    i2 = WhenMappings.c[rideRollOverBannerCtaActionType.ordinal()];
                }
                if (i2 != -1) {
                    if (i2 == 1) {
                        str4 = rideRollOverBannerCta.c;
                        if (str4 != null) {
                            customerSupport = new PbPassInfoBannerCtaType.CustomerSupport(str4);
                        }
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList.add(new PbPassInfoBanner(iconType4, str7, bannerStatus2, str3, customerSupport));
            }
        }
        return arrayList;
        String str8 = (String) objB;
        pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$0 = premiumBusMeta2;
        pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$1 = list;
        pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$2 = iconType;
        pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$3 = str8;
        pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.L$4 = arrayList;
        pbBulkBookingRideDetailsComponent$createPassInfoBanners$1.label = 2;
        objB2 = stringProvider.b(StringEnum.CHANGE_START_DATE, new Object[0], pbBulkBookingRideDetailsComponent$createPassInfoBanners$1);
        if (objB2 != coroutineSingletons) {
            str = str8;
            list2 = list;
            arrayList.add(new PbPassInfoBanner(iconType, str, BannerStatus.SUCCESS, (String) objB2, PbPassInfoBannerCtaType.ChangeDate.f6936a));
            arrayList = list2;
            rideRollOverMeta = premiumBusMeta2.d;
            if (rideRollOverMeta != null) {
                rideRollOverBannerCta = rideRollOverMeta.b;
                str2 = rideRollOverMeta.f9558a;
                if (str2 != null) {
                    i = WhenMappings.b[rideRollOverMeta.c.ordinal()];
                    if (i == 1) {
                        iconType2 = IconType.PARTY_EMOJI;
                    } else if (i == 2) {
                        iconType2 = IconType.IC_ROLLOVER;
                    } else if (i == 3) {
                        iconType2 = IconType.IC_ALERT_TRIANGLE;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iconType2 = IconType.IC_ROLLOVER;
                    }
                    IconType iconType5 = iconType2;
                    String str9 = rideRollOverMeta.f9558a;
                    if (rideRollOverBannerCta != null) {
                        str3 = rideRollOverBannerCta.f9556a;
                    } else {
                        str3 = null;
                    }
                    BannerStatus bannerStatus3 = rideRollOverMeta.c;
                    if (rideRollOverBannerCta != null) {
                        rideRollOverBannerCtaActionType = rideRollOverBannerCta.b;
                    } else {
                        rideRollOverBannerCtaActionType = null;
                    }
                    if (rideRollOverBannerCtaActionType == null) {
                        i2 = -1;
                    } else {
                        i2 = WhenMappings.c[rideRollOverBannerCtaActionType.ordinal()];
                    }
                    if (i2 != -1) {
                        if (i2 == 1) {
                            str4 = rideRollOverBannerCta.c;
                            if (str4 != null) {
                                customerSupport = new PbPassInfoBannerCtaType.CustomerSupport(str4);
                            }
                        } else if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    arrayList.add(new PbPassInfoBanner(iconType5, str9, bannerStatus3, str3, customerSupport));
                }
            }
            return arrayList;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object M0(String str, ContinuationImpl continuationImpl) {
        PbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1 pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1;
        Object next;
        if (continuationImpl instanceof PbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1) {
            pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1 = (PbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1) continuationImpl;
            int i = pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1 = new PbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1 = new PbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1(this, continuationImpl);
        }
        PbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1 pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$2 = pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$1;
        Object objB = pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$2.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$2.label = 1;
            objB = FetchCompleteProductConfigByIdUseCase.b(this.D, str, null, null, pbBulkBookingRideDetailsComponent$fetchFaqUrlImageFromProductConfig$2, 14);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f8205a.I;
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((ProductImageAppModel) next).b != ProductImageType.PLAN_SCREEN_FAQS_URL);
                ProductImageAppModel productImageAppModel = (ProductImageAppModel) next;
                if (productImageAppModel != null) {
                    return productImageAppModel.f8224a;
                }
            }
        }
        return null;
    }

    public final void N0(String str) {
        Job job = this.J;
        if ((job == null || !((AbstractCoroutine) job).isActive()) && !this.Q) {
            E0(new mq0(10));
            this.J = BuildersKt.d(this.j, this.t.b(), null, new PbBulkBookingRideDetailsComponent$fetchRemotePremiumReserveTicketsAndUpdateStateForFailedAndUnderProcessBookings$2(this, str, null), 2);
        }
    }

    public final ArrayList O0(List list) throws Exception {
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
        String str = "";
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String strA = FormatTimeInMillisToGivenFormatUseCase.a(this.p, ((PremiumBusBulkBookingUpcomingRidesCardData) obj).o, ChaloCustomDateFormat.DAY_WITH_MONTH_YEAR_FORMAT, 12);
            if (!Intrinsics.d(str, strA)) {
                arrayList.add(new BookingStartDateHeader(i, strA));
                str = strA;
            }
            arrayList2.add(Unit.f17538a);
            i = i2;
        }
        return arrayList;
    }

    public final String P0(long j, String str, String str2) {
        TimeUtilsContract timeUtilsContract = this.m;
        return timeUtilsContract.G(str2 + " " + TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j, str, 4));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r1 == r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q0(app.chalo.superpass.data.models.entities.SuperPass r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent.Q0(app.chalo.superpass.data.models.entities.SuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void R0(PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType) {
        Json json = ChaloJson.b;
        json.getClass();
        this.z.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.SlotSelectionArgs(Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN, json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), premiumBusProductPurchaseFlowType), null), null, null, 6));
    }

    public final void S0(PbBulkBookingRideDetailsViewIntent intent) {
        SuperPassResponseAppModel superPassResponseAppModel;
        String str;
        String str2;
        String str3;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent;
        ContextScope contextScope = this.j;
        if (z) {
            PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent viewCreatedIntent = (PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent) intent;
            if (this.d) {
                return;
            }
            this.d = true;
            BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handleViewCreatedIntent$1(this, viewCreatedIntent, null), 3);
            return;
        }
        boolean z2 = intent instanceof PbBulkBookingRideDetailsViewIntent.BookSingleRideClickIntent;
        int i = 8;
        int i2 = 7;
        StateFlow stateFlow = this.f;
        if (z2) {
            SuperPassResponseAppModel superPassResponseAppModel2 = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).f;
            SuperPassResponseAppModel superPassResponseAppModel3 = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).f;
            SuperPassTripPreferences superPassTripPreferences = superPassResponseAppModel3 != null ? superPassResponseAppModel3.j : null;
            AnalyticsContract.DefaultImpls.a(this.s, "pb bulk booking book single ride click", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(new Pair("passId", String.valueOf(superPassResponseAppModel2 != null ? superPassResponseAppModel2.b : null)), new Pair("remainingTrips", String.valueOf(superPassResponseAppModel2 != null ? superPassResponseAppModel2.i : null)), new Pair("route id", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.f9575a : null)), new Pair("from stop id", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.b : null)), new Pair("endStopId", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.d : null)), new Pair("from stop name", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.c : null)), new Pair("to stop name", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.e : null)), new Pair("productType", String.valueOf(superPassResponseAppModel2 != null ? superPassResponseAppModel2.k : null)), new Pair("productSubType", String.valueOf(superPassResponseAppModel2 != null ? superPassResponseAppModel2.l : null))), null, false, 24);
            BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handelBookSingleRideClickIntent$1(superPassResponseAppModel2, superPassTripPreferences, this, null), 3);
            return;
        }
        boolean z3 = intent instanceof PbBulkBookingRideDetailsViewIntent.OnRidesCardCtaClickIntent;
        ChaloNavigationManager chaloNavigationManager = this.z;
        if (z3) {
            PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData = ((PbBulkBookingRideDetailsViewIntent.OnRidesCardCtaClickIntent) intent).f6927a;
            switch (WhenMappings.d[premiumBusBulkBookingUpcomingRidesCardData.i.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusActivationArgs(Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN, premiumBusBulkBookingUpcomingRidesCardData.c, premiumBusBulkBookingUpcomingRidesCardData.f6939a, premiumBusBulkBookingUpcomingRidesCardData.b, false), null, null, 6));
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (intent instanceof PbBulkBookingRideDetailsViewIntent.OnDirectionsCtaClickIntent) {
            PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState = ((PbBulkBookingRideDetailsViewIntent.OnDirectionsCtaClickIntent) intent).f6925a;
            if (premiumReserveTicketStopDirectionsInfoState instanceof PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable) {
                PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable stopLocationAvailable = (PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable) premiumReserveTicketStopDirectionsInfoState;
                this.y.h(stopLocationAvailable.c, stopLocationAvailable.b);
                return;
            } else {
                if (!Intrinsics.d(premiumReserveTicketStopDirectionsInfoState, PremiumReserveTicketStopDirectionsInfoState.StopLocationNotAvailable.f7475a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (intent.equals(PbBulkBookingRideDetailsViewIntent.RetryClickIntent.f6931a)) {
            this.Q = false;
            SuperPassResponseAppModel superPassResponseAppModel4 = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).f;
            String str4 = "";
            if (superPassResponseAppModel4 == null || (str2 = superPassResponseAppModel4.b) == null) {
                str2 = "";
            }
            AnalyticsContract.DefaultImpls.a(this.s, "pb bulk booking fetch linked booking retry btn click", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), vo1.s("passId", str2), null, false, 24);
            SuperPassResponseAppModel superPassResponseAppModel5 = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).f;
            if (superPassResponseAppModel5 != null && (str3 = superPassResponseAppModel5.b) != null) {
                str4 = str3;
            }
            N0(str4);
            return;
        }
        if (intent instanceof PbBulkBookingRideDetailsViewIntent.OnTabClickIntent) {
            E0(new ym0((PbBulkBookingRideDetailsViewIntent.OnTabClickIntent) intent, 14));
            return;
        }
        if (intent instanceof PbBulkBookingRideDetailsViewIntent.BookAgainClickedIntent) {
            PbBulkBookingRideDetailsViewIntent.BookAgainClickedIntent bookAgainClickedIntent = (PbBulkBookingRideDetailsViewIntent.BookAgainClickedIntent) intent;
            Job job = this.M;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                PremiumBusBulkBookingPastRidesCardData premiumBusBulkBookingPastRidesCardData = bookAgainClickedIntent.f6916a;
                Pair pair = new Pair("bookingId", premiumBusBulkBookingPastRidesCardData.g);
                Pair pair2 = new Pair("productType", premiumBusBulkBookingPastRidesCardData.e);
                Pair pair3 = new Pair("productSubType", premiumBusBulkBookingPastRidesCardData.f);
                RouteInfo routeInfo = premiumBusBulkBookingPastRidesCardData.c;
                AnalyticsContract.DefaultImpls.a(this.s, "pb bulk booking book again cta click", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(pair, pair2, pair3, new Pair("route name", String.valueOf(routeInfo != null ? routeInfo.f6940a : null)), new Pair("configId", premiumBusBulkBookingPastRidesCardData.f6938a)), null, false, 24);
                E0(new mq0(i2));
                this.M = BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handleBookAgainClickedIntent$2(this, bookAgainClickedIntent, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof PbBulkBookingRideDetailsViewIntent.ViewReceiptClickedIntent) {
            PbBulkBookingRideDetailsViewIntent.ViewReceiptClickedIntent viewReceiptClickedIntent = (PbBulkBookingRideDetailsViewIntent.ViewReceiptClickedIntent) intent;
            String str5 = viewReceiptClickedIntent.f6933a;
            String str6 = viewReceiptClickedIntent.b;
            String str7 = viewReceiptClickedIntent.c;
            Source source = Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN;
            AnalyticsContract.DefaultImpls.a(this.s, "pb bulk booking view trip receipt button clicked", source.getSourceName(), MapsKt.i(new Pair("bookingId", str5), new Pair("productType", str6), new Pair("productSubType", str7)), null, false, 24);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripSummaryArgs.TicketSummaryScreen(source, new BookingsRequestType.PremiumBusTicketType(str5)), null, null, 6));
            return;
        }
        if (intent.equals(PbBulkBookingRideDetailsViewIntent.DismissAlertDialogIntent.f6919a)) {
            PbBulkBookingRideDetailsDialogType pbBulkBookingRideDetailsDialogType = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).u;
            if (pbBulkBookingRideDetailsDialogType instanceof PbBulkBookingRideDetailsDialogType.DatePickerDialog) {
                str = "DATE_PICKER_DIALOG";
            } else if (pbBulkBookingRideDetailsDialogType instanceof PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog) {
                str = "PASS_DATE_CHANGE_CONFIRMATION_DIALOG";
            } else if (pbBulkBookingRideDetailsDialogType instanceof PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog) {
                str = "PASS_DATE_CHANGE_FAILURE_DIALOG";
            } else if (Intrinsics.d(pbBulkBookingRideDetailsDialogType, PbBulkBookingRideDetailsDialogType.ProductDisabledDialog.f6914a)) {
                str = "PRODUCT_DISABLED";
            } else {
                if (pbBulkBookingRideDetailsDialogType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "null";
            }
            AnalyticsContract.DefaultImpls.a(this.s, "pb bulk booking dimsiss dialog", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), vo1.s("dialogType", str), null, false, 24);
            E0(new mq0(13));
            return;
        }
        if (intent.equals(PbBulkBookingRideDetailsViewIntent.OnBackToHomeScreenClickIntent.f6924a)) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
            return;
        }
        if (intent.equals(PbBulkBookingRideDetailsViewIntent.FragmentStopIntent.f6923a)) {
            Job job2 = this.L;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            this.L = null;
            BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handleFragmentStopIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(PbBulkBookingRideDetailsViewIntent.FragmentStartedIntent.f6922a)) {
            String str8 = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).r;
            if (str8 != null) {
                U0(str8);
                return;
            }
            return;
        }
        if (intent instanceof PbBulkBookingRideDetailsViewIntent.DateSelectedIntent) {
            PbBulkBookingRideDetailsViewIntent.DateSelectedIntent dateSelectedIntent = (PbBulkBookingRideDetailsViewIntent.DateSelectedIntent) intent;
            if (dateSelectedIntent.f6918a == null || (superPassResponseAppModel = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).f) == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1(superPassResponseAppModel, this, dateSelectedIntent, null), 3);
            return;
        }
        if (intent.equals(PbBulkBookingRideDetailsViewIntent.DismissDialogIntent.f6920a)) {
            E0(new mq0(i));
            return;
        }
        int i3 = 12;
        if (intent instanceof PbBulkBookingRideDetailsViewIntent.PassDateChangeConfirmationDialog) {
            PbBulkBookingRideDetailsViewIntent.PassDateChangeConfirmationDialog passDateChangeConfirmationDialog = (PbBulkBookingRideDetailsViewIntent.PassDateChangeConfirmationDialog) intent;
            Job job3 = this.N;
            if (job3 == null || !((AbstractCoroutine) job3).isActive()) {
                this.Q = false;
                String str9 = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).r;
                if (str9 == null || str9.length() == 0) {
                    return;
                }
                E0(new mq0(i3));
                this.N = BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handlePassDateChangeConfirmationDialog$2(this, str9, passDateChangeConfirmationDialog, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof PbBulkBookingRideDetailsViewIntent.OnPassInfoBannerCtaClickIntent) {
            BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handleOnPassInfoBannerCtaClickIntent$1((PbBulkBookingRideDetailsViewIntent.OnPassInfoBannerCtaClickIntent) intent, this, null), 3);
            return;
        }
        if (!intent.equals(PbBulkBookingRideDetailsViewIntent.RenewPassClickIntent.f6930a)) {
            if (!(intent instanceof PbBulkBookingRideDetailsViewIntent.FaqClickedIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handleFaqClickedIntent$1(this, (PbBulkBookingRideDetailsViewIntent.FaqClickedIntent) intent, null), 3);
            return;
        }
        SuperPassResponseAppModel superPassResponseAppModel6 = ((PbBulkBookingRideDetailsViewState) stateFlow.getValue()).f;
        if (superPassResponseAppModel6 == null) {
            return;
        }
        Pair pair4 = new Pair("passId", superPassResponseAppModel6.b);
        Pair pair5 = new Pair("configId", superPassResponseAppModel6.f6891a);
        long j = superPassResponseAppModel6.e;
        ChaloCustomDateFormat chaloCustomDateFormat = ChaloCustomDateFormat.DAY_WITH_MONTH_YEAR_FORMAT;
        FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase = this.p;
        Pair pair6 = new Pair("passStartDate", FormatTimeInMillisToGivenFormatUseCase.a(formatTimeInMillisToGivenFormatUseCase, j, chaloCustomDateFormat, 12));
        Pair pair7 = new Pair("expiryDate", FormatTimeInMillisToGivenFormatUseCase.a(formatTimeInMillisToGivenFormatUseCase, superPassResponseAppModel6.f, chaloCustomDateFormat, 12));
        Pair pair8 = new Pair("remainingTrips", String.valueOf(superPassResponseAppModel6.i));
        SuperPassTripPreferences superPassTripPreferences2 = superPassResponseAppModel6.j;
        AnalyticsContractImplKt.b(this.s, "pb pass detail screen renew btn clicked", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN, MapsKt.i(pair4, pair5, pair6, pair7, pair8, new Pair("route id", String.valueOf(superPassTripPreferences2 != null ? superPassTripPreferences2.f9575a : null)), new Pair("from stop id", String.valueOf(superPassTripPreferences2 != null ? superPassTripPreferences2.b : null)), new Pair("from stop name", String.valueOf(superPassTripPreferences2 != null ? superPassTripPreferences2.c : null)), new Pair("to stop id", String.valueOf(superPassTripPreferences2 != null ? superPassTripPreferences2.d : null)), new Pair("to stop name", String.valueOf(superPassTripPreferences2 != null ? superPassTripPreferences2.e : null)), new Pair("productType", superPassResponseAppModel6.k), new Pair("productSubType", superPassResponseAppModel6.l)), false, 24);
        BuildersKt.d(contextScope, null, null, new PbBulkBookingRideDetailsComponent$handleRenewPassClickIntent$1(this, superPassResponseAppModel6, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object T0(boolean z, long j, long j2, Integer num, Integer num2, ContinuationImpl continuationImpl) {
        PbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1 pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1;
        Integer num3;
        long j3;
        long j4;
        Integer num4;
        long j5;
        long j6;
        int i;
        Integer num5;
        Integer num6;
        int i2;
        Long l;
        long j7;
        boolean z2;
        boolean z3;
        if (continuationImpl instanceof PbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1) {
            pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1 = (PbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1) continuationImpl;
            int i3 = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.label = i3 - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1 = new PbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1 = new PbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1(this, continuationImpl);
        }
        Object obj = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.label;
        boolean z4 = true;
        if (i4 == 0) {
            ResultKt.b(obj);
            if (!z) {
                return Boolean.FALSE;
            }
            pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$0 = num;
            num3 = num2;
            pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$1 = num3;
            j3 = j;
            pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$0 = j3;
            j4 = j2;
            pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$1 = j4;
            pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.label = 1;
            Object objA = this.E.a(pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1);
            if (objA != coroutineSingletons) {
                num4 = num;
                obj = objA;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            long j8 = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$1;
            long j9 = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$0;
            num3 = (Integer) pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$1;
            num4 = (Integer) pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$0;
            ResultKt.b(obj);
            j4 = j8;
            j3 = j9;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.I$1;
            i2 = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.I$0;
            j6 = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$1;
            j5 = pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$0;
            num5 = (Integer) pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$1;
            num6 = (Integer) pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$0;
            ResultKt.b(obj);
        }
        l = (Long) obj;
        if (l != null) {
            return Boolean.FALSE;
        }
        j7 = j5 - j6;
        long jLongValue = l.longValue() - j6;
        if (j7 > 0 || jLongValue <= 0 || jLongValue * ((long) 100) < j7 * ((long) i)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (num6 != null || num5 == null || num6.intValue() <= 0) {
            z3 = false;
        } else {
            int iIntValue = num6.intValue() - num5.intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            if (((long) iIntValue) * ((long) 100) >= ((long) num6.intValue()) * ((long) i2)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (!z2 && !z3) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
        PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = (PremiumBusNativeCityWiseConfigAppModel) obj;
        int iE = RangesKt.e(premiumBusNativeCityWiseConfigAppModel.o, 0, 100);
        int iE2 = RangesKt.e(premiumBusNativeCityWiseConfigAppModel.p, 0, 100);
        pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$0 = num4;
        pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.L$1 = num3;
        pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$0 = j3;
        pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.J$1 = j4;
        pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.I$0 = iE;
        pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.I$1 = iE2;
        pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1.label = 2;
        Object objB = this.B.b(pbBulkBookingRideDetailsComponent$showRenewButtonIfEligible$1);
        if (objB != coroutineSingletons) {
            long j10 = j4;
            j5 = j3;
            j6 = j10;
            i = iE2;
            obj = objB;
            num5 = num3;
            num6 = num4;
            i2 = iE;
            l = (Long) obj;
            if (l != null) {
                return Boolean.FALSE;
            }
            j7 = j5 - j6;
            long jLongValue2 = l.longValue() - j6;
            if (j7 > 0) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (num6 != null) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (!z2) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
        return coroutineSingletons;
    }

    public final void U0(String str) {
        Job job = this.K;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.K = BuildersKt.d(this.j, this.t.getDefault(), null, new PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1(this, str, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object V0(PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) {
        PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1 pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1;
        String strB;
        Object objB;
        long j;
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent;
        long j2;
        String strB2;
        Object objB2;
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent2;
        long j3;
        String strB3;
        Object objB3;
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent3;
        String strP0;
        String str;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2;
        String str2;
        String str3;
        long j4;
        String str4;
        String str5;
        PremiumReserveTicketStatus premiumReserveTicketStatus;
        RouteInfo routeInfo;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel3 = premiumReserveTicketAppModel;
        if (continuationImpl instanceof PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1) {
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1 = (PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1) continuationImpl;
            int i = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1 = new PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1 = new PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1(this, continuationImpl);
        }
        Object obj = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.label;
        StringProvider stringProvider = this.r;
        TimeUtilsContract timeUtilsContract = this.m;
        if (i2 == 0) {
            ResultKt.b(obj);
            switch (WhenMappings.d[premiumReserveTicketAppModel3.f7113a.h.ordinal()]) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 9:
                case 11:
                case 12:
                case 13:
                    return null;
                case 2:
                case 3:
                    long j5 = premiumReserveTicketAppModel3.b.b;
                    strB = timeUtilsContract.b();
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0 = premiumReserveTicketAppModel3;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1 = this;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2 = strB;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0 = j5;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.label = 1;
                    objB = stringProvider.b(StringEnum.VALIDATED_AT, new Object[0], pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1);
                    if (objB != coroutineSingletons) {
                        j = j5;
                        pbBulkBookingRideDetailsComponent = this;
                        strP0 = pbBulkBookingRideDetailsComponent.P0(j, strB, (String) objB);
                        break;
                    }
                    return coroutineSingletons;
                case 6:
                case 7:
                    j2 = premiumReserveTicketAppModel3.f7113a.b;
                    strB2 = timeUtilsContract.b();
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0 = premiumReserveTicketAppModel3;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1 = this;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2 = strB2;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0 = j2;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.label = 2;
                    objB2 = stringProvider.b(StringEnum.BOOKED_AT, new Object[0], pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1);
                    if (objB2 != coroutineSingletons) {
                        pbBulkBookingRideDetailsComponent2 = this;
                        strP0 = pbBulkBookingRideDetailsComponent2.P0(j2, strB2, (String) objB2);
                        break;
                    }
                    return coroutineSingletons;
                case 10:
                    j3 = premiumReserveTicketAppModel3.c.c;
                    strB3 = timeUtilsContract.b();
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0 = premiumReserveTicketAppModel3;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1 = this;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2 = strB3;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0 = j3;
                    pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.EXPIRED_AT, new Object[0], pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1);
                    if (objB3 != coroutineSingletons) {
                        pbBulkBookingRideDetailsComponent3 = this;
                        strP0 = pbBulkBookingRideDetailsComponent3.P0(j3, strB3, (String) objB3);
                        break;
                    }
                    return coroutineSingletons;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i2 == 1) {
            long j6 = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0;
            String str6 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2;
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent4 = (PbBulkBookingRideDetailsComponent) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1;
            PremiumReserveTicketAppModel premiumReserveTicketAppModel4 = (PremiumReserveTicketAppModel) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0;
            ResultKt.b(obj);
            strB = str6;
            premiumReserveTicketAppModel3 = premiumReserveTicketAppModel4;
            j = j6;
            pbBulkBookingRideDetailsComponent = pbBulkBookingRideDetailsComponent4;
            objB = obj;
            strP0 = pbBulkBookingRideDetailsComponent.P0(j, strB, (String) objB);
        } else if (i2 == 2) {
            long j7 = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0;
            String str7 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2;
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent5 = (PbBulkBookingRideDetailsComponent) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1;
            PremiumReserveTicketAppModel premiumReserveTicketAppModel5 = (PremiumReserveTicketAppModel) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0;
            ResultKt.b(obj);
            j2 = j7;
            pbBulkBookingRideDetailsComponent2 = pbBulkBookingRideDetailsComponent5;
            objB2 = obj;
            strB2 = str7;
            premiumReserveTicketAppModel3 = premiumReserveTicketAppModel5;
            strP0 = pbBulkBookingRideDetailsComponent2.P0(j2, strB2, (String) objB2);
        } else if (i2 == 3) {
            long j8 = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0;
            String str8 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2;
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent6 = (PbBulkBookingRideDetailsComponent) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1;
            PremiumReserveTicketAppModel premiumReserveTicketAppModel6 = (PremiumReserveTicketAppModel) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0;
            ResultKt.b(obj);
            strB3 = str8;
            premiumReserveTicketAppModel3 = premiumReserveTicketAppModel6;
            j3 = j8;
            pbBulkBookingRideDetailsComponent3 = pbBulkBookingRideDetailsComponent6;
            objB3 = obj;
            strP0 = pbBulkBookingRideDetailsComponent3.P0(j3, strB3, (String) objB3);
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j9 = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0;
            RouteInfo routeInfo2 = (RouteInfo) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$7;
            PremiumReserveTicketStatus premiumReserveTicketStatus2 = (PremiumReserveTicketStatus) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$6;
            String str9 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$5;
            String str10 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$4;
            str = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$3;
            String str11 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2;
            String str12 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1;
            premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0;
            ResultKt.b(obj);
            routeInfo = routeInfo2;
            j4 = j9;
            premiumReserveTicketStatus = premiumReserveTicketStatus2;
            str5 = str9;
            str3 = str10;
            str4 = str11;
            str2 = str12;
        }
        String str13 = str;
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel2.f7113a;
        return new PremiumBusBulkBookingPastRidesCardData(premiumReserveTicketBookingPropertiesAppModel.c, str2, routeInfo, (String) obj, str13, str3, str4, str5, premiumReserveTicketStatus, j4, premiumReserveTicketAppModel2.c.c, premiumReserveTicketBookingPropertiesAppModel.b);
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel2 = premiumReserveTicketAppModel3.f7113a;
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel3.b;
        String str14 = premiumReserveTicketBookingPropertiesAppModel2.f7114a;
        str = premiumReserveTicketBookingPropertiesAppModel2.d;
        String str15 = premiumReserveTicketBookingPropertiesAppModel2.e;
        String strB4 = timeUtilsContract.b();
        PremiumReserveTicketStatus premiumReserveTicketStatus3 = premiumReserveTicketAppModel3.f7113a.h;
        RouteInfo routeInfo3 = new RouteInfo(premiumReserveTicketTripPropertiesAppModel.f, premiumReserveTicketTripPropertiesAppModel.g.b, premiumReserveTicketTripPropertiesAppModel.h.b);
        long j10 = premiumReserveTicketTripPropertiesAppModel.b;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$0 = premiumReserveTicketAppModel3;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$1 = strP0;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$2 = str14;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$3 = str;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$4 = str15;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$5 = strB4;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$6 = premiumReserveTicketStatus3;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.L$7 = routeInfo3;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.J$0 = j10;
        pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1.label = 4;
        Object objB4 = stringProvider.b(StringEnum.BOOK_AGAIN, new Object[0], pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingPastRidesCardData$1);
        if (objB4 != coroutineSingletons) {
            premiumReserveTicketAppModel2 = premiumReserveTicketAppModel3;
            str2 = strP0;
            str3 = str15;
            j4 = j10;
            str4 = str14;
            str5 = strB4;
            premiumReserveTicketStatus = premiumReserveTicketStatus3;
            routeInfo = routeInfo3;
            obj = objB4;
            String str16 = str;
            PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel3 = premiumReserveTicketAppModel2.f7113a;
            return new PremiumBusBulkBookingPastRidesCardData(premiumReserveTicketBookingPropertiesAppModel3.c, str2, routeInfo, (String) obj, str16, str3, str4, str5, premiumReserveTicketStatus, j4, premiumReserveTicketAppModel2.c.c, premiumReserveTicketBookingPropertiesAppModel3.b);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object W0(PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) throws Exception {
        PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1 pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1;
        String str;
        String str2;
        String str3;
        PremiumBusBookingVehicleInfoState.VehicleNotAssigned vehicleNotAssigned;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
        if (continuationImpl instanceof PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1) {
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1 = (PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1) continuationImpl;
            int i = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1 = new PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1 = new PbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1(this, continuationImpl);
        }
        Object obj = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel2.f7113a;
            str = premiumReserveTicketBookingPropertiesAppModel.f7114a;
            String str4 = premiumReserveTicketBookingPropertiesAppModel.d;
            String str5 = premiumReserveTicketBookingPropertiesAppModel.e;
            PremiumBusBookingVehicleInfoState.VehicleNotAssigned vehicleNotAssigned2 = new PremiumBusBookingVehicleInfoState.VehicleNotAssigned(EmptyList.f17557a);
            long j = premiumReserveTicketAppModel2.b.b;
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$0 = premiumReserveTicketAppModel2;
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$1 = str;
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$2 = str4;
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$3 = str5;
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$4 = vehicleNotAssigned2;
            pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.label = 1;
            Object objA = this.n.a(j, pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str5;
            obj = objA;
            str3 = str4;
            vehicleNotAssigned = vehicleNotAssigned2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PremiumBusBookingVehicleInfoState.VehicleNotAssigned vehicleNotAssigned3 = (PremiumBusBookingVehicleInfoState.VehicleNotAssigned) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$4;
            str2 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$3;
            String str6 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$2;
            String str7 = (String) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$1;
            PremiumReserveTicketAppModel premiumReserveTicketAppModel3 = (PremiumReserveTicketAppModel) pbBulkBookingRideDetailsComponent$toPremiumBusBulkBookingUpcomingRidesCardData$1.L$0;
            ResultKt.b(obj);
            vehicleNotAssigned = vehicleNotAssigned3;
            premiumReserveTicketAppModel2 = premiumReserveTicketAppModel3;
            str3 = str6;
            str = str7;
        }
        PremiumBusPostBookingStopSchedule.ScheduleAvailable scheduleAvailable = new PremiumBusPostBookingStopSchedule.ScheduleAvailable((String) obj);
        String strB = this.m.b();
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel2 = premiumReserveTicketAppModel2.f7113a;
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel2.b;
        PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketBookingPropertiesAppModel2.h;
        String str8 = premiumReserveTicketTripPropertiesAppModel.g.b;
        String str9 = premiumReserveTicketTripPropertiesAppModel.h.b;
        String str10 = premiumReserveTicketTripPropertiesAppModel.f;
        NewPremiumReserveTicketDetailsScreenType.INSTANCE.getClass();
        return new PremiumBusBulkBookingUpcomingRidesCardData(str3, str2, str, vehicleNotAssigned, scheduleAvailable, PremiumBusPostBookingStopSchedule.NotApplicable.f7427a, PremiumBusBookingTripTimeInfoState.NotFetched.b, strB, premiumReserveTicketStatus, str8, str9, str10, PremiumReserveTicketStopDirectionsInfoState.StopLocationNotAvailable.f7475a, NewPremiumReserveTicketDetailsScreenType.Companion.a(premiumReserveTicketStatus), premiumReserveTicketTripPropertiesAppModel.b);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PbBulkBookingRideDetailsViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PbBulkBookingRideDetailsViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new PbBulkBookingRideDetailsViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        S0(PbBulkBookingRideDetailsViewIntent.FragmentStartedIntent.f6922a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        S0(PbBulkBookingRideDetailsViewIntent.FragmentStopIntent.f6923a);
    }
}
