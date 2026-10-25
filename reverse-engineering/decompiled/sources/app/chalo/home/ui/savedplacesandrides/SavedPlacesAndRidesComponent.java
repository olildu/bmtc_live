package app.chalo.home.ui.savedplacesandrides;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.SelectRideArgs;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModelKt;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import app.chalo.usercommutepreference.domain.AddCommutePreferenceStopPlaceUseCase;
import app.chalo.usercommutepreference.domain.DeleteCommutePreferenceStopPlaceUseCase;
import app.chalo.usercommutepreference.domain.DeleteSavedRideUseCase;
import app.chalo.usercommutepreference.domain.FetchCommutePreferenceSummaryUseCase;
import app.chalo.usercommutepreference.domain.GetCommutePreferencePlacesUseCase;
import app.chalo.usercommutepreference.domain.GetCommutePreferenceSavedRidesUseCase;
import app.chalo.utils.KUUID;
import com.arkivanov.decompose.ComponentContext;
import defpackage.r31;
import defpackage.s41;
import defpackage.vo1;
import defpackage.z21;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesDataState;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesViewState;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedPlacesAndRidesComponent extends ChaloBaseStateMviComponent<SavedPlacesAndRidesIntent, SavedPlacesAndRidesDataState, SavedPlacesAndRidesViewState, SavedPlacesAndRidesSideEffect> {
    public final FetchCommutePreferenceSummaryUseCase k;
    public final GetCommutePreferencePlacesUseCase l;
    public final GetCommutePreferenceSavedRidesUseCase m;
    public final DeleteCommutePreferenceStopPlaceUseCase n;
    public final DeleteSavedRideUseCase o;
    public final ChaloNavigationManager p;
    public final StringProvider q;
    public final UniversalSearchResultStateManager r;
    public final AddCommutePreferenceStopPlaceUseCase s;
    public final SavedPlacesAndRidesUiStateFactory t;
    public final KotlinToastManager u;
    public final AnalyticsContract v;
    public Job w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedPlacesAndRidesComponent(ComponentContext componentContext, FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase, GetCommutePreferencePlacesUseCase getCommutePreferencePlacesUseCase, GetCommutePreferenceSavedRidesUseCase getCommutePreferenceSavedRidesUseCase, DeleteCommutePreferenceStopPlaceUseCase deleteCommutePreferenceStopPlaceUseCase, DeleteSavedRideUseCase deleteSavedRideUseCase, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, UniversalSearchResultStateManager universalSearchResultStateManager, AddCommutePreferenceStopPlaceUseCase addCommutePreferenceStopPlaceUseCase, SavedPlacesAndRidesUiStateFactory savedPlacesAndRidesUiStateFactory, KotlinToastManager kotlinToastManager, AnalyticsContract analyticsContract) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        this.k = fetchCommutePreferenceSummaryUseCase;
        this.l = getCommutePreferencePlacesUseCase;
        this.m = getCommutePreferenceSavedRidesUseCase;
        this.n = deleteCommutePreferenceStopPlaceUseCase;
        this.o = deleteSavedRideUseCase;
        this.p = chaloNavigationManager;
        this.q = stringProvider;
        this.r = universalSearchResultStateManager;
        this.s = addCommutePreferenceStopPlaceUseCase;
        this.t = savedPlacesAndRidesUiStateFactory;
        this.u = kotlinToastManager;
        this.v = analyticsContract;
        I0(SavedPlacesAndRidesIntent.InitializationIntent.f3688a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r2 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
    
        if (r2 == r5) goto L34;
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
    public static final java.lang.Object F0(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent r17, app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent.F0(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent, app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r2 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
    
        if (r2 == r5) goto L34;
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
    public static final java.lang.Object G0(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent r17, app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent.G0(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent, app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r13 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H0(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent r11, boolean r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent.H0(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Map J0(UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel) {
        Pair pair = new Pair("rideId", userCommutePreferenceSavedRideAppModel.f10252a);
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = userCommutePreferenceSavedRideAppModel.b;
        Pair pair2 = new Pair("rideOriginName", UserCommutePreferenceAppModelKt.a(userCommutePreferencePlaceLocationAppModel));
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2 = userCommutePreferenceSavedRideAppModel.c;
        return MapsKt.i(pair, pair2, new Pair("rideDestinationName", UserCommutePreferenceAppModelKt.a(userCommutePreferencePlaceLocationAppModel2)), new Pair("rideOriginCityId", userCommutePreferencePlaceLocationAppModel.getC()), new Pair("rideDestinationCityId", userCommutePreferencePlaceLocationAppModel2.getC()), new Pair("rideTime", Long.valueOf(userCommutePreferenceSavedRideAppModel.d)));
    }

    public static Map K0(UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel) {
        Pair pair = new Pair("placeId", userCommutePreferenceStopPlaceAppModel.f10253a);
        Pair pair2 = new Pair("placeTag", userCommutePreferenceStopPlaceAppModel.b.name());
        Pair pair3 = new Pair("placeLabel", userCommutePreferenceStopPlaceAppModel.c);
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = userCommutePreferenceStopPlaceAppModel.d;
        return MapsKt.i(pair, pair2, pair3, new Pair("placeName", UserCommutePreferenceAppModelKt.a(userCommutePreferencePlaceLocationAppModel)), new Pair("placeCityId", userCommutePreferencePlaceLocationAppModel.getC()), new Pair("placeType", userCommutePreferencePlaceLocationAppModel.getI().name()), new Pair("placeSearchPartner", userCommutePreferencePlaceLocationAppModel.getH()));
    }

    public final void I0(SavedPlacesAndRidesIntent intent) {
        String strA;
        String strA2;
        String strA3;
        Map mapD;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean zEquals = intent.equals(SavedPlacesAndRidesIntent.InitializationIntent.f3688a);
        int i = 3;
        ContextScope contextScope = this.j;
        if (zEquals) {
            AnalyticsContractImplKt.b(this.v, "savedPlacesAndRides screen opened", Source.SAVED_PLACES_AND_RIDES_SCREEN, null, false, 28);
            E0(new s41(i));
            BuildersKt.d(contextScope, null, null, new SavedPlacesAndRidesComponent$handleInitializationIntent$2(this, null), 3);
            BuildersKt.d(contextScope, null, null, new SavedPlacesAndRidesComponent$handleInitializationIntent$3(this, null), 3);
            BuildersKt.d(contextScope, null, null, new SavedPlacesAndRidesComponent$handleInitializationIntent$4(this, null), 3);
            return;
        }
        if (intent instanceof SavedPlacesAndRidesIntent.DeletePlaceIntent) {
            SavedPlacesAndRidesIntent.DeletePlaceIntent deletePlaceIntent = (SavedPlacesAndRidesIntent.DeletePlaceIntent) intent;
            AnalyticsContractImplKt.b(this.v, "savedPlacesAndRides delete place clicked", Source.SAVED_PLACES_AND_RIDES_SCREEN, K0(deletePlaceIntent.f3685a), false, 24);
            E0(new z21(deletePlaceIntent, 19));
            return;
        }
        if (intent instanceof SavedPlacesAndRidesIntent.DeleteRideIntent) {
            SavedPlacesAndRidesIntent.DeleteRideIntent deleteRideIntent = (SavedPlacesAndRidesIntent.DeleteRideIntent) intent;
            AnalyticsContractImplKt.b(this.v, "savedPlacesAndRides delete ride clicked", Source.SAVED_PLACES_AND_RIDES_SCREEN, J0(deleteRideIntent.f3686a), false, 24);
            E0(new z21(deleteRideIntent, 20));
            return;
        }
        boolean zEquals2 = intent.equals(SavedPlacesAndRidesIntent.ConfirmationDialogNegativeBtnClickIntent.f3683a);
        StateFlow stateFlow = this.f;
        if (zEquals2) {
            ConfirmationDialogType confirmationDialogType = ((SavedPlacesAndRidesDataState) stateFlow.getValue()).f;
            Source source = Source.SAVED_PLACES_AND_RIDES_SCREEN;
            if (confirmationDialogType instanceof ConfirmationDialogType.Place) {
                mapD = K0(((ConfirmationDialogType.Place) confirmationDialogType).f3671a);
            } else if (confirmationDialogType instanceof ConfirmationDialogType.Ride) {
                mapD = J0(((ConfirmationDialogType.Ride) confirmationDialogType).f3672a);
            } else {
                if (confirmationDialogType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                mapD = MapsKt.d();
            }
            AnalyticsContractImplKt.b(this.v, "savedPlacesAndRides confirmation dialog dismissed", source, mapD, false, 24);
            E0(new r31(25));
            return;
        }
        if (intent.equals(SavedPlacesAndRidesIntent.ConfirmationDialogPositiveBtnClickIntent.f3684a)) {
            ConfirmationDialogType confirmationDialogType2 = ((SavedPlacesAndRidesDataState) stateFlow.getValue()).f;
            E0(new r31(26));
            BuildersKt.d(contextScope, null, null, new SavedPlacesAndRidesComponent$handleConfirmationDialogPositiveBtnClickIntent$2(confirmationDialogType2, this, null), 3);
            return;
        }
        boolean z = intent instanceof SavedPlacesAndRidesIntent.EditRideIntent;
        ChaloNavigationManager chaloNavigationManager = this.p;
        if (z) {
            UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel = ((SavedPlacesAndRidesIntent.EditRideIntent) intent).f3687a;
            String str = userCommutePreferenceSavedRideAppModel.f10252a;
            ChaloJson chaloJson = ChaloJson.f6455a;
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = userCommutePreferenceSavedRideAppModel.b;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA2 = json.a(UserCommutePreferencePlaceLocationAppModel.INSTANCE.serializer(), userCommutePreferencePlaceLocationAppModel);
            } catch (Exception unused) {
                strA2 = null;
            }
            ChaloJson chaloJson2 = ChaloJson.f6455a;
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2 = userCommutePreferenceSavedRideAppModel.c;
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA3 = json2.a(UserCommutePreferencePlaceLocationAppModel.INSTANCE.serializer(), userCommutePreferencePlaceLocationAppModel2);
            } catch (Exception unused2) {
                strA3 = null;
            }
            ChaloNavigationManagerKt.e(chaloNavigationManager, new SelectRideArgs(str, strA2, strA3, Long.valueOf(userCommutePreferenceSavedRideAppModel.d)), null, 6);
            return;
        }
        if (intent instanceof SavedPlacesAndRidesIntent.PlaceSelectionFieldResultIntent) {
            SavedPlacesAndRidesIntent.PlaceSelectionFieldResultIntent placeSelectionFieldResultIntent = (SavedPlacesAndRidesIntent.PlaceSelectionFieldResultIntent) intent;
            Source source2 = Source.SAVED_PLACES_AND_RIDES_SCREEN;
            Pair pair = new Pair("placeTag", placeSelectionFieldResultIntent.f3689a.name());
            RecentPlaceAppModel recentPlaceAppModel = placeSelectionFieldResultIntent.b;
            AnalyticsContractImplKt.b(this.v, "savedPlacesAndRides place picker result", source2, MapsKt.i(pair, new Pair("placeId", recentPlaceAppModel.e), new Pair("placeName", recentPlaceAppModel.g), new Pair("placeCityId", recentPlaceAppModel.h), new Pair("placeSearchPartner", recentPlaceAppModel.f)), false, 24);
            E0(new r31(28));
            BuildersKt.d(contextScope, null, null, new SavedPlacesAndRidesComponent$handlePlaceSelectionFieldResultIntent$2(placeSelectionFieldResultIntent, this, null), 3);
            return;
        }
        if (!(intent instanceof SavedPlacesAndRidesIntent.AddAndEditPlaceIntent)) {
            if (intent.equals(SavedPlacesAndRidesIntent.AddRideIntent.f3682a)) {
                ChaloNavigationManagerKt.e(chaloNavigationManager, new SelectRideArgs(null, null, null, null), null, 6);
                return;
            } else {
                if (!intent.equals(SavedPlacesAndRidesIntent.RetryClickedIntent.f3690a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AnalyticsContractImplKt.b(this.v, "savedPlacesAndRides retry clicked", Source.SAVED_PLACES_AND_RIDES_SCREEN, null, false, 28);
                E0(new r31(27));
                BuildersKt.d(contextScope, null, null, new SavedPlacesAndRidesComponent$handelRetryClickedIntent$2(this, null), 3);
                return;
            }
        }
        SavedPlacesAndRidesIntent.AddAndEditPlaceIntent addAndEditPlaceIntent = (SavedPlacesAndRidesIntent.AddAndEditPlaceIntent) intent;
        AnalyticsContractImplKt.b(this.v, "savedPlacesAndRides add/edit place clicked", Source.SAVED_PLACES_AND_RIDES_SCREEN, vo1.s("placeTag", addAndEditPlaceIntent.f3681a.name()), false, 24);
        UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.g(new UniversalSearchOption.PLACES(false, true)));
        try {
            Json json3 = ChaloJson.b;
            json3.getClass();
            strA = json3.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
        } catch (Exception unused3) {
            strA = null;
        }
        if (strA == null) {
            return;
        }
        String strA4 = KUUID.a();
        Job job = this.w;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.w = BuildersKt.d(contextScope, null, null, new SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1(this, strA4, addAndEditPlaceIntent, strA, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        SavedPlacesAndRidesComponent$convertToUiState$2 savedPlacesAndRidesComponent$convertToUiState$2 = new SavedPlacesAndRidesComponent$convertToUiState$2(1, this, SavedPlacesAndRidesComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;)V", 0);
        return this.t.d((SavedPlacesAndRidesDataState) obj, savedPlacesAndRidesComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new SavedPlacesAndRidesDataState(false, false, null, null, EmptyList.f17557a, null, false, false);
    }
}
