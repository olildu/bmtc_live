package app.chalo.home.ui.selectridescreen;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.home.ui.selectride.SelectRideUiStateFactory;
import app.chalo.home.ui.selectride.SelectRideViewState;
import app.chalo.home.ui.selectridescreen.SelectRideDataState;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.SelectRideArgs;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.domain.SaveOrEditRideUseCase;
import app.chalo.utils.KUUID;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.g41;
import defpackage.gf;
import defpackage.x41;
import defpackage.z21;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideDataState;", "Lapp/chalo/home/ui/selectride/SelectRideViewState;", "Lapp/chalo/home/ui/selectridescreen/SelectRideSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectRideComponent extends ChaloBaseStateMviComponent<SelectRideIntent, SelectRideDataState, SelectRideViewState, SelectRideSideEffect> {
    public final ChaloNavigationManager k;
    public final StringProvider l;
    public final UniversalSearchResultStateManager m;
    public final SaveOrEditRideUseCase n;
    public final SelectRideUiStateFactory o;
    public final TimeUtilsContract p;
    public final KotlinToastManager q;
    public final SystemHelper r;
    public final CityProvider s;
    public Job t;
    public UserCommutePreferencePlaceLocationAppModel u;
    public UserCommutePreferencePlaceLocationAppModel v;
    public SelectedTime w;
    public String x;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3702a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RideSavedSuccessFailureState.values().length];
            try {
                iArr[RideSavedSuccessFailureState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideSavedSuccessFailureState.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RideSavedSuccessFailureState.RIDE_ALREADY_SAVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3702a = iArr;
            int[] iArr2 = new int[LocationSelectionType.values().length];
            try {
                iArr2[LocationSelectionType.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LocationSelectionType.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectRideComponent(ComponentContext componentContext, SelectRideArgs args, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, UniversalSearchResultStateManager universalSearchResultStateManager, SaveOrEditRideUseCase saveOrEditRideUseCase, SelectRideUiStateFactory selectRideUiStateFactory, TimeUtilsContract timeUtilsContract, KotlinToastManager kotlinToastManager, SystemHelper systemHelper, CityProvider cityProvider) {
        Object objB;
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel;
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = chaloNavigationManager;
        this.l = stringProvider;
        this.m = universalSearchResultStateManager;
        this.n = saveOrEditRideUseCase;
        this.o = selectRideUiStateFactory;
        this.p = timeUtilsContract;
        this.q = kotlinToastManager;
        this.r = systemHelper;
        this.s = cityProvider;
        String str = args.b;
        String str2 = args.c;
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2 = null;
        Object objB2 = null;
        if (str2 != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str2, UserCommutePreferencePlaceLocationAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            userCommutePreferencePlaceLocationAppModel = (UserCommutePreferencePlaceLocationAppModel) objB;
        } else {
            userCommutePreferencePlaceLocationAppModel = null;
        }
        String str3 = args.d;
        if (str3 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str3, UserCommutePreferencePlaceLocationAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
            }
            userCommutePreferencePlaceLocationAppModel2 = (UserCommutePreferencePlaceLocationAppModel) objB2;
        }
        G0(new SelectRideIntent.InitializationIntent(str, userCommutePreferencePlaceLocationAppModel, userCommutePreferencePlaceLocationAppModel2, args.e));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r13 == r2) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.home.ui.selectridescreen.SelectRideComponent r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.selectridescreen.SelectRideComponent.F0(app.chalo.home.ui.selectridescreen.SelectRideComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void G0(SelectRideIntent intent) {
        String strA;
        Intrinsics.i(intent, "intent");
        C0(intent);
        int i = 2;
        if (intent instanceof SelectRideIntent.InitializationIntent) {
            SelectRideIntent.InitializationIntent initializationIntent = (SelectRideIntent.InitializationIntent) intent;
            TimeZone.Companion companion = TimeZone.INSTANCE;
            TimeUtilsContract timeUtilsContract = this.p;
            String strB = timeUtilsContract.b();
            companion.getClass();
            TimeZone timeZoneA = TimeZone.Companion.a(strB);
            Long l = initializationIntent.d;
            long j = l == null ? this.r.j() : timeUtilsContract.z(l.longValue());
            Instant.INSTANCE.getClass();
            LocalDateTime localDateTimeC = TimeZoneKt.c(Instant.Companion.a(j), timeZoneA);
            SelectedTime selectedTime = new SelectedTime(timeUtilsContract.r(localDateTimeC.g()), localDateTimeC.h(), localDateTimeC.g() < 12 ? "AM" : "PM");
            E0(new g41(i, initializationIntent, selectedTime));
            this.u = initializationIntent.b;
            this.v = initializationIntent.c;
            this.w = selectedTime;
            this.x = initializationIntent.f3704a;
            return;
        }
        boolean z = intent instanceof SelectRideIntent.OnLocationChangeIntent;
        final int i2 = 0;
        int i3 = 3;
        ContextScope contextScope = this.j;
        final int i4 = 1;
        if (z) {
            LocationSelectionType locationSelectionType = ((SelectRideIntent.OnLocationChangeIntent) intent).f3706a;
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(ArraysKt.j0(new UniversalSearchOption[]{new UniversalSearchOption.PLACES(false, true), new UniversalSearchOption.STOPS(true, false)}));
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            } catch (Exception unused) {
                strA = null;
            }
            if (strA == null) {
                return;
            }
            String strA2 = KUUID.a();
            Job job = this.t;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.t = BuildersKt.d(contextScope, null, null, new SelectRideComponent$navigateToPlaceSelection$1(this, strA2, locationSelectionType, strA, null), 3);
            return;
        }
        int i5 = 26;
        if (intent instanceof SelectRideIntent.ODCardContinueButtonClicked) {
            E0(new x41(i5));
            return;
        }
        if (intent.equals(SelectRideIntent.TimePickerCancelButtonClicked.f3713a)) {
            E0(new x41(27));
            return;
        }
        boolean z2 = intent instanceof SelectRideIntent.TimePickerContinueButtonClicked;
        StateFlow stateFlow = this.f;
        if (z2) {
            if (Intrinsics.d(this.u, ((SelectRideDataState) stateFlow.getValue()).f3703a) && Intrinsics.d(this.v, ((SelectRideDataState) stateFlow.getValue()).b) && Intrinsics.d(this.w, ((SelectRideDataState) stateFlow.getValue()).c)) {
                E0(new x41(19));
                return;
            } else {
                E0(new x41(24));
                BuildersKt.d(contextScope, null, null, new SelectRideComponent$handleTimePickerContinueButtonClicked$3(this, null), 3);
                return;
            }
        }
        SelectRideIntent.RetryClicked retryClicked = SelectRideIntent.RetryClicked.f3709a;
        if (intent.equals(retryClicked)) {
            BuildersKt.d(contextScope, null, null, new SelectRideComponent$handleRetryClicked$1(this, null), 3);
            return;
        }
        if (intent instanceof SelectRideIntent.PlaceSelectionFieldResultIntent) {
            final SelectRideIntent.PlaceSelectionFieldResultIntent placeSelectionFieldResultIntent = (SelectRideIntent.PlaceSelectionFieldResultIntent) intent;
            int i6 = WhenMappings.b[placeSelectionFieldResultIntent.f3708a.ordinal()];
            if (i6 == 1) {
                E0(new Function1() { // from class: t61
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                SelectRideDataState it = (SelectRideDataState) obj;
                                Intrinsics.i(it, "it");
                                return SelectRideDataState.a(it, placeSelectionFieldResultIntent.b, null, null, false, false, null, false, null, TypedValues.PositionType.TYPE_POSITION_TYPE);
                            default:
                                SelectRideDataState it2 = (SelectRideDataState) obj;
                                Intrinsics.i(it2, "it");
                                return SelectRideDataState.a(it2, null, placeSelectionFieldResultIntent.b, null, false, false, null, false, null, 509);
                        }
                    }
                });
                return;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new Function1() { // from class: t61
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i4) {
                            case 0:
                                SelectRideDataState it = (SelectRideDataState) obj;
                                Intrinsics.i(it, "it");
                                return SelectRideDataState.a(it, placeSelectionFieldResultIntent.b, null, null, false, false, null, false, null, TypedValues.PositionType.TYPE_POSITION_TYPE);
                            default:
                                SelectRideDataState it2 = (SelectRideDataState) obj;
                                Intrinsics.i(it2, "it");
                                return SelectRideDataState.a(it2, null, placeSelectionFieldResultIntent.b, null, false, false, null, false, null, 509);
                        }
                    }
                });
                return;
            }
        }
        if (intent.equals(SelectRideIntent.SwapOriginDestinationIntent.f3712a)) {
            E0(new g41(i3, ((SelectRideDataState) stateFlow.getValue()).b, ((SelectRideDataState) stateFlow.getValue()).f3703a));
            return;
        }
        boolean zEquals = intent.equals(SelectRideIntent.SuccessFailureScreenNegativeButtonClicked.f3710a);
        ChaloNavigationManager chaloNavigationManager = this.k;
        if (zEquals) {
            gf.u(null, chaloNavigationManager);
            return;
        }
        if (!intent.equals(SelectRideIntent.SuccessFailureScreenPositiveButtonClicked.f3711a)) {
            if (!(intent instanceof SelectRideIntent.OnTimeChangeIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new z21((SelectRideIntent.OnTimeChangeIntent) intent, i5));
            return;
        }
        RideSavedSuccessFailureState rideSavedSuccessFailureState = ((SelectRideDataState) stateFlow.getValue()).f;
        int i7 = rideSavedSuccessFailureState == null ? -1 : WhenMappings.f3702a[rideSavedSuccessFailureState.ordinal()];
        if (i7 != -1) {
            if (i7 == 1) {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
            } else if (i7 == 2) {
                G0(retryClicked);
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new x41(25));
            }
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        SelectRideComponent$convertToUiState$2 selectRideComponent$convertToUiState$2 = new SelectRideComponent$convertToUiState$2(1, this, SelectRideComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;)V", 0);
        return this.o.e((SelectRideDataState) obj, selectRideComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new SelectRideDataState(null, null, null, false, false, null, false, LocationSelectionType.FROM, ScreenType.RIDE_SELECTION);
    }
}
