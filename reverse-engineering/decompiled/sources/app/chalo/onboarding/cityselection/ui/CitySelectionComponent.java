package app.chalo.onboarding.cityselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ch;
import defpackage.cp;
import defpackage.dp;
import defpackage.k2;
import defpackage.n8;
import defpackage.ti;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionDataState;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionUIState;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionEffect;", "Companion", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CitySelectionComponent extends ChaloBaseStateMviComponent<CitySelectionIntent, CitySelectionDataState, CitySelectionUIState, CitySelectionEffect> {
    public final CityMetaDataManager k;
    public final AnalyticsContract l;
    public final ArePermissionsGrantedUseCase m;
    public final ChaloNavigationManager n;
    public final CityProvider o;
    public final StringProvider p;
    public final CitySelectionUIStateFactory q;
    public Job r;
    public CitySelectionRestoredState s;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionComponent$Companion;", "", "", "CITY_SEARCH_DELAY", "J", "", "CITY_SELECTION_SAVED_STATE_KEY", "Ljava/lang/String;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CitySelectionComponent(ComponentContext componentContext, CitySelectionArgs.OldCitySelectionArgs oldCitySelectionArgs, CityMetaDataManager cityMetaDataManager, AnalyticsContract analyticsContract, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, ChaloNavigationManager chaloNavigationManager, CityProvider cityProvider, StringProvider stringProvider, CitySelectionUIStateFactory citySelectionUIStateFactory) {
        super(componentContext);
        this.k = cityMetaDataManager;
        this.l = analyticsContract;
        this.m = arePermissionsGrantedUseCase;
        this.n = chaloNavigationManager;
        this.o = cityProvider;
        this.p = stringProvider;
        this.q = citySelectionUIStateFactory;
        componentContext.getB().d("CITY_SELECTION_SAVED_STATE_KEY", CitySelectionRestoredState.INSTANCE.serializer(), new dp(this, 1));
        I0(CitySelectionIntent.InitialisationIntent.f6619a);
    }

    public static final List F0(CitySelectionComponent citySelectionComponent, List list, String str) {
        citySelectionComponent.getClass();
        if (StringsKt.F(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.m(((BasicCityInfoAppModel) obj).b, str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(CitySelectionComponent citySelectionComponent, ContinuationImpl continuationImpl) {
        CitySelectionComponent$getOrFetchCitiesList$1 citySelectionComponent$getOrFetchCitiesList$1;
        citySelectionComponent.getClass();
        if (continuationImpl instanceof CitySelectionComponent$getOrFetchCitiesList$1) {
            citySelectionComponent$getOrFetchCitiesList$1 = (CitySelectionComponent$getOrFetchCitiesList$1) continuationImpl;
            int i = citySelectionComponent$getOrFetchCitiesList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                citySelectionComponent$getOrFetchCitiesList$1.label = i - Integer.MIN_VALUE;
            } else {
                citySelectionComponent$getOrFetchCitiesList$1 = new CitySelectionComponent$getOrFetchCitiesList$1(citySelectionComponent, continuationImpl);
            }
        } else {
            citySelectionComponent$getOrFetchCitiesList$1 = new CitySelectionComponent$getOrFetchCitiesList$1(citySelectionComponent, continuationImpl);
        }
        Object objC = citySelectionComponent$getOrFetchCitiesList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = citySelectionComponent$getOrFetchCitiesList$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            List list = ((CitySelectionDataState) citySelectionComponent.f.getValue()).f6616a;
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return list;
            }
            CityMetaDataManager cityMetaDataManager = citySelectionComponent.k;
            citySelectionComponent$getOrFetchCitiesList$1.label = 1;
            objC = cityMetaDataManager.c(citySelectionComponent$getOrFetchCitiesList$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return null;
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void H0() {
        CityAppModel cityAppModel = (CityAppModel) this.o.getE().getValue();
        E0(new n8(cityAppModel != null ? cityAppModel.k : false, cityAppModel, 1));
        BuildersKt.d(this.j, null, null, new CitySelectionComponent$initialiseCityList$2(this, null), 3);
    }

    public final void I0(CitySelectionIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof CitySelectionIntent.InitialisationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            H0();
            BuildersKt.d(contextScope, null, null, new CitySelectionComponent$checkLocationPermissionStatus$1(this, null), 3);
            return;
        }
        if (intent instanceof CitySelectionIntent.RetryFetchIntent) {
            H0();
            return;
        }
        boolean zEquals = intent.equals(CitySelectionIntent.BackClickedIntent.f6617a);
        int i = 1;
        int i2 = 0;
        StateFlow stateFlow = this.f;
        if (zEquals) {
            if (!((CitySelectionDataState) stateFlow.getValue()).g) {
                q0(new dp(this, i2));
                return;
            } else {
                E0(new cp(i));
                I0(new CitySelectionIntent.SearchQueryEnteredIntent(""));
                return;
            }
        }
        if (intent instanceof CitySelectionIntent.SearchQueryEnteredIntent) {
            CitySelectionIntent.SearchQueryEnteredIntent searchQueryEnteredIntent = (CitySelectionIntent.SearchQueryEnteredIntent) intent;
            Job job = this.r;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            String str = searchQueryEnteredIntent.f6622a;
            E0(new k2(str, 23));
            this.r = BuildersKt.d(contextScope, null, null, new CitySelectionComponent$handleSearchQueryEnteredIntent$2(this, str, null), 3);
            return;
        }
        if (intent.equals(CitySelectionIntent.SearchPanelClickedIntent.f6621a)) {
            if (((CitySelectionDataState) stateFlow.getValue()).e) {
                return;
            }
            E0(new cp(i2));
            AnalyticsContractImplKt.b(this.l, "city selection search icon clicked", Source.CITY_SELECTION_FRAGMENT, null, false, 28);
            return;
        }
        if (!(intent instanceof CitySelectionIntent.CityClickedIntent)) {
            if (!intent.equals(CitySelectionIntent.VoteForCityClickedIntent.f6623a)) {
                throw new NoWhenBranchMatchedException();
            }
            q0(new Function0() { // from class: app.chalo.onboarding.cityselection.ui.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    CitySelectionComponent citySelectionComponent = this.f6637a;
                    BuildersKt.d(citySelectionComponent.j, null, null, new CitySelectionComponent$handleVoteForCityClickedIntent$1$1(citySelectionComponent, null), 3);
                    return Unit.f17538a;
                }
            });
        } else {
            CitySelectionIntent.CityClickedIntent cityClickedIntent = (CitySelectionIntent.CityClickedIntent) intent;
            E0(new ch(cityClickedIntent, 29));
            this.o.e();
            AnalyticsContractImplKt.b(this.l, "city selected", Source.CITY_SELECTION_FRAGMENT_SPACED, MapsKt.i(new Pair("cityName", cityClickedIntent.f6618a.b), new Pair("selectedby", LogSubCategory.Action.USER)), true, 8);
            q0(new ti(18, this, cityClickedIntent));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        CitySelectionComponent$convertToUiState$2 citySelectionComponent$convertToUiState$2 = new CitySelectionComponent$convertToUiState$2(1, this, CitySelectionComponent.class, "processIntent", "processIntent(Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;)V", 0);
        return this.q.d((CitySelectionDataState) obj, citySelectionComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        if (this.s == null) {
            this.s = (CitySelectionRestoredState) this.f5983a.getB().a("CITY_SELECTION_SAVED_STATE_KEY", CitySelectionRestoredState.INSTANCE.serializer());
        }
        CitySelectionRestoredState citySelectionRestoredState = this.s;
        if (citySelectionRestoredState == null) {
            return new CitySelectionDataState(null, 127);
        }
        String str = citySelectionRestoredState.f6626a;
        if (str == null) {
            str = "";
        }
        return new CitySelectionDataState(str, 123);
    }
}
