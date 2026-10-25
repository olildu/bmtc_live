package app.chalo.routeselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ProductBookingBranding;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.domain.FetchOndcConfigUseCase;
import app.chalo.ondc.model.app.OndcRouteSearchResultAppModel;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase;
import app.chalo.routeselection.domain.FetchRoutesResult;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.searchbar.SearchBarWithActionUISpecs;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.IsCityEnabledForLiveTrackingUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ab1;
import defpackage.cb1;
import defpackage.db1;
import defpackage.dd;
import defpackage.f31;
import defpackage.gf;
import defpackage.hq0;
import defpackage.qi;
import defpackage.rw0;
import defpackage.vo1;
import defpackage.yg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchForProductPurchaseComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchViewState;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchDataState;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchSideEffect;", "StopPrefill", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopBasedRouteSearchForProductPurchaseComponent extends ChaloBaseStateMviComponent<StopBasedRouteSearchIntent, StopBasedRouteSearchViewState, StopBasedRouteSearchViewState, StopBasedRouteSearchSideEffect> {
    public boolean A;
    public StopAppModel B;
    public StopAppModel C;
    public String D;
    public String E;
    public String F;
    public List G;
    public String H;
    public Job I;
    public boolean J;
    public final Lazy K;
    public final Lazy L;
    public final TicketPurchaseArgs.StopSelectionArgs k;
    public final FetchRoutesForGivenStopsUseCase l;
    public final FetchCompleteProductConfigByIdUseCase m;
    public final FetchProductConfigsForUiUseCase n;
    public final StoreCompleteProductConfigLocallyUseCase o;
    public final StringProvider p;
    public final CityProvider q;
    public final RecentRepositoryProvider r;
    public final BasicInfoContract s;
    public final AnalyticsContract t;
    public final FetchOndcConfigUseCase u;
    public final ChaloNavigationManager v;
    public final KotlinToastManager w;
    public final UniversalSearchResultStateManager x;
    public final ProductBookingDataStore y;
    public final IsCityEnabledForLiveTrackingUseCase z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchForProductPurchaseComponent$Companion;", "", "", "MIN_ROUTES_COUNT_FOR_ENABLING_SEARCH", "I", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchForProductPurchaseComponent$StopPrefill;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopPrefill {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9190a;
        public final String b;
        public final String c;

        public StopPrefill(String str, String str2, String str3) {
            this.f9190a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopPrefill)) {
                return false;
            }
            StopPrefill stopPrefill = (StopPrefill) obj;
            return Intrinsics.d(this.f9190a, stopPrefill.f9190a) && Intrinsics.d(this.b, stopPrefill.b) && Intrinsics.d(this.c, stopPrefill.c);
        }

        public final int hashCode() {
            String str = this.f9190a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return vo1.p(dd.e("StopPrefill(fromStopJson=", this.f9190a, ", toStopJson=", this.b, ", routeId="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9191a;

        static {
            int[] iArr = new int[RouteNamingSchemeType.values().length];
            try {
                iArr[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9191a = iArr;
        }
    }

    public StopBasedRouteSearchForProductPurchaseComponent(ComponentContext componentContext, TicketPurchaseArgs.StopSelectionArgs stopSelectionArgs, FetchRoutesForGivenStopsUseCase fetchRoutesForGivenStopsUseCase, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, StringProvider stringProvider, CityProvider cityProvider, RecentRepositoryProvider recentRepositoryProvider, BasicInfoContract basicInfoContract, AnalyticsContract analyticsContract, FetchOndcConfigUseCase fetchOndcConfigUseCase, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, UniversalSearchResultStateManager universalSearchResultStateManager, ProductBookingDataStore productBookingDataStore, IsCityEnabledForLiveTrackingUseCase isCityEnabledForLiveTrackingUseCase) {
        super(componentContext);
        this.k = stopSelectionArgs;
        this.l = fetchRoutesForGivenStopsUseCase;
        this.m = fetchCompleteProductConfigByIdUseCase;
        this.n = fetchProductConfigsForUiUseCase;
        this.o = storeCompleteProductConfigLocallyUseCase;
        this.p = stringProvider;
        this.q = cityProvider;
        this.r = recentRepositoryProvider;
        this.s = basicInfoContract;
        this.t = analyticsContract;
        this.u = fetchOndcConfigUseCase;
        this.v = chaloNavigationManager;
        this.w = kotlinToastManager;
        this.x = universalSearchResultStateManager;
        this.y = productBookingDataStore;
        this.z = isCityEnabledForLiveTrackingUseCase;
        this.A = true;
        this.G = EmptyList.f17557a;
        this.H = "";
        this.J = true;
        final int i = 0;
        this.K = LazyKt.b(new Function0(this) { // from class: app.chalo.routeselection.ui.a
            public final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objB;
                StopAppModel stopAppModel;
                Object objB2;
                StopAppModel stopAppModel2;
                switch (i) {
                    case 0:
                        TicketPurchaseArgs.StopSelectionArgs stopSelectionArgs2 = this.b.k;
                        if (stopSelectionArgs2 instanceof TicketPurchaseArgs.StopSelectionArgs.InstantTicket) {
                            TicketPurchaseArgs.StopSelectionArgs.InstantTicket instantTicket = (TicketPurchaseArgs.StopSelectionArgs.InstantTicket) stopSelectionArgs2;
                            return new StopBasedRouteSearchForProductPurchaseComponent.StopPrefill(instantTicket.e, instantTicket.f, instantTicket.g);
                        }
                        if (stopSelectionArgs2 instanceof TicketPurchaseArgs.StopSelectionArgs.ONDC) {
                            TicketPurchaseArgs.StopSelectionArgs.ONDC ondc = (TicketPurchaseArgs.StopSelectionArgs.ONDC) stopSelectionArgs2;
                            return new StopBasedRouteSearchForProductPurchaseComponent.StopPrefill(ondc.e, ondc.f, null);
                        }
                        if (stopSelectionArgs2 instanceof TicketPurchaseArgs.StopSelectionArgs.PassPurchase) {
                            return new StopBasedRouteSearchForProductPurchaseComponent.StopPrefill(null, null, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        Lazy lazy = this.b.K;
                        String str = ((StopBasedRouteSearchForProductPurchaseComponent.StopPrefill) lazy.getValue()).f9190a;
                        if (str != null) {
                            try {
                                Json json = ChaloJson.b;
                                json.getClass();
                                objB = json.b(str, StopAppModel.INSTANCE.serializer());
                            } catch (Exception unused) {
                                objB = null;
                            }
                            stopAppModel = (StopAppModel) objB;
                            break;
                        } else {
                            stopAppModel = null;
                        }
                        String str2 = ((StopBasedRouteSearchForProductPurchaseComponent.StopPrefill) lazy.getValue()).b;
                        if (str2 != null) {
                            try {
                                Json json2 = ChaloJson.b;
                                json2.getClass();
                                objB2 = json2.b(str2, StopAppModel.INSTANCE.serializer());
                            } catch (Exception unused2) {
                                objB2 = null;
                            }
                            stopAppModel2 = (StopAppModel) objB2;
                            break;
                        } else {
                            stopAppModel2 = null;
                        }
                        if (stopAppModel == null || stopAppModel2 == null || StringsKt.F(stopAppModel.f1727a) || StringsKt.F(stopAppModel2.f1727a)) {
                            return null;
                        }
                        return new Pair(stopAppModel, stopAppModel2);
                }
            }
        });
        final int i2 = 1;
        this.L = LazyKt.b(new Function0(this) { // from class: app.chalo.routeselection.ui.a
            public final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objB;
                StopAppModel stopAppModel;
                Object objB2;
                StopAppModel stopAppModel2;
                switch (i2) {
                    case 0:
                        TicketPurchaseArgs.StopSelectionArgs stopSelectionArgs2 = this.b.k;
                        if (stopSelectionArgs2 instanceof TicketPurchaseArgs.StopSelectionArgs.InstantTicket) {
                            TicketPurchaseArgs.StopSelectionArgs.InstantTicket instantTicket = (TicketPurchaseArgs.StopSelectionArgs.InstantTicket) stopSelectionArgs2;
                            return new StopBasedRouteSearchForProductPurchaseComponent.StopPrefill(instantTicket.e, instantTicket.f, instantTicket.g);
                        }
                        if (stopSelectionArgs2 instanceof TicketPurchaseArgs.StopSelectionArgs.ONDC) {
                            TicketPurchaseArgs.StopSelectionArgs.ONDC ondc = (TicketPurchaseArgs.StopSelectionArgs.ONDC) stopSelectionArgs2;
                            return new StopBasedRouteSearchForProductPurchaseComponent.StopPrefill(ondc.e, ondc.f, null);
                        }
                        if (stopSelectionArgs2 instanceof TicketPurchaseArgs.StopSelectionArgs.PassPurchase) {
                            return new StopBasedRouteSearchForProductPurchaseComponent.StopPrefill(null, null, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        Lazy lazy = this.b.K;
                        String str = ((StopBasedRouteSearchForProductPurchaseComponent.StopPrefill) lazy.getValue()).f9190a;
                        if (str != null) {
                            try {
                                Json json = ChaloJson.b;
                                json.getClass();
                                objB = json.b(str, StopAppModel.INSTANCE.serializer());
                            } catch (Exception unused) {
                                objB = null;
                            }
                            stopAppModel = (StopAppModel) objB;
                            break;
                        } else {
                            stopAppModel = null;
                        }
                        String str2 = ((StopBasedRouteSearchForProductPurchaseComponent.StopPrefill) lazy.getValue()).b;
                        if (str2 != null) {
                            try {
                                Json json2 = ChaloJson.b;
                                json2.getClass();
                                objB2 = json2.b(str2, StopAppModel.INSTANCE.serializer());
                            } catch (Exception unused2) {
                                objB2 = null;
                            }
                            stopAppModel2 = (StopAppModel) objB2;
                            break;
                        } else {
                            stopAppModel2 = null;
                        }
                        if (stopAppModel == null || stopAppModel2 == null || StringsKt.F(stopAppModel.f1727a) || StringsKt.F(stopAppModel2.f1727a)) {
                            return null;
                        }
                        return new Pair(stopAppModel, stopAppModel2);
                }
            }
        });
        Json json = ChaloJson.b;
        String str = stopSelectionArgs.c;
        json.getClass();
        Q0(new StopBasedRouteSearchIntent.ViewCreatedIntentBasedRoute((StopBasedRouteSelectionFlowType) json.b(str, StopBasedRouteSelectionFlowType.INSTANCE.serializer())));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r1 == r2) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r32, java.lang.String r33, app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.F0(app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent, java.lang.String, app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        if (r1 == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:
    
        if (r1 == r3) goto L56;
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
    public static final java.lang.Object G0(app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r22, app.chalo.citydata.data.model.app.StopAppModel r23, app.chalo.citydata.data.model.app.StopAppModel r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.G0(app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent, app.chalo.citydata.data.model.app.StopAppModel, app.chalo.citydata.data.model.app.StopAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        if (r1 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
    
        if (r1 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if (r1 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0193, code lost:
    
        if (r1 == r6) goto L66;
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
    public static final java.lang.Object H0(app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r21, app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.H0(app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent, app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static ArrayList K0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) obj;
            int i = WhenMappings.f9191a[originDestinationAppModel.j.ordinal()];
            if (i == 1) {
                StopAppModel stopAppModel = originDestinationAppModel.f;
                String str = stopAppModel != null ? stopAppModel.b : null;
                if (str != null && !StringsKt.F(str)) {
                    arrayList.add(obj);
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!StringsKt.F(originDestinationAppModel.b)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (R0(r8) == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(java.lang.String r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$fetchAndHandleRouteForStopPair$1
            if (r0 == 0) goto L14
            r0 = r14
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$fetchAndHandleRouteForStopPair$1 r0 = (app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$fetchAndHandleRouteForStopPair$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$fetchAndHandleRouteForStopPair$1 r0 = new app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$fetchAndHandleRouteForStopPair$1
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r9 = 3
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L3b
            if (r1 == r10) goto L37
            if (r1 != r9) goto L2f
            kotlin.ResultKt.b(r14)
            goto L70
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.b(r14)
            goto L67
        L3b:
            kotlin.ResultKt.b(r14)
            goto L5c
        L3f:
            kotlin.ResultKt.b(r14)
            if (r15 == 0) goto L48
            app.chalo.routeselection.domain.RouteForStopPairRequestType r14 = app.chalo.routeselection.domain.RouteForStopPairRequestType.ONDC
        L46:
            r5 = r14
            goto L4b
        L48:
            app.chalo.routeselection.domain.RouteForStopPairRequestType r14 = app.chalo.routeselection.domain.RouteForStopPairRequestType.REGULAR
            goto L46
        L4b:
            r8.label = r2
            app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r6 = app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode.BUS
            r7 = 1
            app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase r1 = r11.l
            r4 = 0
            r2 = r12
            r3 = r13
            java.lang.Object r14 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L5c
            goto L6f
        L5c:
            app.chalo.routeselection.domain.FetchRoutesResult r14 = (app.chalo.routeselection.domain.FetchRoutesResult) r14
            r8.label = r10
            java.lang.Object r12 = r11.O0(r14, r8)
            if (r12 != r0) goto L67
            goto L6f
        L67:
            r8.label = r9
            java.lang.Object r12 = r11.R0(r8)
            if (r12 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.I0(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(ContinuationImpl continuationImpl) {
        StopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1 stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1;
        if (continuationImpl instanceof StopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1) {
            stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1 = (StopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1) continuationImpl;
            int i = stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1 = new StopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1(this, continuationImpl);
            }
        } else {
            stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1 = new StopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1(this, continuationImpl);
        }
        Object objA = stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1.label = 1;
            objA = this.u.a("ondcTicket", stopBasedRouteSearchForProductPurchaseComponent$fetchOndcConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            z = false;
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new yg((ChaloUseCaseResult.Success) chaloUseCaseResult, 21));
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object L0(String str, ContinuationImpl continuationImpl) {
        StopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1 stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1;
        String str2;
        SearchBarWithActionUISpecs searchBarWithActionUISpecs;
        IconButtonUIState iconButtonUIState;
        if (continuationImpl instanceof StopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1) {
            stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1 = (StopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1) continuationImpl;
            int i = stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1 = new StopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1 = new StopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1(this, continuationImpl);
        }
        Object obj = stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f = ChaloThemeHelper.a().f1916a;
            SearchBarWithActionUISpecs searchBarWithActionUISpecs2 = new SearchBarWithActionUISpecs(null, new ChaloPadding(f, f, f, f), 479);
            str2 = str;
            stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.L$0 = str2;
            stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.L$1 = searchBarWithActionUISpecs2;
            stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.label = 1;
            Object objB = this.p.b(StringEnum.ENTER_ROUTE_NUMBER, new Object[0], stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            searchBarWithActionUISpecs = searchBarWithActionUISpecs2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            searchBarWithActionUISpecs = (SearchBarWithActionUISpecs) stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.L$1;
            String str3 = (String) stopBasedRouteSearchForProductPurchaseComponent$getSearchBarUIState$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
        }
        BaseTextFieldUIState.TextFieldUIState textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, TextFieldEventHandlerHelper.b(2, new cb1(this, 0), null), null, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyLarge, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, null, 0, null, null, 0.0f, 131004);
        if (str2.length() > 0) {
            iconButtonUIState = new IconButtonUIState(new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), UiEventHandler.Companion.a(new db1(this, 0)), ChaloColorToken.Transparent.f9864a, ChaloThemeHelper.a().f1916a, 4);
        } else {
            iconButtonUIState = null;
        }
        return new SearchBarWithActionUIState(searchBarWithActionUISpecs, textFieldUIState, null, iconButtonUIState, null, 48);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M0(ContinuationImpl continuationImpl) {
        StopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1 stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1;
        if (continuationImpl instanceof StopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1) {
            stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1 = (StopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1) continuationImpl;
            int i = stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1 = new StopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1(this, continuationImpl);
            }
        } else {
            stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1 = new StopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1(this, continuationImpl);
        }
        Object objB = stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            AnalyticsContractImplKt.b(this.t, "stop based stop selection screen route result success", Source.STOP_BASED_ROUTE_SELECTION_FRAGMENT, MapsKt.i(new Pair("totalResults", new Integer(0)), new Pair("flowType", ((StopBasedRouteSearchViewState) this.f.getValue()).i.toString())), false, 24);
            stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1.label = 1;
            objB = this.p.b(StringEnum.NO_ROUTE_AVAILABLE_FOR_THIS_SEARCH, new Object[0], stopBasedRouteSearchForProductPurchaseComponent$handleNoRoutesAvailableResultCase$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        E0(new f31((String) objB, 10));
        return Unit.f17538a;
    }

    public final void N0() {
        StopAppModel stopAppModel;
        E0(new ab1(11));
        StopAppModel stopAppModel2 = this.B;
        if (stopAppModel2 == null || (stopAppModel = this.C) == null) {
            return;
        }
        this.E = this.D;
        this.D = null;
        StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType = ((StopBasedRouteSearchViewState) this.f.getValue()).i;
        AnalyticsContractImplKt.b(this.t, "stop based stop selection screen proceed button click", Source.STOP_BASED_ROUTE_SELECTION_FRAGMENT, vo1.s("flowType", stopBasedRouteSelectionFlowType.toString()), false, 24);
        BuildersKt.d(this.j, null, null, new StopBasedRouteSearchForProductPurchaseComponent$handleProceedButtonClickIntent$2(stopBasedRouteSelectionFlowType, this, stopAppModel2, stopAppModel, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x015b A[RETURN] */
    public final Object O0(FetchRoutesResult fetchRoutesResult, ContinuationImpl continuationImpl) {
        StopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1 stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1;
        KotlinToastManager kotlinToastManager;
        FetchRoutesResult.Success regular;
        List list;
        Object objT0;
        if (continuationImpl instanceof StopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1) {
            stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1 = (StopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1) continuationImpl;
            int i = stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1 = new StopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1(this, continuationImpl);
            }
        } else {
            stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1 = new StopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1(this, continuationImpl);
        }
        Object objB = stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label;
        Object obj2 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!(fetchRoutesResult instanceof FetchRoutesResult.Success)) {
                if (fetchRoutesResult instanceof FetchRoutesResult.NoRoutesAvailable) {
                    stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label = 4;
                    if (M0(stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1) != obj) {
                        return obj2;
                    }
                } else {
                    if (!(fetchRoutesResult instanceof FetchRoutesResult.CityNotAvailable) && !(fetchRoutesResult instanceof FetchRoutesResult.LocalException) && !(fetchRoutesResult instanceof FetchRoutesResult.UnknownException) && !(fetchRoutesResult instanceof FetchRoutesResult.ResponseParseException) && !(fetchRoutesResult instanceof FetchRoutesResult.ServerError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AnalyticsContractImplKt.b(this.t, "stop based stop selection screen route result failure", Source.STOP_BASED_ROUTE_SELECTION_FRAGMENT, vo1.s("flowType", ((StopBasedRouteSearchViewState) this.f.getValue()).i.toString()), false, 24);
                    E0(new ab1(9));
                    KotlinToastManager kotlinToastManager2 = this.w;
                    stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.L$0 = kotlinToastManager2;
                    stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label = 5;
                    objB = this.p.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1);
                    if (objB != obj) {
                        kotlinToastManager = kotlinToastManager2;
                    }
                }
                return obj;
            }
            FetchRoutesResult.Success success = (FetchRoutesResult.Success) fetchRoutesResult;
            if (!(success instanceof FetchRoutesResult.Success.Ondc)) {
                if (!(success instanceof FetchRoutesResult.Success.Regular)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayListK0 = K0(((FetchRoutesResult.Success.Regular) fetchRoutesResult).f9186a);
                if (arrayListK0.isEmpty()) {
                    stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label = 2;
                    if (M0(stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1) == obj) {
                        return obj;
                    }
                    return obj2;
                }
                regular = new FetchRoutesResult.Success.Regular(arrayListK0);
                stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label = 3;
                if (regular instanceof FetchRoutesResult.Success.Ondc) {
                    OndcRouteSearchResultAppModel ondcRouteSearchResultAppModel = ((FetchRoutesResult.Success.Ondc) regular).f9185a;
                    this.H = ondcRouteSearchResultAppModel.b;
                    list = ondcRouteSearchResultAppModel.f6770a;
                } else {
                    if (regular instanceof FetchRoutesResult.Success.Regular) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = ((FetchRoutesResult.Success.Regular) regular).f9186a;
                }
                List listV0 = CollectionsKt.v0(new StopBasedRouteSearchForProductPurchaseComponent$handleRoutesFetchedSuccessFully$$inlined$sortedBy$1(), list);
                this.G = listV0;
                objT0 = T0(listV0, stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1);
                if (objT0 != obj) {
                    objT0 = obj2;
                }
                if (objT0 == obj) {
                    return obj;
                }
                return obj2;
            }
            OndcRouteSearchResultAppModel ondcRouteSearchResultAppModel2 = ((FetchRoutesResult.Success.Ondc) fetchRoutesResult).f9185a;
            ArrayList arrayListK1 = K0(ondcRouteSearchResultAppModel2.f6770a);
            if (arrayListK1.isEmpty()) {
                stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label = 1;
                if (M0(stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1) == obj) {
                    return obj;
                }
                return obj2;
            }
            String transactionId = ondcRouteSearchResultAppModel2.b;
            Intrinsics.i(transactionId, "transactionId");
            regular = new FetchRoutesResult.Success.Ondc(new OndcRouteSearchResultAppModel(arrayListK1, transactionId));
            stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.label = 3;
            if (regular instanceof FetchRoutesResult.Success.Ondc) {
                OndcRouteSearchResultAppModel ondcRouteSearchResultAppModel3 = ((FetchRoutesResult.Success.Ondc) regular).f9185a;
                this.H = ondcRouteSearchResultAppModel3.b;
                list = ondcRouteSearchResultAppModel3.f6770a;
            } else {
                if (regular instanceof FetchRoutesResult.Success.Regular) {
                    throw new NoWhenBranchMatchedException();
                }
                list = ((FetchRoutesResult.Success.Regular) regular).f9186a;
            }
            List listV1 = CollectionsKt.v0(new StopBasedRouteSearchForProductPurchaseComponent$handleRoutesFetchedSuccessFully$$inlined$sortedBy$1(), list);
            this.G = listV1;
            objT0 = T0(listV1, stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1);
            if (objT0 != obj) {
                objT0 = obj2;
            }
            if (objT0 == obj) {
                return obj;
            }
            return obj2;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
            return obj2;
        }
        if (i2 == 2) {
            ResultKt.b(objB);
            return obj2;
        }
        if (i2 == 3) {
            ResultKt.b(objB);
            return obj2;
        }
        if (i2 == 4) {
            ResultKt.b(objB);
            return obj2;
        }
        if (i2 != 5) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) stopBasedRouteSearchForProductPurchaseComponent$handleRemotelySearchedRoutes$1.L$0;
        ResultKt.b(objB);
        hq0.s(kotlinToastManager, (String) objB);
        return obj2;
    }

    public final void P0(UniversalSearchFlowSource universalSearchFlowSource) {
        String strA = KUUID.a();
        Job job = this.I;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.I = BuildersKt.d(this.j, null, null, new StopBasedRouteSearchForProductPurchaseComponent$waitForUniversalSearchResult$1(this, strA, null), 3);
        Json json = ChaloJson.b;
        UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.g(new UniversalSearchOption.STOPS(true, false)));
        json.getClass();
        this.v.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions), "Select Stop", universalSearchFlowSource.getSourceName(), Source.STOP_BASED_ROUTE_SEARCH_SCREEN, this.A ? "regular bus start location" : "regular bus end location", "ACTIVITY_RESULT", strA, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
    }

    public final void Q0(StopBasedRouteSearchIntent intent) {
        String str;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        Object ondc;
        UniversalSearchFlowSource universalSearchFlowSource;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof StopBasedRouteSearchIntent.ViewCreatedIntentBasedRoute;
        int i = 11;
        int i2 = 14;
        ContextScope contextScope = this.j;
        if (z) {
            StopBasedRouteSearchIntent.ViewCreatedIntentBasedRoute viewCreatedIntentBasedRoute = (StopBasedRouteSearchIntent.ViewCreatedIntentBasedRoute) intent;
            Source source = Source.STOP_BASED_ROUTE_SELECTION_FRAGMENT;
            StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType = viewCreatedIntentBasedRoute.f9203a;
            Pair pair = new Pair("flowType", stopBasedRouteSelectionFlowType.toString());
            Lazy lazy = this.L;
            LinkedHashMap linkedHashMapK = MapsKt.k(pair, new Pair("isPrefilled", Boolean.valueOf(((Pair) lazy.getValue()) != null)));
            Pair pair2 = (Pair) lazy.getValue();
            if (pair2 != null) {
                StopAppModel stopAppModel = (StopAppModel) pair2.getFirst();
                StopAppModel stopAppModel2 = (StopAppModel) pair2.getSecond();
                linkedHashMapK.put("prefilledFromStopId", stopAppModel.f1727a);
                linkedHashMapK.put("prefilledToStopId", stopAppModel2.f1727a);
            }
            Lazy lazy2 = this.K;
            String str2 = ((StopPrefill) lazy2.getValue()).c;
            if (str2 != null) {
                linkedHashMapK.put("prefilledRouteId", str2);
            }
            AnalyticsContractImplKt.b(this.t, "stop based stop selection screen opened", source, linkedHashMapK, false, 24);
            if (this.d) {
                return;
            }
            this.d = true;
            boolean z2 = stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.ONDC;
            if (z2) {
                ondc = new ProductBookingBranding.Ondc();
            } else {
                if (!(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.InstantTicket) && !(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.PassPurchase)) {
                    throw new NoWhenBranchMatchedException();
                }
                ondc = ProductBookingBranding.None.INSTANCE;
            }
            if (z2) {
                universalSearchFlowSource = UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN;
            } else {
                if (!(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.InstantTicket) && !(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.PassPurchase)) {
                    throw new NoWhenBranchMatchedException();
                }
                universalSearchFlowSource = UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN;
            }
            E0(new rw0(i2, viewCreatedIntentBasedRoute, ondc, universalSearchFlowSource));
            if (z2) {
                BuildersKt.d(contextScope, null, null, new StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$3(this, null), 3);
            } else if (!(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.InstantTicket) && !(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.PassPurchase)) {
                throw new NoWhenBranchMatchedException();
            }
            Pair pair3 = (Pair) lazy.getValue();
            if (pair3 != null) {
                StopAppModel stopAppModel3 = (StopAppModel) pair3.getFirst();
                StopAppModel stopAppModel4 = (StopAppModel) pair3.getSecond();
                this.D = ((StopPrefill) lazy2.getValue()).c;
                this.B = stopAppModel3;
                this.C = stopAppModel4;
                E0(new qi(stopAppModel3, stopAppModel4, (stopAppModel3 == null || stopAppModel4 == null) ? false : true, i));
                N0();
            }
            BuildersKt.d(contextScope, null, null, new StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4(this, null), 3);
            return;
        }
        boolean z3 = intent instanceof StopBasedRouteSearchIntent.FromStopBasedRouteSearchClickIntent;
        StateFlow stateFlow = this.f;
        if (z3) {
            this.A = true;
            P0(((StopBasedRouteSearchViewState) stateFlow.getValue()).m);
            return;
        }
        if (intent instanceof StopBasedRouteSearchIntent.ToStopBasedRouteSearchClickIntent) {
            AnalyticsContractImplKt.b(this.t, "stop based stop selection screen proceed button click", Source.STOP_BASED_ROUTE_SELECTION_FRAGMENT, null, false, 28);
            this.A = false;
            P0(((StopBasedRouteSearchViewState) stateFlow.getValue()).m);
            return;
        }
        if (intent instanceof StopBasedRouteSearchIntent.ProceedButtonClickIntentBasedRoute) {
            N0();
            return;
        }
        if (intent instanceof StopBasedRouteSearchIntent.OnIntentResultSuccessBasedRoute) {
            BuildersKt.d(contextScope, null, null, new StopBasedRouteSearchForProductPurchaseComponent$handleOnIntentResultSuccessIntent$1(this, (StopBasedRouteSearchIntent.OnIntentResultSuccessBasedRoute) intent, null), 3);
            return;
        }
        if (intent instanceof StopBasedRouteSearchIntent.OnRouteClickIntentBasedRoute) {
            BuildersKt.d(contextScope, null, null, new StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1(this, (StopBasedRouteSearchIntent.OnRouteClickIntentBasedRoute) intent, null), 3);
            return;
        }
        if (intent instanceof StopBasedRouteSearchIntent.ClickRecentTripItemIntentBasedRoute) {
            RecentStopBasedTripAppModel recentStopBasedTripAppModel = ((StopBasedRouteSearchIntent.ClickRecentTripItemIntentBasedRoute) intent).f9194a;
            StopAppModel stopAppModel5 = recentStopBasedTripAppModel.g;
            StopAppModel stopAppModel6 = recentStopBasedTripAppModel.h;
            this.B = stopAppModel5;
            this.C = stopAppModel6;
            E0(new qi(stopAppModel5, stopAppModel6, (stopAppModel5 == null || stopAppModel6 == null) ? false : true, i));
            N0();
            return;
        }
        if (intent instanceof StopBasedRouteSearchIntent.HideBottomSheetIntentBasedRoute) {
            E0(new ab1(13));
            return;
        }
        if (intent instanceof StopBasedRouteSearchIntent.DismissSnackBar) {
            E0(new ab1(12));
            return;
        }
        if (intent.equals(StopBasedRouteSearchIntent.BackPressedIntent.f9192a)) {
            if (((StopBasedRouteSearchViewState) stateFlow.getValue()).f != null) {
                E0(new ab1(i2));
                return;
            } else {
                gf.u(null, this.v);
                return;
            }
        }
        if (intent instanceof StopBasedRouteSearchIntent.RouteSearchQueryChangeIntent) {
            BuildersKt.d(contextScope, null, null, new StopBasedRouteSearchForProductPurchaseComponent$handleRouteSearchQueryChangeIntent$1(this, ((StopBasedRouteSearchIntent.RouteSearchQueryChangeIntent) intent).f9201a, null), 3);
            return;
        }
        if (!intent.equals(StopBasedRouteSearchIntent.ClearRouteSearchQueryIntent.f9193a)) {
            throw new NoWhenBranchMatchedException();
        }
        SearchBarWithActionUIState searchBarWithActionUIState = ((StopBasedRouteSearchViewState) stateFlow.getValue()).n;
        if (searchBarWithActionUIState == null || (textFieldUIState = searchBarWithActionUIState.b) == null || (str = textFieldUIState.f10099a) == null) {
            str = "";
        }
        AnalyticsContractImplKt.b(this.t, "stop based route selection screen clear search click", Source.STOP_BASED_ROUTE_SEARCH_SCREEN, MapsKt.i(new Pair("searchQuery", str), new Pair("flowType", ((StopBasedRouteSearchViewState) stateFlow.getValue()).i.toString())), false, 24);
        BuildersKt.d(contextScope, null, null, new StopBasedRouteSearchForProductPurchaseComponent$handleRouteSearchQueryChangeIntent$1(this, "", null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object R0(ContinuationImpl continuationImpl) {
        StopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1 stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1;
        String strN;
        String str;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        ChaloTransitMode chaloTransitMode;
        if (continuationImpl instanceof StopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1) {
            stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1 = (StopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1) continuationImpl;
            int i = stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1 = new StopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1(this, continuationImpl);
            }
        } else {
            stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1 = new StopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1(this, continuationImpl);
        }
        Object objC = stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            StopAppModel stopAppModel3 = this.B;
            if ((stopAppModel3 != null ? stopAppModel3.f1727a : null) != null) {
                StopAppModel stopAppModel4 = this.C;
                if ((stopAppModel4 != null ? stopAppModel4.f1727a : null) != null) {
                    strN = vo1.n(stopAppModel3 != null ? stopAppModel3.f1727a : null, "-", stopAppModel4 != null ? stopAppModel4.f1727a : null);
                    String strB = CityProviderKt.b(this.q);
                    if (strB == null) {
                        strB = "";
                    }
                    str = strB;
                    stopAppModel = this.B;
                    if (stopAppModel != null && (stopAppModel2 = this.C) != null) {
                        chaloTransitMode = ChaloTransitMode.BUS;
                        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$0 = strN;
                        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$1 = str;
                        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$2 = stopAppModel;
                        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$3 = stopAppModel2;
                        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$4 = chaloTransitMode;
                        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.label = 1;
                        objC = this.s.c(stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1);
                        if (objC != coroutineSingletons) {
                        }
                    }
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        chaloTransitMode = (ChaloTransitMode) stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$4;
        stopAppModel2 = (StopAppModel) stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$3;
        stopAppModel = (StopAppModel) stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$2;
        str = (String) stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$1;
        strN = (String) stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$0;
        ResultKt.b(objC);
        RecentStopBasedTripAppModel recentStopBasedTripAppModel = new RecentStopBasedTripAppModel(strN, str, stopAppModel, stopAppModel2, chaloTransitMode, ((Number) objC).longValue(), 1);
        StopBasedTripRecentRepository c = this.r.getC();
        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$0 = null;
        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$1 = null;
        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$2 = null;
        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$3 = null;
        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$4 = null;
        stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1.label = 2;
        return c.c(recentStopBasedTripAppModel, true, stopBasedRouteSearchForProductPurchaseComponent$saveOrUpdateStopBasedRecentTripToStore$1) == coroutineSingletons ? coroutineSingletons : unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S0(FareDetailsData fareDetailsData, ContinuationImpl continuationImpl) {
        StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1 stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1;
        Object next;
        if (continuationImpl instanceof StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1) {
            stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1 = (StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1) continuationImpl;
            int i = stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1 = new StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1(this, continuationImpl);
            }
        } else {
            stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1 = new StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1(this, continuationImpl);
        }
        Object objA = stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1.L$0 = fareDetailsData;
            stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1.label = 1;
            objA = this.z.a(stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fareDetailsData = (FareDetailsData) stopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$1.L$0;
            ResultKt.b(objA);
        }
        FareDetailsData fareDetailsData2 = fareDetailsData;
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        Unit unit = Unit.f17538a;
        if (zBooleanValue) {
            Iterator it = this.G.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((OriginDestinationAppModel) next).f8190a, fareDetailsData2.f8185a.b));
            OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) next;
            if (originDestinationAppModel != null) {
                String str = fareDetailsData2.f8185a.b;
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    BuildersKt.d(this.j, null, null, new StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$2(fareDetailsData2, this, originDestinationAppModel, str2, null), 3);
                    return unit;
                }
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0148  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0174, code lost:
    
        if (r2 == r4) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(java.util.List r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.T0(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (StopBasedRouteSearchViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new StopBasedRouteSearchViewState(null, null, EmptyList.f17557a, false, false, null, false, "", StopBasedRouteSelectionFlowType.InstantTicket.INSTANCE, ProductBookingBranding.None.INSTANCE, null, null, UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN, null);
    }
}
