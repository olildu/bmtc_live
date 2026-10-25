package app.chalo.livetracking.universalsearch.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.constants.Source;
import app.chalo.livetracking.routedetails.domain.IsAgencyTagVisibleUseCase;
import app.chalo.livetracking.universalsearch.UniversalSearchManager;
import app.chalo.livetracking.universalsearch.UniversalSearchResult;
import app.chalo.livetracking.universalsearch.UniversalSearchResultAnalyticProperties;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.domain.CheckIfUserCameFromPremiumBusCampaign;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.livetracking.universalsearch.ui.UniversalSearchAdditionalEventProperties;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.DestinationAfterUniversalSearch;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleViewCreatedIntent$1", f = "UniversalPickerComponent.kt", l = {341, 348, 349, 358, 364}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$handleViewCreatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DestinationAfterUniversalSearch $destinationAfterUniversalSearch;
    final /* synthetic */ UniversalPickerHeaderIcon $headerIcon;
    final /* synthetic */ String $headerStepIndicator;
    final /* synthetic */ String $headerTitle;
    final /* synthetic */ Source $screenSource;
    final /* synthetic */ String $searchBarTitle;
    final /* synthetic */ String $searchType;
    final /* synthetic */ UniversalSearchOptions $searchedOptions;
    final /* synthetic */ UniversalSearchFlowSource $source;
    final /* synthetic */ ChaloTransitMode $transitMode;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleViewCreatedIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleViewCreatedIntent$1$2", f = "UniversalPickerComponent.kt", l = {TypedValues.CycleType.TYPE_ALPHA}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UniversalPickerComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UniversalPickerComponent universalPickerComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = universalPickerComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow stateFlowA = this.this$0.o.a();
                final UniversalPickerComponent universalPickerComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent.handleViewCreatedIntent.1.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        boolean z;
                        UniversalSearchResult universalSearchResult = (UniversalSearchResult) obj2;
                        UniversalPickerComponent universalPickerComponent2 = universalPickerComponent;
                        Set<UniversalSearchOption> set = ((UniversalPickerViewState) universalPickerComponent2.f.getValue()).m.f10141a;
                        boolean z2 = false;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (UniversalSearchOption universalSearchOption : set) {
                                if (Intrinsics.d(universalSearchOption, UniversalSearchOption.ALL.INSTANCE)) {
                                    z = true;
                                } else if (universalSearchOption instanceof UniversalSearchOption.PLACES) {
                                    z = ((UniversalSearchOption.PLACES) universalSearchOption).c;
                                } else if (universalSearchOption instanceof UniversalSearchOption.ROUTES) {
                                    z = ((UniversalSearchOption.ROUTES) universalSearchOption).c;
                                } else if (universalSearchOption instanceof UniversalSearchOption.STOPS) {
                                    z = ((UniversalSearchOption.STOPS) universalSearchOption).c;
                                } else {
                                    if (!(universalSearchOption instanceof UniversalSearchOption.TRIPS)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z = false;
                                }
                                if (z) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        BuildersKt.d(universalPickerComponent2.j, null, null, new UniversalPickerComponent$handleUniversalSearchData$1(universalPickerComponent2, universalSearchResult, z2, null), 3);
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlowA.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$handleViewCreatedIntent$1(UniversalPickerComponent universalPickerComponent, UniversalSearchFlowSource universalSearchFlowSource, ChaloTransitMode chaloTransitMode, Source source, String str, String str2, UniversalSearchOptions universalSearchOptions, DestinationAfterUniversalSearch destinationAfterUniversalSearch, String str3, String str4, UniversalPickerHeaderIcon universalPickerHeaderIcon, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$source = universalSearchFlowSource;
        this.$transitMode = chaloTransitMode;
        this.$screenSource = source;
        this.$searchType = str;
        this.$searchBarTitle = str2;
        this.$searchedOptions = universalSearchOptions;
        this.$destinationAfterUniversalSearch = destinationAfterUniversalSearch;
        this.$headerTitle = str3;
        this.$headerStepIndicator = str4;
        this.$headerIcon = universalPickerHeaderIcon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$handleViewCreatedIntent$1(this.this$0, this.$source, this.$transitMode, this.$screenSource, this.$searchType, this.$searchBarTitle, this.$searchedOptions, this.$destinationAfterUniversalSearch, this.$headerTitle, this.$headerStepIndicator, this.$headerIcon, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$handleViewCreatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0 A[PHI: r2 r10
      0x00e0: PHI (r2v11 java.lang.Object) = (r2v9 java.lang.Object), (r2v31 java.lang.Object) binds: [B:33:0x00dd, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r10v5 app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel) = 
      (r10v3 app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel)
      (r10v8 app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel)
     binds: [B:33:0x00dd, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:44:0x0162  */
    /* JADX WARN: Code duplicated, block: B:45:0x0167  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x01df  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        LatLng latLng;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel;
        Object objB;
        String str;
        Object objB2;
        LatLng latLng2;
        String str2;
        Object objA2;
        boolean zBooleanValue;
        Object objA3;
        final boolean z;
        final UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel3;
        LatLng latLng3;
        List list;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        if (i == 0) {
            ResultKt.b(obj);
            FetchCurrentLocationUseCase fetchCurrentLocationUseCase = this.this$0.v;
            this.label = 1;
            objA = fetchCurrentLocationUseCase.a(false, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objA = obj;
        } else {
            if (i == 2) {
                latLng = (LatLng) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                str = (String) objB;
                this.L$0 = latLng;
                this.L$1 = str;
                this.label = 3;
                objB2 = this.this$0.t.b(StringEnum.CURRENT_LOCATION, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    latLng2 = latLng;
                    str2 = str;
                    universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(str2, (String) objB2, latLng2.f5134a + "," + latLng2.b, "userLocation", latLng2);
                    CheckIfUserCameFromPremiumBusCampaign checkIfUserCameFromPremiumBusCampaign = this.this$0.u;
                    this.L$0 = universalSearchDescriptiveLocationAppModel;
                    this.L$1 = null;
                    this.label = 4;
                    objA2 = checkIfUserCameFromPremiumBusCampaign.a(this);
                    if (objA2 != coroutineSingletons) {
                        zBooleanValue = ((Boolean) objA2).booleanValue();
                        if (zBooleanValue) {
                            this.this$0.q.a(this.$source.getSourceName());
                        }
                        IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase = this.this$0.m;
                        this.L$0 = universalSearchDescriptiveLocationAppModel;
                        this.Z$0 = zBooleanValue;
                        this.label = 5;
                        objA3 = isAgencyTagVisibleUseCase.a(this);
                        if (objA3 != coroutineSingletons) {
                            z = zBooleanValue;
                            universalSearchDescriptiveLocationAppModel2 = universalSearchDescriptiveLocationAppModel;
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                String str3 = (String) this.L$1;
                LatLng latLng4 = (LatLng) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                str2 = str3;
                latLng2 = latLng4;
                universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(str2, (String) objB2, latLng2.f5134a + "," + latLng2.b, "userLocation", latLng2);
                CheckIfUserCameFromPremiumBusCampaign checkIfUserCameFromPremiumBusCampaign2 = this.this$0.u;
                this.L$0 = universalSearchDescriptiveLocationAppModel;
                this.L$1 = null;
                this.label = 4;
                objA2 = checkIfUserCameFromPremiumBusCampaign2.a(this);
                if (objA2 != coroutineSingletons) {
                    zBooleanValue = ((Boolean) objA2).booleanValue();
                    if (zBooleanValue) {
                        this.this$0.q.a(this.$source.getSourceName());
                    }
                    IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase2 = this.this$0.m;
                    this.L$0 = universalSearchDescriptiveLocationAppModel;
                    this.Z$0 = zBooleanValue;
                    this.label = 5;
                    objA3 = isAgencyTagVisibleUseCase2.a(this);
                    if (objA3 != coroutineSingletons) {
                        z = zBooleanValue;
                        universalSearchDescriptiveLocationAppModel2 = universalSearchDescriptiveLocationAppModel;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 4) {
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel4 = (UniversalSearchDescriptiveLocationAppModel) this.L$0;
                ResultKt.b(obj);
                universalSearchDescriptiveLocationAppModel = universalSearchDescriptiveLocationAppModel4;
                objA2 = obj;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                if (zBooleanValue) {
                    this.this$0.q.a(this.$source.getSourceName());
                }
                IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase3 = this.this$0.m;
                this.L$0 = universalSearchDescriptiveLocationAppModel;
                this.Z$0 = zBooleanValue;
                this.label = 5;
                objA3 = isAgencyTagVisibleUseCase3.a(this);
                if (objA3 != coroutineSingletons) {
                    z = zBooleanValue;
                    universalSearchDescriptiveLocationAppModel2 = universalSearchDescriptiveLocationAppModel;
                }
                return coroutineSingletons;
            }
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z2 = this.Z$0;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel5 = (UniversalSearchDescriptiveLocationAppModel) this.L$0;
            ResultKt.b(obj);
            objA3 = obj;
            z = z2;
            universalSearchDescriptiveLocationAppModel2 = universalSearchDescriptiveLocationAppModel5;
        }
        final boolean zBooleanValue2 = ((Boolean) objA3).booleanValue();
        final UniversalPickerComponent universalPickerComponent = this.this$0;
        final UniversalSearchFlowSource universalSearchFlowSource = this.$source;
        final Source source = this.$screenSource;
        final String str4 = this.$searchType;
        final String str5 = this.$searchBarTitle;
        final UniversalSearchOptions universalSearchOptions = this.$searchedOptions;
        final DestinationAfterUniversalSearch destinationAfterUniversalSearch = this.$destinationAfterUniversalSearch;
        final ChaloTransitMode chaloTransitMode = this.$transitMode;
        final String str6 = this.$headerTitle;
        final String str7 = this.$headerStepIndicator;
        final UniversalPickerHeaderIcon universalPickerHeaderIcon = this.$headerIcon;
        universalPickerComponent.E0(new Function1() { // from class: wm1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean z3;
                UniversalPickerViewState universalPickerViewState = (UniversalPickerViewState) obj2;
                EmptyList emptyList = EmptyList.f17557a;
                SearchScreenLayoutType searchScreenLayoutType = SearchScreenLayoutType.RECENT_RESULT_SCREEN;
                long j = universalPickerComponent.y.j();
                UniversalSearchFlowSource universalSearchFlowSource2 = universalSearchFlowSource;
                UniversalSearchAdditionalEventProperties universalSearchAdditionalEventProperties = new UniversalSearchAdditionalEventProperties(16, j, universalSearchFlowSource2.getSourceName(), source.getSourceName(), str4);
                switch (UniversalPickerComponent.WhenMappings.b[universalSearchFlowSource2.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        z3 = true;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        z3 = false;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return UniversalPickerViewState.a(universalPickerViewState, null, emptyList, str5, false, zBooleanValue2, searchScreenLayoutType, null, false, false, false, null, universalSearchFlowSource2, universalSearchOptions, destinationAfterUniversalSearch, chaloTransitMode, universalSearchAdditionalEventProperties, z, universalSearchDescriptiveLocationAppModel2, z3, false, str6, str7, universalPickerHeaderIcon, 526281);
            }
        });
        UniversalPickerComponent universalPickerComponent2 = this.this$0;
        UniversalSearchManager universalSearchManager = universalPickerComponent2.o;
        UniversalSearchFlowSource universalSearchFlowSource2 = ((UniversalPickerViewState) universalPickerComponent2.f.getValue()).l;
        UniversalSearchOptions universalSearchOptions2 = ((UniversalPickerViewState) this.this$0.f.getValue()).m;
        universalSearchDescriptiveLocationAppModel3 = ((UniversalPickerViewState) this.this$0.f.getValue()).r;
        if (universalSearchDescriptiveLocationAppModel3 != null) {
            latLng3 = universalSearchDescriptiveLocationAppModel3.e;
        } else {
            latLng3 = null;
        }
        universalSearchManager.b(null, "", universalSearchFlowSource2, universalSearchOptions2, new UniversalSearchResultAnalyticProperties(-1L, -1L, ((UniversalPickerViewState) this.this$0.f.getValue()).p.c, ((UniversalPickerViewState) this.this$0.f.getValue()).p.d), latLng3, this.$transitMode);
        UniversalPickerComponent universalPickerComponent3 = this.this$0;
        BuildersKt.d(universalPickerComponent3.j, null, null, new AnonymousClass2(universalPickerComponent3, null), 3);
        UniversalPickerComponent universalPickerComponent4 = this.this$0;
        UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper = universalPickerComponent4.q;
        long j = ((UniversalPickerViewState) universalPickerComponent4.f.getValue()).p.f5085a;
        String sourceName = this.$screenSource.getSourceName();
        list = ((UniversalPickerViewState) this.this$0.f.getValue()).f5084a.f4998a;
        if ((list instanceof Collection) || !list.isEmpty()) {
            it = list.iterator();
            while (it.hasNext()) {
                if (!(((UniversalSearchRecentSearchItem) it.next()) instanceof UniversalSearchRecentSearchItem.Trip) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        universalSearchAnalyticsEventHelper.l(j, sourceName, this.$searchType, i2);
        this.this$0.r0(UniversalPickerSideEffect.BringFocusOnSearchField.f5083a);
        return Unit.f17538a;
        latLng = (LatLng) objA;
        if (latLng == null || !CityProviderKt.a(this.this$0.l, latLng)) {
            universalSearchDescriptiveLocationAppModel = null;
            CheckIfUserCameFromPremiumBusCampaign checkIfUserCameFromPremiumBusCampaign3 = this.this$0.u;
            this.L$0 = universalSearchDescriptiveLocationAppModel;
            this.L$1 = null;
            this.label = 4;
            objA2 = checkIfUserCameFromPremiumBusCampaign3.a(this);
            if (objA2 != coroutineSingletons) {
                zBooleanValue = ((Boolean) objA2).booleanValue();
                if (zBooleanValue) {
                    this.this$0.q.a(this.$source.getSourceName());
                }
                IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase4 = this.this$0.m;
                this.L$0 = universalSearchDescriptiveLocationAppModel;
                this.Z$0 = zBooleanValue;
                this.label = 5;
                objA3 = isAgencyTagVisibleUseCase4.a(this);
                if (objA3 != coroutineSingletons) {
                    z = zBooleanValue;
                    universalSearchDescriptiveLocationAppModel2 = universalSearchDescriptiveLocationAppModel;
                    final boolean zBooleanValue3 = ((Boolean) objA3).booleanValue();
                    final UniversalPickerComponent universalPickerComponent5 = this.this$0;
                    final UniversalSearchFlowSource universalSearchFlowSource3 = this.$source;
                    final Source source2 = this.$screenSource;
                    final String str8 = this.$searchType;
                    final String str9 = this.$searchBarTitle;
                    final UniversalSearchOptions universalSearchOptions3 = this.$searchedOptions;
                    final DestinationAfterUniversalSearch destinationAfterUniversalSearch2 = this.$destinationAfterUniversalSearch;
                    final ChaloTransitMode chaloTransitMode2 = this.$transitMode;
                    final String str10 = this.$headerTitle;
                    final String str11 = this.$headerStepIndicator;
                    final UniversalPickerHeaderIcon universalPickerHeaderIcon2 = this.$headerIcon;
                    universalPickerComponent5.E0(new Function1() { // from class: wm1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            boolean z3;
                            UniversalPickerViewState universalPickerViewState = (UniversalPickerViewState) obj2;
                            EmptyList emptyList = EmptyList.f17557a;
                            SearchScreenLayoutType searchScreenLayoutType = SearchScreenLayoutType.RECENT_RESULT_SCREEN;
                            long j2 = universalPickerComponent5.y.j();
                            UniversalSearchFlowSource universalSearchFlowSource4 = universalSearchFlowSource3;
                            UniversalSearchAdditionalEventProperties universalSearchAdditionalEventProperties = new UniversalSearchAdditionalEventProperties(16, j2, universalSearchFlowSource4.getSourceName(), source2.getSourceName(), str8);
                            switch (UniversalPickerComponent.WhenMappings.b[universalSearchFlowSource4.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    z3 = true;
                                    break;
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    z3 = false;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            return UniversalPickerViewState.a(universalPickerViewState, null, emptyList, str9, false, zBooleanValue3, searchScreenLayoutType, null, false, false, false, null, universalSearchFlowSource4, universalSearchOptions3, destinationAfterUniversalSearch2, chaloTransitMode2, universalSearchAdditionalEventProperties, z, universalSearchDescriptiveLocationAppModel2, z3, false, str10, str11, universalPickerHeaderIcon2, 526281);
                        }
                    });
                    UniversalPickerComponent universalPickerComponent6 = this.this$0;
                    UniversalSearchManager universalSearchManager2 = universalPickerComponent6.o;
                    UniversalSearchFlowSource universalSearchFlowSource4 = ((UniversalPickerViewState) universalPickerComponent6.f.getValue()).l;
                    UniversalSearchOptions universalSearchOptions4 = ((UniversalPickerViewState) this.this$0.f.getValue()).m;
                    universalSearchDescriptiveLocationAppModel3 = ((UniversalPickerViewState) this.this$0.f.getValue()).r;
                    if (universalSearchDescriptiveLocationAppModel3 != null) {
                        latLng3 = universalSearchDescriptiveLocationAppModel3.e;
                    } else {
                        latLng3 = null;
                    }
                    universalSearchManager2.b(null, "", universalSearchFlowSource4, universalSearchOptions4, new UniversalSearchResultAnalyticProperties(-1L, -1L, ((UniversalPickerViewState) this.this$0.f.getValue()).p.c, ((UniversalPickerViewState) this.this$0.f.getValue()).p.d), latLng3, this.$transitMode);
                    UniversalPickerComponent universalPickerComponent7 = this.this$0;
                    BuildersKt.d(universalPickerComponent7.j, null, null, new AnonymousClass2(universalPickerComponent7, null), 3);
                    UniversalPickerComponent universalPickerComponent8 = this.this$0;
                    UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper2 = universalPickerComponent8.q;
                    long j2 = ((UniversalPickerViewState) universalPickerComponent8.f.getValue()).p.f5085a;
                    String sourceName2 = this.$screenSource.getSourceName();
                    list = ((UniversalPickerViewState) this.this$0.f.getValue()).f5084a.f4998a;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (!(((UniversalSearchRecentSearchItem) it.next()) instanceof UniversalSearchRecentSearchItem.Trip)) {
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (!(((UniversalSearchRecentSearchItem) it.next()) instanceof UniversalSearchRecentSearchItem.Trip)) {
                            }
                        }
                    }
                    universalSearchAnalyticsEventHelper2.l(j2, sourceName2, this.$searchType, i2);
                    this.this$0.r0(UniversalPickerSideEffect.BringFocusOnSearchField.f5083a);
                    return Unit.f17538a;
                }
            }
        } else {
            this.L$0 = latLng;
            this.label = 2;
            objB = this.this$0.t.b(StringEnum.CURRENT_LOCATION, new Object[0], this);
            if (objB != coroutineSingletons) {
                str = (String) objB;
                this.L$0 = latLng;
                this.L$1 = str;
                this.label = 3;
                objB2 = this.this$0.t.b(StringEnum.CURRENT_LOCATION, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    latLng2 = latLng;
                    str2 = str;
                    universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(str2, (String) objB2, latLng2.f5134a + "," + latLng2.b, "userLocation", latLng2);
                    CheckIfUserCameFromPremiumBusCampaign checkIfUserCameFromPremiumBusCampaign4 = this.this$0.u;
                    this.L$0 = universalSearchDescriptiveLocationAppModel;
                    this.L$1 = null;
                    this.label = 4;
                    objA2 = checkIfUserCameFromPremiumBusCampaign4.a(this);
                    if (objA2 != coroutineSingletons) {
                        zBooleanValue = ((Boolean) objA2).booleanValue();
                        if (zBooleanValue) {
                            this.this$0.q.a(this.$source.getSourceName());
                        }
                        IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase5 = this.this$0.m;
                        this.L$0 = universalSearchDescriptiveLocationAppModel;
                        this.Z$0 = zBooleanValue;
                        this.label = 5;
                        objA3 = isAgencyTagVisibleUseCase5.a(this);
                        if (objA3 != coroutineSingletons) {
                            z = zBooleanValue;
                            universalSearchDescriptiveLocationAppModel2 = universalSearchDescriptiveLocationAppModel;
                            final boolean zBooleanValue4 = ((Boolean) objA3).booleanValue();
                            final UniversalPickerComponent universalPickerComponent9 = this.this$0;
                            final UniversalSearchFlowSource universalSearchFlowSource5 = this.$source;
                            final Source source3 = this.$screenSource;
                            final String str12 = this.$searchType;
                            final String str13 = this.$searchBarTitle;
                            final UniversalSearchOptions universalSearchOptions5 = this.$searchedOptions;
                            final DestinationAfterUniversalSearch destinationAfterUniversalSearch3 = this.$destinationAfterUniversalSearch;
                            final ChaloTransitMode chaloTransitMode3 = this.$transitMode;
                            final String str14 = this.$headerTitle;
                            final String str15 = this.$headerStepIndicator;
                            final UniversalPickerHeaderIcon universalPickerHeaderIcon3 = this.$headerIcon;
                            universalPickerComponent9.E0(new Function1() { // from class: wm1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    boolean z3;
                                    UniversalPickerViewState universalPickerViewState = (UniversalPickerViewState) obj2;
                                    EmptyList emptyList = EmptyList.f17557a;
                                    SearchScreenLayoutType searchScreenLayoutType = SearchScreenLayoutType.RECENT_RESULT_SCREEN;
                                    long j3 = universalPickerComponent9.y.j();
                                    UniversalSearchFlowSource universalSearchFlowSource6 = universalSearchFlowSource5;
                                    UniversalSearchAdditionalEventProperties universalSearchAdditionalEventProperties = new UniversalSearchAdditionalEventProperties(16, j3, universalSearchFlowSource6.getSourceName(), source3.getSourceName(), str12);
                                    switch (UniversalPickerComponent.WhenMappings.b[universalSearchFlowSource6.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                            z3 = true;
                                            break;
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                            z3 = false;
                                            break;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                    return UniversalPickerViewState.a(universalPickerViewState, null, emptyList, str13, false, zBooleanValue4, searchScreenLayoutType, null, false, false, false, null, universalSearchFlowSource6, universalSearchOptions5, destinationAfterUniversalSearch3, chaloTransitMode3, universalSearchAdditionalEventProperties, z, universalSearchDescriptiveLocationAppModel2, z3, false, str14, str15, universalPickerHeaderIcon3, 526281);
                                }
                            });
                            UniversalPickerComponent universalPickerComponent10 = this.this$0;
                            UniversalSearchManager universalSearchManager3 = universalPickerComponent10.o;
                            UniversalSearchFlowSource universalSearchFlowSource6 = ((UniversalPickerViewState) universalPickerComponent10.f.getValue()).l;
                            UniversalSearchOptions universalSearchOptions6 = ((UniversalPickerViewState) this.this$0.f.getValue()).m;
                            universalSearchDescriptiveLocationAppModel3 = ((UniversalPickerViewState) this.this$0.f.getValue()).r;
                            if (universalSearchDescriptiveLocationAppModel3 != null) {
                                latLng3 = universalSearchDescriptiveLocationAppModel3.e;
                            } else {
                                latLng3 = null;
                            }
                            universalSearchManager3.b(null, "", universalSearchFlowSource6, universalSearchOptions6, new UniversalSearchResultAnalyticProperties(-1L, -1L, ((UniversalPickerViewState) this.this$0.f.getValue()).p.c, ((UniversalPickerViewState) this.this$0.f.getValue()).p.d), latLng3, this.$transitMode);
                            UniversalPickerComponent universalPickerComponent11 = this.this$0;
                            BuildersKt.d(universalPickerComponent11.j, null, null, new AnonymousClass2(universalPickerComponent11, null), 3);
                            UniversalPickerComponent universalPickerComponent12 = this.this$0;
                            UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper3 = universalPickerComponent12.q;
                            long j3 = ((UniversalPickerViewState) universalPickerComponent12.f.getValue()).p.f5085a;
                            String sourceName3 = this.$screenSource.getSourceName();
                            list = ((UniversalPickerViewState) this.this$0.f.getValue()).f5084a.f4998a;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (!(((UniversalSearchRecentSearchItem) it.next()) instanceof UniversalSearchRecentSearchItem.Trip)) {
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (!(((UniversalSearchRecentSearchItem) it.next()) instanceof UniversalSearchRecentSearchItem.Trip)) {
                                    }
                                }
                            }
                            universalSearchAnalyticsEventHelper3.l(j3, sourceName3, this.$searchType, i2);
                            this.this$0.r0(UniversalPickerSideEffect.BringFocusOnSearchField.f5083a);
                            return Unit.f17538a;
                        }
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
