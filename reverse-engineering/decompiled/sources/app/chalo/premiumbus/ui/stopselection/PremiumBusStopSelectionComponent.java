package app.chalo.premiumbus.ui.stopselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModelKt;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.domain.GetRecentAndFlippedOriginDestinationPairsUseCase;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.SelectedDateAndTime;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusNotificationArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.utils.KUUID;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.aw0;
import defpackage.dv0;
import defpackage.et0;
import defpackage.fr0;
import defpackage.jr0;
import defpackage.vg;
import defpackage.yv0;
import defpackage.zv0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.datetime.Clock;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionViewState;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionDataState;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionSideEffect;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusStopSelectionComponent extends ChaloBaseStateMviComponent<PremiumBusStopSelectionIntent, PremiumBusStopSelectionViewState, PremiumBusStopSelectionViewState, PremiumBusStopSelectionSideEffect> {
    public final ChaloNavigationManager A;
    public final UniversalSearchResultStateManager B;
    public final IReportProblemFeature C;
    public String D;
    public PBStopPlaceSelectedAppModel E;
    public PBStopPlaceSelectedAppModel F;
    public boolean G;
    public Job H;
    public Job I;
    public Job J;
    public Source K;
    public PremiumBusNativeCityWiseConfigAppModel L;
    public final PremiumBusArgs.StopSelectionArgs k;
    public final PremiumBusPurchaseInfoManager l;
    public final FetchCompleteProductConfigByIdUseCase m;
    public final StoreCompleteProductConfigLocallyUseCase n;
    public final GetRecentAndFlippedOriginDestinationPairsUseCase o;
    public final FetchCurrentLocationUseCase p;
    public final AnalyticsContract q;
    public final CityProvider r;
    public final UserProfileDetailsProvider s;
    public final GetPremiumBusCurrentCityConfigUseCase t;
    public final StringProvider u;
    public final BasicInfoContract v;
    public final TimeUtilsContract w;
    public final FetchPBODPairsForGivenLocationsUseCase x;
    public final SystemHelper y;
    public final KotlinToastManager z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionComponent$Companion;", "", "", "RECENT_OD_PAIRS_LIMIT", "I", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7963a;

        static {
            int[] iArr = new int[PremiumBusStopSearchSource.values().length];
            try {
                iArr[PremiumBusStopSearchSource.FROM_STOP_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusStopSearchSource.FROM_STOP_SUGGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusStopSearchSource.TO_STOP_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusStopSearchSource.TO_STOP_SUGGESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7963a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusStopSelectionComponent(PremiumBusArgs.StopSelectionArgs args, ComponentContext componentContext, PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, GetRecentAndFlippedOriginDestinationPairsUseCase getRecentAndFlippedOriginDestinationPairsUseCase, FetchCurrentLocationUseCase fetchCurrentLocationUseCase, AnalyticsContract analyticsContract, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, StringProvider stringProvider, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, FetchPBODPairsForGivenLocationsUseCase fetchPBODPairsForGivenLocationsUseCase, SystemHelper systemHelper, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, UniversalSearchResultStateManager universalSearchResultStateManager, IReportProblemFeature iReportProblemFeature) {
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = args;
        this.l = premiumBusPurchaseInfoManager;
        this.m = fetchCompleteProductConfigByIdUseCase;
        this.n = storeCompleteProductConfigLocallyUseCase;
        this.o = getRecentAndFlippedOriginDestinationPairsUseCase;
        this.p = fetchCurrentLocationUseCase;
        this.q = analyticsContract;
        this.r = cityProvider;
        this.s = userProfileDetailsProvider;
        this.t = getPremiumBusCurrentCityConfigUseCase;
        this.u = stringProvider;
        this.v = basicInfoContract;
        this.w = timeUtilsContract;
        this.x = fetchPBODPairsForGivenLocationsUseCase;
        this.y = systemHelper;
        this.z = kotlinToastManager;
        this.A = chaloNavigationManager;
        this.B = universalSearchResultStateManager;
        this.C = iReportProblemFeature;
        this.K = Source.UNKNOWN;
        L0(new PremiumBusStopSelectionIntent.InitializationIntent(args.c, args.f, args.e, args.d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, String str, PremiumBusStopSearchSource premiumBusStopSearchSource, ContinuationImpl continuationImpl) {
        PremiumBusStopSelectionComponent$collectUniversalSearchResult$1 premiumBusStopSelectionComponent$collectUniversalSearchResult$1;
        Object objB;
        Object objB2;
        premiumBusStopSelectionComponent.getClass();
        if (continuationImpl instanceof PremiumBusStopSelectionComponent$collectUniversalSearchResult$1) {
            premiumBusStopSelectionComponent$collectUniversalSearchResult$1 = (PremiumBusStopSelectionComponent$collectUniversalSearchResult$1) continuationImpl;
            int i = premiumBusStopSelectionComponent$collectUniversalSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusStopSelectionComponent$collectUniversalSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusStopSelectionComponent$collectUniversalSearchResult$1 = new PremiumBusStopSelectionComponent$collectUniversalSearchResult$1(premiumBusStopSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusStopSelectionComponent$collectUniversalSearchResult$1 = new PremiumBusStopSelectionComponent$collectUniversalSearchResult$1(premiumBusStopSelectionComponent, continuationImpl);
        }
        Object objV = premiumBusStopSelectionComponent$collectUniversalSearchResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusStopSelectionComponent$collectUniversalSearchResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = premiumBusStopSelectionComponent.B.b(str);
            premiumBusStopSelectionComponent$collectUniversalSearchResult$1.L$0 = premiumBusStopSearchSource;
            premiumBusStopSelectionComponent$collectUniversalSearchResult$1.label = 1;
            objV = premiumBusStopSelectionComponent.b.v(flowB, premiumBusStopSelectionComponent$collectUniversalSearchResult$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumBusStopSearchSource = (PremiumBusStopSearchSource) premiumBusStopSelectionComponent$collectUniversalSearchResult$1.L$0;
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
        UniversalSearchResultState universalSearchResultState = (UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a;
        String str2 = universalSearchResultState.f9060a;
        String str3 = universalSearchResultState.b;
        if (str2 != null && str2.length() != 0) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB2 = json.b(str2, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB2 = null;
            }
            StopAppModel stopAppModel = (StopAppModel) objB2;
            if (stopAppModel != null) {
                premiumBusStopSelectionComponent.L0(new PremiumBusStopSelectionIntent.StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModelKt.a(stopAppModel), premiumBusStopSearchSource));
            }
        } else if (str3 != null && str3.length() != 0) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str3, RecentPlaceAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB = null;
            }
            RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) objB;
            if (recentPlaceAppModel != null) {
                premiumBusStopSelectionComponent.L0(new PremiumBusStopSelectionIntent.StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModelKt.b(recentPlaceAppModel), premiumBusStopSearchSource));
            }
        }
        Job job = premiumBusStopSelectionComponent.J;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        premiumBusStopSelectionComponent.J = null;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        if (r8 == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent.G0(app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x010c  */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0227, code lost:
    
        if (r2 == r5) goto L68;
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
    public static final java.lang.Object H0(app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent r28, app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent.H0(app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent, app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0143  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:50:0x0181  */
    /* JADX WARN: Code duplicated, block: B:53:0x0188  */
    /* JADX WARN: Code duplicated, block: B:55:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object I0(final PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, List list, Source source, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1;
        List list2;
        Source source2;
        final boolean z3;
        boolean z4;
        Object objK0;
        Source source3;
        final boolean z5;
        final String str;
        final List list3;
        String str2;
        final boolean z6;
        final Ref.BooleanRef booleanRef;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        final boolean z7;
        LocalDateTime localDateTimeC;
        String str3;
        LinkedHashMap linkedHashMapK;
        String str4;
        TimeUtilsContract timeUtilsContract = premiumBusStopSelectionComponent.w;
        if (continuationImpl instanceof PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1) {
            premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 = (PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1) continuationImpl;
            int i = premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 = new PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1(premiumBusStopSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 = new PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1(premiumBusStopSelectionComponent, continuationImpl);
        }
        Object obj = premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            list2 = list;
            premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$0 = list2;
            source2 = source;
            premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$1 = source2;
            z3 = z;
            premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$0 = z3;
            z4 = z2;
            premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$1 = z4;
            premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.label = 1;
            objK0 = premiumBusStopSelectionComponent.K0(premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1);
            if (objK0 != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            boolean z8 = premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$1;
            z3 = premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$0;
            Source source4 = (Source) premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$1;
            List list4 = (List) premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$0;
            ResultKt.b(obj);
            objK0 = obj;
            list2 = list4;
            z4 = z8;
            source2 = source4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z9 = premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$1;
            boolean z10 = premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$0;
            String str5 = (String) premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$2;
            Source source5 = (Source) premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$1;
            List list5 = (List) premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$0;
            ResultKt.b(obj);
            list3 = list5;
            z5 = z9;
            str = str5;
            source3 = source5;
            z3 = z10;
        }
        str2 = ((PremiumBusNativeCityWiseConfigAppModel) obj).i;
        if (str2 != null) {
            z6 = !StringsKt.F(str2);
        } else {
            z6 = false;
        }
        if (z3 && premiumBusStopSelectionComponent.E == null && premiumBusStopSelectionComponent.F == null && !list3.isEmpty()) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel = (PBOriginDestinationAppModel) CollectionsKt.F(list3);
            String str6 = pBOriginDestinationAppModel.c;
            String str7 = pBOriginDestinationAppModel.d;
            PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
            premiumBusStopSelectionComponent.E = new PBStopPlaceSelectedAppModel(str6, "", str7, null, null, premiumBusSelectedLocationType);
            premiumBusStopSelectionComponent.F = new PBStopPlaceSelectedAppModel(pBOriginDestinationAppModel.h, "", pBOriginDestinationAppModel.i, null, null, premiumBusSelectedLocationType);
        }
        booleanRef = new Ref.BooleanRef();
        if (premiumBusStopSelectionComponent.E == null) {
            BuildersKt.d(premiumBusStopSelectionComponent.j, null, null, new PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2(premiumBusStopSelectionComponent, booleanRef, null), 3);
        }
        pBStopPlaceSelectedAppModel = premiumBusStopSelectionComponent.E;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = premiumBusStopSelectionComponent.F;
        if (pBStopPlaceSelectedAppModel != null || pBStopPlaceSelectedAppModel2 == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = timeUtilsContract.b();
        companion.getClass();
        localDateTimeC = TimeZoneKt.c(Clock.System.f17926a.a(), TimeZone.Companion.a(strB));
        final int iR = timeUtilsContract.r(localDateTimeC.g());
        final int iH = localDateTimeC.h();
        if (localDateTimeC.g() < 12) {
            str3 = "AM";
        } else {
            str3 = "PM";
        }
        final String str8 = str3;
        premiumBusStopSelectionComponent.E0(new Function1() { // from class: cw0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                PremiumBusStopSelectionViewState it = (PremiumBusStopSelectionViewState) obj3;
                Intrinsics.i(it, "it");
                PremiumBusStopSelectionComponent premiumBusStopSelectionComponent2 = this.f15410a;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = premiumBusStopSelectionComponent2.E;
                String str9 = pBStopPlaceSelectedAppModel3 != null ? pBStopPlaceSelectedAppModel3.c : null;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = premiumBusStopSelectionComponent2.F;
                return PremiumBusStopSelectionViewState.a(it, Boolean.valueOf(z3), false, z7, str9, pBStopPlaceSelectedAppModel4 != null ? pBStopPlaceSelectedAppModel4.c : null, null, list3, z6, str, booleanRef.element, z5, CityProviderKt.b(premiumBusStopSelectionComponent2.r), new SelectedDateAndTime(iR, iH, str8), 90658);
            }
        });
        linkedHashMapK = MapsKt.k(new Pair("rebookCardCount", String.valueOf(list3.size())), new Pair("isNewLandingScreen", Boolean.valueOf(z3)));
        str4 = premiumBusStopSelectionComponent.k.g;
        if (str4 != null) {
            if (StringsKt.F(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                linkedHashMapK.put("attribution type", str4);
            }
        }
        AnalyticsContractImplKt.a(premiumBusStopSelectionComponent.q, "pb trip details screen shown", Source.PREMIUM_BUS_STOP_SELECTION_SCREEN, source3, linkedHashMapK, 48);
        return Unit.f17538a;
        String str9 = ((PremiumBusNativeCityWiseConfigAppModel) objK0).j;
        premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$0 = list2;
        premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$1 = source2;
        premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.L$2 = str9;
        premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$0 = z3;
        premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.Z$1 = z4;
        premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.label = 2;
        Object objK1 = premiumBusStopSelectionComponent.K0(premiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1);
        if (objK1 != obj2) {
            source3 = source2;
            z5 = z4;
            str = str9;
            list3 = list2;
            obj = objK1;
            str2 = ((PremiumBusNativeCityWiseConfigAppModel) obj).i;
            if (str2 != null) {
                z6 = !StringsKt.F(str2);
            } else {
                z6 = false;
            }
            if (z3) {
                PBOriginDestinationAppModel pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) CollectionsKt.F(list3);
                String str10 = pBOriginDestinationAppModel2.c;
                String str11 = pBOriginDestinationAppModel2.d;
                PremiumBusSelectedLocationType premiumBusSelectedLocationType2 = PremiumBusSelectedLocationType.STOP;
                premiumBusStopSelectionComponent.E = new PBStopPlaceSelectedAppModel(str10, "", str11, null, null, premiumBusSelectedLocationType2);
                premiumBusStopSelectionComponent.F = new PBStopPlaceSelectedAppModel(pBOriginDestinationAppModel2.h, "", pBOriginDestinationAppModel2.i, null, null, premiumBusSelectedLocationType2);
            }
            booleanRef = new Ref.BooleanRef();
            if (premiumBusStopSelectionComponent.E == null) {
                BuildersKt.d(premiumBusStopSelectionComponent.j, null, null, new PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2(premiumBusStopSelectionComponent, booleanRef, null), 3);
            }
            pBStopPlaceSelectedAppModel = premiumBusStopSelectionComponent.E;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = premiumBusStopSelectionComponent.F;
            if (pBStopPlaceSelectedAppModel != null) {
                z7 = false;
            } else {
                z7 = false;
            }
            TimeZone.Companion companion2 = TimeZone.INSTANCE;
            String strB2 = timeUtilsContract.b();
            companion2.getClass();
            localDateTimeC = TimeZoneKt.c(Clock.System.f17926a.a(), TimeZone.Companion.a(strB2));
            final int iR2 = timeUtilsContract.r(localDateTimeC.g());
            final int iH2 = localDateTimeC.h();
            if (localDateTimeC.g() < 12) {
                str3 = "AM";
            } else {
                str3 = "PM";
            }
            final String str12 = str3;
            premiumBusStopSelectionComponent.E0(new Function1() { // from class: cw0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    PremiumBusStopSelectionViewState it = (PremiumBusStopSelectionViewState) obj3;
                    Intrinsics.i(it, "it");
                    PremiumBusStopSelectionComponent premiumBusStopSelectionComponent2 = this.f15410a;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = premiumBusStopSelectionComponent2.E;
                    String str13 = pBStopPlaceSelectedAppModel4 != null ? pBStopPlaceSelectedAppModel4.c : null;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel5 = premiumBusStopSelectionComponent2.F;
                    return PremiumBusStopSelectionViewState.a(it, Boolean.valueOf(z3), false, z7, str13, pBStopPlaceSelectedAppModel5 != null ? pBStopPlaceSelectedAppModel5.c : null, null, list3, z6, str, booleanRef.element, z5, CityProviderKt.b(premiumBusStopSelectionComponent2.r), new SelectedDateAndTime(iR2, iH2, str12), 90658);
                }
            });
            linkedHashMapK = MapsKt.k(new Pair("rebookCardCount", String.valueOf(list3.size())), new Pair("isNewLandingScreen", Boolean.valueOf(z3)));
            str4 = premiumBusStopSelectionComponent.k.g;
            if (str4 != null) {
                if (StringsKt.F(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    linkedHashMapK.put("attribution type", str4);
                }
            }
            AnalyticsContractImplKt.a(premiumBusStopSelectionComponent.q, "pb trip details screen shown", Source.PREMIUM_BUS_STOP_SELECTION_SCREEN, source3, linkedHashMapK, 48);
            return Unit.f17538a;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x016a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0196  */
    /* JADX WARN: Code duplicated, block: B:37:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0235  */
    /* JADX WARN: Code duplicated, block: B:45:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J0(int i, int i2, String str, ContinuationImpl continuationImpl) {
        PremiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1 premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1;
        int i3;
        String str2;
        int i4;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str3;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        String str4;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        int i5;
        String str5;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        TextUIState.ChaloTextUIState chaloTextUIStateF2;
        UIShape.Rectangle rectangle;
        Object objB2;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        int i6;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        PremiumBusStopSelectionComponent premiumBusStopSelectionComponent;
        ButtonUIState buttonUIStateF;
        Object objB3;
        CoroutineSingletons coroutineSingletons;
        ButtonUIStateFactory buttonUIStateFactory2;
        String str6;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        TextUIState.ChaloTextUIState chaloTextUIState14;
        int i7;
        int i8;
        ChaloColorToken.Black black;
        ButtonUIState buttonUIStateD;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A;
        IconType iconType;
        ImageUISize imageUISize;
        CoroutineSingletons coroutineSingletons2;
        TextUIState.ChaloTextUIState chaloTextUIState15;
        Object objB4;
        int i9;
        int i10;
        UiEventHandler uiEventHandler;
        TextUIState.ChaloTextUIState chaloTextUIState16;
        ButtonUIState buttonUIState;
        String str7;
        ImageUISize imageUISize2;
        if (continuationImpl instanceof PremiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1) {
            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1 = (PremiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1) continuationImpl;
            int i11 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = i11 - Integer.MIN_VALUE;
            } else {
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1 = new PremiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1(this, continuationImpl);
            }
        } else {
            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1 = new PremiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1(this, continuationImpl);
        }
        Object objB5 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        ChaloTextStyleHelper chaloTextStyleHelper4 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider = this.u;
        switch (i12) {
            case 0:
                ResultKt.b(objB5);
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i2;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 1;
                objB5 = stringProvider.b(StringEnum.WHEN_DO_YOU_WANT_THIS_RIDE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB5 != coroutineSingletons3) {
                    i3 = i;
                    str2 = str;
                    i4 = i2;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplayMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7996);
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str2;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextStyleHelper4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 2;
                    objB5 = stringProvider.b(StringEnum.SELECT_DATE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB5 != coroutineSingletons3) {
                        str3 = str2;
                        chaloTextStyleHelper = chaloTextStyleHelper4;
                        chaloTextUIState2 = chaloTextUIState;
                        str4 = str3;
                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str4;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState2;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIStateF;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper4;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 3;
                        objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        if (objB != coroutineSingletons3) {
                            chaloTextUIState3 = chaloTextUIStateF;
                            chaloTextUIState4 = chaloTextUIState2;
                            chaloTextStyleHelper2 = chaloTextStyleHelper4;
                            i5 = i3;
                            str5 = str4;
                            objB5 = objB;
                            chaloTextUIState5 = chaloTextUIState3;
                            chaloTextUIState6 = chaloTextUIState4;
                            chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            rectangle = UIShape.e;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                            if (objB2 != coroutineSingletons3) {
                                int i13 = i5;
                                chaloTextUIState7 = chaloTextUIState6;
                                objB5 = objB2;
                                i6 = i13;
                                chaloTextUIState8 = chaloTextUIState5;
                                buttonUIStateFactory = buttonUIStateFactory3;
                                chaloTextStyleHelper3 = chaloTextStyleHelper4;
                                UIShape.Rectangle rectangle2 = rectangle;
                                chaloTextUIState9 = chaloTextUIStateF2;
                                chaloTextUIState10 = chaloTextUIState8;
                                chaloTextUIState11 = chaloTextUIState7;
                                premiumBusStopSelectionComponent = this;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new yv0(this, 0), rectangle2, false, 0.0f, 52);
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                                objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                                coroutineSingletons = coroutineSingletons3;
                                if (objB3 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                buttonUIStateFactory2 = buttonUIStateFactory3;
                                str6 = str5;
                                chaloTextUIState12 = chaloTextUIState11;
                                objB5 = objB3;
                                chaloTextUIState13 = chaloTextUIState10;
                                chaloTextUIState14 = chaloTextUIState9;
                                i7 = i4;
                                i8 = i6;
                                ChaloTextStyleHelper chaloTextStyleHelper5 = chaloTextStyleHelper4;
                                ChaloColorToken.Black black2 = ChaloColorToken.Black.f9759a;
                                black = black2;
                                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper5, (String) objB5, black2, null, null, null, null, 124), new yv0(premiumBusStopSelectionComponent, 1), UIShape.e, false, 52);
                                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new yv0(premiumBusStopSelectionComponent, 2));
                                iconType = IconType.IC_RED_CROSS;
                                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                                coroutineSingletons2 = coroutineSingletons;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState12;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState13;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState14;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandler$Companion$fromLambda$1A;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i8;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i7;
                                chaloTextUIState15 = chaloTextUIState14;
                                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                                if (objB4 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                int i14 = i8;
                                i9 = i7;
                                i10 = i14;
                                uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                chaloTextUIState16 = chaloTextUIState12;
                                buttonUIState = buttonUIStateF;
                                str7 = str6;
                                imageUISize2 = imageUISize;
                                objB5 = objB4;
                                ButtonUIState buttonUIState2 = buttonUIStateD;
                                TextUIState.ChaloTextUIState chaloTextUIState17 = chaloTextUIState13;
                                ImageUIState imageUIState = new ImageUIState(iconType, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler, 112);
                                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i10, i9, str7, chaloTextUIState16, chaloTextUIState17, chaloTextUIState15, buttonUIState, buttonUIState2, imageUIState, 8);
                            }
                        }
                    }
                }
                return coroutineSingletons3;
            case 1:
                i4 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                i3 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                str2 = (String) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplayMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7996);
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str2;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextStyleHelper4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 2;
                objB5 = stringProvider.b(StringEnum.SELECT_DATE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB5 != coroutineSingletons3) {
                    str3 = str2;
                    chaloTextStyleHelper = chaloTextStyleHelper4;
                    chaloTextUIState2 = chaloTextUIState;
                    str4 = str3;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState2;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIStateF;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 3;
                    objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB != coroutineSingletons3) {
                        chaloTextUIState3 = chaloTextUIStateF;
                        chaloTextUIState4 = chaloTextUIState2;
                        chaloTextStyleHelper2 = chaloTextStyleHelper4;
                        i5 = i3;
                        str5 = str4;
                        objB5 = objB;
                        chaloTextUIState5 = chaloTextUIState3;
                        chaloTextUIState6 = chaloTextUIState4;
                        chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        rectangle = UIShape.e;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        if (objB2 != coroutineSingletons3) {
                            int i15 = i5;
                            chaloTextUIState7 = chaloTextUIState6;
                            objB5 = objB2;
                            i6 = i15;
                            chaloTextUIState8 = chaloTextUIState5;
                            buttonUIStateFactory = buttonUIStateFactory3;
                            chaloTextStyleHelper3 = chaloTextStyleHelper4;
                            UIShape.Rectangle rectangle3 = rectangle;
                            chaloTextUIState9 = chaloTextUIStateF2;
                            chaloTextUIState10 = chaloTextUIState8;
                            chaloTextUIState11 = chaloTextUIState7;
                            premiumBusStopSelectionComponent = this;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new yv0(this, 0), rectangle3, false, 0.0f, 52);
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                            objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                            coroutineSingletons = coroutineSingletons3;
                            if (objB3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            buttonUIStateFactory2 = buttonUIStateFactory3;
                            str6 = str5;
                            chaloTextUIState12 = chaloTextUIState11;
                            objB5 = objB3;
                            chaloTextUIState13 = chaloTextUIState10;
                            chaloTextUIState14 = chaloTextUIState9;
                            i7 = i4;
                            i8 = i6;
                            ChaloTextStyleHelper chaloTextStyleHelper6 = chaloTextStyleHelper4;
                            ChaloColorToken.Black black3 = ChaloColorToken.Black.f9759a;
                            black = black3;
                            buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper6, (String) objB5, black3, null, null, null, null, 124), new yv0(premiumBusStopSelectionComponent, 1), UIShape.e, false, 52);
                            uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new yv0(premiumBusStopSelectionComponent, 2));
                            iconType = IconType.IC_RED_CROSS;
                            imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                            coroutineSingletons2 = coroutineSingletons;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState12;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState13;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState14;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandler$Companion$fromLambda$1A;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i8;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i7;
                            chaloTextUIState15 = chaloTextUIState14;
                            premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                            objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                            if (objB4 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            int i16 = i8;
                            i9 = i7;
                            i10 = i16;
                            uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                            chaloTextUIState16 = chaloTextUIState12;
                            buttonUIState = buttonUIStateF;
                            str7 = str6;
                            imageUISize2 = imageUISize;
                            objB5 = objB4;
                            ButtonUIState buttonUIState3 = buttonUIStateD;
                            TextUIState.ChaloTextUIState chaloTextUIState18 = chaloTextUIState13;
                            ImageUIState imageUIState2 = new ImageUIState(iconType, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler, 112);
                            return new PremiumBusSlotSelectionDateAndTimePickerUIState(i10, i9, str7, chaloTextUIState16, chaloTextUIState18, chaloTextUIState15, buttonUIState, buttonUIState3, imageUIState2, 8);
                        }
                    }
                }
                return coroutineSingletons3;
            case 2:
                i4 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                i3 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                str3 = (String) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState2 = chaloTextUIState;
                str4 = str3;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState2;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIStateF;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 3;
                objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB != coroutineSingletons3) {
                    chaloTextUIState3 = chaloTextUIStateF;
                    chaloTextUIState4 = chaloTextUIState2;
                    chaloTextStyleHelper2 = chaloTextStyleHelper4;
                    i5 = i3;
                    str5 = str4;
                    objB5 = objB;
                    chaloTextUIState5 = chaloTextUIState3;
                    chaloTextUIState6 = chaloTextUIState4;
                    chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    rectangle = UIShape.e;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB2 != coroutineSingletons3) {
                        int i17 = i5;
                        chaloTextUIState7 = chaloTextUIState6;
                        objB5 = objB2;
                        i6 = i17;
                        chaloTextUIState8 = chaloTextUIState5;
                        buttonUIStateFactory = buttonUIStateFactory3;
                        chaloTextStyleHelper3 = chaloTextStyleHelper4;
                        UIShape.Rectangle rectangle4 = rectangle;
                        chaloTextUIState9 = chaloTextUIStateF2;
                        chaloTextUIState10 = chaloTextUIState8;
                        chaloTextUIState11 = chaloTextUIState7;
                        premiumBusStopSelectionComponent = this;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new yv0(this, 0), rectangle4, false, 0.0f, 52);
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                        objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        coroutineSingletons = coroutineSingletons3;
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        buttonUIStateFactory2 = buttonUIStateFactory3;
                        str6 = str5;
                        chaloTextUIState12 = chaloTextUIState11;
                        objB5 = objB3;
                        chaloTextUIState13 = chaloTextUIState10;
                        chaloTextUIState14 = chaloTextUIState9;
                        i7 = i4;
                        i8 = i6;
                        ChaloTextStyleHelper chaloTextStyleHelper7 = chaloTextStyleHelper4;
                        ChaloColorToken.Black black4 = ChaloColorToken.Black.f9759a;
                        black = black4;
                        buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper7, (String) objB5, black4, null, null, null, null, 124), new yv0(premiumBusStopSelectionComponent, 1), UIShape.e, false, 52);
                        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new yv0(premiumBusStopSelectionComponent, 2));
                        iconType = IconType.IC_RED_CROSS;
                        imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                        coroutineSingletons2 = coroutineSingletons;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState12;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState13;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState14;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandler$Companion$fromLambda$1A;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i8;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i7;
                        chaloTextUIState15 = chaloTextUIState14;
                        premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                        objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        if (objB4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        int i18 = i8;
                        i9 = i7;
                        i10 = i18;
                        uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                        chaloTextUIState16 = chaloTextUIState12;
                        buttonUIState = buttonUIStateF;
                        str7 = str6;
                        imageUISize2 = imageUISize;
                        objB5 = objB4;
                        ButtonUIState buttonUIState4 = buttonUIStateD;
                        TextUIState.ChaloTextUIState chaloTextUIState19 = chaloTextUIState13;
                        ImageUIState imageUIState3 = new ImageUIState(iconType, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler, 112);
                        return new PremiumBusSlotSelectionDateAndTimePickerUIState(i10, i9, str7, chaloTextUIState16, chaloTextUIState19, chaloTextUIState15, buttonUIState, buttonUIState4, imageUIState3, 8);
                    }
                }
                return coroutineSingletons3;
            case 3:
                i4 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                int i19 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper2 = (ChaloTextStyleHelper) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState20 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                String str8 = (String) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                i5 = i19;
                chaloTextUIState3 = chaloTextUIState20;
                str5 = str8;
                chaloTextUIState5 = chaloTextUIState3;
                chaloTextUIState6 = chaloTextUIState4;
                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                rectangle = UIShape.e;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB2 != coroutineSingletons3) {
                    int i110 = i5;
                    chaloTextUIState7 = chaloTextUIState6;
                    objB5 = objB2;
                    i6 = i110;
                    chaloTextUIState8 = chaloTextUIState5;
                    buttonUIStateFactory = buttonUIStateFactory3;
                    chaloTextStyleHelper3 = chaloTextStyleHelper4;
                    UIShape.Rectangle rectangle5 = rectangle;
                    chaloTextUIState9 = chaloTextUIStateF2;
                    chaloTextUIState10 = chaloTextUIState8;
                    chaloTextUIState11 = chaloTextUIState7;
                    premiumBusStopSelectionComponent = this;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new yv0(this, 0), rectangle5, false, 0.0f, 52);
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    coroutineSingletons = coroutineSingletons3;
                    if (objB3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    buttonUIStateFactory2 = buttonUIStateFactory3;
                    str6 = str5;
                    chaloTextUIState12 = chaloTextUIState11;
                    objB5 = objB3;
                    chaloTextUIState13 = chaloTextUIState10;
                    chaloTextUIState14 = chaloTextUIState9;
                    i7 = i4;
                    i8 = i6;
                    ChaloTextStyleHelper chaloTextStyleHelper8 = chaloTextStyleHelper4;
                    ChaloColorToken.Black black5 = ChaloColorToken.Black.f9759a;
                    black = black5;
                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper8, (String) objB5, black5, null, null, null, null, 124), new yv0(premiumBusStopSelectionComponent, 1), UIShape.e, false, 52);
                    uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new yv0(premiumBusStopSelectionComponent, 2));
                    iconType = IconType.IC_RED_CROSS;
                    imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                    coroutineSingletons2 = coroutineSingletons;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState12;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState13;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState14;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandler$Companion$fromLambda$1A;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i8;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i7;
                    chaloTextUIState15 = chaloTextUIState14;
                    premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                    objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    int i111 = i8;
                    i9 = i7;
                    i10 = i111;
                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                    chaloTextUIState16 = chaloTextUIState12;
                    buttonUIState = buttonUIStateF;
                    str7 = str6;
                    imageUISize2 = imageUISize;
                    objB5 = objB4;
                    ButtonUIState buttonUIState5 = buttonUIStateD;
                    TextUIState.ChaloTextUIState chaloTextUIState110 = chaloTextUIState13;
                    ImageUIState imageUIState4 = new ImageUIState(iconType, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler, 112);
                    return new PremiumBusSlotSelectionDateAndTimePickerUIState(i10, i9, str7, chaloTextUIState16, chaloTextUIState110, chaloTextUIState15, buttonUIState, buttonUIState5, imageUIState4, 8);
                }
                return coroutineSingletons3;
            case 4:
                i4 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                i6 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6;
                rectangle = (UIShape.Rectangle) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5;
                ButtonUIStateFactory buttonUIStateFactory4 = (ButtonUIStateFactory) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4;
                chaloTextUIStateF2 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                str5 = (String) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                buttonUIStateFactory = buttonUIStateFactory4;
                UIShape.Rectangle rectangle6 = rectangle;
                chaloTextUIState9 = chaloTextUIStateF2;
                chaloTextUIState10 = chaloTextUIState8;
                chaloTextUIState11 = chaloTextUIState7;
                premiumBusStopSelectionComponent = this;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new yv0(this, 0), rectangle6, false, 0.0f, 52);
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                buttonUIStateFactory2 = buttonUIStateFactory3;
                str6 = str5;
                chaloTextUIState12 = chaloTextUIState11;
                objB5 = objB3;
                chaloTextUIState13 = chaloTextUIState10;
                chaloTextUIState14 = chaloTextUIState9;
                i7 = i4;
                i8 = i6;
                ChaloTextStyleHelper chaloTextStyleHelper9 = chaloTextStyleHelper4;
                ChaloColorToken.Black black6 = ChaloColorToken.Black.f9759a;
                black = black6;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper9, (String) objB5, black6, null, null, null, null, 124), new yv0(premiumBusStopSelectionComponent, 1), UIShape.e, false, 52);
                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new yv0(premiumBusStopSelectionComponent, 2));
                iconType = IconType.IC_RED_CROSS;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                coroutineSingletons2 = coroutineSingletons;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState12;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState13;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState14;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandler$Companion$fromLambda$1A;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i8;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i7;
                chaloTextUIState15 = chaloTextUIState14;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                int i112 = i8;
                i9 = i7;
                i10 = i112;
                uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                chaloTextUIState16 = chaloTextUIState12;
                buttonUIState = buttonUIStateF;
                str7 = str6;
                imageUISize2 = imageUISize;
                objB5 = objB4;
                ButtonUIState buttonUIState6 = buttonUIStateD;
                TextUIState.ChaloTextUIState chaloTextUIState111 = chaloTextUIState13;
                ImageUIState imageUIState5 = new ImageUIState(iconType, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler, 112);
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i10, i9, str7, chaloTextUIState16, chaloTextUIState111, chaloTextUIState15, buttonUIState, buttonUIState6, imageUIState5, 8);
            case 5:
                int i20 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                int i21 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper4 = (ChaloTextStyleHelper) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6;
                ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5;
                ButtonUIState buttonUIState7 = (ButtonUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState21 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                chaloTextUIState13 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState22 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                str6 = (String) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                premiumBusStopSelectionComponent = this;
                chaloTextUIState14 = chaloTextUIState21;
                buttonUIStateF = buttonUIState7;
                coroutineSingletons = coroutineSingletons3;
                i7 = i20;
                i8 = i21;
                chaloTextUIState12 = chaloTextUIState22;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                ChaloTextStyleHelper chaloTextStyleHelper10 = chaloTextStyleHelper4;
                ChaloColorToken.Black black7 = ChaloColorToken.Black.f9759a;
                black = black7;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper10, (String) objB5, black7, null, null, null, null, 124), new yv0(premiumBusStopSelectionComponent, 1), UIShape.e, false, 52);
                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new yv0(premiumBusStopSelectionComponent, 2));
                iconType = IconType.IC_RED_CROSS;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                coroutineSingletons2 = coroutineSingletons;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState12;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState13;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState14;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandler$Companion$fromLambda$1A;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i8;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i7;
                chaloTextUIState15 = chaloTextUIState14;
                premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                int i113 = i8;
                i9 = i7;
                i10 = i113;
                uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                chaloTextUIState16 = chaloTextUIState12;
                buttonUIState = buttonUIStateF;
                str7 = str6;
                imageUISize2 = imageUISize;
                objB5 = objB4;
                ButtonUIState buttonUIState8 = buttonUIStateD;
                TextUIState.ChaloTextUIState chaloTextUIState112 = chaloTextUIState13;
                ImageUIState imageUIState6 = new ImageUIState(iconType, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler, 112);
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i10, i9, str7, chaloTextUIState16, chaloTextUIState112, chaloTextUIState15, buttonUIState, buttonUIState8, imageUIState6, 8);
            case 6:
                int i22 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                int i23 = premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                ImageUISize imageUISize3 = (ImageUISize) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9;
                black = (ChaloColorToken.Black) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8;
                iconType = (IconType) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7;
                UiEventHandler uiEventHandler2 = (UiEventHandler) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6;
                buttonUIStateD = (ButtonUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5;
                ButtonUIState buttonUIState9 = (ButtonUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState23 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                chaloTextUIState13 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState24 = (TextUIState.ChaloTextUIState) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                String str9 = (String) premiumBusStopSelectionComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                str7 = str9;
                buttonUIState = buttonUIState9;
                imageUISize2 = imageUISize3;
                i9 = i22;
                i10 = i23;
                chaloTextUIState15 = chaloTextUIState23;
                chaloTextUIState16 = chaloTextUIState24;
                uiEventHandler = uiEventHandler2;
                ButtonUIState buttonUIState10 = buttonUIStateD;
                TextUIState.ChaloTextUIState chaloTextUIState113 = chaloTextUIState13;
                ImageUIState imageUIState7 = new ImageUIState(iconType, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler, 112);
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i10, i9, str7, chaloTextUIState16, chaloTextUIState113, chaloTextUIState15, buttonUIState, buttonUIState10, imageUIState7, 8);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(ContinuationImpl continuationImpl) {
        PremiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1 premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1;
        PremiumBusStopSelectionComponent premiumBusStopSelectionComponent;
        if (continuationImpl instanceof PremiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1) {
            premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1 = (PremiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1) continuationImpl;
            int i = premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1 = new PremiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1(this, continuationImpl);
            }
        } else {
            premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1 = new PremiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1(this, continuationImpl);
        }
        Object objA = premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = this.L;
            if (premiumBusNativeCityWiseConfigAppModel != null) {
                return premiumBusNativeCityWiseConfigAppModel;
            }
            premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1.L$0 = this;
            premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1.label = 1;
            objA = this.t.a(premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            premiumBusStopSelectionComponent = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumBusStopSelectionComponent = (PremiumBusStopSelectionComponent) premiumBusStopSelectionComponent$getEvaluatedPremiumBusConfig$1.L$0;
            ResultKt.b(objA);
        }
        PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel2 = (PremiumBusNativeCityWiseConfigAppModel) objA;
        premiumBusStopSelectionComponent.L = premiumBusNativeCityWiseConfigAppModel2;
        return premiumBusNativeCityWiseConfigAppModel2;
    }

    public final void L0(PremiumBusStopSelectionIntent intent) {
        String strA;
        Source source;
        String strA2;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PremiumBusStopSelectionIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            PremiumBusStopSelectionIntent.InitializationIntent initializationIntent = (PremiumBusStopSelectionIntent.InitializationIntent) intent;
            if (this.d) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleInitializationIntent$1(this, initializationIntent, null), 3);
            return;
        }
        final int i = 0;
        int i2 = 2;
        final int i3 = 1;
        if (intent instanceof PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent) {
            PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent stopSelectionFieldClickedIntent = (PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent) intent;
            Job job = this.H;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                int i4 = WhenMappings.f7963a[stopSelectionFieldClickedIntent.f7981a.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    source = Source.PREMIUM_FROM_STOP_SELECTION;
                } else {
                    if (i4 != 3 && i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    source = Source.PREMIUM_TO_STOP_SELECTION;
                }
                UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(ArraysKt.j0(new UniversalSearchOption[]{new UniversalSearchOption.STOPS(true, true), new UniversalSearchOption.PLACES(true, true)}));
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA2 = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
                } catch (Exception unused) {
                    strA2 = null;
                }
                if (strA2 == null) {
                    return;
                }
                String strA3 = KUUID.a();
                UniversalSearchFlowSource universalSearchFlowSource = source == Source.PREMIUM_FROM_STOP_SELECTION ? UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION : UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION;
                Job job2 = this.J;
                if (job2 != null) {
                    ((JobSupport) job2).cancel(null);
                }
                this.J = BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1(this, strA3, stopSelectionFieldClickedIntent, universalSearchFlowSource, source, strA2, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof PremiumBusStopSelectionIntent.StopSelectionFieldResultIntent) {
            PremiumBusStopSelectionIntent.StopSelectionFieldResultIntent stopSelectionFieldResultIntent = (PremiumBusStopSelectionIntent.StopSelectionFieldResultIntent) intent;
            PremiumBusStopSearchSource premiumBusStopSearchSource = stopSelectionFieldResultIntent.b;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = stopSelectionFieldResultIntent.f7982a;
            int i5 = WhenMappings.f7963a[premiumBusStopSearchSource.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                E0(new vg(premiumBusStopSearchSource == PremiumBusStopSearchSource.FROM_STOP_SUGGESTION, pBStopPlaceSelectedAppModel, 2));
                return;
            }
            boolean z2 = premiumBusStopSearchSource == PremiumBusStopSearchSource.FROM_STOP_SEARCH;
            final boolean z3 = ((z2 ? pBStopPlaceSelectedAppModel : this.E) == null || (!z2 ? pBStopPlaceSelectedAppModel : this.F) == null) ? false : true;
            if (z2) {
                this.E = pBStopPlaceSelectedAppModel;
                E0(new Function1() { // from class: bw0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        PremiumBusStopSelectionViewState it = (PremiumBusStopSelectionViewState) obj;
                        switch (i) {
                            case 0:
                                Intrinsics.i(it, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.E;
                                return PremiumBusStopSelectionViewState.a(it, null, false, z3, pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.c : null, null, null, null, false, null, Intrinsics.d(pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.b : null, "userLocation"), false, null, null, 130035);
                            default:
                                Intrinsics.i(it, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = this.F;
                                return PremiumBusStopSelectionViewState.a(it, null, false, z3, null, pBStopPlaceSelectedAppModel3 != null ? pBStopPlaceSelectedAppModel3.c : null, null, null, false, null, false, false, null, null, 131051);
                        }
                    }
                });
                return;
            } else {
                this.F = pBStopPlaceSelectedAppModel;
                E0(new Function1() { // from class: bw0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        PremiumBusStopSelectionViewState it = (PremiumBusStopSelectionViewState) obj;
                        switch (i3) {
                            case 0:
                                Intrinsics.i(it, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.E;
                                return PremiumBusStopSelectionViewState.a(it, null, false, z3, pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.c : null, null, null, null, false, null, Intrinsics.d(pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.b : null, "userLocation"), false, null, null, 130035);
                            default:
                                Intrinsics.i(it, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = this.F;
                                return PremiumBusStopSelectionViewState.a(it, null, false, z3, null, pBStopPlaceSelectedAppModel3 != null ? pBStopPlaceSelectedAppModel3.c : null, null, null, false, null, false, false, null, null, 131051);
                        }
                    }
                });
                return;
            }
        }
        PremiumBusStopSelectionIntent.ProceedBtnClickIntent proceedBtnClickIntent = PremiumBusStopSelectionIntent.ProceedBtnClickIntent.f7979a;
        if (intent.equals(proceedBtnClickIntent)) {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.E;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = this.F;
            if (pBStopPlaceSelectedAppModel2 == null || pBStopPlaceSelectedAppModel3 == null) {
                BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$3(this, null), 3);
                return;
            }
            String str = this.G ? "Rebook Card" : "User";
            Source source2 = Source.PREMIUM_BUS_STOP_SELECTION_SCREEN;
            Source source3 = this.K;
            Pair pair = new Pair("searchSource", str);
            Pair pair2 = new Pair("sourceName", pBStopPlaceSelectedAppModel2.c);
            Pair pair3 = new Pair("sourceType", pBStopPlaceSelectedAppModel2.f.name());
            LatLng latLng = pBStopPlaceSelectedAppModel2.e;
            Pair pair4 = new Pair("sourceLat", String.valueOf(latLng != null ? Double.valueOf(latLng.f5134a) : null));
            Pair pair5 = new Pair("sourceLong", String.valueOf(latLng != null ? Double.valueOf(latLng.b) : null));
            String str2 = pBStopPlaceSelectedAppModel3.c;
            LatLng latLng2 = pBStopPlaceSelectedAppModel3.e;
            AnalyticsContractImplKt.a(this.q, "pb trip details submitted", source2, source3, MapsKt.i(pair, pair2, pair3, pair4, pair5, new Pair("destinationName", str2), new Pair("destinationType", pBStopPlaceSelectedAppModel3.f.name()), new Pair("destinationLat", String.valueOf(latLng2 != null ? Double.valueOf(latLng2.f5134a) : null)), new Pair("destinationLong", String.valueOf(latLng2 != null ? Double.valueOf(latLng2.b) : null))), 48);
            this.G = false;
            E0(new zv0(i3));
            this.H = BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$2(this, pBStopPlaceSelectedAppModel2, pBStopPlaceSelectedAppModel3, null), 3);
            return;
        }
        boolean z4 = intent instanceof PremiumBusStopSelectionIntent.OriginDestinationPointSelectedIntent;
        ChaloNavigationManager chaloNavigationManager = this.A;
        PremiumBusArgs.StopSelectionArgs stopSelectionArgs = this.k;
        StateFlow stateFlow = this.f;
        if (z4) {
            PremiumBusStopSelectionIntent.OriginDestinationPointSelectedIntent originDestinationPointSelectedIntent = (PremiumBusStopSelectionIntent.OriginDestinationPointSelectedIntent) intent;
            PBOriginDestinationAppModel pBOriginDestinationAppModel = originDestinationPointSelectedIntent.f7975a;
            Job job3 = this.I;
            if (job3 == null || !((AbstractCoroutine) job3).isActive()) {
                this.l.E(pBOriginDestinationAppModel);
                Object obj = this.G ? "Rebook Card" : "User";
                Long l = pBOriginDestinationAppModel.e;
                Long l2 = pBOriginDestinationAppModel.j;
                long jLongValue = (l == null || l2 == null) ? -1L : l.longValue() + l2.longValue();
                Source source4 = Source.PREMIUM_BUS_STOP_SELECTION_SCREEN;
                AnalyticsContractImplKt.a(this.q, "pb pickup drop selected", source4, this.K, MapsKt.i(new Pair("searchSource", obj), new Pair("pickUpName", pBOriginDestinationAppModel.d), new Pair("pickUpId", pBOriginDestinationAppModel.c), new Pair("dropName", pBOriginDestinationAppModel.i), new Pair("dropId", pBOriginDestinationAppModel.h), new Pair("firstMileWalkingTime", String.valueOf(l)), new Pair("lastMileWalkingTime", String.valueOf(l2)), new Pair("combinedWalkingTime", Long.valueOf(jLongValue))), 48);
                if (((PremiumBusStopSelectionViewState) stateFlow.getValue()).k) {
                    this.I = BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleOriginDestinationPointSelectedIntent$1(this, originDestinationPointSelectedIntent, null), 3);
                    return;
                }
                E0(new zv0(0));
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = this.E;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel5 = this.F;
                if (pBStopPlaceSelectedAppModel4 == null || pBStopPlaceSelectedAppModel5 == null) {
                    BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleOriginDestinationPointSelectedIntent$3(this, null), 3);
                    return;
                }
                PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = new PremiumBusProductPurchaseFlowType.FreshPurchase(pBStopPlaceSelectedAppModel4, pBStopPlaceSelectedAppModel5, this.y.j());
                Json json2 = ChaloJson.b;
                json2.getClass();
                ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.SlotSelectionArgs(source4, json2.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), freshPurchase), stopSelectionArgs.g), null, 6);
                return;
            }
            return;
        }
        if (intent instanceof PremiumBusStopSelectionIntent.OriginDestinationPointClickedFromRecentIntent) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = ((PremiumBusStopSelectionIntent.OriginDestinationPointClickedFromRecentIntent) intent).f7974a;
            String str3 = pBOriginDestinationAppModel2.c;
            String str4 = pBOriginDestinationAppModel2.d;
            PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
            this.E = new PBStopPlaceSelectedAppModel(str3, "", str4, null, null, premiumBusSelectedLocationType);
            String str5 = pBOriginDestinationAppModel2.h;
            String str6 = pBOriginDestinationAppModel2.i;
            this.F = new PBStopPlaceSelectedAppModel(str5, "", str6, null, null, premiumBusSelectedLocationType);
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel6 = this.E;
            if (pBStopPlaceSelectedAppModel6 != null) {
                Source source5 = Source.PREMIUM_BUS_STOP_SELECTION_SCREEN;
                Pair pair6 = new Pair("sourceName", pBStopPlaceSelectedAppModel6.c);
                Pair pair7 = new Pair("sourceType", pBStopPlaceSelectedAppModel6.f.name());
                LatLng latLng3 = pBStopPlaceSelectedAppModel6.e;
                AnalyticsContractImplKt.b(this.q, "pb rebook card clicked", source5, MapsKt.i(pair6, pair7, new Pair("sourceLat", String.valueOf(latLng3 != null ? Double.valueOf(latLng3.f5134a) : null)), new Pair("sourceLong", String.valueOf(latLng3 != null ? Double.valueOf(latLng3.b) : null)), new Pair("destinationName", str6), new Pair("destinationType", premiumBusSelectedLocationType.name()), new Pair("destinationLat", "null"), new Pair("destinationLong", "null")), false, 24);
            }
            this.G = true;
            E0(new aw0(this, 1));
            L0(proceedBtnClickIntent);
            return;
        }
        if (intent instanceof PremiumBusStopSelectionIntent.ReportProblemClickedIntent) {
            BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleReportProblemClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(PremiumBusStopSelectionIntent.StopSwapButtonClickedIntent.f7983a)) {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel7 = this.E;
            this.E = this.F;
            this.F = pBStopPlaceSelectedAppModel7;
            E0(new aw0(this, 0));
            return;
        }
        if (intent.equals(PremiumBusStopSelectionIntent.ViewAllOffersClickedIntent.f7985a)) {
            return;
        }
        if (intent.equals(PremiumBusStopSelectionIntent.PhoneClicked.f7978a)) {
            BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handlePhoneClicked$1(this, null), 3);
            return;
        }
        if (intent instanceof PremiumBusStopSelectionIntent.OriginDestinationStopDetailsClickedIntent) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel3 = ((PremiumBusStopSelectionIntent.OriginDestinationStopDetailsClickedIntent) intent).f7976a;
            ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumStopDetailsArgs(pBOriginDestinationAppModel3.c, pBOriginDestinationAppModel3.h, stopSelectionArgs.g, pBOriginDestinationAppModel3.f7091a), null, 6);
            return;
        }
        if (intent instanceof PremiumBusStopSelectionIntent.PBRouteClicked) {
            Source source6 = Source.PREMIUM_BUS_STOP_SELECTION_SCREEN;
            AnalyticsContractImplKt.a(this.q, "pb landing route clicked", source6, Source.NONE, MapsKt.h(new Pair("route id", null)), 48);
            RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(null, null, source6.getSourceName(), 238);
            try {
                Json json3 = ChaloJson.b;
                json3.getClass();
                strA = json3.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
            } catch (Exception unused2) {
                strA = null;
            }
            if (strA != null) {
                q0(new fr0(12, this, strA));
                return;
            }
            return;
        }
        if (intent instanceof PremiumBusStopSelectionIntent.NewRouteSuggestionClickIntent) {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel8 = this.E;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel9 = this.F;
            if (pBStopPlaceSelectedAppModel8 == null || pBStopPlaceSelectedAppModel8.f == PremiumBusSelectedLocationType.LOCATION) {
                pBStopPlaceSelectedAppModel8 = null;
            }
            E0(new jr0(pBStopPlaceSelectedAppModel8, (pBStopPlaceSelectedAppModel9 == null || pBStopPlaceSelectedAppModel9.f == PremiumBusSelectedLocationType.LOCATION) ? null : pBStopPlaceSelectedAppModel9, 1));
            return;
        }
        if (!(intent instanceof PremiumBusStopSelectionIntent.NewRouteSuggestionSubmitBtnClickIntent)) {
            if (intent instanceof PremiumBusStopSelectionIntent.NewRouteSuggestionCancelBtnClickIntent) {
                E0(new dv0(23));
                return;
            }
            if (intent instanceof PremiumBusStopSelectionIntent.NewRouteSuggestionSuccessOkayBtnClickIntent) {
                E0(new zv0(i2));
                return;
            }
            if (intent.equals(PremiumBusStopSelectionIntent.PBExploreAvailableRoutesClicked.f7977a)) {
                AnalyticsContractImplKt.a(this.q, "PB explore routes clicked", Source.PREMIUM_BUS_STOP_SELECTION_SCREEN, Source.NONE, null, 56);
                q0(new yv0(this, 3));
                return;
            }
            if (intent.equals(PremiumBusStopSelectionIntent.CloseBottomSheetClickIntent.f7965a)) {
                E0(new dv0(28));
                return;
            }
            if (intent.equals(PremiumBusStopSelectionIntent.OnNotificationIconClicked.f7972a)) {
                ChaloNavigationManagerKt.e(chaloNavigationManager, PremiumBusNotificationArgs.INSTANCE, null, 6);
                return;
            }
            if (intent.equals(PremiumBusStopSelectionIntent.TimePickerContinueBtnClickedIntent.f7984a)) {
                BuildersKt.d(contextScope, null, null, new PremiumBusStopSelectionComponent$handleTimePickerContinueBtnClickedIntent$1(this, null), 3);
                return;
            }
            if (intent instanceof PremiumBusStopSelectionIntent.OnTimeChangeIntent) {
                E0(new et0((PremiumBusStopSelectionIntent.OnTimeChangeIntent) intent, 26));
                return;
            }
            if (intent.equals(PremiumBusStopSelectionIntent.BackPressedOnDateAndTimePickerBottomSheet.f7964a)) {
                if (((PremiumBusStopSelectionViewState) stateFlow.getValue()).f != null) {
                    E0(new dv0(25));
                    return;
                }
                return;
            } else {
                if (!intent.equals(PremiumBusStopSelectionIntent.OnDatePickerDialogCancelIntent.f7971a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new dv0(24));
                return;
            }
        }
        PremiumBusStopSelectionIntent.NewRouteSuggestionSubmitBtnClickIntent newRouteSuggestionSubmitBtnClickIntent = (PremiumBusStopSelectionIntent.NewRouteSuggestionSubmitBtnClickIntent) intent;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel10 = newRouteSuggestionSubmitBtnClickIntent.f7969a;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel11 = newRouteSuggestionSubmitBtnClickIntent.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel12 = this.E;
        if (pBStopPlaceSelectedAppModel12 != null) {
            linkedHashMap.put("searchedPickUpLocationName", pBStopPlaceSelectedAppModel12.c);
            linkedHashMap.put("searchedPickUpLocationType", pBStopPlaceSelectedAppModel12.f.name());
            LatLng latLng4 = pBStopPlaceSelectedAppModel12.e;
            if (latLng4 != null) {
                linkedHashMap.put("searchedPickUpLocationLat", Double.valueOf(latLng4.f5134a));
                linkedHashMap.put("searchedPickUpLocationLong", Double.valueOf(latLng4.b));
            }
        }
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel13 = this.F;
        if (pBStopPlaceSelectedAppModel13 != null) {
            linkedHashMap.put("searchedDropLocationName", pBStopPlaceSelectedAppModel13.c);
            linkedHashMap.put("searchedDropLocationType", pBStopPlaceSelectedAppModel13.f.name());
            LatLng latLng5 = pBStopPlaceSelectedAppModel13.e;
            if (latLng5 != null) {
                linkedHashMap.put("searchedDropLocationLat", Double.valueOf(latLng5.f5134a));
                linkedHashMap.put("searchedDropLocationLong", Double.valueOf(latLng5.b));
            }
        }
        if (pBStopPlaceSelectedAppModel10 != null) {
            linkedHashMap.put("pickUpLocationName", pBStopPlaceSelectedAppModel10.c);
            linkedHashMap.put("pickUpLocationType", pBStopPlaceSelectedAppModel10.f.name());
            LatLng latLng6 = pBStopPlaceSelectedAppModel10.e;
            if (latLng6 != null) {
                linkedHashMap.put("pickUpLocationLat", Double.valueOf(latLng6.f5134a));
                linkedHashMap.put("pickUpLocationLong", Double.valueOf(latLng6.b));
            }
        }
        if (pBStopPlaceSelectedAppModel11 != null) {
            linkedHashMap.put("dropLocationName", pBStopPlaceSelectedAppModel11.c);
            linkedHashMap.put("dropLocationType", pBStopPlaceSelectedAppModel11.f.name());
            LatLng latLng7 = pBStopPlaceSelectedAppModel11.e;
            if (latLng7 != null) {
                linkedHashMap.put("dropLocationLat", Double.valueOf(latLng7.f5134a));
                linkedHashMap.put("dropLocationLong", Double.valueOf(latLng7.b));
            }
        }
        AnalyticsContractImplKt.a(this.q, "pb stop suggestion submitted", Source.PREMIUM_BUS_STOP_SELECTION_SCREEN, this.K, linkedHashMap, 48);
        E0(new dv0(29));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PremiumBusStopSelectionViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusStopSelectionViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new PremiumBusStopSelectionViewState();
    }
}
