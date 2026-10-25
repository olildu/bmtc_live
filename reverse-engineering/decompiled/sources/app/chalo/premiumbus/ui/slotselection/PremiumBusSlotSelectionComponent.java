package app.chalo.premiumbus.ui.slotselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.extensions.KotlinDateTimeExtensionsKt;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModelKt;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionType;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionsAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionsAppModelKt;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingPurchaseOptionAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingPurchaseOptionDetailsAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.domain.CheckAndShowPassPurchaseNudgeCard;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.domain.FetchPremiumBusBookingAvailablePurchaseOptionsUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.ODPairAndSlotsFetchFailedReasons;
import app.chalo.premiumbus.domain.ODPairWithSlotsListAppModel;
import app.chalo.premiumbus.domain.ODPairsAndRespectiveSlotsBetweenStops;
import app.chalo.premiumbus.domain.SlotSelectionSectionInfoManager;
import app.chalo.premiumbus.helper.PremiumBusBulkBookingHelper;
import app.chalo.premiumbus.managers.PremiumBusBookingNavigationHelper;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.managers.SelectSlotsResult;
import app.chalo.premiumbus.managers.SlotSelectionResultStateManager;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsEntryRoutingKt;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowTypeKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsEntryContext;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel;
import app.chalo.productbooking.common.domain.FetchAvailableSlotsForPreBookingUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
import app.chalo.uistate.dialog.DateDataState;
import app.chalo.uistate.dialog.LegendItemDataState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.MultiSelectDatePickerConfig;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.av0;
import defpackage.dv0;
import defpackage.et0;
import defpackage.ev0;
import defpackage.fv0;
import defpackage.n3;
import defpackage.py;
import defpackage.qd;
import defpackage.v3;
import defpackage.vo1;
import defpackage.vu0;
import defpackage.za0;
import defpackage.zu0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.serialization.json.Json;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionDataState;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionViewState;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionSideEffect;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSlotSelectionComponent extends ChaloBaseStateMviComponent<PremiumBusSlotSelectionIntent, PremiumBusSlotSelectionDataState, PremiumBusSlotSelectionViewState, PremiumBusSlotSelectionSideEffect> {
    public final CheckAndShowPassPurchaseNudgeCard A;
    public final SystemHelper B;
    public final ChaloNavigationManager C;
    public final KotlinToastManager D;
    public final FetchPBODPairsForGivenLocationsUseCase E;
    public final GetPremiumBusCurrentCityConfigUseCase F;
    public final ChaloTimeProvider G;
    public final FetchAvailableSlotsForPreBookingUseCase H;
    public final SuperPassDataWrapper I;
    public final SlotSelectionResultStateManager J;
    public final PremiumBusBulkBookingHelper K;
    public final GetTimeInMillisAfterXTimeUseCase L;
    public Job M;
    public Job N;
    public Job O;
    public Job P;
    public Job Q;
    public Job R;
    public Long S;
    public PBAvailableSlotsTripAppModel T;
    public Job U;
    public final PremiumBusArgs.SlotSelectionArgs k;
    public final ComponentContext l;
    public final AnalyticsContract m;
    public final PremiumBusPurchaseInfoManager n;
    public final PremiumBusBookingNavigationHelper o;
    public final StringProvider p;
    public final TimeUtilsContract q;
    public final GetPremiumReserveTicketByIdUseCase r;
    public final FetchPremiumBusBookingAvailablePurchaseOptionsUseCase s;
    public final FetchProductConfigsForUiUseCase t;
    public final IUserPreferencesDataStore u;
    public final GetOneTimeOfferConfigUseCase v;
    public final CurrencyFeature w;
    public final SlotSelectionSectionInfoManager x;
    public final SlotSelectionScreenUiStateFactory y;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionComponent$Companion;", "", "", "SLOT_WINDOW_NUM_OF_DAYS", "I", "DEFAULT_BULK_BOOKING_ALLOWED_DAYS", "", "PREMIUM_BUS_ROUTES_WEB_URL", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7853a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[SlotSelectionErrorScreenType.values().length];
            try {
                iArr[SlotSelectionErrorScreenType.NO_ROUTE_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7853a = iArr;
            int[] iArr2 = new int[BookingSelectionType.values().length];
            try {
                iArr2[BookingSelectionType.SINGLE_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BookingSelectionType.MULTIPLE_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[PremiumBusPurchaseOptionState.values().length];
            try {
                iArr3[PremiumBusPurchaseOptionState.NO_PURCHASE_OPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[PremiumBusPurchaseOptionState.NO_PASS_OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[PremiumBusPurchaseOptionState.ATLEAST_ONE_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            c = iArr3;
            int[] iArr4 = new int[DateAvailabilityStatus.values().length];
            try {
                iArr4[DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[DateAvailabilityStatus.FEW_SEATS_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[DateAvailabilityStatus.AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[DateAvailabilityStatus.SOLD_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[DateAvailabilityStatus.NOT_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DateAvailabilityStatus.NO_SLOTS_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DateAvailabilityStatus.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            d = iArr4;
            int[] iArr5 = new int[SuperPassSubTypes.values().length];
            try {
                iArr5[SuperPassSubTypes.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[SuperPassSubTypes.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[SuperPassSubTypes.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            e = iArr5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent(PremiumBusArgs.SlotSelectionArgs args, ComponentContext componentContext, AnalyticsContract analyticsContract, PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager, PremiumBusBookingNavigationHelper premiumBusBookingNavigationHelper, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, FetchPremiumBusBookingAvailablePurchaseOptionsUseCase fetchPremiumBusBookingAvailablePurchaseOptionsUseCase, FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase, IUserPreferencesDataStore iUserPreferencesDataStore, GetOneTimeOfferConfigUseCase getOneTimeOfferConfigUseCase, CurrencyFeature currencyFeature, SlotSelectionSectionInfoManager slotSelectionSectionInfoManager, SlotSelectionScreenUiStateFactory slotSelectionScreenUiStateFactory, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, CheckAndShowPassPurchaseNudgeCard checkAndShowPassPurchaseNudgeCard, SystemHelper systemHelper, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, FetchPBODPairsForGivenLocationsUseCase fetchPBODPairsForGivenLocationsUseCase, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, ChaloTimeProvider chaloTimeProvider, FetchAvailableSlotsForPreBookingUseCase fetchAvailableSlotsForPreBookingUseCase, SuperPassDataWrapper superPassDataWrapper, SlotSelectionResultStateManager slotSelectionResultStateManager, PremiumBusBulkBookingHelper premiumBusBulkBookingHelper, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase) {
        Object objB;
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = args;
        this.l = componentContext;
        this.m = analyticsContract;
        this.n = premiumBusPurchaseInfoManager;
        this.o = premiumBusBookingNavigationHelper;
        this.p = stringProvider;
        this.q = timeUtilsContract;
        this.r = getPremiumReserveTicketByIdUseCase;
        this.s = fetchPremiumBusBookingAvailablePurchaseOptionsUseCase;
        this.t = fetchProductConfigsForUiUseCase;
        this.u = iUserPreferencesDataStore;
        this.v = getOneTimeOfferConfigUseCase;
        this.w = currencyFeature;
        this.x = slotSelectionSectionInfoManager;
        this.y = slotSelectionScreenUiStateFactory;
        this.z = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.A = checkAndShowPassPurchaseNudgeCard;
        this.B = systemHelper;
        this.C = chaloNavigationManager;
        this.D = kotlinToastManager;
        this.E = fetchPBODPairsForGivenLocationsUseCase;
        this.F = getPremiumBusCurrentCityConfigUseCase;
        this.G = chaloTimeProvider;
        this.H = fetchAvailableSlotsForPreBookingUseCase;
        this.I = superPassDataWrapper;
        this.J = slotSelectionResultStateManager;
        this.K = premiumBusBulkBookingHelper;
        this.L = getTimeInMillisAfterXTimeUseCase;
        ChaloJson chaloJson = ChaloJson.f6455a;
        String str = args.d;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str, PremiumBusProductPurchaseFlowType.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = (PremiumBusProductPurchaseFlowType) objB;
        if (premiumBusProductPurchaseFlowType != null) {
            h1(new PremiumBusSlotSelectionIntent.InitializationIntent(premiumBusProductPurchaseFlowType, this.k.c));
        } else {
            ChaloNavigationManagerKt.c(this.C);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    public static final DateDataState F0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking, DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking2, Long l, Long l2) {
        boolean z;
        DateDataState dateDataState;
        List list;
        DateDataState dateDataState2;
        boolean z2;
        List list2;
        premiumBusSlotSelectionComponent.getClass();
        LocalDateTime localDateTime = dateAndSlotSelectedForBulkBooking.b;
        List list3 = dateAndSlotSelectedForBulkBooking.d;
        boolean zC1 = premiumBusSlotSelectionComponent.c1(localDateTime, l, l2);
        DateAvailabilityStatus dateAvailabilityStatus = dateAndSlotSelectedForBulkBooking.c;
        switch (WhenMappings.d[dateAvailabilityStatus.ordinal()]) {
            case 1:
                if (dateAndSlotSelectedForBulkBooking2 == null || (list = dateAndSlotSelectedForBulkBooking2.d) == null) {
                    z = false;
                } else {
                    List list4 = list;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = list4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                            } else if (((SlotsAvailableForSelection) it.next()).b) {
                                z = true;
                            }
                        }
                    }
                }
                dateDataState = new DateDataState(localDateTime, z, dateAvailabilityStatus, true);
                dateDataState2 = dateDataState;
                if (zC1) {
                    return dateDataState2;
                }
                return DateDataState.a(dateDataState2, false, DateAvailabilityStatus.NO_SLOTS_AVAILABLE, 1);
            case 2:
            case 3:
                if (dateAndSlotSelectedForBulkBooking2 == null || (list2 = dateAndSlotSelectedForBulkBooking2.d) == null) {
                    z2 = false;
                } else {
                    List list5 = list2;
                    if ((list5 instanceof Collection) && list5.isEmpty()) {
                        z2 = false;
                    } else {
                        Iterator it2 = list5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                            } else if (((SlotsAvailableForSelection) it2.next()).b) {
                                z2 = true;
                            }
                        }
                    }
                }
                dateDataState = new DateDataState(localDateTime, z2, dateAvailabilityStatus, true);
                dateDataState2 = dateDataState;
                if (zC1) {
                    return dateDataState2;
                }
                return DateDataState.a(dateDataState2, false, DateAvailabilityStatus.NO_SLOTS_AVAILABLE, 1);
            case 4:
            case 5:
            case 6:
                SlotsAvailableForSelection slotsAvailableForSelection = (SlotsAvailableForSelection) CollectionsKt.H(list3);
                dateDataState2 = new DateDataState(localDateTime, slotsAvailableForSelection != null && slotsAvailableForSelection.b, dateAvailabilityStatus, false);
                if (zC1) {
                    return dateDataState2;
                }
                return DateDataState.a(dateDataState2, false, DateAvailabilityStatus.NO_SLOTS_AVAILABLE, 1);
            case 7:
                SlotsAvailableForSelection slotsAvailableForSelection2 = (SlotsAvailableForSelection) CollectionsKt.H(list3);
                dateDataState2 = new DateDataState(localDateTime, slotsAvailableForSelection2 != null && slotsAvailableForSelection2.b, dateAvailabilityStatus, true);
                if (zC1) {
                    return dateDataState2;
                }
                return DateDataState.a(dateDataState2, false, DateAvailabilityStatus.NO_SLOTS_AVAILABLE, 1);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object G0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, List list, int i, int i2, long j, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1 premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1;
        SystemHelper systemHelper = premiumBusSlotSelectionComponent.B;
        TimeUtilsContract timeUtilsContract = premiumBusSlotSelectionComponent.q;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1) {
            premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1 = (PremiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1) continuationImpl;
            int i3 = premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1 = new PremiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1(premiumBusSlotSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1 = new PremiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1(premiumBusSlotSelectionComponent, continuationImpl);
        }
        Object objT0 = premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.label;
        if (i4 == 0) {
            ResultKt.b(objT0);
            premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.L$0 = list;
            premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.I$0 = i;
            premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.I$1 = i2;
            premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.J$0 = j;
            premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.label = 1;
            objT0 = premiumBusSlotSelectionComponent.T0(list, premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1);
            if (objT0 == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.J$0;
            i2 = premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.I$1;
            i = premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.I$0;
            list = (List) premiumBusSlotSelectionComponent$buildMultiSelectionCalendarDataState$1.L$0;
            ResultKt.b(objT0);
        }
        LocalDateTime.Companion companion = LocalDateTime.INSTANCE;
        return new MultiSelectionCalendarDataState(list, new MultiSelectDatePickerConfig(KotlinDateTimeExtensionsKt.b(companion, systemHelper.j(), timeUtilsContract.b()).a(), i, i2), KotlinDateTimeExtensionsKt.b(companion, systemHelper.j(), timeUtilsContract.b()), KotlinDateTimeExtensionsKt.b(companion, j, timeUtilsContract.b()), (List) objT0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object H0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, int i, int i2, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$buildPassRideLeftString$1 premiumBusSlotSelectionComponent$buildPassRideLeftString$1;
        String str;
        String str2;
        String str3;
        StateFlow stateFlow = premiumBusSlotSelectionComponent.f;
        StringProvider stringProvider = premiumBusSlotSelectionComponent.p;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$buildPassRideLeftString$1) {
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1 = (PremiumBusSlotSelectionComponent$buildPassRideLeftString$1) continuationImpl;
            int i3 = premiumBusSlotSelectionComponent$buildPassRideLeftString$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$buildPassRideLeftString$1.label = i3 - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$buildPassRideLeftString$1 = new PremiumBusSlotSelectionComponent$buildPassRideLeftString$1(premiumBusSlotSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1 = new PremiumBusSlotSelectionComponent$buildPassRideLeftString$1(premiumBusSlotSelectionComponent, continuationImpl);
        }
        Object objB = premiumBusSlotSelectionComponent$buildPassRideLeftString$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = premiumBusSlotSelectionComponent$buildPassRideLeftString$1.label;
        if (i4 == 0) {
            ResultKt.b(objB);
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1.I$0 = i;
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1.I$1 = i2;
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1.label = 1;
            objB = stringProvider.b(StringEnum.RIDES_LEFT, new Object[0], premiumBusSlotSelectionComponent$buildPassRideLeftString$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                str3 = (String) premiumBusSlotSelectionComponent$buildPassRideLeftString$1.L$0;
                ResultKt.b(objB);
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                return objB + " " + lowerCase;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) premiumBusSlotSelectionComponent$buildPassRideLeftString$1.L$0;
            ResultKt.b(objB);
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase2, "toLowerCase(...)");
            return objB + " " + lowerCase2;
        }
        i2 = premiumBusSlotSelectionComponent$buildPassRideLeftString$1.I$1;
        i = premiumBusSlotSelectionComponent$buildPassRideLeftString$1.I$0;
        ResultKt.b(objB);
        String str4 = (String) objB;
        SelectedPassInfo selectedPassInfo = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).A;
        if (selectedPassInfo == null || !selectedPassInfo.h) {
            SuperPassSubTypes.Companion companion = SuperPassSubTypes.INSTANCE;
            SelectedPassInfo selectedPassInfo2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).A;
            if (selectedPassInfo2 == null || (str = selectedPassInfo2.g) == null) {
                str = "";
            }
            companion.getClass();
            int i5 = WhenMappings.e[SuperPassSubTypes.Companion.a(str).ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String lowerCase3 = str4.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase3, "toLowerCase(...)");
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" / ");
                sb.append(i2);
                return vo1.p(sb, " ", lowerCase3);
            }
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1.L$0 = str4;
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1.label = 3;
            Object objB2 = stringProvider.b(StringEnum.UNLIMITED, new Object[0], premiumBusSlotSelectionComponent$buildPassRideLeftString$1);
            if (objB2 != coroutineSingletons) {
                str2 = str4;
                objB = objB2;
                String lowerCase4 = str2.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase4, "toLowerCase(...)");
                return objB + " " + lowerCase4;
            }
        } else {
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1.L$0 = str4;
            premiumBusSlotSelectionComponent$buildPassRideLeftString$1.label = 2;
            Object objB3 = stringProvider.b(StringEnum.UNLIMITED, new Object[0], premiumBusSlotSelectionComponent$buildPassRideLeftString$1);
            if (objB3 != coroutineSingletons) {
                str3 = str4;
                objB = objB3;
                String lowerCase5 = str3.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase5, "toLowerCase(...)");
                return objB + " " + lowerCase5;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, String str, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1 premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1;
        premiumBusSlotSelectionComponent.getClass();
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1) {
            premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1 = (PremiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1 = new PremiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1(premiumBusSlotSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1 = new PremiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1(premiumBusSlotSelectionComponent, continuationImpl);
        }
        Object objV = premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = premiumBusSlotSelectionComponent.J.b(str);
            premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1.label = 1;
            objV = premiumBusSlotSelectionComponent.b.v(flowB, premiumBusSlotSelectionComponent$collectNearBySlotSelectionResult$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        ResultStateData resultStateData = (ResultStateData) objV;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        premiumBusSlotSelectionComponent.h1(new PremiumBusSlotSelectionIntent.SelectNearBySlotClickedForBulkBookingIntent(((SelectSlotsResult) ((ResultStateData.Success) resultStateData).f9039a).f7279a.f7902a));
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        if (r14 == r2) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.J0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void K0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, ChaloUseCaseResult.Failure failure, PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel) {
        premiumBusSlotSelectionComponent.getClass();
        long j = pBODPairWithSlotSectionListUiModel.f7820a;
        Object obj = failure.f10418a;
        premiumBusSlotSelectionComponent.j1(j, (ODPairAndSlotsFetchFailedReasons) obj);
        ODPairAndSlotsFetchFailedReasons oDPairAndSlotsFetchFailedReasons = (ODPairAndSlotsFetchFailedReasons) obj;
        if (Intrinsics.d(oDPairAndSlotsFetchFailedReasons, ODPairAndSlotsFetchFailedReasons.NoStopPointsAvailable.f7210a)) {
            premiumBusSlotSelectionComponent.E0(new fv0(failure, pBODPairWithSlotSectionListUiModel, 0));
            return;
        }
        if (!Intrinsics.d(oDPairAndSlotsFetchFailedReasons, ODPairAndSlotsFetchFailedReasons.InvalidWindow.f7208a) && !Intrinsics.d(oDPairAndSlotsFetchFailedReasons, ODPairAndSlotsFetchFailedReasons.LocalException.f7209a) && !Intrinsics.d(oDPairAndSlotsFetchFailedReasons, ODPairAndSlotsFetchFailedReasons.ResponseParseException.f7211a) && !(oDPairAndSlotsFetchFailedReasons instanceof ODPairAndSlotsFetchFailedReasons.ServerError) && !Intrinsics.d(oDPairAndSlotsFetchFailedReasons, ODPairAndSlotsFetchFailedReasons.UnknownException.f7213a) && !Intrinsics.d(oDPairAndSlotsFetchFailedReasons, ODPairAndSlotsFetchFailedReasons.UserNotFound.f7214a)) {
            throw new NoWhenBranchMatchedException();
        }
        premiumBusSlotSelectionComponent.E0(new fv0(failure, pBODPairWithSlotSectionListUiModel, 1));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e2 -> B:53:0x00e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0122 -> B:57:0x0125). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object L0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent r23, java.util.List r24, app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel r25, java.util.List r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.L0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent, java.util.List, app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object M0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, List list, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PBOriginDestinationAppModel pBOriginDestinationAppModel, List list2, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1 premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1;
        PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel;
        PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel;
        String str;
        String str2;
        premiumBusSlotSelectionComponent.getClass();
        ChaloNavigationManager chaloNavigationManager = premiumBusSlotSelectionComponent.C;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1) {
            premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1 = (PremiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1 = new PremiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1(premiumBusSlotSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1 = new PremiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1(premiumBusSlotSelectionComponent, continuationImpl);
        }
        Object objA1 = premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1.label;
        if (i2 == 0) {
            ResultKt.b(objA1);
            if (list.size() != 1 || (premiumBusBookingPurchaseOptionAppModel = (PremiumBusBookingPurchaseOptionAppModel) CollectionsKt.H(list)) == null || (premiumBusBookingPurchaseOptionDetailsAppModel = premiumBusBookingPurchaseOptionAppModel.c) == null || !premiumBusBookingPurchaseOptionDetailsAppModel.h) {
                boolean zB = PremiumBusBookingAvailableOptionsAppModelKt.b(list2);
                premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1.label = 1;
                objA1 = premiumBusSlotSelectionComponent.a1(list2, premiumBusSlotSelectionComponent$handleSingleRidePurchaseOptionSelectionAndProceed$1, zB);
                if (objA1 == obj) {
                    return obj;
                }
            } else {
                PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel2 = (PremiumBusBookingPurchaseOptionAppModel) CollectionsKt.F(list);
                FareDetailsData.Companion companion = FareDetailsData.INSTANCE;
                FareDetailsData fareDetailsDataB = FareDetailsData.Companion.b(companion, pBAvailableSlotsTripAppModel, pBOriginDestinationAppModel, null, 28);
                SuperPassSubTypes.Companion companion2 = SuperPassSubTypes.INSTANCE;
                PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel2 = premiumBusBookingPurchaseOptionAppModel2.c;
                String str3 = "";
                if (premiumBusBookingPurchaseOptionDetailsAppModel2 == null || (str = premiumBusBookingPurchaseOptionDetailsAppModel2.b) == null) {
                    str = "";
                }
                companion2.getClass();
                SuperPassSubTypes superPassSubTypesA = SuperPassSubTypes.Companion.a(str);
                String str4 = pBAvailableSlotsTripAppModel.f;
                PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel3 = premiumBusBookingPurchaseOptionAppModel2.c;
                if (premiumBusBookingPurchaseOptionDetailsAppModel3 != null && (str2 = premiumBusBookingPurchaseOptionDetailsAppModel3.c) != null) {
                    str3 = str2;
                }
                PremiumBusFareDetailsFlowType.PurchaseThroughPass purchaseThroughPass = new PremiumBusFareDetailsFlowType.PurchaseThroughPass(str4, str3, superPassSubTypesA);
                premiumBusSlotSelectionComponent.E0(new vu0(18));
                PremiumBusArgs.SlotSelectionArgs slotSelectionArgs = premiumBusSlotSelectionComponent.k;
                if (pBAvailableSlotsTripAppModel.c()) {
                    String str5 = pBAvailableSlotsTripAppModel.f;
                    Json json = ChaloJson.b;
                    json.getClass();
                    ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusSeatSelectionArgs(Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, json.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), new PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass(str5, pBOriginDestinationAppModel.c, pBOriginDestinationAppModel.h, json.a(companion.serializer(), fareDetailsDataB), PremiumBusFareDetailsFlowTypeKt.a(purchaseThroughPass))), (String) null, slotSelectionArgs.e, 4), null, 6);
                } else {
                    ChaloNavigationManagerKt.e(chaloNavigationManager, PremiumBusFareDetailsEntryRoutingKt.a(purchaseThroughPass, fareDetailsDataB, PremiumBusFareDetailsEntryContext.FromSlotSelection, EmptyList.f17557a, slotSelectionArgs.e), null, 6);
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA1);
        premiumBusSlotSelectionComponent.E0(new av0((PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) objA1, 1));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    public static final Object N0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, String str, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1;
        int i;
        premiumBusSlotSelectionComponent.getClass();
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1) {
            premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = (PremiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1) continuationImpl;
            int i2 = premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = new PremiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1(premiumBusSlotSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = new PremiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1(premiumBusSlotSelectionComponent, continuationImpl);
        }
        Object objV = premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label;
        boolean z = false;
        if (i3 == 0) {
            ResultKt.b(objV);
            Flow flowA = premiumBusSlotSelectionComponent.u.a(str);
            premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0 = str;
            premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = 1;
            objV = FlowKt.v(flowA, premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            str = (String) premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0;
            ResultKt.b(objV);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.I$0;
            str = (String) premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0;
            ResultKt.b(objV);
        }
        if (OneTimeOfferConfigAppModelKt.a((OneTimeOfferConfigAppModel) objV, str) && i != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
        Boolean bool = (Boolean) objV;
        ?? BooleanValue = bool != null ? bool.booleanValue() : 0;
        GetOneTimeOfferConfigUseCase getOneTimeOfferConfigUseCase = premiumBusSlotSelectionComponent.v;
        premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0 = str;
        premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.I$0 = BooleanValue;
        premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = 2;
        Object objA = getOneTimeOfferConfigUseCase.a(premiumBusSlotSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1);
        if (objA != coroutineSingletons) {
            ?? r6 = BooleanValue;
            objV = objA;
            i = r6 == true ? 1 : 0;
            if (OneTimeOfferConfigAppModelKt.a((OneTimeOfferConfigAppModel) objV, str)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008e -> B:16:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object O0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent r28, int r29, app.chalo.premiumbus.PremiumBusProductPurchaseFlowType r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.O0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent, int, app.chalo.premiumbus.PremiumBusProductPurchaseFlowType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object P0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, String str, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1 premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1;
        String str2;
        Long l;
        premiumBusSlotSelectionComponent.getClass();
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1) {
            premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1 = (PremiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1 = new PremiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1(premiumBusSlotSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1 = new PremiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1(premiumBusSlotSelectionComponent, continuationImpl);
        }
        Object obj = premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Long l2 = ((PremiumBusSlotSelectionDataState) premiumBusSlotSelectionComponent.f.getValue()).h;
            ChaloTimeProvider chaloTimeProvider = premiumBusSlotSelectionComponent.G;
            premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.L$0 = str;
            premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.L$1 = l2;
            premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.label = 1;
            Object objB = chaloTimeProvider.b(premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str;
            l = l2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = (Long) premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.L$1;
            str2 = (String) premiumBusSlotSelectionComponent$raiseUpgradeValuePassClickedEvent$1.L$0;
            ResultKt.b(obj);
        }
        Long l3 = (Long) obj;
        AnalyticsContractImplKt.b(premiumBusSlotSelectionComponent.m, "pb value pass bottomsheet upgrade CTA clicked", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, MapsKt.i(new Pair("passId", str2), new Pair("advanceBookingDays", (l3 == null || l == null) ? "" : String.valueOf(premiumBusSlotSelectionComponent.q.s(l3.longValue(), l.longValue())))), false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    /* JADX WARN: Code duplicated, block: B:58:0x0168  */
    /* JADX WARN: Code duplicated, block: B:61:0x0172  */
    /* JADX WARN: Code duplicated, block: B:66:0x0194  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01db  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01df  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fc  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0189, code lost:
    
        if (r1 == r7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ad, code lost:
    
        if (r1 == r7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d0, code lost:
    
        if (r1 == r7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ed, code lost:
    
        if (r1 == r7) goto L83;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent r30, app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDateClickIntent r31, app.chalo.uistate.dialog.DateAvailabilityStatus r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.Q0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent, app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarDateClickIntent, app.chalo.uistate.dialog.DateAvailabilityStatus, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00af -> B:28:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object R0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent r10, app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel r11, java.util.Map r12, java.util.List r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r10.getClass()
            boolean r0 = r14 instanceof app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionsAfterPreferred$1
            if (r0 == 0) goto L16
            r0 = r14
            app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionsAfterPreferred$1 r0 = (app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionsAfterPreferred$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionsAfterPreferred$1 r0 = new app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionsAfterPreferred$1
            r0.<init>(r10, r14)
        L1b:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            int r11 = r0.I$2
            int r12 = r0.I$1
            int r13 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.b(r14)
            goto Lb2
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            kotlin.ResultKt.b(r14)
            java.util.Set r12 = r12.entrySet()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionsAfterPreferred$$inlined$sortedBy$1 r14 = new app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionsAfterPreferred$$inlined$sortedBy$1
            r14.<init>()
            java.util.List r12 = kotlin.collections.CollectionsKt.v0(r14, r12)
            java.util.Iterator r14 = r12.iterator()
            r2 = r3
        L59:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r14.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            long r7 = r11.f7820a
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L76
            goto L7a
        L76:
            int r2 = r2 + 1
            goto L59
        L79:
            r2 = -1
        L7a:
            int r2 = r2 + r4
            int r11 = r12.size()
            r14 = r2
            r2 = r12
            r12 = r14
            r14 = r13
            r13 = r3
        L84:
            if (r12 >= r11) goto Lbf
            vu0 r5 = new vu0
            r6 = 15
            r5.<init>(r6)
            r10.E0(r5)
            java.lang.Object r5 = r2.get(r12)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel r5 = (app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel) r5
            r0.L$0 = r14
            r0.L$1 = r2
            r0.I$0 = r13
            r0.I$1 = r12
            r0.I$2 = r11
            r0.label = r4
            java.lang.Object r5 = r10.o1(r5, r14, r0)
            if (r5 != r1) goto Laf
            return r1
        Laf:
            r9 = r5
            r5 = r14
            r14 = r9
        Lb2:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lbc
            r13 = r4
            goto Lbf
        Lbc:
            int r12 = r12 + r4
            r14 = r5
            goto L84
        Lbf:
            if (r13 == 0) goto Lc2
            r3 = r4
        Lc2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.R0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent, app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel, java.util.Map, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static PremiumBusPurchaseOptionState Z0(List list) {
        boolean zIsEmpty = list.isEmpty();
        List list2 = list;
        int i = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((PremiumBusBookingPurchaseOptionAppModel) it.next()).b == PremiumBusBookingAvailableOptionType.SUPER_PASS && (i = i + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        if (zIsEmpty) {
            return PremiumBusPurchaseOptionState.NO_PURCHASE_OPTION;
        }
        if (i == 0) {
            return PremiumBusPurchaseOptionState.NO_PASS_OPTION;
        }
        return i >= 1 ? PremiumBusPurchaseOptionState.ATLEAST_ONE_PASS : PremiumBusPurchaseOptionState.ATLEAST_ONE_PASS;
    }

    public final LinkedHashMap S0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StateFlow stateFlow = this.f;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).q;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).q;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).r;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).r;
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T0(List list, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$buildLegendItems$1 premiumBusSlotSelectionComponent$buildLegendItems$1;
        List listL;
        List listZ;
        List list2;
        List list3;
        ChaloColorToken chaloColorToken;
        ChaloColorToken.GreyishBlue greyishBlue;
        List list4;
        List list5;
        ChaloColorToken chaloColorToken2;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$buildLegendItems$1) {
            premiumBusSlotSelectionComponent$buildLegendItems$1 = (PremiumBusSlotSelectionComponent$buildLegendItems$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$buildLegendItems$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$buildLegendItems$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$buildLegendItems$1 = new PremiumBusSlotSelectionComponent$buildLegendItems$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$buildLegendItems$1 = new PremiumBusSlotSelectionComponent$buildLegendItems$1(this, continuationImpl);
        }
        Object objB = premiumBusSlotSelectionComponent$buildLegendItems$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$buildLegendItems$1.label;
        StringProvider stringProvider = this.p;
        if (i2 != 0) {
            if (i2 == 1) {
                chaloColorToken = (ChaloColorToken) premiumBusSlotSelectionComponent$buildLegendItems$1.L$3;
                listL = (List) premiumBusSlotSelectionComponent$buildLegendItems$1.L$2;
                list2 = (List) premiumBusSlotSelectionComponent$buildLegendItems$1.L$1;
                list3 = (List) premiumBusSlotSelectionComponent$buildLegendItems$1.L$0;
                ResultKt.b(objB);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloColorToken2 = (ChaloColorToken) premiumBusSlotSelectionComponent$buildLegendItems$1.L$2;
                list5 = (List) premiumBusSlotSelectionComponent$buildLegendItems$1.L$1;
                list4 = (List) premiumBusSlotSelectionComponent$buildLegendItems$1.L$0;
                ResultKt.b(objB);
            }
            list5.add(new LegendItemDataState(chaloColorToken2, (String) objB));
            return list4;
        }
        listL = py.l(objB);
        List list6 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list6, 10));
        Iterator it = list6.iterator();
        while (it.hasNext()) {
            arrayList.add(((DateDataState) it.next()).c);
        }
        listZ = CollectionsKt.z(arrayList);
        if (listZ.contains(DateAvailabilityStatus.FEW_SEATS_LEFT)) {
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$0 = listL;
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$1 = listZ;
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$2 = listL;
            ChaloColorToken.Orange3 orange3 = ChaloColorToken.Orange3.f9831a;
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$3 = orange3;
            premiumBusSlotSelectionComponent$buildLegendItems$1.label = 1;
            objB = stringProvider.b(StringEnum.PB_SLOTS_FEW_SEATS_LEFT, new Object[0], premiumBusSlotSelectionComponent$buildLegendItems$1);
            if (objB != coroutineSingletons) {
                list2 = listZ;
                list3 = listL;
                chaloColorToken = orange3;
            }
        } else {
            if (listZ.contains(DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE)) {
                return listL;
            }
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$0 = listL;
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$1 = listL;
            greyishBlue = ChaloColorToken.GreyishBlue.f9808a;
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$2 = greyishBlue;
            premiumBusSlotSelectionComponent$buildLegendItems$1.L$3 = null;
            premiumBusSlotSelectionComponent$buildLegendItems$1.label = 2;
            objB = stringProvider.b(StringEnum.NEARBY_TIME_AVAILABLE, new Object[0], premiumBusSlotSelectionComponent$buildLegendItems$1);
            if (objB != coroutineSingletons) {
                list4 = listL;
                list5 = list4;
                chaloColorToken2 = greyishBlue;
                list5.add(new LegendItemDataState(chaloColorToken2, (String) objB));
                return list4;
            }
        }
        return coroutineSingletons;
        listL.add(new LegendItemDataState(chaloColorToken, (String) objB));
        listZ = list2;
        listL = list3;
        if (listZ.contains(DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE)) {
            return listL;
        }
        premiumBusSlotSelectionComponent$buildLegendItems$1.L$0 = listL;
        premiumBusSlotSelectionComponent$buildLegendItems$1.L$1 = listL;
        greyishBlue = ChaloColorToken.GreyishBlue.f9808a;
        premiumBusSlotSelectionComponent$buildLegendItems$1.L$2 = greyishBlue;
        premiumBusSlotSelectionComponent$buildLegendItems$1.L$3 = null;
        premiumBusSlotSelectionComponent$buildLegendItems$1.label = 2;
        objB = stringProvider.b(StringEnum.NEARBY_TIME_AVAILABLE, new Object[0], premiumBusSlotSelectionComponent$buildLegendItems$1);
        if (objB != coroutineSingletons) {
            list4 = listL;
            list5 = list4;
            chaloColorToken2 = greyishBlue;
            list5.add(new LegendItemDataState(chaloColorToken2, (String) objB));
            return list4;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0482  */
    /* JADX WARN: Code duplicated, block: B:115:0x049e  */
    /* JADX WARN: Code duplicated, block: B:116:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:120:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:124:0x053c  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x053c -> B:125:0x054c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object p0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState r40, kotlin.coroutines.jvm.internal.ContinuationImpl r41) {
        /*
            Method dump skipped, instruction units count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.p0(app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void V0(PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel) {
        Job job;
        Job job2 = this.M;
        if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.M) != null) {
            ((JobSupport) job).cancel(null);
        }
        StateFlow stateFlow = this.f;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).q;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).r;
        if (pBStopPlaceSelectedAppModel == null || pBStopPlaceSelectedAppModel2 == null) {
            E0(new vu0(19));
        } else {
            this.M = BuildersKt.d(this.j, null, null, new PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2(this, pBODPairWithSlotSectionListUiModel, null), 3);
        }
    }

    public final void W0(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, boolean z) {
        Job job = this.P;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            E0(new vu0(14));
            this.P = BuildersKt.d(this.j, null, null, new PremiumBusSlotSelectionComponent$fetchProductDataFromConfigIdAndProceed$2(this, pBAvailableSlotsTripAppModel, CollectionsKt.S("premiumReserveTicket", "rideBasedPass", "magicPass"), CollectionsKt.R(ProductConfigServiceType.PREMIUM), z, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object X0(ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$fullScreenErrorUIState$1 premiumBusSlotSelectionComponent$fullScreenErrorUIState$1;
        ImageUIState imageUIState;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$fullScreenErrorUIState$1) {
            premiumBusSlotSelectionComponent$fullScreenErrorUIState$1 = (PremiumBusSlotSelectionComponent$fullScreenErrorUIState$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$fullScreenErrorUIState$1 = new PremiumBusSlotSelectionComponent$fullScreenErrorUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$fullScreenErrorUIState$1 = new PremiumBusSlotSelectionComponent$fullScreenErrorUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.label;
        StringProvider stringProvider = this.p;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$0 = imageUIState2;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$1 = chaloTextStyleHelper2;
            premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], premiumBusSlotSelectionComponent$fullScreenErrorUIState$1);
            if (objB != coroutineSingletons) {
                imageUIState = imageUIState2;
                chaloTextStyleHelper = chaloTextStyleHelper2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$1;
            ImageUIState imageUIState3 = (ImageUIState) premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
            imageUIState = imageUIState3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$2;
            imageUIState = (ImageUIState) premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$1;
            buttonUIStateFactory = (ButtonUIStateFactory) premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState = chaloTextUIState2;
        }
        return new SlotSelectionFullScreenErrorUIState(imageUIState, chaloTextUIState, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new zu0(this, 0), null, UIShape.d, false, 0.0f, 52), null, 24);
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, null, UITextAlign.Center, UIFontWeight.Bold, null, 102);
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$0 = buttonUIStateFactory2;
        premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$1 = imageUIState;
        premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.L$2 = chaloTextUIStateE;
        premiumBusSlotSelectionComponent$fullScreenErrorUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], premiumBusSlotSelectionComponent$fullScreenErrorUIState$1);
        if (objB2 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateE;
            objB = objB2;
            buttonUIStateFactory = buttonUIStateFactory2;
            return new SlotSelectionFullScreenErrorUIState(imageUIState, chaloTextUIState, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new zu0(this, 0), null, UIShape.d, false, 0.0f, 52), null, 24);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object Y0(boolean z, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1 premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2;
        List list;
        PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions availablePurchaseOptions;
        ArrayList arrayList;
        int size;
        int i;
        Object obj;
        PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions availablePurchaseOptions2;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1) {
            premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1 = (PremiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1) continuationImpl;
            int i2 = premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1 = new PremiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1 = new PremiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1(this, continuationImpl);
        }
        PremiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1 premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2 = premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$1;
        Object objA = premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.label;
        if (i3 == 0) {
            ResultKt.b(objA);
            if (!z && ((PremiumBusSlotSelectionDataState) this.f.getValue()).s && pBAvailableSlotsTripAppModel3 != null) {
                String str = pBAvailableSlotsTripAppModel3.d;
                String str2 = pBAvailableSlotsTripAppModel3.e;
                String str3 = pBAvailableSlotsTripAppModel3.b;
                long j = pBAvailableSlotsTripAppModel3.g;
                String str4 = pBAvailableSlotsTripAppModel3.f;
                premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$0 = pBAvailableSlotsTripAppModel3;
                premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.label = 1;
                objA = this.s.a(j, str, str2, str3, str4, premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2);
                if (objA != obj2) {
                }
                return obj2;
            }
            return null;
        }
        if (i3 == 1) {
            pBAvailableSlotsTripAppModel3 = (PBAvailableSlotsTripAppModel) premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$0;
            ResultKt.b(objA);
        } else {
            if (i3 == 2) {
                list = (List) premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$1;
                pBAvailableSlotsTripAppModel2 = (PBAvailableSlotsTripAppModel) premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$0;
                ResultKt.b(objA);
                availablePurchaseOptions = (PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) objA;
                arrayList = availablePurchaseOptions.f7823a;
                if (!arrayList.isEmpty()) {
                    size = arrayList.size();
                    i = 0;
                    do {
                        if (i < size) {
                            obj = arrayList.get(i);
                            i++;
                        }
                    } while (((PremiumBusPurchaseOptionUiModel) obj).f7851a != PremiumBusBookingAvailableOptionType.SUPER_PASS);
                    this.n.G(pBAvailableSlotsTripAppModel2);
                    if (PremiumBusBookingAvailableOptionsAppModelKt.b(list)) {
                        premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$0 = availablePurchaseOptions;
                        premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$1 = null;
                        premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.label = 3;
                        if (l1(list, premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2) != obj2) {
                            availablePurchaseOptions2 = availablePurchaseOptions;
                        }
                        return obj2;
                    }
                    return new PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet(availablePurchaseOptions.f7823a, availablePurchaseOptions.b);
                }
                return PassPurchaseNudgeType.PassPurchaseNudgeCard.f7832a;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            availablePurchaseOptions2 = (PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$0;
            ResultKt.b(objA);
        }
        availablePurchaseOptions = availablePurchaseOptions2;
        return new PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet(availablePurchaseOptions.f7823a, availablePurchaseOptions.b);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List listV0 = CollectionsKt.v0(new PremiumBusSlotSelectionComponent$getPassPurchaseNudgeType$$inlined$sortedBy$1(), ((PremiumBusBookingAvailableOptionsAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f7097a);
            boolean zB = PremiumBusBookingAvailableOptionsAppModelKt.b(listV0);
            if (zB) {
                premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$0 = pBAvailableSlotsTripAppModel3;
                premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$1 = listV0;
                premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.label = 2;
                Object objA1 = a1(listV0, premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2, zB);
                if (objA1 != obj2) {
                    pBAvailableSlotsTripAppModel2 = pBAvailableSlotsTripAppModel3;
                    list = listV0;
                    objA = objA1;
                    availablePurchaseOptions = (PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) objA;
                    arrayList = availablePurchaseOptions.f7823a;
                    if (!arrayList.isEmpty()) {
                        size = arrayList.size();
                        i = 0;
                        do {
                            if (i < size) {
                                obj = arrayList.get(i);
                                i++;
                            }
                        } while (((PremiumBusPurchaseOptionUiModel) obj).f7851a != PremiumBusBookingAvailableOptionType.SUPER_PASS);
                        this.n.G(pBAvailableSlotsTripAppModel2);
                        if (PremiumBusBookingAvailableOptionsAppModelKt.b(list)) {
                            premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$0 = availablePurchaseOptions;
                            premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.L$1 = null;
                            premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2.label = 3;
                            if (l1(list, premiumBusSlotSelectionComponent$getPassPurchaseNudgeType$2) != obj2) {
                                availablePurchaseOptions2 = availablePurchaseOptions;
                                availablePurchaseOptions = availablePurchaseOptions2;
                            }
                        }
                        return new PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet(availablePurchaseOptions.f7823a, availablePurchaseOptions.b);
                    }
                }
                return obj2;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listV0) {
                PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel = ((PremiumBusBookingPurchaseOptionAppModel) obj3).c;
                if (premiumBusBookingPurchaseOptionDetailsAppModel != null && premiumBusBookingPurchaseOptionDetailsAppModel.h) {
                    arrayList2.add(obj3);
                }
            }
            int i4 = WhenMappings.c[Z0(arrayList2).ordinal()];
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return PassPurchaseNudgeType.PassPurchaseNudgeCard.f7832a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a1(List list, ContinuationImpl continuationImpl, boolean z) {
        PremiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1 premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1;
        List<PremiumBusBookingPurchaseOptionAppModel> list2;
        Object objA;
        boolean z2;
        Object obj;
        int iNextIndex;
        String str;
        String str2;
        String str3;
        int i;
        String strG;
        String strA;
        Object superPassOption;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1) {
            premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1 = (PremiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1) continuationImpl;
            int i2 = premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1 = new PremiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1 = new PremiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1(this, continuationImpl);
        }
        Object obj2 = premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.label;
        int i4 = 1;
        if (i3 == 0) {
            ResultKt.b(obj2);
            list2 = list;
            premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.L$0 = list2;
            premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.Z$0 = z;
            premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.label = 1;
            objA = this.F.a(premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            z2 = z;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.Z$0;
            List list3 = (List) premiumBusSlotSelectionComponent$getPurchaseOptionsUiModelsList$1.L$0;
            ResultKt.b(obj2);
            objA = obj2;
            list2 = list3;
        }
        String str4 = ((PremiumBusNativeCityWiseConfigAppModel) objA).i;
        ArrayList arrayList = new ArrayList();
        for (PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel : list2) {
            Intrinsics.i(premiumBusBookingPurchaseOptionAppModel, "<this>");
            PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel = premiumBusBookingPurchaseOptionAppModel.c;
            TimeUtilsContract timeUtilsContract = this.q;
            Intrinsics.i(timeUtilsContract, "timeUtilsContract");
            CurrencyFeature currencyFeature = this.w;
            Intrinsics.i(currencyFeature, "currencyFeature");
            int i5 = PremiumBusPurchaseOptionUiModelKt.WhenMappings.f7852a[premiumBusBookingPurchaseOptionAppModel.b.ordinal()];
            if (i5 != i4) {
                if (i5 == 2) {
                    superPassOption = PremiumBusPurchaseOptionUiModel.DefaultOption.b;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (str4 != null && str4.length() > 0) {
                        superPassOption = new PremiumBusPurchaseOptionUiModel.CustomerSupportOption(str4);
                    }
                    i = i4;
                    superPassOption = null;
                }
                i = i4;
            } else if (premiumBusBookingPurchaseOptionDetailsAppModel == null || (str = premiumBusBookingPurchaseOptionDetailsAppModel.d) == null) {
                i = i4;
                superPassOption = null;
            } else {
                boolean z3 = premiumBusBookingPurchaseOptionDetailsAppModel.h;
                String str5 = premiumBusBookingPurchaseOptionDetailsAppModel.c;
                if (str5 == null || (str2 = premiumBusBookingPurchaseOptionDetailsAppModel.f7099a) == null || (str3 = premiumBusBookingPurchaseOptionDetailsAppModel.b) == null) {
                    i = i4;
                } else {
                    Long l = premiumBusBookingPurchaseOptionDetailsAppModel.e;
                    i = i4;
                    if (l != null && (strG = timeUtilsContract.g(l.longValue())) != null) {
                        Long l2 = premiumBusBookingPurchaseOptionDetailsAppModel.f;
                        if (l2 == null || (strA = currencyFeature.a(l2.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)) == null) {
                            strA = "";
                        }
                        String str6 = strA;
                        Integer num = premiumBusBookingPurchaseOptionDetailsAppModel.g;
                        if (num != null) {
                            superPassOption = new PremiumBusPurchaseOptionUiModel.SuperPassOption(str, z3, str5, str2, str3, strG, str6, num.intValue(), premiumBusBookingPurchaseOptionDetailsAppModel.i, premiumBusBookingPurchaseOptionDetailsAppModel.j);
                        }
                    }
                }
                superPassOption = null;
            }
            if (superPassOption != null) {
                arrayList.add(superPassOption);
            }
            i4 = i;
        }
        int i6 = i4;
        ArrayList arrayListE0 = CollectionsKt.E0(arrayList);
        int size = arrayListE0.size();
        int i7 = 0;
        do {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayListE0.get(i7);
            i7++;
        } while (((PremiumBusPurchaseOptionUiModel) obj).f7851a != PremiumBusBookingAvailableOptionType.OTHERS);
        int i8 = obj != null ? i6 : 0;
        if (z2 && str4 != null && str4.length() > 0) {
            ListIterator listIterator = arrayListE0.listIterator(arrayListE0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (((PremiumBusPurchaseOptionUiModel) listIterator.previous()).f7851a == PremiumBusBookingAvailableOptionType.SUPER_PASS) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListE0.add(iNextIndex != -1 ? iNextIndex + 1 : arrayListE0.size(), new PremiumBusPurchaseOptionUiModel.CustomerSupportOption(str4));
        }
        if (i8 == 0) {
            arrayListE0.add(PremiumBusPurchaseOptionUiModel.DefaultOption.b);
        }
        return new PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions(arrayListE0, z2);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v1, types: [app.chalo.scenes.ChaloNavOptions, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24 */
    public final void b1(PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetConfirmRidesClickIntent nearBySlotsBottomSheetConfirmRidesClickIntent) {
        int i;
        String str;
        String str2;
        int i2;
        ?? r14;
        int i3;
        ?? next;
        ?? next2;
        ?? r10;
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel;
        String str3;
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel2;
        int i4;
        StateFlow stateFlow = this.f;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).i;
        if (pBAvailableSlotsTripAppModel == null) {
            return;
        }
        ArrayList arrayList = nearBySlotsBottomSheetConfirmRidesClickIntent.f7878a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) obj;
            List list = dateAndSlotSelectedForBulkBooking.d;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((SlotsAvailableForSelection) obj2).b) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(DateAndSlotSelectedForBulkBooking.a(dateAndSlotSelectedForBulkBooking, arrayList3));
        }
        List list2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).D;
        ArrayList arrayList4 = nearBySlotsBottomSheetConfirmRidesClickIntent.f7878a;
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj3 = arrayList4.get(i6);
            i6++;
            if (((DateAndSlotSelectedForBulkBooking) obj3).c == DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE) {
                arrayList5.add(obj3);
            }
        }
        List<DateAndSlotSelectedForBulkBooking> list3 = list2;
        Iterator it = list3.iterator();
        int size3 = 0;
        while (it.hasNext()) {
            size3 += ((DateAndSlotSelectedForBulkBooking) it.next()).d.size();
        }
        int size4 = arrayList5.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            Object obj4 = null;
            if (i8 >= size4) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    List list4 = ((DateAndSlotSelectedForBulkBooking) it2.next()).d;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(((SlotsAvailableForSelection) it3.next()).f7902a.b);
                    }
                    CollectionsKt.i(arrayList7, arrayList6);
                }
                Set setG0 = CollectionsKt.G0(arrayList6);
                ArrayList arrayList8 = new ArrayList();
                int size5 = arrayList5.size();
                int i9 = 0;
                while (i9 < size5) {
                    Object obj5 = arrayList5.get(i9);
                    i9++;
                    List list5 = ((DateAndSlotSelectedForBulkBooking) obj5).d;
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj6 : list5) {
                        Object obj7 = obj4;
                        if (((SlotsAvailableForSelection) obj6).b) {
                            arrayList9.add(obj6);
                        }
                        obj4 = obj7;
                    }
                    Object obj8 = obj4;
                    ArrayList arrayList10 = new ArrayList(CollectionsKt.v(arrayList9, 10));
                    int size6 = arrayList9.size();
                    int i10 = 0;
                    while (i10 < size6) {
                        Object obj9 = arrayList9.get(i10);
                        i10++;
                        arrayList10.add(((SlotsAvailableForSelection) obj9).f7902a.b);
                        setG0 = setG0;
                    }
                    CollectionsKt.i(arrayList10, arrayList8);
                    obj4 = obj8;
                }
                Set set = setG0;
                ?? r25 = obj4;
                Set setG1 = CollectionsKt.G0(arrayList8);
                int i11 = 0;
                for (DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking2 : list3) {
                    int size7 = arrayList5.size();
                    int i12 = 0;
                    do {
                        if (i12 >= size7) {
                            i2 = 1;
                            r14 = r25;
                            break;
                        } else {
                            r14 = arrayList5.get(i12);
                            i12++;
                            i2 = 1;
                        }
                    } while (!Intrinsics.d(((DateAndSlotSelectedForBulkBooking) r14).f7795a, dateAndSlotSelectedForBulkBooking2.f7795a));
                    DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking3 = (DateAndSlotSelectedForBulkBooking) r14;
                    if (dateAndSlotSelectedForBulkBooking3 != null) {
                        Iterator it4 = dateAndSlotSelectedForBulkBooking2.d.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = r25;
                                break;
                            }
                            next = it4.next();
                        } while (!((SlotsAvailableForSelection) next).b);
                        SlotsAvailableForSelection slotsAvailableForSelection = (SlotsAvailableForSelection) next;
                        ?? r7 = (slotsAvailableForSelection == null || (pBBulkBookingAvailableSlotsTripAppResponseModel2 = slotsAvailableForSelection.f7902a) == null) ? r25 : pBBulkBookingAvailableSlotsTripAppResponseModel2.b;
                        Iterator it5 = dateAndSlotSelectedForBulkBooking3.d.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next2 = r25;
                                break;
                            }
                            next2 = it5.next();
                        } while (!((SlotsAvailableForSelection) next2).b);
                        SlotsAvailableForSelection slotsAvailableForSelection2 = (SlotsAvailableForSelection) next2;
                        if (slotsAvailableForSelection2 == null || (pBBulkBookingAvailableSlotsTripAppResponseModel = slotsAvailableForSelection2.f7902a) == null) {
                            r10 = r25;
                        } else {
                            str3 = pBBulkBookingAvailableSlotsTripAppResponseModel.b;
                        }
                        if (r7 == 0 || r10 == 0 || r7.equals(r10)) {
                            r10 = str3;
                            i3 = 0;
                        } else {
                            i3 = i2;
                        }
                    } else {
                        r10 = str3;
                        i3 = 0;
                    }
                    i11 += i3;
                }
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it6 = set2.iterator();
                    i = 0;
                    while (it6.hasNext()) {
                        if (!setG1.contains((String) it6.next()) && (i = i + 1) < 0) {
                            CollectionsKt.y0();
                            throw r25;
                        }
                    }
                }
                Source source = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
                AnalyticsContractImplKt.b(this.m, "pb nearBySlots bs confirm rides clicked", source, MapsKt.k(new Pair("initiallySuggestedAlternateSlots", String.valueOf(size3)), new Pair("modifiedSlots", String.valueOf(i11)), new Pair("removedSlots", String.valueOf(i)), new Pair("finalNumberOfSlots", String.valueOf(i7))), false, 24);
                E0(new vu0(29));
                PBOriginDestinationAppModel pBOriginDestinationAppModelV = this.n.getP();
                if (pBOriginDestinationAppModelV == null) {
                    return;
                }
                SelectedPassInfo selectedPassInfo = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).A;
                String str4 = (selectedPassInfo == null || (str2 = selectedPassInfo.f7896a) == null) ? "" : str2;
                SelectedPassInfo selectedPassInfo2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).A;
                PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = new PremiumBusSeatSelectionFlowType.BulkBooking(str4, (selectedPassInfo2 == null || (str = selectedPassInfo2.g) == null) ? "" : str, pBOriginDestinationAppModelV.c, pBOriginDestinationAppModelV.h, pBOriginDestinationAppModelV.d, pBOriginDestinationAppModelV.i, arrayList2, EmptyList.f17557a, false);
                boolean zC = pBAvailableSlotsTripAppModel.c();
                ChaloNavigationManager chaloNavigationManager = this.C;
                if (zC) {
                    Json json = ChaloJson.b;
                    json.getClass();
                    ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusSeatSelectionArgs(source, json.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), bulkBooking), (String) null, (String) null, 12), r25, 6);
                    return;
                } else {
                    Json json2 = ChaloJson.b;
                    json2.getClass();
                    ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs(source, json2.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), bulkBooking)), r25, 6);
                    return;
                }
            }
            Object obj10 = arrayList5.get(i8);
            i8++;
            List list6 = ((DateAndSlotSelectedForBulkBooking) obj10).d;
            if ((list6 instanceof Collection) && list6.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it7 = list6.iterator();
                i4 = 0;
                while (it7.hasNext()) {
                    if (((SlotsAvailableForSelection) it7.next()).b && (i4 = i4 + 1) < 0) {
                        CollectionsKt.y0();
                        throw null;
                    }
                }
            }
            i7 += i4;
        }
    }

    public final boolean c1(LocalDateTime localDateTime, Long l, Long l2) {
        LocalDate localDateA = localDateTime.a();
        return localDateA.compareTo(n1(l.longValue())) >= 0 && localDateA.compareTo(n1(l2.longValue())) <= 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d1(ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$loadingUIState$1 premiumBusSlotSelectionComponent$loadingUIState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$loadingUIState$1) {
            premiumBusSlotSelectionComponent$loadingUIState$1 = (PremiumBusSlotSelectionComponent$loadingUIState$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$loadingUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$loadingUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$loadingUIState$1 = new PremiumBusSlotSelectionComponent$loadingUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$loadingUIState$1 = new PremiumBusSlotSelectionComponent$loadingUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSlotSelectionComponent$loadingUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$loadingUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusSlotSelectionComponent$loadingUIState$1.L$0 = chaloTextStyleHelper2;
            premiumBusSlotSelectionComponent$loadingUIState$1.label = 1;
            objB = this.p.b(StringEnum.LOADING_THREE_DOTS, new Object[0], premiumBusSlotSelectionComponent$loadingUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSlotSelectionComponent$loadingUIState$1.L$0;
            ResultKt.b(objB);
        }
        return new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e1(ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$noODPairAvailableUIState$1 premiumBusSlotSelectionComponent$noODPairAvailableUIState$1;
        ImageUIState imageUIState;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        ImageUIState imageUIState2;
        ButtonUIState buttonUIStateG;
        Object objB;
        ButtonUIStateFactory buttonUIStateFactory2;
        ImageUIState imageUIState3;
        ButtonUIState buttonUIState;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$noODPairAvailableUIState$1) {
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1 = (PremiumBusSlotSelectionComponent$noODPairAvailableUIState$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$noODPairAvailableUIState$1 = new PremiumBusSlotSelectionComponent$noODPairAvailableUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1 = new PremiumBusSlotSelectionComponent$noODPairAvailableUIState$1(this, continuationImpl);
        }
        Object objB2 = premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.label;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        StringProvider stringProvider = this.p;
        if (i2 == 0) {
            ResultKt.b(objB2);
            ImageUIState imageUIState4 = new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$0 = imageUIState4;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$1 = chaloTextStyleHelper2;
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.NO_ROUTE_AVAILABLE_FOR_THIS_SEARCH, new Object[0], premiumBusSlotSelectionComponent$noODPairAvailableUIState$1);
            if (objB2 != coroutineSingletons) {
                imageUIState = imageUIState4;
                chaloTextStyleHelper = chaloTextStyleHelper2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$1;
            imageUIState = (ImageUIState) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$0;
            ResultKt.b(objB2);
            chaloTextStyleHelper = chaloTextStyleHelper3;
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$2;
                imageUIState2 = (ImageUIState) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$1;
                ButtonUIStateFactory buttonUIStateFactory4 = (ButtonUIStateFactory) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$0;
                ResultKt.b(objB2);
                buttonUIStateFactory = buttonUIStateFactory4;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, new zu0(this, 1), null, UIShape.d, false, 0.0f, 52);
                premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$0 = buttonUIStateFactory3;
                premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$1 = imageUIState2;
                premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$2 = chaloTextUIState;
                premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$3 = buttonUIStateG;
                premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.GO_BACK, new Object[0], premiumBusSlotSelectionComponent$noODPairAvailableUIState$1);
                if (objB != coroutineSingletons) {
                    buttonUIStateFactory2 = buttonUIStateFactory3;
                    imageUIState3 = imageUIState2;
                    buttonUIState = buttonUIStateG;
                    objB2 = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ButtonUIState buttonUIState2 = (ButtonUIState) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$3;
            chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$2;
            ImageUIState imageUIState5 = (ImageUIState) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$1;
            ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$0;
            ResultKt.b(objB2);
            buttonUIState = buttonUIState2;
            imageUIState3 = imageUIState5;
            buttonUIStateFactory2 = buttonUIStateFactory5;
        }
        return new SlotSelectionFullScreenErrorUIState(imageUIState3, chaloTextUIState, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB2, new zu0(this, 2), UIShape.d, false, 52), 16);
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB2, null, UITextAlign.Center, UIFontWeight.Bold, null, 102);
        premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$0 = buttonUIStateFactory3;
        premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$1 = imageUIState;
        premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$2 = chaloTextUIStateE;
        premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], premiumBusSlotSelectionComponent$noODPairAvailableUIState$1);
        if (objB3 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateE;
            objB2 = objB3;
            buttonUIStateFactory = buttonUIStateFactory3;
            imageUIState2 = imageUIState;
            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, new zu0(this, 1), null, UIShape.d, false, 0.0f, 52);
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$0 = buttonUIStateFactory3;
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$1 = imageUIState2;
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$2 = chaloTextUIState;
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.L$3 = buttonUIStateG;
            premiumBusSlotSelectionComponent$noODPairAvailableUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.GO_BACK, new Object[0], premiumBusSlotSelectionComponent$noODPairAvailableUIState$1);
            if (objB != coroutineSingletons) {
                buttonUIStateFactory2 = buttonUIStateFactory3;
                imageUIState3 = imageUIState2;
                buttonUIState = buttonUIStateG;
                objB2 = objB;
                return new SlotSelectionFullScreenErrorUIState(imageUIState3, chaloTextUIState, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB2, new zu0(this, 2), UIShape.d, false, 52), 16);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f1(Map map, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1 premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1) {
            premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1 = (PremiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1 = new PremiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1 = new PremiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1(this, continuationImpl);
        }
        Object objV = premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            if (!(premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.RescheduleTicket)) {
                if ((premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.FreshPurchase) || (premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.RePurchaseTicket) || (premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass)) {
                    return map;
                }
                throw new NoWhenBranchMatchedException();
            }
            Flow flowA = this.r.a(((PremiumBusProductPurchaseFlowType.RescheduleTicket) premiumBusProductPurchaseFlowType).c);
            premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1.L$0 = map;
            premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1.label = 1;
            objV = FlowKt.v(flowA, premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) premiumBusSlotSelectionComponent$performSpecificFilteringIfRequired$1.L$0;
            ResultKt.b(objV);
        }
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objV;
        if (premiumReserveTicketAppModel == null) {
            return map;
        }
        long j = premiumReserveTicketAppModel.b.b;
        TimeUtilsContract timeUtilsContract = this.q;
        long jQ = timeUtilsContract.q(j, timeUtilsContract.b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getKey()).longValue() == jQ) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return MapsKt.u(linkedHashMap);
    }

    public final void g1(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, String str, String str2) {
        Job job;
        Job job2 = this.Q;
        if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.Q) != null) {
            ((JobSupport) job).cancel(null);
        }
        this.Q = BuildersKt.d(this.j, null, null, new PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1(this, str2, str, pBAvailableSlotsTripAppModel, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0385  */
    /* JADX WARN: Code duplicated, block: B:419:0x0a9f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v177, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v180, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v50, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    /* JADX WARN: Type inference failed for: r4v51, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    /* JADX WARN: Type inference failed for: r4v53, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    /* JADX WARN: Type inference failed for: r7v29, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v35, types: [T, java.lang.Object] */
    public final void h1(PremiumBusSlotSelectionIntent intent) {
        ?? r3;
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel;
        ArrayList arrayList;
        Object obj;
        List listG;
        boolean z;
        String strValueOf;
        String str;
        String str2;
        ?? arrayList2;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel2;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel;
        String str3;
        ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel;
        int iIntValue;
        Object next;
        List list;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel3;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel4;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops2;
        Job job;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z2 = intent instanceof PremiumBusSlotSelectionIntent.InitializationIntent;
        PremiumBusArgs.SlotSelectionArgs slotSelectionArgs = this.k;
        PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager = this.n;
        int i = 0;
        boolean z3 = true;
        ContextScope contextScope = this.j;
        List list2 = null;
        if (z2) {
            PremiumBusSlotSelectionIntent.InitializationIntent initializationIntent = (PremiumBusSlotSelectionIntent.InitializationIntent) intent;
            if (this.d) {
                return;
            }
            this.d = true;
            Job job2 = this.N;
            if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.N) != null) {
                ((JobSupport) job).cancel(null);
            }
            this.S = null;
            PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = initializationIntent.f7872a;
            Source source = initializationIntent.b;
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("flow", premiumBusProductPurchaseFlowType.toString()));
            String str4 = slotSelectionArgs.e;
            if (str4 != null) {
                if (StringsKt.F(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    linkedHashMapK.put("attribution type", str4);
                }
            }
            AnalyticsContractImplKt.a(this.m, "pb slot selection screen opened", Source.PREMIUM_BUS_STOP_SELECTION_SCREEN, source, linkedHashMapK, 48);
            E0(new dv0(i));
            this.o.X(premiumBusProductPurchaseFlowType);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            if (premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.FreshPurchase) {
                PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = (PremiumBusProductPurchaseFlowType.FreshPurchase) premiumBusProductPurchaseFlowType;
                objectRef2.element = freshPurchase.c;
                objectRef3.element = freshPurchase.d;
            } else if (premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass) {
                PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass ticketPurchaseThroughPass = (PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass) premiumBusProductPurchaseFlowType;
                objectRef2.element = ticketPurchaseThroughPass.d;
                objectRef3.element = ticketPurchaseThroughPass.e;
                objectRef.element = ticketPurchaseThroughPass.c;
            } else if (premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.RePurchaseTicket) {
                PBOriginDestinationAppModel pBOriginDestinationAppModel = ((PremiumBusProductPurchaseFlowType.RePurchaseTicket) premiumBusProductPurchaseFlowType).c;
                objectRef2.element = pBOriginDestinationAppModel.a().d();
                objectRef3.element = pBOriginDestinationAppModel.a().e();
                premiumBusPurchaseInfoManager.E(pBOriginDestinationAppModel);
            } else {
                if (!(premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.RescheduleTicket)) {
                    throw new NoWhenBranchMatchedException();
                }
                PBOriginDestinationAppModel pBOriginDestinationAppModel2 = ((PremiumBusProductPurchaseFlowType.RescheduleTicket) premiumBusProductPurchaseFlowType).d;
                objectRef2.element = pBOriginDestinationAppModel2.a().d();
                objectRef3.element = pBOriginDestinationAppModel2.a().e();
                premiumBusPurchaseInfoManager.E(pBOriginDestinationAppModel2);
            }
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleInitializationIntent$2(this, initializationIntent, objectRef2, objectRef3, objectRef, null), 3);
            return;
        }
        boolean z4 = intent instanceof PremiumBusSlotSelectionIntent.ViewAllSlotsClickIntent;
        int i2 = 28;
        StateFlow stateFlow = this.f;
        if (z4) {
            PremiumBusSlotSelectionIntent.ViewAllSlotsClickIntent viewAllSlotsClickIntent = (PremiumBusSlotSelectionIntent.ViewAllSlotsClickIntent) intent;
            PBOriginDestinationAppModel pBOriginDestinationAppModel3 = viewAllSlotsClickIntent.f7887a;
            premiumBusPurchaseInfoManager.E(pBOriginDestinationAppModel3);
            Map map = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).g;
            if (map != null && (pBODPairWithSlotSectionListUiModel4 = (PBODPairWithSlotSectionListUiModel) map.get(((PremiumBusSlotSelectionDataState) stateFlow.getValue()).h)) != null && (oDPairsAndRespectiveSlotsBetweenStops2 = pBODPairWithSlotSectionListUiModel4.c) != null) {
                list2 = oDPairsAndRespectiveSlotsBetweenStops2.f7216a;
            }
            Source source2 = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
            LinkedHashMap linkedHashMapS0 = S0();
            linkedHashMapS0.put("from stop name", pBOriginDestinationAppModel3.d);
            linkedHashMapS0.put("to stop name", pBOriginDestinationAppModel3.i);
            linkedHashMapS0.put("from stop id", pBOriginDestinationAppModel3.c);
            linkedHashMapS0.put("to stop id", pBOriginDestinationAppModel3.h);
            linkedHashMapS0.put("route id", pBOriginDestinationAppModel3.f7091a);
            AnalyticsContractImplKt.b(this.m, "pb view all slots clicked", source2, linkedHashMapS0, false, 24);
            E0(new za0(i2, viewAllSlotsClickIntent, this, list2));
            return;
        }
        boolean zEquals = intent.equals(PremiumBusSlotSelectionIntent.ExploreAvailableRoutesClickIntent.f7871a);
        ChaloNavigationManager chaloNavigationManager = this.C;
        if (zEquals) {
            AnalyticsContractImplKt.b(this.m, "pb explore available routes clicked", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, null, false, 28);
            ChaloNavigationManagerKt.e(chaloNavigationManager, new WebViewArgs("https://chalo.com/mumbai/chalo-bus/routes", "", false, true), null, 6);
            return;
        }
        if (intent.equals(PremiumBusSlotSelectionIntent.ErrorSnackBarActionBtnClickIntent.f7870a)) {
            E0(new vu0(24));
            return;
        }
        int i3 = 20;
        if (intent instanceof PremiumBusSlotSelectionIntent.PurchaseOptionClickedIntent) {
            PremiumBusSlotSelectionIntent.PurchaseOptionClickedIntent purchaseOptionClickedIntent = (PremiumBusSlotSelectionIntent.PurchaseOptionClickedIntent) intent;
            PassPurchaseNudgeType passPurchaseNudgeType = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).x;
            if (!(passPurchaseNudgeType instanceof PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet)) {
                if (!Intrinsics.d(passPurchaseNudgeType, PassPurchaseNudgeType.PassPurchaseNudgeCard.f7832a) && passPurchaseNudgeType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = false;
            }
            E0(new vu0(i3));
            PremiumBusBookingAvailableOptionType premiumBusBookingAvailableOptionType = purchaseOptionClickedIntent.f7882a.f7851a;
            LinkedHashMap linkedHashMapS1 = S0();
            linkedHashMapS1.put("supportedPassesCount", premiumBusBookingAvailableOptionType.getOptionTypeStr());
            AnalyticsContractImplKt.b(this.m, "pb purchase option bs item clicked", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, linkedHashMapS1, false, 24);
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2(this, purchaseOptionClickedIntent, z3, null), 3);
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.SectionItemClickedIntent) {
            PremiumBusSlotSelectionIntent.SectionItemClickedIntent sectionItemClickedIntent = (PremiumBusSlotSelectionIntent.SectionItemClickedIntent) intent;
            this.S = Long.valueOf(sectionItemClickedIntent.f7883a);
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleSectionItemClickedIntent$1(this, sectionItemClickedIntent, null), 3);
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.SlotClickedIntent) {
            PremiumBusSlotSelectionIntent.SlotClickedIntent slotClickedIntent = (PremiumBusSlotSelectionIntent.SlotClickedIntent) intent;
            if (!(((PremiumBusSlotSelectionDataState) stateFlow.getValue()).f instanceof PBSlotSelectionScreenBottomSheetType.ViewAllSlots)) {
                E0(new et0(slotClickedIntent, 19));
                return;
            }
            PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).f;
            Intrinsics.g(pBSlotSelectionScreenBottomSheetType, "null cannot be cast to non-null type app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType.ViewAllSlots");
            PBSlotSelectionScreenBottomSheetType.ViewAllSlots viewAllSlots = (PBSlotSelectionScreenBottomSheetType.ViewAllSlots) pBSlotSelectionScreenBottomSheetType;
            Map map2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).g;
            E0(new n3(viewAllSlots, slotClickedIntent, this, (map2 == null || (pBODPairWithSlotSectionListUiModel3 = (PBODPairWithSlotSectionListUiModel) map2.get(((PremiumBusSlotSelectionDataState) stateFlow.getValue()).h)) == null || (oDPairsAndRespectiveSlotsBetweenStops = pBODPairWithSlotSectionListUiModel3.c) == null) ? null : oDPairsAndRespectiveSlotsBetweenStops.f7216a, 23));
            return;
        }
        int i4 = 5;
        int i5 = 4;
        if (intent instanceof PremiumBusSlotSelectionIntent.ConfirmSlotClickedIntent) {
            PremiumBusSlotSelectionIntent.ConfirmSlotClickedIntent confirmSlotClickedIntent = (PremiumBusSlotSelectionIntent.ConfirmSlotClickedIntent) intent;
            Job job3 = this.O;
            if (job3 == null || !((AbstractCoroutine) job3).isActive()) {
                E0(new et0(confirmSlotClickedIntent, 21));
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2 = confirmSlotClickedIntent.f7866a;
                List list3 = confirmSlotClickedIntent.c;
                int i6 = WhenMappings.b[confirmSlotClickedIntent.b.ordinal()];
                if (i6 == 1) {
                    str3 = "pb book single rides clicked";
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = "pb book multiple rides clicked";
                }
                String str5 = str3;
                String str6 = pBAvailableSlotsTripAppModel2.f;
                long j = pBAvailableSlotsTripAppModel2.g;
                String str7 = pBAvailableSlotsTripAppModel2.b;
                AnalyticsContractImplKt.b(this.m, str5, Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, MapsKt.i(new Pair("tripId", str6), new Pair("route id", str7), new Pair("from stop id", pBAvailableSlotsTripAppModel2.d), new Pair("to stop id", pBAvailableSlotsTripAppModel2.e), new Pair("slotFromStopTime", Long.valueOf(j)), new Pair("availableSeats", String.valueOf(pBAvailableSlotsTripAppModel2.j))), false, 24);
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel = ((ODPairWithSlotsListAppModel) next).c;
                        if (pBAvailableSlotsInfoAppModel != null && (list = pBAvailableSlotsInfoAppModel.c) != null && list.contains(pBAvailableSlotsTripAppModel2)) {
                            break;
                        }
                    }
                    oDPairWithSlotsListAppModel = (ODPairWithSlotsListAppModel) next;
                } else {
                    oDPairWithSlotsListAppModel = null;
                }
                PBOriginDestinationAppModel pBOriginDestinationAppModel4 = oDPairWithSlotsListAppModel != null ? oDPairWithSlotsListAppModel.f7215a : null;
                if (oDPairWithSlotsListAppModel != null) {
                    int iIndexOf = list3.indexOf(oDPairWithSlotsListAppModel);
                    Integer numValueOf = Integer.valueOf(iIndexOf);
                    if (iIndexOf < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                this.T = pBAvailableSlotsTripAppModel2;
                LinkedHashMap linkedHashMapS2 = S0();
                linkedHashMapS2.put("selectedSlotTripId", pBAvailableSlotsTripAppModel2.f);
                linkedHashMapS2.put("selectedSlotSeatAvailable", String.valueOf(pBAvailableSlotsTripAppModel2.b()));
                linkedHashMapS2.put("selectedSlotTime", String.valueOf(j));
                linkedHashMapS2.put("selectedSlotArrivalTime", String.valueOf(pBAvailableSlotsTripAppModel2.h));
                linkedHashMapS2.put("selectedSlotRouteId", str7);
                linkedHashMapS2.put("selectedODPairPosition", Integer.valueOf(iIntValue + 1));
                AnalyticsContractImplKt.b(this.m, "pb slot selected by user", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, linkedHashMapS2, false, 24);
                if (pBOriginDestinationAppModel4 != null) {
                    premiumBusPurchaseInfoManager.E(pBOriginDestinationAppModel4);
                }
                premiumBusPurchaseInfoManager.G(pBAvailableSlotsTripAppModel2);
                E0(new dv0(8));
                this.O = BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleSlotClickedForFreshPurchaseFlow$2(this, pBAvailableSlotsTripAppModel2, null), 3);
                return;
            }
            return;
        }
        if (intent.equals(PremiumBusSlotSelectionIntent.CloseBottomSheetBtnClickIntent.f7865a)) {
            if (((PremiumBusSlotSelectionDataState) stateFlow.getValue()).f == null) {
                return;
            }
            PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).f;
            if (pBSlotSelectionScreenBottomSheetType2 instanceof PBSlotSelectionScreenBottomSheetType.ViewAllSlots) {
                E0(new ev0(this, i));
                return;
            } else {
                if (!(pBSlotSelectionScreenBottomSheetType2 instanceof PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) && !(pBSlotSelectionScreenBottomSheetType2 instanceof PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar) && !(pBSlotSelectionScreenBottomSheetType2 instanceof PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet) && pBSlotSelectionScreenBottomSheetType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new dv0(i4));
                return;
            }
        }
        if (intent.equals(PremiumBusSlotSelectionIntent.BackBtnClickIntent.f7863a)) {
            if (((PremiumBusSlotSelectionDataState) stateFlow.getValue()).f != null) {
                E0(new vu0(26));
                return;
            } else {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
                return;
            }
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.OriginDestinationStopDetailsClickedIntent) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel5 = ((PremiumBusSlotSelectionIntent.OriginDestinationStopDetailsClickedIntent) intent).f7880a;
            String str8 = pBOriginDestinationAppModel5.h;
            String str9 = pBOriginDestinationAppModel5.c;
            LinkedHashMap linkedHashMapS3 = S0();
            linkedHashMapS3.put("from stop name", pBOriginDestinationAppModel5.d);
            linkedHashMapS3.put("to stop name", pBOriginDestinationAppModel5.i);
            linkedHashMapS3.put("from stop id", str9);
            linkedHashMapS3.put("to stop id", str8);
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel3 = this.T;
            String str10 = pBAvailableSlotsTripAppModel3 != null ? pBAvailableSlotsTripAppModel3.f : null;
            linkedHashMapS3.put("selectedSlotTripId", str10 != null ? str10 : "");
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel4 = this.T;
            linkedHashMapS3.put("selectedSlotSeatAvailable", String.valueOf(pBAvailableSlotsTripAppModel4 != null ? Boolean.valueOf(pBAvailableSlotsTripAppModel4.b()) : null));
            AnalyticsContractImplKt.b(this.m, "pb directions to stop clicked", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, linkedHashMapS3, false, 24);
            ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumStopDetailsArgs(str9, str8, slotSelectionArgs.e, pBOriginDestinationAppModel5.f7091a), null, 6);
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.PassPurchaseNudgeCardClickedIntent) {
            PremiumBusSlotSelectionIntent.PassPurchaseNudgeCardClickedIntent passPurchaseNudgeCardClickedIntent = (PremiumBusSlotSelectionIntent.PassPurchaseNudgeCardClickedIntent) intent;
            Job job4 = this.O;
            if ((job4 == null || !((AbstractCoroutine) job4).isActive()) && (pBAvailableSlotsTripAppModel = passPurchaseNudgeCardClickedIntent.f7881a) != null) {
                this.T = pBAvailableSlotsTripAppModel;
                LinkedHashMap linkedHashMapS4 = S0();
                linkedHashMapS4.put("selectedSlotTripId", pBAvailableSlotsTripAppModel.f);
                linkedHashMapS4.put("selectedSlotSeatAvailable", String.valueOf(pBAvailableSlotsTripAppModel.b()));
                linkedHashMapS4.put("selectedSlotTime", String.valueOf(pBAvailableSlotsTripAppModel.g));
                linkedHashMapS4.put("selectedSlotArrivalTime", String.valueOf(pBAvailableSlotsTripAppModel.h));
                AnalyticsContractImplKt.b(this.m, "pb pass purchased card clicked by user", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, linkedHashMapS4, false, 24);
                premiumBusPurchaseInfoManager.G(pBAvailableSlotsTripAppModel);
                PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).p;
                if (premiumBusProductPurchaseFlowType2 instanceof PremiumBusProductPurchaseFlowType.RescheduleTicket) {
                    return;
                }
                if (!(premiumBusProductPurchaseFlowType2 instanceof PremiumBusProductPurchaseFlowType.FreshPurchase) && !(premiumBusProductPurchaseFlowType2 instanceof PremiumBusProductPurchaseFlowType.RePurchaseTicket) && !(premiumBusProductPurchaseFlowType2 instanceof PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass) && premiumBusProductPurchaseFlowType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                W0(pBAvailableSlotsTripAppModel, true);
                return;
            }
            return;
        }
        if (intent.equals(PremiumBusSlotSelectionIntent.DismissSnackBar.f7869a)) {
            E0(new vu0(23));
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.ErrorScreenRetryBtnClickedIntent) {
            this.S = 0L;
            E0(new et0((PremiumBusSlotSelectionIntent.ErrorScreenRetryBtnClickedIntent) intent, 22));
            Map map3 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).g;
            if (map3 == null || (pBODPairWithSlotSectionListUiModel2 = (PBODPairWithSlotSectionListUiModel) map3.get(0L)) == null) {
                E0(new dv0(2));
                return;
            }
            if (!((PremiumBusSlotSelectionDataState) stateFlow.getValue()).v.isEmpty()) {
                V0(pBODPairWithSlotSectionListUiModel2);
                return;
            }
            E0(new dv0(3));
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).q;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).r;
            if (pBStopPlaceSelectedAppModel == null || pBStopPlaceSelectedAppModel2 == null) {
                E0(new dv0(i5));
                return;
            } else {
                BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleErrorScreenRetryBtnClickedIntent$4(this, pBODPairWithSlotSectionListUiModel2, null), 3);
                return;
            }
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.LoadMoreSlotsIntent) {
            Job job5 = this.R;
            if (job5 != null) {
                ((JobSupport) job5).cancel(null);
            }
            PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState = (PremiumBusSlotSelectionDataState) stateFlow.getValue();
            Long l = premiumBusSlotSelectionDataState.h;
            if (l != null) {
                long jLongValue = l.longValue();
                Map map4 = premiumBusSlotSelectionDataState.g;
                if (map4 == null || (pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) map4.get(l)) == null) {
                    return;
                }
                int i7 = pBODPairWithSlotSectionListUiModel.i;
                boolean z5 = pBODPairWithSlotSectionListUiModel.k;
                List list4 = premiumBusSlotSelectionDataState.v;
                if (!z5 || list4.isEmpty()) {
                    return;
                }
                E0(new v3(jLongValue, 5));
                this.R = BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleLoadMoreSlotsIntent$2(this, jLongValue, list4, i7, premiumBusSlotSelectionDataState, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.CallCustomerSupportBtnClickIntent) {
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$checkAndRaiseCustomerSupportBtnClickedEventForSingleSupportedValuePass$1(this, null), 3);
            E0(new vu0(21));
            this.B.d(((PremiumBusSlotSelectionIntent.CallCustomerSupportBtnClickIntent) intent).f7864a);
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent) {
            E0(new dv0(7));
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleAggregateSlotFetchErrorBottomSheetRetryBtnClickIntent$2(this, (PremiumBusSlotSelectionIntent.AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent) intent, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSlotSelectionIntent.DismissMultipleSlotSelectionCalendarIntent.f7868a)) {
            AnalyticsContractImplKt.b(this.m, "pb multi date selection dismiss btn clicked", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, null, false, 28);
            E0(new vu0(28));
            return;
        }
        if (intent.equals(PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarCancelClickIntent.f7874a)) {
            E0(new dv0(6));
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDateClickIntent) {
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarDateClickIntent$1(this, (PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDateClickIntent) intent, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDismissClickIntent.f7876a)) {
            AnalyticsContractImplKt.b(this.m, "pb multi date selection dismiss btn clicked", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, null, false, 28);
            E0(new dv0(9));
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarProceedClickIntent) {
            PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarProceedClickIntent multipleSlotSelectionCalendarProceedClickIntent = (PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarProceedClickIntent) intent;
            E0(new vu0(27));
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel5 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).i;
            if (pBAvailableSlotsTripAppModel5 == null) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = multipleSlotSelectionCalendarProceedClickIntent.f7877a;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
            int size = arrayList4.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj2 = arrayList4.get(i8);
                i8++;
                arrayList5.add(((LocalDateTime) obj2).a());
            }
            final FilteringSequence filteringSequenceE = SequencesKt.e(CollectionsKt.o(((PremiumBusSlotSelectionDataState) stateFlow.getValue()).B), new et0(CollectionsKt.B0(arrayList5), 20));
            final PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarProceedClickIntent$$inlined$sortedBy$1 premiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarProceedClickIntent$$inlined$sortedBy$1 = new PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarProceedClickIntent$$inlined$sortedBy$1();
            List listQ = SequencesKt.q(new Sequence<Object>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$sortedWith$1
                @Override // kotlin.sequences.Sequence
                /* JADX INFO: renamed from: iterator */
                public final Iterator getF17660a() {
                    ArrayList arrayListA = SequencesKt___SequencesKt.a(filteringSequenceE);
                    CollectionsKt.t0(arrayListA, premiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarProceedClickIntent$$inlined$sortedBy$1);
                    return arrayListA.iterator();
                }
            });
            if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
                Iterator it2 = listQ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (((DateAndSlotSelectedForBulkBooking) it2.next()).c == DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt.v(listQ, 10));
            Iterator it3 = listQ.iterator();
            while (it3.hasNext()) {
                DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) it3.next();
                String str11 = dateAndSlotSelectedForBulkBooking.f7795a;
                LocalDateTime localDateTime = dateAndSlotSelectedForBulkBooking.b;
                DateAvailabilityStatus dateAvailabilityStatus = dateAndSlotSelectedForBulkBooking.c;
                List list5 = dateAndSlotSelectedForBulkBooking.d;
                switch (WhenMappings.d[dateAvailabilityStatus.ordinal()]) {
                    case 1:
                        it3 = it3;
                        List list6 = list5;
                        arrayList2 = new ArrayList(CollectionsKt.v(list6, 10));
                        Iterator it4 = list6.iterator();
                        int i9 = 0;
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            Iterator it5 = it4;
                            arrayList2.add(new SlotsAvailableForSelection(((SlotsAvailableForSelection) next2).f7902a, i9 == 0));
                            i9 = i10;
                            it4 = it5;
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        SlotsAvailableForSelection slotsAvailableForSelection = (SlotsAvailableForSelection) CollectionsKt.H(list5);
                        arrayList2 = slotsAvailableForSelection != null ? CollectionsKt.R(new SlotsAvailableForSelection(slotsAvailableForSelection.f7902a, true)) : EmptyList.f17557a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList6.add(new DateAndSlotSelectedForBulkBooking(str11, localDateTime, dateAvailabilityStatus, arrayList2));
                it3 = it3;
                premiumBusPurchaseInfoManager = premiumBusPurchaseInfoManager;
            }
            PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager2 = premiumBusPurchaseInfoManager;
            arrayList3.addAll(arrayList6);
            E0(new qd(13, arrayList3));
            SelectedPassInfo selectedPassInfo = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).A;
            if (selectedPassInfo == null || (strValueOf = String.valueOf(selectedPassInfo.d)) == null) {
                strValueOf = "";
            }
            Source source3 = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
            Pair pair = new Pair("datesSelectedCount", Integer.valueOf(arrayList3.size()));
            ArrayList arrayList7 = new ArrayList();
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                if (((DateAndSlotSelectedForBulkBooking) obj3).c == DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE) {
                    arrayList7.add(obj3);
                }
            }
            AnalyticsContractImplKt.b(this.m, "pb multi date selection proceed btn clicked", source3, MapsKt.i(pair, new Pair("nearbySlotsDateSelectedCount", Integer.valueOf(arrayList7.size())), new Pair("selectedSlotTime", this.q.e(pBAvailableSlotsTripAppModel5.g)), new Pair("remainingRides", strValueOf)), false, 24);
            if (z) {
                ArrayList arrayList8 = new ArrayList();
                int size3 = arrayList3.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    if (((DateAndSlotSelectedForBulkBooking) obj4).c == DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE) {
                        arrayList8.add(obj4);
                    }
                }
                E0(new za0(27, arrayList3, pBAvailableSlotsTripAppModel5, arrayList8));
                return;
            }
            PBOriginDestinationAppModel pBOriginDestinationAppModelV = premiumBusPurchaseInfoManager2.getP();
            if (pBOriginDestinationAppModelV == null) {
                return;
            }
            SelectedPassInfo selectedPassInfo2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).A;
            String str12 = (selectedPassInfo2 == null || (str2 = selectedPassInfo2.f7896a) == null) ? "" : str2;
            SelectedPassInfo selectedPassInfo3 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).A;
            PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = new PremiumBusSeatSelectionFlowType.BulkBooking(str12, (selectedPassInfo3 == null || (str = selectedPassInfo3.g) == null) ? "" : str, pBOriginDestinationAppModelV.c, pBOriginDestinationAppModelV.h, pBOriginDestinationAppModelV.d, pBOriginDestinationAppModelV.i, arrayList3, EmptyList.f17557a, false);
            if (pBAvailableSlotsTripAppModel5.c()) {
                Source source4 = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
                Json json = ChaloJson.b;
                json.getClass();
                ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusSeatSelectionArgs(source4, json.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), bulkBooking), (String) null, (String) null, 12), null, 6);
                return;
            }
            Source source5 = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
            Json json2 = ChaloJson.b;
            json2.getClass();
            ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs(source5, json2.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), bulkBooking)), null, 6);
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetGoBackClickIntent) {
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleNearBySlotsBottomSheetGoBackClickIntent$1(this, (PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetGoBackClickIntent) intent, null), 3);
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetConfirmRidesClickIntent) {
            b1((PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetConfirmRidesClickIntent) intent);
            return;
        }
        if (intent instanceof PremiumBusSlotSelectionIntent.DateAndSlotSelectedForBulkBookingRemoveClickIntent) {
            PremiumBusSlotSelectionIntent.DateAndSlotSelectedForBulkBookingRemoveClickIntent dateAndSlotSelectedForBulkBookingRemoveClickIntent = (PremiumBusSlotSelectionIntent.DateAndSlotSelectedForBulkBookingRemoveClickIntent) intent;
            final PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel6 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).i;
            if (pBAvailableSlotsTripAppModel6 == null) {
                return;
            }
            List list7 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).C;
            final ArrayList arrayList9 = new ArrayList();
            for (Object obj5 : list7) {
                if (!Intrinsics.d(((DateAndSlotSelectedForBulkBooking) obj5).f7795a, dateAndSlotSelectedForBulkBookingRemoveClickIntent.f7867a.f7795a)) {
                    arrayList9.add(obj5);
                }
            }
            final int i13 = 0;
            E0(new Function1() { // from class: cv0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj6) {
                    PremiumBusSlotSelectionDataState it6 = (PremiumBusSlotSelectionDataState) obj6;
                    switch (i13) {
                        case 0:
                            Intrinsics.i(it6, "it");
                            ArrayList arrayList10 = arrayList9;
                            return PremiumBusSlotSelectionDataState.a(it6, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet(arrayList10, pBAvailableSlotsTripAppModel6), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, arrayList10, null, -1073741857);
                        default:
                            Intrinsics.i(it6, "it");
                            ArrayList arrayList11 = arrayList9;
                            return PremiumBusSlotSelectionDataState.a(it6, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet(arrayList11, pBAvailableSlotsTripAppModel6), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, arrayList11, null, -1073741857);
                    }
                }
            });
            if (!arrayList9.isEmpty()) {
                int size4 = arrayList9.size();
                int i14 = 0;
                while (i14 < size4) {
                    Object obj6 = arrayList9.get(i14);
                    i14++;
                    if (((DateAndSlotSelectedForBulkBooking) obj6).c == DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE) {
                        return;
                    }
                }
            }
            BuildersKt.d(contextScope, null, null, new PremiumBusSlotSelectionComponent$handleDateAndSlotSelectedForBulkBookingRemoveClickIntent$3(this, arrayList9, null), 3);
            return;
        }
        int i15 = 0;
        if (!(intent instanceof PremiumBusSlotSelectionIntent.SelectNearBySlotClickedForBulkBookingIntent)) {
            if (!(intent instanceof PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent selectNearByViewMoreClickedForBulkBookingIntent = (PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent) intent;
            AnalyticsContractImplKt.b(this.m, "pb alternate slot selection bs view more clicked", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, null, false, 28);
            Job job6 = this.U;
            if (job6 != null) {
                r3 = 0;
                ((JobSupport) job6).cancel(null);
            } else {
                r3 = 0;
            }
            this.U = BuildersKt.d(contextScope, r3, r3, new PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1(this, selectNearByViewMoreClickedForBulkBookingIntent, KUUID.a(), r3), 3);
            return;
        }
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel2 = ((PremiumBusSlotSelectionIntent.SelectNearBySlotClickedForBulkBookingIntent) intent).f7884a;
        final PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel7 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).i;
        if (pBAvailableSlotsTripAppModel7 == null) {
            return;
        }
        PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType3 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).f;
        if (!(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet)) {
            if (!(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) && !(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar) && !(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.ViewAllSlots) && pBSlotSelectionScreenBottomSheetType3 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        ArrayList arrayList10 = ((PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet) pBSlotSelectionScreenBottomSheetType3).f7825a;
        final ArrayList arrayList11 = new ArrayList(CollectionsKt.v(arrayList10, 10));
        int size5 = arrayList10.size();
        int i16 = 0;
        while (i16 < size5) {
            Object obj7 = arrayList10.get(i16);
            i16++;
            DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking2 = (DateAndSlotSelectedForBulkBooking) obj7;
            DateAvailabilityStatus dateAvailabilityStatus2 = dateAndSlotSelectedForBulkBooking2.c;
            List list8 = dateAndSlotSelectedForBulkBooking2.d;
            switch (WhenMappings.d[dateAvailabilityStatus2.ordinal()]) {
                case 1:
                    List list9 = list8;
                    if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                        Iterator it6 = list9.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (Intrinsics.d(((SlotsAvailableForSelection) it6.next()).f7902a.b, pBBulkBookingAvailableSlotsTripAppResponseModel2.b)) {
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt.v(list9, 10));
                                    Iterator it7 = list9.iterator();
                                    while (it7.hasNext()) {
                                        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel3 = ((SlotsAvailableForSelection) it7.next()).f7902a;
                                        arrayList12.add(new SlotsAvailableForSelection(pBBulkBookingAvailableSlotsTripAppResponseModel3, Intrinsics.d(pBBulkBookingAvailableSlotsTripAppResponseModel3.b, pBBulkBookingAvailableSlotsTripAppResponseModel2.b)));
                                    }
                                    if (arrayList12.size() <= 1) {
                                        pBBulkBookingAvailableSlotsTripAppResponseModel = pBBulkBookingAvailableSlotsTripAppResponseModel2;
                                        arrayList = arrayList10;
                                        listG = arrayList12;
                                    } else {
                                        SlotsAvailableForSelection slotsAvailableForSelection2 = (SlotsAvailableForSelection) CollectionsKt.F(arrayList12);
                                        int size6 = arrayList12.size();
                                        int i17 = i15;
                                        while (true) {
                                            if (i17 < size6) {
                                                Object obj8 = arrayList12.get(i17);
                                                i17++;
                                                SlotsAvailableForSelection slotsAvailableForSelection3 = (SlotsAvailableForSelection) obj8;
                                                if (slotsAvailableForSelection3.b && !Intrinsics.d(slotsAvailableForSelection3.f7902a.b, slotsAvailableForSelection2.f7902a.b)) {
                                                    obj = obj8;
                                                }
                                            } else {
                                                obj = null;
                                            }
                                        }
                                        SlotsAvailableForSelection slotsAvailableForSelection4 = (SlotsAvailableForSelection) obj;
                                        if (slotsAvailableForSelection4 != null) {
                                            ArrayList arrayList13 = new ArrayList();
                                            int size7 = arrayList12.size();
                                            int i18 = 0;
                                            while (i18 < size7) {
                                                Object obj9 = arrayList12.get(i18);
                                                i18++;
                                                SlotsAvailableForSelection slotsAvailableForSelection5 = (SlotsAvailableForSelection) obj9;
                                                PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel4 = pBBulkBookingAvailableSlotsTripAppResponseModel2;
                                                ArrayList arrayList14 = arrayList10;
                                                if (!Intrinsics.d(slotsAvailableForSelection5.f7902a.b, slotsAvailableForSelection2.f7902a.b) && !Intrinsics.d(slotsAvailableForSelection5.f7902a.b, slotsAvailableForSelection4.f7902a.b)) {
                                                    arrayList13.add(obj9);
                                                }
                                                pBBulkBookingAvailableSlotsTripAppResponseModel2 = pBBulkBookingAvailableSlotsTripAppResponseModel4;
                                                arrayList10 = arrayList14;
                                            }
                                            pBBulkBookingAvailableSlotsTripAppResponseModel = pBBulkBookingAvailableSlotsTripAppResponseModel2;
                                            arrayList = arrayList10;
                                            ListBuilder listBuilderY = CollectionsKt.y();
                                            listBuilderY.add(slotsAvailableForSelection2);
                                            listBuilderY.add(slotsAvailableForSelection4);
                                            listBuilderY.addAll(arrayList13);
                                            listG = listBuilderY.g();
                                        } else {
                                            pBBulkBookingAvailableSlotsTripAppResponseModel = pBBulkBookingAvailableSlotsTripAppResponseModel2;
                                            arrayList = arrayList10;
                                            listG = arrayList12;
                                        }
                                    }
                                    dateAndSlotSelectedForBulkBooking2 = new DateAndSlotSelectedForBulkBooking(dateAndSlotSelectedForBulkBooking2.f7795a, dateAndSlotSelectedForBulkBooking2.b, dateAndSlotSelectedForBulkBooking2.c, listG);
                                }
                            }
                            break;
                        }
                    }
                    arrayList11.add(dateAndSlotSelectedForBulkBooking2);
                    pBBulkBookingAvailableSlotsTripAppResponseModel2 = pBBulkBookingAvailableSlotsTripAppResponseModel;
                    arrayList10 = arrayList;
                    i15 = 0;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    pBBulkBookingAvailableSlotsTripAppResponseModel = pBBulkBookingAvailableSlotsTripAppResponseModel2;
                    arrayList = arrayList10;
                    arrayList11.add(dateAndSlotSelectedForBulkBooking2);
                    pBBulkBookingAvailableSlotsTripAppResponseModel2 = pBBulkBookingAvailableSlotsTripAppResponseModel;
                    arrayList10 = arrayList;
                    i15 = 0;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        final int i19 = 1;
        E0(new Function1() { // from class: cv0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj10) {
                PremiumBusSlotSelectionDataState it8 = (PremiumBusSlotSelectionDataState) obj10;
                switch (i19) {
                    case 0:
                        Intrinsics.i(it8, "it");
                        ArrayList arrayList15 = arrayList11;
                        return PremiumBusSlotSelectionDataState.a(it8, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet(arrayList15, pBAvailableSlotsTripAppModel7), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, arrayList15, null, -1073741857);
                    default:
                        Intrinsics.i(it8, "it");
                        ArrayList arrayList16 = arrayList11;
                        return PremiumBusSlotSelectionDataState.a(it8, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet(arrayList16, pBAvailableSlotsTripAppModel7), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, arrayList16, null, -1073741857);
                }
            }
        });
    }

    public final void i1(String str, String str2, List list) {
        Source source = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
        LinkedHashMap linkedHashMapS0 = S0();
        linkedHashMapS0.put("from stop id", str);
        linkedHashMapS0.put("to stop id", str2);
        linkedHashMapS0.put("totalODPairs", Integer.valueOf(list.size()));
        AnalyticsContractImplKt.b(this.m, "pb od pair fetch success", source, linkedHashMapS0, false, 24);
    }

    public final void j1(long j, ODPairAndSlotsFetchFailedReasons oDPairAndSlotsFetchFailedReasons) {
        LinkedHashMap linkedHashMapS0 = S0();
        linkedHashMapS0.put("selectedSection", String.valueOf(j));
        linkedHashMapS0.put("failureReason", oDPairAndSlotsFetchFailedReasons.toString());
        AnalyticsContractImplKt.b(this.m, "pb slot fetch failure", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, linkedHashMapS0, false, 24);
    }

    public final void k1(long j, List list) {
        Object obj;
        Object next;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel;
        List list2;
        List list3;
        List list4;
        List list5 = list;
        Iterator it = list5.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel2 = ((ODPairWithSlotsListAppModel) next).b;
            if (pBAvailableSlotsInfoAppModel2 != null && (list4 = pBAvailableSlotsInfoAppModel2.c) != null && (!list4.isEmpty())) {
                break;
            }
        }
        int size = 0;
        boolean z = next != null;
        for (Object obj2 : list5) {
            PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel3 = ((ODPairWithSlotsListAppModel) obj2).b;
            if (pBAvailableSlotsInfoAppModel3 != null && (list3 = pBAvailableSlotsInfoAppModel3.c) != null && (!list3.isEmpty())) {
                obj = obj2;
                break;
            }
        }
        ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel = (ODPairWithSlotsListAppModel) obj;
        if (oDPairWithSlotsListAppModel != null && (pBAvailableSlotsInfoAppModel = oDPairWithSlotsListAppModel.b) != null && (list2 = pBAvailableSlotsInfoAppModel.c) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (((PBAvailableSlotsTripAppModel) obj3).d()) {
                    arrayList.add(obj3);
                }
            }
            size = arrayList.size();
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ODPairWithSlotsListAppModel) it2.next()).f7215a.f7091a);
        }
        List listZ = CollectionsKt.z(CollectionsKt.I(arrayList2));
        LinkedHashMap linkedHashMapS0 = S0();
        linkedHashMapS0.put("selectedSection", String.valueOf(j));
        linkedHashMapS0.put("isAnySlotAvailable", String.valueOf(z));
        linkedHashMapS0.put("routesForSelectedOD", CollectionsKt.O(listZ, ",", null, null, null, 62));
        linkedHashMapS0.put("currentDayActiveSlotCount", String.valueOf(size));
        AnalyticsContractImplKt.b(this.m, "pb slot fetch success", Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, linkedHashMapS0, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l1(List list, ContinuationImpl continuationImpl) {
        PremiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1 premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1;
        String str;
        Long l;
        PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1) {
            premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1 = (PremiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1) continuationImpl;
            int i = premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1 = new PremiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1 = new PremiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1(this, continuationImpl);
        }
        Object obj = premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            Intrinsics.i(list, "<this>");
            PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModelA = PremiumBusBookingAvailableOptionsAppModelKt.a(list);
            String str2 = (premiumBusBookingPurchaseOptionAppModelA == null || (premiumBusBookingPurchaseOptionDetailsAppModel = premiumBusBookingPurchaseOptionAppModelA.c) == null) ? null : premiumBusBookingPurchaseOptionDetailsAppModel.c;
            if (str2 == null) {
                return unit;
            }
            Long l2 = ((PremiumBusSlotSelectionDataState) this.f.getValue()).h;
            premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.L$0 = str2;
            premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.L$1 = l2;
            premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.label = 1;
            Object objB = this.G.b(premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            l = l2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = (Long) premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.L$1;
            str = (String) premiumBusSlotSelectionComponent$raiseValuePassBookingBlockedEvent$1.L$0;
            ResultKt.b(obj);
        }
        Long l3 = (Long) obj;
        String strValueOf = (l3 == null || l == null) ? "" : String.valueOf(this.q.s(l3.longValue(), l.longValue()));
        Source source = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
        LinkedHashMap linkedHashMapS0 = S0();
        linkedHashMapS0.put("passId", str.toString());
        linkedHashMapS0.put("advanceBookingDays", strValueOf);
        AnalyticsContractImplKt.b(this.m, "pb value pass bottomsheet booking blocked", source, linkedHashMapS0, false, 24);
        return unit;
    }

    public final boolean m1() {
        StateFlow stateFlow = this.f;
        return ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).y && ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).d == null && !((PremiumBusSlotSelectionDataState) stateFlow.getValue()).c;
    }

    public final LocalDate n1(long j) {
        return KotlinDateTimeExtensionsKt.b(LocalDateTime.INSTANCE, j, this.q.b()).a();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x010d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0166  */
    /* JADX WARN: Code duplicated, block: B:50:0x0172  */
    /* JADX WARN: Code duplicated, block: B:52:0x0176  */
    /* JADX WARN: Code duplicated, block: B:54:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00fe -> B:29:0x0107). Please report as a decompilation issue!!! */
    public final Object o1(PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, List list, ContinuationImpl continuationImpl) throws Throwable {
        PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
        int i;
        Ref.BooleanRef booleanRef;
        List listC0;
        List list2;
        Ref.IntRef intRef;
        boolean z;
        int i2;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel2;
        Ref.BooleanRef booleanRef2;
        Ref.IntRef intRef2;
        List list3;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel3;
        PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2;
        long jK;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel;
        Object next;
        Ref.IntRef intRef3;
        int i3;
        final PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel4;
        ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel;
        List list4;
        Ref.BooleanRef booleanRef3;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel;
        List list5;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel2;
        List list6;
        int i4;
        if (continuationImpl instanceof PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1) {
            premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 = (PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1) continuationImpl;
            int i5 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.label = i5 - Integer.MIN_VALUE;
            } else {
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 = new PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1(this, continuationImpl);
            }
        } else {
            premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 = new PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1(this, continuationImpl);
        }
        Object objY0 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.label;
        StateFlow stateFlow = this.f;
        if (i6 == 0) {
            ResultKt.b(objY0);
            Ref.IntRef intRef4 = new Ref.IntRef();
            i = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).w;
            Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
            booleanRef4.element = true;
            booleanRef = booleanRef4;
            listC0 = EmptyList.f17557a;
            list2 = list;
            intRef = intRef4;
            z = false;
            i2 = 0;
            pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
            if (booleanRef.element) {
            }
            PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$3 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
            booleanRef2 = booleanRef;
            intRef2 = intRef;
            list3 = listC0;
            i = i;
            pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel2;
            premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$3;
            if (z) {
            }
            return Boolean.FALSE;
        }
        if (i6 == 1) {
            i = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.I$0;
            List list7 = (List) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$4;
            booleanRef = (Ref.BooleanRef) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$3;
            intRef = (Ref.IntRef) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$2;
            List list8 = (List) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$1;
            PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel5 = (PBODPairWithSlotSectionListUiModel) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$0;
            ResultKt.b(objY0);
            StateFlow stateFlow2 = stateFlow;
            list2 = list8;
            ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objY0;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                j1(pBODPairWithSlotSectionListUiModel5.f7820a, (ODPairAndSlotsFetchFailedReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a);
                return Boolean.FALSE;
            }
            ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops = (ODPairsAndRespectiveSlotsBetweenStops) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            listC0 = CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStops.f7216a, list7);
            int i7 = oDPairsAndRespectiveSlotsBetweenStops.d;
            booleanRef.element = oDPairsAndRespectiveSlotsBetweenStops.e;
            List list9 = oDPairsAndRespectiveSlotsBetweenStops.f7216a;
            if ((list9 instanceof Collection) || !list9.isEmpty()) {
                Iterator it = list9.iterator();
                while (true) {
                    if (it.hasNext()) {
                        pBAvailableSlotsInfoAppModel2 = ((ODPairWithSlotsListAppModel) it.next()).b;
                        if (pBAvailableSlotsInfoAppModel2 == null && (list6 = pBAvailableSlotsInfoAppModel2.c) != null) {
                            i4 = 1;
                            if (!list6.isEmpty()) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                if (!z) {
                    intRef.element += i4;
                    pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel5;
                    i2 = i7;
                    stateFlow = stateFlow2;
                    if (booleanRef.element || z) {
                        PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$4 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                        booleanRef2 = booleanRef;
                        intRef2 = intRef;
                        list3 = listC0;
                        i = i;
                        pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel2;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$4;
                    } else {
                        long j = pBODPairWithSlotSectionListUiModel2.f7820a;
                        long j2 = pBODPairWithSlotSectionListUiModel2.d;
                        List list10 = listC0;
                        long j3 = pBODPairWithSlotSectionListUiModel2.e;
                        stateFlow2 = stateFlow;
                        Long l = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).t;
                        if (l != null) {
                            jK = l.longValue();
                        } else {
                            TimeUtilsContract timeUtilsContract = this.q;
                            jK = timeUtilsContract.K(this.B.j(), timeUtilsContract.b());
                        }
                        int i8 = intRef.element;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$0 = pBODPairWithSlotSectionListUiModel2;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$1 = list2;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$2 = intRef;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$3 = booleanRef;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$4 = list10;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.I$0 = i;
                        premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.label = 1;
                        PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$5 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                        int i9 = i;
                        Ref.BooleanRef booleanRef5 = booleanRef;
                        Ref.IntRef intRef5 = intRef;
                        Object objB = this.x.b(jK, j, list2, j2, j3, i8, i9, premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$5);
                        if (objB != obj) {
                            pBODPairWithSlotSectionListUiModel5 = pBODPairWithSlotSectionListUiModel2;
                            booleanRef = booleanRef5;
                            intRef = intRef5;
                            list7 = list10;
                            objY0 = objB;
                            i = i9;
                            premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$5;
                            ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) objY0;
                            if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success) {
                                if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                j1(pBODPairWithSlotSectionListUiModel5.f7820a, (ODPairAndSlotsFetchFailedReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a);
                                return Boolean.FALSE;
                            }
                            ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops2 = (ODPairsAndRespectiveSlotsBetweenStops) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a;
                            listC0 = CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStops2.f7216a, list7);
                            int i10 = oDPairsAndRespectiveSlotsBetweenStops2.d;
                            booleanRef.element = oDPairsAndRespectiveSlotsBetweenStops2.e;
                            List list11 = oDPairsAndRespectiveSlotsBetweenStops2.f7216a;
                            if (list11 instanceof Collection) {
                                Iterator it2 = list11.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        pBAvailableSlotsInfoAppModel2 = ((ODPairWithSlotsListAppModel) it2.next()).b;
                                        if (pBAvailableSlotsInfoAppModel2 == null) {
                                        }
                                    }
                                }
                                if (!z) {
                                    premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                                    list3 = listC0;
                                    booleanRef2 = booleanRef;
                                    intRef2 = intRef;
                                    pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel5;
                                    i2 = i10;
                                } else {
                                    intRef.element += i4;
                                    pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel5;
                                    i2 = i10;
                                    stateFlow = stateFlow2;
                                    if (booleanRef.element) {
                                    }
                                    PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$6 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                                    booleanRef2 = booleanRef;
                                    intRef2 = intRef;
                                    list3 = listC0;
                                    i = i;
                                    pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel2;
                                    premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$6;
                                }
                            } else {
                                Iterator it3 = list11.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        pBAvailableSlotsInfoAppModel2 = ((ODPairWithSlotsListAppModel) it3.next()).b;
                                        if (pBAvailableSlotsInfoAppModel2 == null) {
                                        }
                                    }
                                }
                                if (!z) {
                                    premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                                    list3 = listC0;
                                    booleanRef2 = booleanRef;
                                    intRef2 = intRef;
                                    pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel5;
                                    i2 = i10;
                                } else {
                                    intRef.element += i4;
                                    pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel5;
                                    i2 = i10;
                                    stateFlow = stateFlow2;
                                    if (booleanRef.element) {
                                    }
                                    PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$7 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                                    booleanRef2 = booleanRef;
                                    intRef2 = intRef;
                                    list3 = listC0;
                                    i = i;
                                    pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel2;
                                    premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$7;
                                }
                            }
                        }
                    }
                    return obj;
                }
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                list3 = listC0;
                booleanRef2 = booleanRef;
                intRef2 = intRef;
                pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel5;
                i2 = i10;
                if (z || list3.isEmpty()) {
                    return Boolean.FALSE;
                }
                Iterator it4 = list3.iterator();
                while (true) {
                    pBAvailableSlotsTripAppModel = null;
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel3 = ((ODPairWithSlotsListAppModel) next).b;
                    if (pBAvailableSlotsInfoAppModel3 != null && !pBAvailableSlotsInfoAppModel3.c.isEmpty()) {
                        break;
                    }
                }
                ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel2 = (ODPairWithSlotsListAppModel) next;
                if (oDPairWithSlotsListAppModel2 != null && (pBAvailableSlotsInfoAppModel = oDPairWithSlotsListAppModel2.b) != null && (list5 = pBAvailableSlotsInfoAppModel.c) != null) {
                    pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) CollectionsKt.H(list5);
                }
                boolean z2 = pBODPairWithSlotSectionListUiModel3.h;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.L$0 = pBODPairWithSlotSectionListUiModel3;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.L$1 = intRef2;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.L$2 = booleanRef2;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.L$3 = list3;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.L$4 = oDPairWithSlotsListAppModel2;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.I$0 = i;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.I$1 = i2;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2.label = 2;
                objY0 = Y0(z2, pBAvailableSlotsTripAppModel, premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2);
                if (objY0 != obj) {
                    intRef3 = intRef2;
                    i3 = i2;
                    pBODPairWithSlotSectionListUiModel4 = pBODPairWithSlotSectionListUiModel3;
                    oDPairWithSlotsListAppModel = oDPairWithSlotsListAppModel2;
                    list4 = list3;
                    booleanRef3 = booleanRef2;
                }
                return obj;
            }
            i4 = 1;
            z = false;
            if (!z) {
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                list3 = listC0;
                booleanRef2 = booleanRef;
                intRef2 = intRef;
                pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel5;
                i2 = i10;
            } else {
                intRef.element += i4;
                pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel5;
                i2 = i10;
                stateFlow = stateFlow2;
                if (booleanRef.element) {
                }
                PremiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1 premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$8 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1;
                booleanRef2 = booleanRef;
                intRef2 = intRef;
                list3 = listC0;
                i = i;
                pBODPairWithSlotSectionListUiModel3 = pBODPairWithSlotSectionListUiModel2;
                premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$2 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$8;
            }
            if (z) {
            }
            return Boolean.FALSE;
        }
        if (i6 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i11 = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.I$1;
        i = premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.I$0;
        ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel3 = (ODPairWithSlotsListAppModel) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$4;
        List list12 = (List) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$3;
        Ref.BooleanRef booleanRef6 = (Ref.BooleanRef) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$2;
        Ref.IntRef intRef6 = (Ref.IntRef) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$1;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel6 = (PBODPairWithSlotSectionListUiModel) premiumBusSlotSelectionComponent$tryFetchingSlotsForSectionWithAutoPagination$1.L$0;
        ResultKt.b(objY0);
        intRef3 = intRef6;
        i3 = i11;
        booleanRef3 = booleanRef6;
        pBODPairWithSlotSectionListUiModel4 = pBODPairWithSlotSectionListUiModel6;
        oDPairWithSlotsListAppModel = oDPairWithSlotsListAppModel3;
        list4 = list12;
        final int i12 = i;
        final PassPurchaseNudgeType passPurchaseNudgeType = (PassPurchaseNudgeType) objY0;
        if (oDPairWithSlotsListAppModel != null) {
            this.n.E(oDPairWithSlotsListAppModel.f7215a);
        }
        k1(pBODPairWithSlotSectionListUiModel4.f7820a, list4);
        final ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops3 = new ODPairsAndRespectiveSlotsBetweenStops(list4, false, intRef3.element, i3, booleanRef3.element, i12);
        this.S = new Long(pBODPairWithSlotSectionListUiModel4.f7820a);
        final ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel4 = oDPairWithSlotsListAppModel;
        final Ref.BooleanRef booleanRef7 = booleanRef3;
        final Ref.IntRef intRef7 = intRef3;
        E0(new Function1() { // from class: bv0
            /* JADX WARN: Code duplicated, block: B:12:0x0054  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModelA;
                PremiumBusSlotSelectionDataState it5 = (PremiumBusSlotSelectionDataState) obj2;
                Intrinsics.i(it5, "it");
                Map map = it5.g;
                LinkedHashMap linkedHashMapU = map != null ? MapsKt.u(map) : new LinkedHashMap();
                long j4 = pBODPairWithSlotSectionListUiModel4.f7820a;
                PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel7 = (PBODPairWithSlotSectionListUiModel) linkedHashMapU.get(Long.valueOf(j4));
                PassPurchaseNudgeType passPurchaseNudgeType2 = passPurchaseNudgeType;
                if (pBODPairWithSlotSectionListUiModel7 != null) {
                    linkedHashMapU.put(Long.valueOf(j4), PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel7, oDPairsAndRespectiveSlotsBetweenStops3, null, passPurchaseNudgeType2 instanceof PassPurchaseNudgeType.PassPurchaseNudgeCard, intRef7.element, 0, booleanRef7.element, false, 11195));
                }
                PassPurchaseNudgeType.PassPurchaseNudgeCard passPurchaseNudgeCard = PassPurchaseNudgeType.PassPurchaseNudgeCard.f7832a;
                PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions availablePurchaseOptions = null;
                if (Intrinsics.d(passPurchaseNudgeType2, passPurchaseNudgeCard)) {
                    pBAvailableSlotsTripAppModelA = null;
                } else {
                    if (!(passPurchaseNudgeType2 instanceof PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet) && passPurchaseNudgeType2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel5 = oDPairWithSlotsListAppModel4;
                    if (oDPairWithSlotsListAppModel5 != null) {
                        pBAvailableSlotsTripAppModelA = oDPairWithSlotsListAppModel5.a();
                    } else {
                        pBAvailableSlotsTripAppModelA = null;
                    }
                }
                if (passPurchaseNudgeType2 instanceof PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet) {
                    PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet passPurchaseOptionsBottomSheet = (PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet) passPurchaseNudgeType2;
                    availablePurchaseOptions = new PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions(passPurchaseOptionsBottomSheet.f7833a, passPurchaseOptionsBottomSheet.b);
                } else if (!Intrinsics.d(passPurchaseNudgeType2, passPurchaseNudgeCard) && passPurchaseNudgeType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return PremiumBusSlotSelectionDataState.a(it5, false, false, false, null, null, availablePurchaseOptions, linkedHashMapU, Long.valueOf(j4), pBAvailableSlotsTripAppModelA, 0, null, null, null, false, null, null, null, null, false, null, null, null, i12, passPurchaseNudgeType2, false, null, null, null, null, null, -50332144);
            }
        });
        return Boolean.TRUE;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new PremiumBusSlotSelectionDataState(false, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, emptyList, 3, null, false, BookingSelectionType.SINGLE_RIDE, null, emptyList, emptyList, emptyList);
    }
}
